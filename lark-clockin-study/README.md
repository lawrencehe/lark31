# 飞书极速打卡模块 — 逆向分析学习包

> 对象:飞书/Lark 7.72.10 Android 客户端 APK
> 主题:原生「极速打卡」(Top Speed Clock-In)引擎的代码与流程
> 性质:纯静态逆向分析,未执行目标
> 使用约束:见 [POLICY.md](POLICY.md)

## 目录结构

```
lark-clockin-study/
├── README.md                 ← 你在看的这个(导读+学习路径)
│
├── 01-report/
│   ├── analysis-report.md    ← 完整分析报告(先读这个)
│   ├── api-parameters.md     ← 接口入参详解+客户端/服务端反作弊职责划分
│   ├── transport-defenses.md ← 传输层防御:裸脚本直接调接口要过的五道关
│   ├── native-signing.md     ← native层逆向:TTNet签名头/metasec/Rust核心设备证明
│   ├── collection-mechanics.md ← 采集机制硬核考据:GPS/WiFi调用链/时机/门禁(纯代码事实)
│   ├── face-verification.md ← 人脸识别与打卡关系专项分析
│   ├── emulator-detection.md ← 模拟器检测逻辑逐行详解
│   └── location-anti-spoof.md ← 虚拟定位防护逻辑详解
│
├── 02-evidence/              ← 机器可读的分析证据(JSON)
│   ├── package-inspection.json                  # REA 包概览:包名/版本/245条权限/manifest全文
│   ├── all-class-names-136k.json                # 全量类名清单(136,057 个)
│   ├── clockin-class-list.json                  # clockin 包的 19 个类
│   ├── SpeedClockInManager-class-inventory.json # REA 类成员清单(方法/字段)
│   └── search-attendance-partial-observation.json # 失败搜索的完整分页数据(全类名来源)
│
├── 03-sources/               ← 反编译 Java 源码(按模块归类)
│   ├── clockin-core/         ★ 核心打卡模块(SpeedClockInManager 等 19 类 + 状态DTO)
│   │   ├── SpeedClockInManager*.java    # 调度器:触发/推送/重试
│   │   ├── state/SpeedClockInModel.java # ★★ 最核心:拉配置+打卡请求构造
│   │   ├── state/SpeedClockIn{Location,Wifi}Manager.java  # GPS/WiFi 采集
│   │   ├── state/SpeedClockInStore.java # 内存态
│   │   ├── network/SpeedClockInNetworkUtils.java          # URL 定义
│   │   ├── entity/*.java                # 协议实体(@SerializedName 字段)
│   │   └── _混淆支撑类/               # v83状态DTO/w83响应判定/y83重试/u83依赖门面
│   ├── attendance-push-protobuf/  # 长连接推送协议(Wire protobuf)
│   ├── anti-cheat/                # 反作弊检测(root/模拟器/作弊App)
│   ├── calendar-checkin/          # 日历会议室签到(独立体系,对照学习)
│   ├── entry-wiring/              # 入口装配(OpenPlatformApiImpl)
│   └── support-classes/           # 旧版 AppStrategyService(降级链路)
│
└── 04-tools/
    └── reproduce.md          ← 复现手册:工具链安装+全步骤+踩坑记录
```

## 建议学习路径(半天)

### 第一站:读报告建立全局观(30 分钟)
1. `01-report/analysis-report.md` — 先通读一遍,重点看**流程图解和字段表**

### 第二站:精读核心代码(2 小时)
按此顺序读 `03-sources/clockin-core/`:

1. **`SpeedClockInManager.java`**
   - 先看顶部 `@kotlin.Metadata` 的 `d2` 数组 → 原始方法名全在里面
   - 对照混淆后的单字母方法:`l()=onAppLaunch, m()=onLoginStatusChange,
     k()=onAppForeground, q()=registerPush, o()=onServerPush, w()=startRequest,
     v()=scheduleRetryClockIn`
2. **`network/SpeedClockInNetworkUtils.java`**(最短,先建立网络认知)
   - 两个 URL、`getDomain("ems_oa")` 动态域名、session cookie
3. **`state/SpeedClockInModel.java`**(★★ 最重要)
   - `c()` = requestConfig:`SEND_HTTP` 隧道请求 → BaseResp 解析 → 存 Store
   - `d()` = requestSpeedClockIn:环境类型分支 → GPS/WiFi 采集 → 组装 body →
     提交 → 失败按 `topSpeedRetryTimeDuration` 重试
4. **`entity/`** 四个数据类 — 所有协议字段的 ground truth
5. **`SpeedClockInManager$requestConfig$1.java`** — 服务端决策点
   (`is_need_speed_clock_in` 才触发打卡)

### 第三站:横向扩展(1 小时)
- `anti-cheat/a.java` — 四类检测的实现细节
- `attendance-push-protobuf/` — Wire protobuf 定义,服务端如何"戳"客户端
- `entry-wiring/OpenPlatformApiImpl.java` — 大型 App 的模块装配方式
- `calendar-checkin/` — 对比另一套"签到"如何组织

### 第四站:动手复现(可选)
- 照 `04-tools/reproduce.md` 从零走一遍工具链

## 读混淆代码的三个技巧

1. **Kotlin @Metadata 是地图**:`d2` 数组按顺序列出原始方法名、参数名、
   返回类型;`@DebugMetadata` 的 `l`/`n` 数组标记协程挂起点行号
2. **`ks7.c.d(模块路径, 类名, 行号)` 是行号埋点**:每处调用都带原始源码
   行号,可用于还原语句顺序
3. **协程状态机**:`label` 字段 = 挂起点序号,`L$0..L$4` = 挂起前保存的
   局部变量,对照 `$xxx$1` 内部类读

## 关键事实速查卡

| 项目 | 值 |
|---|---|
| 配置接口 | `POST /attendance/v2/clock_in/get_top_speed_clock_in_config` |
| 打卡接口 | `POST /attendance/v2/clock_in/top_speed_clock_in` |
| 域名来源 | 设置中心 `getDomain("ems_oa")` |
| 传输 | SdkSender SEND_HTTP 隧道 + `cookie: session=` |
| 环境枚举 | GPS=1, WIFI=2, IP=3, MACHINE=4, BLUETOOTH=5 |
| 打卡决策 | 服务端 `is_need_speed_clock_in` |
| 重试 | 失败后按响应 `top_speed_retry_time_duration`(秒) |
| 推送命令 | PUSH_ATTENDANCE_REFRESH_CONFIG / PUSH_ATTENDANCE_TOP_SPEED_CLOCK_IN |
| 风控上报 | is_cracked/is_emulator/is_debug/app_list/device_id/device_os=2 |
