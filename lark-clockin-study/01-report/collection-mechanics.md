# 位置/WiFi 采集机制硬核代码考据

> 本文只收录**反编译代码直接观测到的事实**（含少量明确标注的存疑点），
> 不含架构推断。推断与讨论见 transport-defenses.md。
> 源码：`03-sources/clockin-core/`（study 版，jadx）+ `analysis/src13/.../GetLocationPlugin.java`
> 行号引用：`ks7.c.d(..., "模块", "类", "行号")` 为原始 Kotlin 源行号埋点，
> 比 jadx 行号更可靠。

## 1. 采集总原则（代码事实）

- **无任何常驻监听**：全模块搜不到 `requestLocationUpdates`、
  `registerWifiScanCallback`、周期定时器（重试定时器除外）
- 所有采集都是**一次性调用**，嵌在"触发→配置→采集→提交"协程链里
- 采集前有三重门禁：登录态、后台熔断、服务端配置（`is_need_speed_clock_in`）

## 2. 触发链与时机（谁在什么时候启动采集）

### 2.1 触发源注册（SpeedClockInManager，全部离散事件）

```java
// L122: 长连接推送注册（两个命令）
sdk.j.b().c(Command.PUSH_ATTENDANCE_REFRESH_CONFIG, ...)      // 配置刷新
sdk.j.b().c(Command.PUSH_ATTENDANCE_TOP_SPEED_CLOCK_IN, ...)  // 服务端戳一下→打卡

// 生命周期入口（ISpeedClockInLifecycle 接口实现，由宿主框架调用）
l() = onAppLaunch        → r("start_up", ...)     // 启动时拉配置
k() = onAppForeground    → 前台切换
m()/n() = onLoginStatusChange / onAccountChange   // 登录态/账号变化
registerNetworkListener → onNetworkChange(type)   // 网络变化（firstNetworkNotify 去抖）
```

### 2.2 串行门禁（r() 与 Mutex）

```java
// SpeedClockInManager.r() L231 —— 所有触发统一入口
private final void r(String triggerType, Function0<Unit> body) {
    if (!i()) {                       // i() = isLogin 未登录直接丢弃
        Log.i("requestConfig, not logged in");
    } else {
        launch(new requestConfig$1(triggerType, body))  // 协程 + 字段 lock: Mutex 串行
    }
}
```

### 2.3 后台熔断（Model.b()，原始行号 226-229）

```java
public final boolean b() {   // isStopClockInBackground
    boolean inBg = !(dep != null && dep.isAppRealForeground());
    boolean fgEnable = ne4.f.a().isEnable("openplatform.speedclockin.allow_bg_location");
    // FG 开关允许服务端按部署开启后台打卡
    if (!inBg || fgEnable) return false;   // 前台 或 白名单 → 继续
    return true;                            // 否则熔断（连采集都不做）
}
```

### 2.4 采集启动的精确时序（Manager.startRequest L316+）

```java
// startRequest 协程内（背景检查之后）：
speedClockInModel.e();      // ★ 先启动 WiFi 扫描（fire-and-forget 预热）
                           //   e() { this.c.f(); } → WifiManager.startScan()
// 随后进入 Model.d() = requestSpeedClockIn：
//   ① GPS 一次性挂起采集（等待结果）
//   ② WiFi 读结果（扫描已在跑，并行省 1-4 秒）
//   ③ risk_info、device_id、POST 提交
```

**采集时机结论**：GPS/WiFi 采集发生在 startRequest 协程内、提交前；
WiFi 扫描的*启动*在协程入口、GPS 采集的*等待*在 body 组装中——两者并行。

## 3. 定位采集调用链（逐层代码）

### 3.1 入口：SpeedClockInLocationManager.a()（挂起函数，单次）

