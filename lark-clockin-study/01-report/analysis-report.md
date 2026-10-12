# 飞书(Lark)极速打卡模块逆向分析报告

> 分析对象:`~/31/851750695-lark20260904110428.apk.1`(371MB)
> 包名:`com.ss.android.lark.sasysa542` | 版本:7.72.10 (build 7721050) | minSdk 22 / targetSdk 35
> APK SHA-256:`31585b7b637b19994b80d8fa1f6e4c5032bd80fe2be55584078a7b43aa94df99`
> 分析方式:纯静态(REA/JADX 0.7.1 引擎 + jadx 1.5.2 批量反编译交叉验证),未执行 APK

---

## 一、核心结论

APK 中原生打卡代码是 **「极速打卡」(Top Speed Clock-In)静默引擎**,位于
`com.ss.android.lark.appstrategy.clockin` 包(19 个类,主体在 classes8.dex)。

完整的考勤应用(打卡页面/统计/补卡)**不在原生代码中**——APK 内无 sapass/考勤
H5 资产包(已用类名清单与 assets 枚举双重验证),它由服务端按 openplatform
小程序/H5 形态动态下发。原生模块只负责"无感"自动打卡。

```
com.ss.android.lark.appstrategy.clockin
├── SpeedClockInManager          # 单例调度器:生命周期触发 + 推送 + 重试(约280行)
├── state/
│   ├── SpeedClockInModel        # 业务编排:拉配置 / 构造打卡请求(最核心,约600行)
│   ├── SpeedClockInLocationManager  # GPS 采集(getLocationV2)
│   ├── SpeedClockInWifiManager  # Wi-Fi 连接信息 + 扫描
│   └── SpeedClockInStore        # 内存态 config / clockInData(volatile)
├── network/SpeedClockInNetworkUtils  # URL 与基础参数
└── entity/
    ├── SpeedClockInConfigData   # 配置响应
    ├── SpeedClockInData         # 打卡响应
    ├── TopSpeedClockInRisk      # 反作弊上报结构
    └── BaseResp<T>              # 通用响应壳 {code,msg,data}
```

混淆说明:方法/字段名为单字母(a/b/c...,f167604b...),但 Kotlin @Metadata 注解
完整保留了原始方法签名与参数名,是阅读的主要线索。

---

## 二、完整打卡流程

### 1. 触发入口(6 种)

| 触发 | triggerType 值 | 装配点(实测) |
|---|---|---|
| App 启动 | `start_up` | `OpenPlatformApiImpl.onPreTaskStart()` → `Manager.l()` |
| 登录成功 | `login` | `notifyAppStrategyOnLoginStatusChanged(true)` → `Manager.m()` |
| 切前台(本地无配置时) | `back_to_front` | `Manager.k()` |
| 网络切到 Wi-Fi | `network` | `NetworkStateListener.onNetworkChange(WIFI)` → `Manager.n()` |
| 账号切换 | `account_change` | `Manager.j()`(先 clear) |
| 服务端长连接推送 | `push` | `Manager.o()`(见第四节) |

### 2. 拉取配置(requestConfig → Model.c())

- **URL**:`https://{ems_oa域名}/attendance/v2/clock_in/get_top_speed_clock_in_config`
- 域名来自飞书设置中心 `u83.b.b().getDomain("ems_oa")`(动态域名,非硬编码)
- **传输通道**:`SdkSender.asynSendRequestNonWrap(SEND_HTTP, ...)` —— 走飞书
  客户端内部 HTTP 桥(长连接隧道),不是裸 okhttp
- **鉴权**:Header `cookie: session=<登录态>`
- **响应字段**(Gson @SerializedName 实测):

| 字段 | 含义 |
|---|---|
| `is_opened` | 极速打卡总开关 |
| `begin_time` / `end_time` | 允许打卡时间窗 |
| `environment_type_list` | 允许的环境类型(见枚举) |
| `is_new_version` | 是否新版链路(否则回退旧版 handler) |
| `is_need_speed_clock_in` | **服务端决策:现在是否需要打卡** |
| `cheat_app_list` | 作弊 App 包名黑名单(下发) |
| `need_risk_info` | 是否要求上报风控信息 |

### 3. 服务端决策(关键设计)

`SpeedClockInManager$requestConfig$1.invokeSuspend()`:

```kotlin
if (config.isNewVersion) {
    if (config.isNeedSpeedClockIn) {          // ← 打不打卡由服务端说了算
        x(config.environmentTypeList,
          config.needRiskInfo,
          config.cheatAppList)                 // → requestSpeedClockIn
    }
} else {
    oldVersionConfigHandler?.invoke()          // 旧版回退(见 support-classes)
}
```

客户端**不做本地时间窗判定**,天然防客户端篡改时钟。

### 4. 采集证据(requestSpeedClockIn → Model.d())

外层 `$requestSpeedClockIn$1` 用 **Mutex 串行化**后进入 `startRequest`:

- 后台熔断:`openplatform.speedclockin.allow_bg_location` 未开启且 App 在后台
  → 直接放弃(日志 `startRequest in background`)
- 按 `environment_type_list` 采集(EnvironmentType 枚举,**实测字节码**):
  - `GPS=1, WIFI=2, IP=3, MACHINE=4, BLUETOOTH=5`(原生只主动处理 1/2)
