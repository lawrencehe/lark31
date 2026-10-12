# 模拟器检测逻辑详解(AntiCheatingAPIUtil.i)

> 源码:`03-sources/anti-cheat/a.java` 的 `i(Context)` 方法
> 调用链:`SpeedClockInModel.createTopSpeedClockInRisk()` →
> `security.a.i(application)` → 结果填入 `risk_info.is_emulator` →
> 随打卡请求上报,**由服务端裁量**(客户端不拦截)
> 辅助类:`OPScreenUtil_x36c.java`(`x36.c`,提供 isPad 判定)

## 还原后的 Kotlin 伪代码(逐行对照字节码)

```kotlin
fun isEmulator(context: Context?): Boolean {

    // ── 信号1:QEMU 内核属性(反射读 SystemProperties)──
    if (SystemProperties.get("ro.kernel.qemu") == "1") return true

    // ── 信号2:拨号能力(平板豁免)──
    val canDial: Boolean = if (!isPad(context) && context != null) {
        Intent(ACTION_DIAL, Uri.parse("tel:123456"))
            .resolveActivity(context.packageManager) != null
    } else {
        true    // 平板/折叠屏默认视为"能拨号",跳过该项
    }

    // ── 信号3~8:Build 指纹族 ──
    val fp = Build.FINGERPRINT
    if (fp.startsWith("generic")
        || fp.lowercase().contains("vbox")
        || fp.lowercase().contains("test-keys")) return true

    val model = Build.MODEL
    if (model.contains("google_sdk")
        || model.contains("Emulator")
        || model.contains("Android SDK built for x86")
        || Build.MANUFACTURER.contains("Genymotion")) return true

    // ── 信号9~11:品牌/产品/运营商 ──
    if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic"))
        return true
    if (Build.PRODUCT == "google_sdk") return true
    if (TelephonyManager.getNetworkOperatorName().lowercase() == "android")
        return true

    // ── 信号2兜底:无拨号能力的手机 → 判为模拟器 ──
    if (!canDial) return true

    return false   // 全部通过 → 真机
}
```

## 信号清单与设计意图

| # | 检查项 | 抓什么 | 说明 |
|---|---|---|---|
| 1 | `ro.kernel.qemu == "1"` | 经典 AVD | QEMU 虚拟机内核属性,反射 `SystemProperties.get` 读取 |
| 2 | DIAL intent 可解析性 | 无拨号器的环境 | 模拟器/部分工控环境解析异常;**平板豁免**(isPad: screenLayout≥LARGE 或 DeviceUtils.isPad 或折叠展开态) |
| 3 | FINGERPRINT `startsWith("generic")` | AOSP 通用镜像 | `generic/<cpu>/sdk_phone` 形态 |
| 4 | FINGERPRINT 含 `vbox` | VirtualBox 系(Genymotion 底座) | |
| 5 | FINGERPRINT 含 `test-keys` | **非发布签名镜像** | ⚠️ 见下:误报源 |
| 6 | MODEL 含 `google_sdk` / `Emulator` / `Android SDK built for x86` | AVD 标准机型名 | |
| 7 | MANUFACTURER 含 `Genymotion` | Genymotion | |
| 8 | BRAND+DEVICE 均 `generic` 开头 | 通用镜像 | 注意是 AND 关系,单 generic 品牌**不**触发 |
| 9 | PRODUCT == `google_sdk` | AVD | |
| 10 | 运营商名 == `android` | 模拟器默认运营商 | 真机为 MCC/MNC 数字或真实名 |
| 11 | `!canDial` | 兜底 | 与 #2 同源 |

## 代码级细节(读字节码才能注意到的)

1. **异常兜底策略**:`createTopSpeedClockInRisk()` 里整个 risk 采集包在
   try/catch,任何异常 → 全 false 空对象照常上报,**不阻塞打卡**;
2. **`test-keys` 是双刃剑**:release 签名的第三方 ROM(LineageOS 等)
   FINGERPRINT 也含 `test-keys` → **刷机真机会被判为模拟器**(已知误报形态);
3. **拨号检查的攻击面/误报面**:不能解析 DIAL 的手机(极少数无拨号器
   定制 ROM)会命中兜底 → 误报;反过来它检测的是"包管理器里有没有
   Activity 响应 tel:",这与模拟器无强因果,更多是经验规则;
4. **短路顺序**:`ro.kernel.qemu` 放最前(最廉价且高置信),
   Build 族其次,TelephonyManager 最后(需系统服务调用);
5. **无传感器/性能检测**:没有用加速度计、电池、CPU 特征、
   `/proc` 扫描等现代手段——这是 2015 年代的经典检查集。

## 架构定位(重要)

```
检测(客户端,不可信)  ──上报──▶  裁量(服务端,可信)
security.a.i()                    is_emulator 进入 risk_info
                                  服务端结合其他信号决定:
                                  is_clock_in_succeed / clock_in_fail_code_name
```

客户端检测只产出**信号**,不做拦截——因为运行在用户设备上天然可绕过。
这批 Build 指纹信号用 `adb shell setprop`/改 ROM 即可伪造,单靠它们
防不住定制模拟器;真正的防线是服务端交叉验证(GPS/BSSID 地理一致性、
device_id 历史轨迹、频率)。这一点在 api-parameters.md §4 已论证。

## 防御视角小结(如果你在做同类系统)

这套实现可学习的点:信号采集与决策分离、异常兜底不阻塞业务、
按成本排序短路。可改进的点:`test-keys`/拨号检查误报率高、
缺少现代信号(传感器噪声特征、GL 渲染指纹、性能基准)、
单一时点快照可被一次性伪造——应结合时序与多信号交叉。