```java
public final Object a(String param, Continuation<? super v83.c> cont) {
    SafeContinuation sc = new SafeContinuation(...);   // 挂起桥
    // 权限门禁（无权限→不弹窗、直接返回失败对象，打卡体里 gps 组缺省）
    boolean coarse = checkSelfPermission(ACCESS_COARSE_LOCATION) == 0;
    boolean fine   = checkSelfPermission(ACCESS_FINE_LOCATION) == 0;
    if (!coarse && !fine) {
        sc.resumeWith(new v83.c.C0234c());            // 失败结果①：无权限
    } else {
        u83.b.b().getLocationV2(param, new IGetDataCallback<SimpleLocation>() {
            onError(err)  -> sc.resumeWith(new v83.c.a(err.code, err.debugMsg));  // 失败②
            onSuccess(loc) -> sc.resumeWith(new v83.c.d(new Location(
                loc.getLatitude(), loc.getLongitude(), loc.getAccuracy(),
                b(loc.getType()))));                  // type→gps_map_type 映射
        });
    }
    return sc.getOrThrow();   // 挂起等待，一次性
}
```

### 3.2 平台实现：GetLocationPlugin.getLocationV2

`@ApiConfig(apiName = "getLocationV2", async = true)`
`com/ss/android/lark/im/open/api/location/GetLocationPlugin.java`：

```java
getLocationAsync(f, req, h) {
    if (!(isAdminGpsEnabled(f,h) && isAdminLocationMapSDKEnabled(h))) return; // 管理员双开关
    mode 校验: 只接受 "best" | "high"，其他→错误码 js1.e.h
    accuracy: best→20.0f   high→100.0f
    timeout:  传入限 3..180s，非法→best 默认 10s / high 默认 3s（×1000 转ms）
    cacheTimeout: 限 0..60s（×1000）          // 有位置缓存层
    if (req.mNeedRequestPermission) {          // 可选交互路径：
        GPS 未开 → openDialog() 弹窗引导       //   弹窗+动态权限申请
        → checkPermission(...)
    }
    if (noSystemPermission()) → 错误码 js1.e.k  // 系统权限缺失→失败
    doGetLocation(f, h);                        // ↓ 实际定位
}
doGetLocation: mLocationTaskManager.e(appContext, acc, timeout, priority,
                 cacheTimeout, "LARK-PSDA-op_api_get_location_v2", callback);
                 // PSDA 隐私合规埋点标记：该数据用途已申报
```

**观测结论**：定位是带 mode/accuracy/timeout/cache 参数的**受控单次请求**；
管理员级开关（GPS 开关、地图 SDK 开关）在平台层再拦一道；
精度二档：best=20m / high=100m——与 300m 围栏场景匹配。

### 3.3 结果映射进请求体

```
SimpleLocation{lat, lon, accuracy, type}
  → body["gps"] = {longitude, latitude, accuracy, gps_map_type}
     gps_map_type: LocationManager.b(type) → 1=wgs84 2=gcj02 0=unknown
定位失败 → gps 整组不出现（不填 0，服务端可区分"没采到"和"坐标0,0"）
```

## 4. WiFi 采集调用链（逐层代码）

### 4.1 三层门禁（SpeedClockInWifiManager.a()）

```java
private final boolean a() {   // checkPermission（原始方法名，metadata 还原）
    if (u83.b.b().getFgValue("attendance.top_speed_clock_in.forbid_bssid"))
        return false;                          // ① 服务端FG开关：整体禁采BSSID
    int sdk = Build.VERSION.SDK_INT;
    if (sdk >= 29) {                           // ② Android 10+：必须精确定位权限
        return checkSelfPermission(ACCESS_FINE_LOCATION) == 0;
    } else if (sdk == 28) {                    // ③ Android 9：粗/精任一
        return fine || coarse;
    }
    return true;                               // Android 8-：直接可采
}
```

### 4.2 三个采集操作（全部反射包装 + PSDA 标记 + try/catch 兜底）

```java
// ① 发起扫描（f = startScan）
public final boolean f() {
    if (!a()) return false;
    try { return mp1.a.a.x(e(), "LARK-PSDA-op_api_wifi_start_scan_speed_clock"); }
    catch (Exception) { return false; }
}

// ② 当前连接的 WiFi（c = getConnectedWifiInfo）
//    getConnectionInfo 走反射重定向包装（cw0.c().b(102301, "android/net/wifi/WifiManager",
//    "getConnectionInfo", ...) —— 宿主可注入替换实现）
//    BSSID 提取: mp1.a.a.j(wifiInfo, "LARK-PSDA-op_api_wifi_bssid_speed_clock_model")
//    加密类型:   wifi.a.d(wifiInfo, wifiManager) → network_security_type

// ③ 扫描结果列表（d = getScanWifiList）
public final v83.d d() {
    if (!a()) return new v83.d.b();            // 门禁未过→空失败对象
    try { return new v83.d.c(
             mp1.a.a.l(e(), "LARK-PSDA-op_api_wifi_get_scan_results_speed_clock")); }
    catch (Exception) { return new v83.d.a(-100, "get WifiManager error"); }
}
// e() = getApplicationContext().getSystemService("wifi")
```

