# 极速打卡接口参数详解(客户端→服务端契约)

> 依据:`SpeedClockInModel.d()/c()`、`SpeedClockInNetworkUtils.a()`、
> `entity/*` 反编译源码,字段名均为 Gson 序列化的字节级直接观测。
> 用途:理解客户端上报契约与服务端/客户端职责划分。

## 0. 传输层(两个接口共用)

| 项 | 值 | 出处 |
|---|---|---|
| 通道 | `SdkSender.asynSendRequestNonWrap(SEND_HTTP, ...)` 客户端内部 HTTP 隧道 | Model.c/d 内联代码 |
| Method | POST | 同上 |
| Header | `cookie: session=<登录态session>` | 同上 |
| Body | Gson JSON(LinkedHashMap 保序) | 同上 |
| 响应壳 | `BaseResp{code:int, msg:string, data:T}`,`code==0` 为成功 | entity/BaseResp.java + w83/a.java |

## 1. 配置接口

`POST https://{ems_oa域名}/attendance/v2/clock_in/get_top_speed_clock_in_config`

域名 = 设置中心 `getDomain("ems_oa")` 下发,APK 内无硬编码 host。

**请求体**(仅 1 个字段):

| 字段 | 类型 | 必填 | 说明 |
|---|---|---|---|
| `device_trace_id` | string | 可选 | OPTrace 追踪 ID,纯监控用途 |

**响应 data**(`SpeedClockInConfigData`):

| 字段 | 类型 | 说明 |
|---|---|---|
| `is_opened` | bool | 极速打卡总开关 |
| `begin_time` / `end_time` | int64 | 时间窗(客户端不判定,仅透传展示) |
| `environment_type_list` | int[] | 1=GPS 2=WIFI 3=IP 4=考勤机 5=蓝牙 |
| `is_new_version` | bool | false 则客户端回退旧版链路 |
| `is_need_speed_clock_in` | bool | **服务端决策:现在要不要打卡** |
| `cheat_app_list` | string[] | 作弊 App 包名黑名单(服务端下发) |
| `need_risk_info` | bool | 是否要求本次上报 risk_info |

## 2. 打卡接口

`POST https://{ems_oa域名}/attendance/v2/clock_in/top_speed_clock_in`

**请求体字段总表**(条件字段仅在对应分支成功时出现):

### 2.1 基础字段

| 字段 | 类型 | 条件 | 说明 | 代码位置 |
|---|---|---|---|---|
| `device_trace_id` | string | tracingID 非空 | 监控追踪 | NetworkUtils.a() |
| `device_id` | string | 恒有 | 平台设备 ID(依赖门面获取) | Model.d() L454 |

### 2.2 GPS 组(envType 含 1 且定位成功时)

`gps` object:

| 字段 | 类型 | 说明 |
|---|---|---|
| `longitude` | double | 经度 |
| `latitude` | double | 纬度 |
| `accuracy` | double | 定位精度(米) |
| `gps_map_type` | int | 坐标系:1=wgs84, 2=gcj02, 0=未知(LocationManager.b() 映射) |

定位失败时 `gps` 整组缺省(不填 0)。需 ACCESS_COARSE 或 FINE 权限,
走平台 `getLocationV2()` 融合定位,坐标类型由其回调 `type` 给出。

### 2.3 Wi-Fi 组(扫描/连接成功时)

| 字段 | 类型 | 说明 |
|---|---|---|
| `wifi_mac_address` | string | 当前连接 Wi-Fi 的 **BSSID**(经 LARK-PSDA-op_api_wifi_bssid 包装器) |
| `network_security_type` | int | 当前 Wi-Fi 加密类型(wifi 插件枚举) |
| `scan_wifi_list` | array | 周边扫描结果,每项: |

`scan_wifi_list[]`:

| 字段 | 类型 | 说明 |
|---|---|---|
| `name` | string | SSID |
| `mac_address` | string | BSSID |
| `network_security_type` | int | 加密类型(wifi.a.l(scanResult)) |

前置条件:`attendance.top_speed_clock_in.forbid_bssid` FG 开关关闭;
Android 9+ 需 ACCESS_FINE_LOCATION;Android 8 需 COARSE/FINE 之一;
低版本直接可读。扫描由 `startScan()` 显式触发(LARK-PSDA 标记)。