- **GPS**(需 ACCESS_COARSE/FINE_LOCATION):
  ```
  gps: { longitude, latitude, accuracy, gps_map_type }  // wgs84=1, gcj02=2
  ```
- **Wi-Fi**(受 FG 开关 `attendance.top_speed_clock_in.forbid_bssid` 控制;
  Android 9+ 需精确定位权限才能读 BSSID):
  ```
  wifi_mac_address: <当前连接 BSSID>
  network_security_type: <加密类型 int>
  scan_wifi_list: [ {name: SSID, mac_address: BSSID, network_security_type} ]
  ```

### 5. 提交打卡

- **URL**:`https://{ems_oa域名}/attendance/v2/clock_in/top_speed_clock_in`
- **Body**(Gson JSON):`device_trace_id` + 采集数据 + `device_id` + 可选 `risk_info`
- 同样走 SEND_HTTP 隧道 + session cookie

### 6. 响应与自动重试

| 字段 | 含义 |
|---|---|
| `is_in_env` | 是否在考勤范围内 |
| `is_clock_in_succeed` | **打卡是否成功** |
| `clock_in_fail_code_name` | 失败原因码名 |
| `top_speed_retry_time_duration` | 重试间隔(秒) |

失败且 `top_speed_retry_time_duration > 0` → `y83.a` 调度器按秒延迟重试
(triggerType=`retry`,监控事件 `LARK-PSDA-op_speed_clock_schedule_retry_clock_in`)。

---

## 三、反作弊上报(`risk_info`,当 `need_risk_info=true`)

构造处:`SpeedClockInModel.createTopSpeedClockInRisk()`
实现处:`plugin/security/a.java`(AntiCheatingAPIUtil)

```json
{
  "is_cracked":  "<bool> Root 检测",
  "is_emulator": "<bool> 模拟器检测",
  "is_debug":    "<bool> ADB 调试检测",
  "app_list":    "[<已安装的作弊App包名>]",
  "device_id":   "<设备ID>",
  "device_os":   2,
  "device_model":"<型号+系统版本>",
  "is_new_version": true
}
```

检测手段(全部实测):

| 检测项 | 方法 |
|---|---|
| Root | 14 个路径找 `su`(`/system/bin/` `/system/xbin/` `/sbin/` `/data/local/`...) + 执行 `which su` |
| ADB 调试 | `Settings.Secure.getInt(adb_enabled) > 0` |
| 模拟器 | `ro.kernel.qemu==1`;FINGERPRINT 含 generic/vbox/test-keys;MODEL 含 google_sdk/Emulator/x86 SDK;MANUFACTURER=Genymotion;BRAND+DEVICE=generic;PRODUCT=google_sdk;运营商名=="android";DIAL intent 解析能力 |
| 作弊 App | 遍历服务端下发 `cheat_app_list`,`getPackageInfo(pkg, GET_SIGNATURES)` 探测是否安装 |

---

## 四、长连接推送协议(protobuf / Square Wire)

`com.ss.android.lark.pb.attendance_push.PushAttendanceRequest`:

```protobuf
message PushAttendanceRequest {
  PushType event_type = 1;        // UNKNOWN=0, REFRESH_CONFIG=1, TOP_SPEED_CLOCK_IN=2
  int64 push_time = 2;            // required
  repeated EnvironmentType environment_type_list = 3;
}
enum EnvironmentType { GPS=1; WIFI=2; IP=3; MACHINE=4; BLUETOOTH=5; }
```

`Manager.q()` 在启动时向 SDK 注册两个命令回调:
- `PUSH_ATTENDANCE_REFRESH_CONFIG` → 重新拉配置(triggerType=`push`)
- `PUSH_ATTENDANCE_TOP_SPEED_CLOCK_IN` → 按推送携带的环境类型**直接打卡**

即:服务端可主动"戳"客户端打卡,不依赖客户端触发。

---

## 五、另一类"签到":日历会议室签到(独立体系)

`calendar.impl.features.events.detail.checkin.*`(约 65 类):
`CheckInInfoActivity` + ViewModel 从 Intent 取 `calendarId/uid/originalTime/startTime`,
展示二维码签到/统计(协议:`calendar.v1.GetResourceCheckInInfoRequest` 等)。
与考勤打卡是**两套独立系统**,仅类名都含 checkin。

---

## 六、学习要点(架构视角)

1. **服务端决策 + 客户端执行**:打卡时机由服务端 `is_need_speed_clock_in` 下发,
   客户端是纯执行体,减少客户端作弊面。
2. **触发器模式**:生命周期/网络/推送多源触发统一收敛到 `requestConfig`,
   幂等由 Mutex + 本地配置缓存保证。
3. **降级链路**:`is_new_version=false` 回退旧版 AppStrategyService(渐进迁移)。
4. **观测完备**:每个分支都有 `ks7.c.d(模块路径, 类名, 行号)` 代码定位埋点 +
   `LARK-PSDA-*` 监控事件 + OPTrace tracingID 贯穿。
5. **权限最小化**:BSSID 读取受双开关(FG 配置 + 系统权限版本分支)控制。

## 七、局限与诚实声明

- 纯静态分析,未运行验证;`--show-bad-code` 产物中个别分支极性存在 jadx 伪影
  (Wi-Fi 采集进入条件、BaseResp 判断的 `!` 位置),字段/URL/枚举值均为字节级直接观测。
- H5 考勤前端、人脸识别等逻辑在服务端/动态下发,APK 静态不可见。
