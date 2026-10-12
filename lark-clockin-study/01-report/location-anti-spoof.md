# 虚拟定位防护逻辑详解

> 问题:防虚拟定位(模拟定位/坐标伪造)的逻辑是什么?
> 结论:客户端几乎没有有效的"拦截式"检测——mock 标志被采集但当前
> 打卡链路不消费;真正的防线是**上报数据的交叉验证素材 + 服务端判定**。
> 这是一个"客户端采集信号、服务端交叉裁决"的典型架构。

## 证据链:mock 标志从 SDK 到业务层的完整流向

### 1. AMap SDK 的 mock 检测(第三方引擎)

- `com.amap.api.location.AMapLocation.isMock()`(字段 D)→ 高德定位引擎
  内置的模拟位置检测,结果由 AMap 原生层填充;
- Lark 在启动定位时 **`setMockEnable(false)`**(`map/service/f.java` L314/L353,
  单次与连续定位两处)——让 AMap 引擎对模拟位置做过滤。

### 2. 转换层:mock 标志被写入 LarkLocation 但无人消费

`me5/a.java`(AMapLocation→LarkLocation 转换器)实测:

```java
larkLocation.e0(aMapLocation.isMock());   // 写入字段 i,getter 是 y()
larkLocation.g0(getLocationType() == 1);  // 写入字段 h,getter 是 F()(是否 GPS)
larkLocation.l0(getLocationType());       // 定位类型 1=GPS ...
// 坐标系:CoordinateConverter.isAMapDataAvailable → GCJ else WGS
```

**关键事实**:在全 APK 的 dex 里搜 `LarkLocation.y()`(即 isMock 的读取),
**没有任何业务代码引用它**。即:

| 消费方 | 是否读 mock 字段 | 证据 |
|---|---|---|
| 极速打卡 `SpeedClockInLocationManager` | ❌ 只读 latitude/longitude/accuracy/type | `getLocationV2` 回调 |
| 端点安全因子收集器 | ❌ 只读经纬度做 GCJ02 转换 | `EndpointSecurityFactorCollector.b()` |
| 其他业务 | ❌ 无 xref | 全 dex 检索 |

→ mock 检测目前是"采集了但没用"的死信号,或仅供 AMap 引擎内部过滤。

## 真正的防护:三层结构

### 第一层:客户端能力门禁(UX/合规,非安全边界)

- 定位权限(COARSE/FINE)检查;
- 后台熔断(`openplatform.speedclockin.allow_bg_location`);
- 管理员可禁用 GPS(`requestOnceLocationDetailed` 日志:
  "admin disabled GPS, fail directly")与禁用 AMap SDK(`me5.b.a.a()`);
- 高德失败时降级系统定位(`f.java` "AMap Failed! Use System Location")。

### 第二层:交叉验证素材(核心,随打卡请求一起上报)

打卡接口 `top_speed_clock_in` 一次性上报三类可互相校验的证据:

| 素材 | 字段 | 反伪造作用 |
|---|---|---|
| GPS 坐标 | `gps{longitude,latitude,accuracy,gps_map_type}` | 位置主证据 |
| 当前连接 Wi-Fi | `wifi_mac_address`(BSSID)+`network_security_type` | 位置旁证 |
| 周边 Wi-Fi 列表 | `scan_wifi_list[{name,mac_address,...}]` | **环境指纹**:BSSID 有真实地理坐标,无法凭空伪造 |

**设计意图(推断)**:伪造一个 GPS 坐标很容易,但同时伪造"该坐标点
真实存在的周边 Wi-Fi 环境"极难——BSSID 是物理布设的。服务端拿
scan_wifi_list 反查 Wi-Fi 位置库,与 GPS 坐标比对,不一致即判作弊。
这正是响应字段 `is_in_env`(是否在考勤范围)的判定素材。

### 第三层:坐标系归一(反"低质量伪造")

`location/LocationCoordinateUtil.java` 实测实现了标准 **WGS84→GCJ02**
转换(含中国边界框 72.004–137.8347, 0.8293–55.8271):

- AMap 返回的坐标若在中国境内,统一转成 GCJ02 上报(端点安全模块);
- `gps_map_type`(wgs84=1/gcj02=2)随打卡上报,服务端知道坐标系;
- 作用:不懂坐标系的外行伪造者直接用 WGS84 填 GCJ02 位置,会产生
  几十到上百米偏移,直接被地理围栏拒绝。

### 第四层:端点安全模块(EMM/合规,独立于打卡接口)

`com.ss.android.lark.endpoint.security.detection.*`(20+ 类):

- **因子收集** `EndpointSecurityFactorCollector.e()` 产出 Base64(UTF-8)JSON:
  ```json
  {
    "geoInfo":     {"lng":"..","lat":".."},          // 已归一 GCJ02
    "networkInfo": {"vpnProxy":bool,                  // VpnDetector.a.c()
                     "timezone":"..",                  // TimeZone ID
                     "autoTimezone":0/1/2}             // Settings.Global.auto_time_zone
  }
  ```
- **上报通道** `EndpointSecurityFactorRustApi.c()` → Rust 客户端
  `ENDPOINT_SECURITY_INFO_UPLOAD`(protobuf `security.v1`);
- **策略下发** `ENDPOINT_SECURITY_SWITCH` → 服务端下发 `report_config`
  (决定采不采坐标/是否查 VPN/时区),`needCoordinate/needDetectVpnProxy/needTimezone`;
- **推送触发** `EndpointSecurityReportPushHandler` → 按需启停连续定位
  (`startLocationUpdatesIfNeeded` / `startTimerDrivenLocation`);
- **采集方式** `DefaultEndpointLocationClient`:单次(`requestOnceLocationDetailed`)
  / 连续(`startContinuousLocation`)/ 定时驱动(`startTimerDrivenLocation`),
  前台服务 `LocationForegroundService` 保活。

### 第五层:服务端裁决(不可见,由协议语义推断)

| 信号 | 证据 |
|---|---|
| 地理围栏 | 响应 `is_in_env` |
| 打卡成败/原因 | `is_clock_in_succeed` / `clock_in_fail_code_name` |
| 重试节奏 | `top_speed_retry_time_duration` |
| 是否要打卡 | 配置 `is_need_speed_clock_in` |

## 诚实结论(架构总结)

1. 飞书**没有**在客户端做"拦截式"虚拟定位检测——`AMapLocation.isMock()`
   被采集进 LarkLocation 却无业务消费,只是高德引擎内部配合
   `setMockEnable(false)` 做过滤;
2. 防伪造的**真正落点**:要求客户端同时上报 GPS + 周边 Wi-Fi BSSID
   环境指纹 + 坐标系元数据,服务端做地理交叉验证;
3. 独立的"端点安全"通道(坐标+VPN+时区,经 Rust 加密/编码上报)更偏
   EMM 合规与设备画像,不是打卡成功与否的直接判据;
4. 客户端上报的一切都可被伪造,强度完全取决于服务端交叉验证——这是
   这类系统的本质,也是做防御设计时要牢记的第一性原理。
