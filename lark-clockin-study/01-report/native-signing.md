# Native 层签名与传输安全逆向报告

> 目标：补齐 Java 层看不到的请求签名/防重放/设备证明机制。
> 对象（均已提取至 `~/lark31/native-analysis/libs/`，arm64，全部 stripped）：
>
> | so | 大小 | 角色 |
> |---|---|---|
> | libsscronet.so | 4.7MB | TTNet（Cronet fork）网络内核，字节系安全头生成 |
> | libmetasec_ml.so | 2.4MB | Metasec ML 设备安全 SDK（X-Argus 签名引擎） |
> | libEncryptor.so | 83KB | ttEncrypt 请求体加密 |
> | libttcrypto.so | 1.2MB | BoringSSL fork（EVP_aes_* 密码学原语） |
> | liblark.so | 115MB | Lark Rust 核心（打卡 SEND_HTTP 隧道实际执行者） |
>
> 方法：readelf/objdump/strings 静态分析（主机未配 Ghidra，未安装）。
> 所有结论区分【观测】（字符串/符号直接可见）与【推断】（结合字节系公开逆向知识）。

---

## 1. 三条网络栈的分工（先厘清打卡请求走哪条）

```
┌─ Java 业务层 ─────────────────────────────────────────────┐
│ SpeedClockInModel → SdkSender.asynSendRequestNonWrap(     │
│     SEND_HTTP, protobuf封装的HTTP请求)                    │
└──────────────┬────────────────────────────────────────────┘
               ↓ protobuf 命令
┌─ Rust 核心 (liblark.so) ═══ 打卡请求实际走这条 ════════════┐
│ lark-biz-app/src/app/api/network/network_job.rs           │
│ · 按域名白名单附加 session cookie                          │
│ · 附加 x-request-id / x-tt-logid / passport 设备头        │
│ · 幂等控制器 (idempotency_controller) 防重放              │
│ · HttpDNS 支持 (op_request_httpdns)                       │
└───────────────────────────────────────────────────────────┘

┌─ TTNet 栈 (libsscronet.so + libmetasec_ml.so) ─ 设备注册/  ┐
│ AppLog/TNC设置/域名调度 —— X-Gorgon/X-Argus 签名在这条栈   │
└───────────────────────────────────────────────────────────┘

┌─ AppLog 加密 (libEncryptor.so) ─ 事件上报体 ttEncrypt ────┐
```

【观测】三条栈的分工意味着：打卡接口本身不直接要 Gorgon/Argus 头，
但它依赖 TTNet 栈完成的 **device_register**（did/iid/ttreq 全部由该流程签发）。

## 2. libsscronet.so —— TTNet 安全头家族【观测】

strings 直接命中以下请求头（字节系三代安全头体系）：

| 头 | 代际/用途（【推断】部分依公开逆向知识） |
|---|---|
| `x-ss-stub` | MD5(body) 摘要，防篡改 |
| `x-khronos` | 加密时间戳（防重放时钟源） |
| `x-gorgon` | 请求签名：URL参数+stub+时间戳派生 |
| `x-ladon` | Gorgon 的加密封装 |
| `x-argus` | protobuf 设备证明签名（由 metasec 生成） |
| `x-ss-req-ticket` | 请求票据 |
| `x-ss-tc` / `x-ss-dp` / `x-ss-canary` | 流量调度/数据路径/灰度 |
| `x-bd-client-key` / `x-tt-token` | 客户端密钥/令牌 |
| `x-metasec-*`（内部指标头） | TTNet→metasec 签名回调的计量：`x-metasec-process-mssdk-cost`、`x-metasec-bypass-mssdk` 等——**直接证明 TTNet 调用 metasec 做签名** |

**证书锁定**【观测】：Cronet 原生 pinning API 全套存在
（`Cronet_EngineParams_public_key_pins_add/at/size`、`Cronet_PublicKeyPins_*`
含 expiration/subdomains），加上 `cert_verify_flags`——pin 配置可由
TNC 远程下发更新。

