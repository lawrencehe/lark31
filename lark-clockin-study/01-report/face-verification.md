# 人脸识别与打卡的关系 — 专项分析

> 问题:打卡流程有没有可能需要人脸识别?
> 结论:**极速打卡原生接口不含人脸;但 APK 内置完整人脸验证技术栈,
> 考勤 H5 应用可在管理员开启"人脸打卡"后经 JSB 调起。是否触发由
> 服务端配置决定,静态分析只能给出能力面,不能给出租户配置。**

## 1. 三套人脸技术栈(全部在 APK 内,共 180+ 类)

| 技术栈 | 包名 | 角色 |
|---|---|---|
| **ByteCert 字节认证 SDK** | `com.ss.android.bytedcert.*`(113 类) | 在线人脸核身:相机/GL 渲染/活体(FaceLiveness/StillLiveness)/NFC 证件/H5 回调 |
| **Toyger 生物识别容器** | `com.dtf.toyger.*` + `com.dtf.face.ui.*`(43 类) | 算法容器:活体配置/人脸帧/深度帧/RSA 加密/远近动作 UI |
| **Zoloz(蚂蚁)** | `com.alipay.zoloz.toyger.*` | 支付链路复用的人脸算法(与考勤无关,佐证技术栈复用) |

## 2. H5 可调用的人脸 JSB API(实测 @ApiConfig 注解)

考勤 H5/小程序页面可通过 JSBridge 调用以下原生能力:

| JS API 名 | 插件类 | 功能 |
|---|---|---|
| `startFaceVerify` | StartFaceVerifyPlugin | **在线人脸核身**:H5 传 `actionsScene`/`userId`/`reqNo` → 服务端下发 `ticket`/`scene`/`appId`/`mode` → 原生 SDK 完成采集活体 → 结果绑定 ticket 回传 |
| `checkLocalFaceVerify` | OfflineFaceCheckPlugin | **离线人脸就绪检查**:`{checkUpdate:bool}` → 检查本地人脸特征是否已准备 |
| `startLocalFaceVerify` | OfflineFaceStartPlugin | **离线本地比对**:用已 enrolled 的本地特征做人脸校验 |
| `acquireFaceImage` | AcquireFaceImagePlugin | 采集人脸图片 |

另有 `OfflineFacePreparePlugin`(离线特征录入准备)、`SetAuthInfoPlugin`。

**离线方案的存在**强烈暗示考勤场景:弱网/无网时打卡仍需人脸,
预录入特征 + 本地比对 + 事后同步,与"极速打卡无感"理念一致。

## 3. 与打卡流程的关系(推断,标注证据强度)

```
管理员开启「人脸打卡」(租户级配置,服务端)
        │
        ▼
考勤 H5 页面(服务端动态下发,不在 APK 内)
        │  JSB: startFaceVerify / startLocalFaceVerify
        ▼
原生人脸 SDK(bytedcert/toyger)完成活体+比对
        │
        ▼
结果/凭证 上传服务端 → 打卡记录
```

- **实测**:原生极速打卡接口(`top_speed_clock_in`)的请求体**没有任何
  照片/人脸字段**(见 api-parameters.md §3);
- **实测**:APK 内置上述完整人脸能力 + JSB 出口;
- **推断**(非观测):H5 考勤应用在"人脸打卡"开启时会调用这些 JSB API;
  具体 URL/参数在 H5 包内,随服务端下发,静态不可见;
- **未知**:你所在租户是否启用了人脸打卡——这取决于企业管理员配置,
  只能登录后从考勤设置里看。

## 4. 场景开关的服务端控制

`FaceAuthActionsSceneSettings`:`@AppConfig(key="faceAuthActionsScene")`
从设置中心下发 `appIds` 列表——**人脸动作场景按应用白名单动态启用**,
进一步说明人脸验证是按需/按租户配置的能力,而非全局强制。

## 5. 学习材料索引

- `03-sources/face-verification/jsb-plugins/` — 6 个 JSB 插件源码
  (重点看 `@ApiConfig` 注解的 API 名与请求/响应模型)
- bytedcert/toyger SDK 主体未摘录(113+43 类,均在线,可用复现手册
  步骤 3/4 定位 dex 自行提取)

## 6. 人脸校验与打卡接口的关系

即便绕过 H5 直接调打卡接口,人脸校验发生在**服务端对凭证的核验**
(ticket 由服务端签发并绑定用户/场景,SDK 采集结果与 ticket 关联),
本地伪造 GPS/BSSID 不覆盖人脸租户的场景。