### 2.4 风控组(配置 `need_risk_info=true` 时)

`risk_info` object(`TopSpeedClockInRisk`,Gson 序列化):

| 字段 | 类型 | 检测方法(anti-cheat/a.java 实测) |
|---|---|---|
| `is_cracked` | bool | 14 路径搜 `su` + `which su` 执行探测 |
| `is_emulator` | bool | ro.kernel.qemu / FINGERPRINT(generic,vbox,test-keys) / MODEL(google_sdk,Emulator,x86 SDK) / Genymotion / generic 品牌 / PRODUCT=google_sdk / 运营商名=android / DIAL intent 解析 |
| `is_debug` | bool | `Settings.Secure adb_enabled > 0` |
| `app_list` | string[] | 遍历服务端 `cheat_app_list`,`getPackageInfo(pkg, GET_SIGNATURES)` 探测已安装 |
| `device_id` | string | 与顶层 device_id 同源 |
| `device_os` | int | 恒 2(Android 枚举值) |
| `device_model` | string | `rom版本, 系统版本` 拼接字符串 |
| `is_new_version` | bool | 结构版本标记,默认 true |

检测异常时兜底:全 false + 空列表(不阻塞打卡,由服务端裁量)。

### 2.5 响应 data(`SpeedClockInData`)

| 字段 | 类型 | 说明 |
|---|---|---|
| `is_in_env` | bool | 服务端判定:提交的环境数据是否在考勤范围内 |
| `is_clock_in_succeed` | bool | **打卡是否成功** |
| `clock_in_fail_code_name` | string | 失败原因码名 |
| `top_speed_retry_time_duration` | int | 失败重试间隔(秒);>0 时客户端调度重试 |

## 3. 两个重要事实

1. **没有照片字段**。极速打卡接口不含任何 photo/人脸参数——用户所说的
   "拍照打卡"属于 H5 考勤应用(动态下发,不在本原生模块),其接口未包含
   在本次静态分析范围。
2. **没有客户端时间戳**。请求体不含任何时间字段,服务端以请求到达时间或
   推送 `push_time` 为准——客户端改时钟对此接口无效。

## 4. 客户端 vs 服务端:反作弊职责划分

### 客户端侧(实测,本质是"采集上报"而非"拦截")

| 机制 | 性质 |
|---|---|
| risk_info 四项检测 + 作弊 App 扫描 | **只采集上报,客户端不拦截**(检测异常也只是填 false) |
| 后台熔断(allow_bg_location FG 开关) | 触发条件控制,防后台偷跑/耗电 |
| 定位权限/BSSID 开关门禁 | 合规与电量考虑为主 |
| Mutex 串行 | 防本地并发重复请求 |

客户端检测在用户自己设备上运行,天然可被绕过,所以设计上仅作信号源。

### 服务端侧(由协议字段与响应语义推断,服务端代码不可见)

| 机制 | 证据 |
|---|---|
| 打卡时机决策 | `is_need_speed_clock_in` 下发 |
| 地理围栏判定 | 响应 `is_in_env`(客户端只交数据,范围判定必然在服务端) |
| 风控裁量 | `risk_info` 上报后由服务端结合 `clock_in_fail_code_name` 决定成败 |
| 重试节奏控制 | `top_speed_retry_time_duration` |
| 策略动态下发 | cheat_app_list / need_risk_info / FG 开关均可服务端调整 |
| 主动触发 | 长连接推送 PUSH_ATTENDANCE_TOP_SPEED_CLOCK_IN |
| 身份绑定 | session cookie + device_id |

### 未知项(静态分析无法回答,需服务端/黑盒验证)

- GPS 轨迹合理性校验(瞬移/匀速检测)
- `scan_wifi_list` 与 GPS 的地理交叉验证(BSSID→位置库比对)
- device_id 历史一致性 / 设备指纹
- 防重放策略

> 防御视角提示(给做考勤系统的人):客户端上报的 GPS/BSSID/risk_info 都是
> 可构造的输入,可靠性取决于服务端交叉验证强度——GPS 与 BSSID 地理一致
> 性、历史轨迹连续性、设备指纹稳定性,是这类系统真正的防线。