## 3. libmetasec_ml.so —— X-Argus 签名引擎【观测】

- JNI 注册类：`com/bytedance/mobsec/metasec/ml/MS`（无 Java_ 静态导出，全部 RegisterNatives 动态注册）
- 签名引擎指标串：`http_sign_gen_all`、`http_sign_init_all`、
  **`http_sign_callstack_check_all`** —— 签名时校验调用栈，检测 Frida/hook 注入环境
- 反注入侦察：读取 `/proc/self/maps`、`/proc/{pid}/maps`（检测注入的 so）
- 设备指纹采集：`ro.arch`、`ro.build.version.sdk`、cpu_width、`risk_sensor`
  （传感器风控）、`disable_risk_sensor` 开关
- **`secdid`**：独立于 did/iid 的第三层"安全设备 ID"，注册 URL 模式
  `...iid=%s&did=%s&bd_did=%s&secdid=%s...` 中可见——服务端维护
  did/iid/secdid 三级设备身份
- 飞书定制痕迹：`[FeiShu] RunPreInitHooks/RunPostInitHooks`

## 4. libEncryptor.so —— ttEncrypt【观测】

- 仅导出 `JNI_OnLoad`；Java 侧契约为
  `com.bytedance.frameworks.encryptor.EncryptorUtil.a(byte[],int)`（调用点遍布
  retrofit2 mime/TypedByteArray、AppLog bridge）
- 用于**请求体加密**（AppLog 事件上报等）；>102400 字节跳过（Java 侧判断）
- 字符串混淆：.rodata 全部为相对偏移表，JNI_OnLoad 内含自定义 base64
  变体解码器（`0x3f` 掩码 + 6bit 分组 + `0x32f/0xfff` 魔数表），
  方法名运行时构造后 RegisterNatives

## 5. liblark.so —— Rust 核心（打卡隧道的真实防御）【观测】

这是本次最重要的增量发现，`lark-passport` / `lark-net-infra` /
`lark-biz-security` 模块字符串直接给出：

### 5.1 API 请求头组装（passport_utils.rs）

打卡类请求经 SEND_HTTP 隧道发出时附加：

- `X-Passport-Uni-Did`、`X-Passport-Device-Ids` —— **统一设备 ID 头**
- `X-Terminal-Type` —— 终端类型
- `X-Device-Info` —— `package_name;package_brand;tt_app_id;lark_version;
  rust_version;device_model;device_os;device_name`
- `X-Api-Version`（"1.0.301"）、`x-tt-logid`、`x-request-id`、
  `x-net-sdk-domain-dispatch`（域名调度）
- `X-Passport-DPoP`（Doubao token API 出现）—— DPoP 持有证明机制存在
- session cookie 注入逻辑：`!contains_session, add session`，受
  `cookie_host_whitelist` / `cookie_host_whitelist_sub_domain`
  （lark-net-infra/src/config/cookie_allow_list.rs）**域名白名单门禁**

### 5.2 防重放：幂等控制器

`lark-net-infra/src/idempotency_controller.rs` —— 网络层幂等控制，
同请求重复提交在客户端即被合并/拦截（与业务层 Mutex 串行互补）。

### 5.3 服务端下发的设备环境检测（重磅）

`lark-biz-security` 模块含完整协议结构（protobuf 字段名直接可读）：

```
GetDeviceEnvDetectSettingsRequest / Response:
  env_detect_settings:
    software_list:  SoftwareDetectItem{software_name, identifier, process_name}
    geo_settings:   GeoSettings{need_coordinate}
    network_settings: NetworkSettings{enabled, needDetectVPNProxy, needTimezone}
  pollingInterval
ReportDeviceEnvInfoResponse:
  isBlockedByPolicy   ← 服务端策略直接封禁
```

