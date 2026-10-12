# 传输层防御专项：裸脚本直接调用打卡接口要过的关卡
> 姊妹篇：`native-signing.md`（native 层签名与设备证明逆向）

> 问题定义：假设攻击者已逆向出打卡协议
> （`POST /attendance/v2/clock_in/top_speed_clock_in`），写了一个脚本
> 直接调用接口，绕过客户端全部逻辑。APK 里还有哪些机制用于防范这一点？
> 依据：`analysis/src*/sources` 反编译代码，均为字节级直接观测。
> 结论先行：**APK 层面没有"拦截"，只有"抬高门槛 + 留下统计证据"**。
> 真正的裁决在服务端设备信誉体系。

## 防御总览：五道关卡

```
脚本作者视角的攻击成本曲线：

  ①不知道往哪发、怎么发      （逆向成本）
  ②偷不到身份凭证三件套       （需要 root 自己的设备）
  ③复现不了请求完整性签名     （需逆向 so，见 §native）
  ④伪造的环境证明自带破绽     （与设备历史画像冲突）
  ⑤服务端交叉验证            ← 天花板，APK 内不可见
```

---

## 第 1 关：接口发现与传输通道（提高逆向成本）

| 机制 | APK 证据 |
|---|---|
| 域名不硬编码 | `SpeedClockInNetworkUtils.b()`：host 来自设置中心 `getDomain("ems_oa")` 动态下发。APK 内搜不到打卡域名 |
| 请求不走普通 Java HTTP 栈 | `SdkSender.asynSendRequestNonWrap(SEND_HTTP, ...)` 把 HTTP 请求封装成 protobuf（`SendHttpRequest`）走平台核心隧道，见 `lm4/b.java:97`（POST 封装）、`ttnet/i.java`（`forceInitCronetKernel()` 强制 Cronet 内核） |
| 签名逻辑下沉 native | `lm4/b.java:90` `"getDidByRustProxy"`——device_id 获取走 Rust 代理；请求头签名在 `libsscronet.so`/`libEncryptor.so`（见 §native 逆向） |
| 防用户装 CA 抓包 | `ttnet/LarkOpaqueData.kt`：`setHttpURLConnectionSelfCAPolicy` + 内置全套自签根证书白名单（反编译内可见完整 PEM 链） |

## 第 2 关：身份凭证三件套（AppLog 设备注册体系）

打卡请求的"身份"不是一个 session cookie，而是整套**设备注册链产物**
（`/service/2/device_register/`，AppLog/TTNet 体系）：

| 凭证 | 性质 | APK 证据 |
|---|---|---|
| `cookie: session=<...>` | 登录态，与设备绑定 | `SpeedClockInModel` 请求构造 |
| `device_id` / `install_id` | device_register 向服务端注册后签发，服务端存有该设备注册画像（何时首装、历史行为） | `InitSafetyNetInhouseTask` 中 `getDeviceId()`/`getInstallId()` 全程与风控联动 |
| `ttreq` cookie | **服务端签发的设备证明票据**，device_register 返回、定期刷新、被专门持久化并自动附加到后续关键请求 | `lm4/c.java`（`DeviceRegisterCookieUtil`）：`NEEDY_KEY_LIST = ["ttreq"]`，`saveNeedyCookies`/`getNeedyCookieHeader` |

另有 `AppLogProxyImplToB.addNetCommonParams()`（`sAppLog.f0(context,url,isApi,L0)`）
给每个请求 URL 追加 aid/iid/app 版本等公共参数——脚本需完整复现。

**要点**：偷 session 只解决"你是谁"；`ttreq`/did/iid 解决的是"这台设备可信吗"。
脚本要么偷（需持续 root，且服务端可见 ttreq 使用模式异常），要么没有。

## 第 3 关：请求完整性

| 机制 | 说明 | 证据 |
|---|---|---|
| `X-SS-STUB` | MD5(body) 摘要头，body 防篡改。脚本可复现但漏掉即拒 | `InitByteCertUtil$NetWork.appendSafeParams()`（实测 `t.d(base64(...))` 即 MD5） |
| native 签名头 | `X-SS-REQ-ID` 等 TTNet 层头/防重放逻辑在 native，Java 层不可见 | `libsscronet.so`（见 native 报告） |

## 第 4 关：环境证明与 APK 完整性

| 机制 | 说明 | 证据 |
|---|---|---|
| `need_risk_info` | 服务端可随时要求上报 risk_info（root/模拟器/debug/作弊App）。脚本不带→直接暴露；伪造→与服务端设备历史画像冲突 | `SpeedClockInConfigData`；`anti-cheat/a.java` |
| BDMS（字节移动安全） | `checkSignStatus()` 校验 APK 签名，失败 `doApkInvalidation()` **直接 kill 进程**（防重打包）；监控 did 变化（`onDeviceIdChange`→`BDMSManager`） | `safetynet/InitSafetyNetInhouseTask` |
| ByteCert 设备证书 SDK | 以 `com.ss.android.lark.plugin.byted_cert` **动态插件**形式存在——服务端可随时升级对抗逻辑而不发新 APK | `bytecert/ByteCertSdkProvider.java`：`mira.d.n("com.ss.android.lark.plugin.byted_cert")` |
| BDMS 配套 so | `libbdsword.so`（安全探针）等 | lib 清单 |

## 第 5 关：服务端裁决（APK 内不可见，由协议语义推断）

- `is_need_speed_clock_in`：服务端决定"现在该不该打卡"。正常客户端由**长连接推送**
  （`PUSH_ATTENDANCE_TOP_SPEED_CLOCK_IN`）或前台触发；脚本盲目定时 POST，
  请求时间分布与真实用户画像不符。
- session↔device_id↔IP↔GPS↔BSSID 五方交叉验证（`is_in_env` 响应语义）。
- 同一 device_id 的异常模式聚类（单设备多账号=群控特征）。

## 与 api-parameters.md 结论的衔接

此前分析确认"客户端检测只采集不拦截"。本篇补齐了传输层视角：
客户端在**协议之外**还维护了一个设备信誉体系（AppLog 注册 + ttreq + BDMS
+ ByteCert），它们的防御逻辑不是阻止请求发出，而是让伪造请求
**自带"我是假的"统计特征**（凭证缺失、指纹突变、时序异常）。

## 攻击成本分级

| 攻击等级 | 手段 | 被什么挡住 |
|---|---|---|
| L1 脚本小子 | 抓包后直接 POST | 公共参数缺失/X-SS-STUB 缺失 → 网关直接拒 |
| L2 逆向者 | 完整复现协议+签名 | ttreq 无法伪造，只能偷 → 设备信誉异常 |
| L3 root 持久偷凭证 | Xposed/Frida hook 注入 | BDMS 签名校验+risk_info 上报 → 服务端画像突变 |
| L4 设备农场 | 真机+真凭证批量打卡 | device_id/网络/行为聚类 → 服务端离线挖掘，延迟处罚 |

## 后续工作

- [x] native 层签名细节逆向（`libEncryptor.so`/`libsscronet.so`）→ 见
  `native-signing.md`（同目录）