### 4.3 结果映射进请求体（Model.d() L380-410）

```java
// 连接信息成功时：
body["wifi_mac_address"]     = BSSID（提取失败→""）
body["network_security_type"] = wifi.a.d(...)
// 扫描成功时：
body["scan_wifi_list"] = [{name: SSID, mac_address: BSSID, network_security_type}, ...]
//     每个 ScanResult 逐项映射，列表为空则放空数组
```

### 4.4 ⚠️ 存疑点：WiFi 分支的进入条件（诚实标注）

jadx 还原的 Model.d() 中 WiFi 采集分支条件为：

```java
if (zContains2 /*envType含GPS*/ && !b()) { GPS采集 }
else {
    zContains = envType.contains(2);          // 日志 "usingWifi: "
    if (!zContains && !b()) { WiFi采集 }      // ← 字面读：envType 不含 WiFi 才采集
}
```

字面语义反直觉（"配置了 WiFi 模式反而不采 WiFi"）。两种解释无法用现有
材料裁决： WiFi 仅作为**非 WiFi 模式下的辅助信号**采集，WiFi 模式走
旧版 AppStrategyService 链路； jadx 控制流还原有误。src2 的同名类是
不完整旧版残片（97 行），无第二份完整反编译可对照。**需 smali 级验证**，
结论以字节码为准。

## 5. 采集机制速查表

| 维度 | GPS | WiFi |
|---|---|---|
| 触发 | requestSpeedClockIn 协程内（await 结果） | startRequest 入口先 startScan，组装时读结果 |
| 系统接口 | 平台融合定位 getLocationV2（GetLocationPlugin） | WifiManager: startScan / getConnectionInfo / getScanResults |
| 调用方式 | 挂起函数 + 单次回调（SafeContinuation） | 同步调用 + 反射重定向包装 |
| 权限门禁 | COARSE 或 FINE（缺失→gps 组缺省） | FG开关 + SDK分级：10+必须FINE / 9=COARSE或FINE / 8-无 |
| 参数 | mode=best(20m)/high(100m)，timeout 3-180s，cache 0-60s | 无参数（系统全量扫描） |
| 管理员开关 | isAdminGpsEnabled + isAdminLocationMapSDKEnabled | forbid_bssid FG 开关 |
| 失败表现 | gps 组缺省 | 字段缺省；scan_wifi_list 空数组 |
| 隐私标记 | LARK-PSDA-op_api_get_location_v2 | 4 个 LARK-PSDA-op_api_wifi_* 标记 |
| 提交字段 | gps{longitude,latitude,accuracy,gps_map_type} | wifi_mac_address, network_security_type, scan_wifi_list[] |

## 6. 后台/前台行为（对照代码）

- 后台 + FG 关 → `b()=true` → GPS/WiFi **均不采集**，请求也发不出
  （startRequest L346 日志 `"startRequest in background"`）
- 后台 + FG 开（`allow_bg_location`，按部署配置）→ 允许完整流程
- 失败重试：`v()` 读响应 `topSpeedRetryTimeDuration > 0` 才调度
  `scheduler.a(SECONDS.toMillis(dur), retry)`——重试是服务端控节奏

## 7. 对反作弊讨论的代码锚点

- "一次性采集"的证据：本文 §2/§3/§4 全部调用均为单次；重试定时器是唯一周期性调度
- "WiFi 全量列表上报"的证据：§4.3 scan_wifi_list 逐项映射 ScanResult
- "客户端不拦截"的证据：所有采集失败都变现为**字段缺省**而非流程中断
  （ gps 缺省→WiFi 可继续；权限缺失→提交仍发生，服务端看得到缺什么）