即：服务端可下发"检测哪些软件/进程、是否上报坐标、是否检测
**VPN/代理**、是否检测**时区**"的配置，客户端采集上报后由
`isBlockedByPolicy` 裁决——**打卡脚本若挂在 VPN/代理上或时区与
地理坐标矛盾，这条链直接命中**。

另有 `deviceToken` / `PostDeviceAuthTokenResponse` 设备认证令牌协议、
`lsc_decision_config`（安全决策下发）、`FetchDeviceCommandResponse`
（服务端向设备下发命令通道）。

### 5.4 SecureLink 域名白名单（防钓鱼/中间页）

内置正则白名单：`.*\.feishu\.cn$`、`.*\.larksuite\.com$`、
`.*\.feishu-pre\.cn$`、`^getfeishu\.cn$` 等 + 服务端可更新的
`sec_link_whitelist`，带 `link/safety/v2` 在线校验与错误熔断。

## 6. 综合：裸脚本面对的 native 层防线全景

```
脚本 POST /attendance/v2/clock_in/top_speed_clock_in
  │
  ├─ TLS 层：Cronet pinning（TNC 可更新 pins）【观测 API】
  │
  ├─ 头部层（Rust 核心组装）：
  │    ├─ session（域名白名单门禁注入）【观测】
  │    ├─ X-Passport-Uni-Did / X-Device-Info / X-Terminal-Type【观测】
  │    └─ x-request-id + 幂等控制器【观测】
  │
  ├─ 设备身份层（TTNet 栈产出）：
  │    ├─ did / iid / secdid 三级 ID【观测】
  │    ├─ ttreq 设备票据 cookie【观测(Java)】
  │    └─ device_register 注册画像【观测(Java)】
  │
  └─ 服务端裁决层：
       ├─ VPN/代理/时区/软件清单环境检测 + isBlockedByPolicy【观测协议】
       ├─ GPS/BSSID/IP 交叉验证【推断】
       └─ 设备信誉历史【推断】
```

**结论**：native 层没有"魔法签名"让打卡接口无法伪造——真实防御是
①签名/设备证明体系的**实现全部藏在动态 JNI + 字符串混淆 + Rust 闭源
模块中**（逆向成本），②did/iid/secdid/ttreq 构成的**设备信誉锚点**
（伪造成本），③VPN/时区/软件环境检测（运营成本）。脚本即使完整
复现协议，其设备信誉历史是空白的，且网络环境特征（代理/机房 IP）
会被 `isBlockedByPolicy` 链路捕获。

## 7. 证据文件索引

| 发现 | 文件 | 验证命令 |
|---|---|---|
| 安全头家族 | libsscronet.so | `strings -a libsscronet.so \| grep -E "x-(gorgon\|argus\|ladon\|khronos)"` |
| metasec JNI 类 | libmetasec_ml.so | `strings -a libmetasec_ml.so \| grep "com/"` |
| 调用栈校验 | libmetasec_ml.so | `strings ... \| grep http_sign_callstack` |
| passport 头 | liblark.so | `strings ... \| grep "X-Passport"` |
| VPN/时区检测 | liblark.so | `strings ... \| grep needDetectVPNProxy` |
| ttEncrypt 契约 | analysis/src*/.../EncryptorUtil 调用点 | Java 侧 `grep -rn ttEncrypt` |
| 幂等控制器 | liblark.so | `strings ... \| grep idempotency` |

## 8. 残留未知（诚实边界）

- X-Gorgon/X-Ladon/X-Argus 的**具体算法**未逆向（需 Ghidra + 动态调试，
  且混淆强度高；本次主机无 Ghidra 环境）
- X-Passport-DPoP 是否应用于 ems_oa 域名：未知（仅在 Doubao token API 观测到）
- 打卡接口是否校验 metasec 头：待黑盒验证（发一个无 Argus 头的请求对比）
- liblark.so 115MB 仅扫了字符串层，Rust 符号已 strip，
  函数级逻辑需进一步反编译
