# 飞书(Lark)极速打卡模块 — 逆向分析资料

本仓库是围绕 **飞书 / Lark Android 客户端 7.72.10** 的「极速打卡」(Top Speed Clock-In)
引擎所做的**纯静态逆向分析**资料集合。

> 分析方式:静态反编译与证据化工具链;未执行目标 APK,未连接任何生产服务。
> 使用边界见 [`lark-clockin-study/POLICY.md`](lark-clockin-study/POLICY.md)。

## 目录结构

```
lark31/
├── lark-clockin-study/        ★ 主要成果:学习包(报告 + 证据 + 精选源码)
│   ├── README.md              导读与学习路径
│   ├── POLICY.md              项目使用与边界规则(唯一规则来源)
│   ├── 01-report/             8 篇分析报告(流程 / 接口 / 传输防御 / native 签名 /
│   │                          采集机制 / 人脸核验 / 模拟器检测 / 虚拟定位防护)
│   ├── 02-evidence/           机器可读证据(JSON:包信息、类清单、REA 类成员清单等)
│   ├── 03-sources/            按模块归类的精选反编译 Java 源码
│   └── 04-tools/reproduce.md  工具链与复现步骤
│
├── analysis/                  JADX / REA 分析中间产物(JSON 证据)
│   ├── 01-package.json        包概览
│   ├── all-classes.json       全量类清单
│   ├── classes-*.json         若干类的成员清单
│   ├── clockin-classes.json   clockin 包类清单
│   └── scim-class.json
│
└── native-analysis/libs/      ★ 未入库(体积原因,见下)
```

## 未入库的大文件

以下文件是分析输入/对象而非成果,因体积过大未纳入 Git,需要时请自行从原始
APK 提取。SHA-256 记录在此以便校验:

| 文件 | 大小 | SHA-256 |
|---|---|---|
| `lark.apk` | 355 MB | `31585b7b637b19994b80d8fa1f6e4c5032bd80fe2be55584078a7b43aa94df99` |
| `851750695-lark20260904110428.apk` | 355 MB | 同上(与 `lark.apk` 字节完全相同) |
| `native-analysis/libs/liblark.so` | 110 MB | `909192d0ef7232d676b5dd2dbd5db2f0ac1909922d7a4f491175f5f52bd5c915` |
| `native-analysis/libs/libsscronet.so` | 4.5 MB | `7879b600bd16f4994f1ce7866e60ddf1df3da72ebc17e1c0ce22fa75bf07d9b7` |
| `native-analysis/libs/libmetasec_ml.so` | 2.3 MB | `004789edec4ca2f4f19b14b2fb70f02ce8f1950aa65acaaff04b6f925eda3230` |
| `native-analysis/libs/libttcrypto.so` | 1.2 MB | `76cd5792b0a35c78ec6ff7ee215d811391f9a76a5abace12191aee717b65f77d` |
| `native-analysis/libs/libEncryptor.so` | 84 KB | `3cb57530e52fe48172a84a3254d2ec1628cbacc74916de2d1562cf46999ab75e` |
| `native-analysis/libs/libEncryptorP.so` | 48 KB | `18ecb6926d3812d45b305fa18a6a785295a04f432fbd341425366e43ad111a2f` |

同时未入库的还有 `analysis/src*/`(JADX 全量反编译输出,约 3.5 万个 `.java`,
约 350 MB),其精选子集已按模块整理进 `lark-clockin-study/03-sources/`。

## 阅读顺序

1. [`lark-clockin-study/README.md`](lark-clockin-study/README.md) — 导读
2. [`lark-clockin-study/01-report/analysis-report.md`](lark-clockin-study/01-report/analysis-report.md) — 完整分析报告
3. [`lark-clockin-study/POLICY.md`](lark-clockin-study/POLICY.md) — 使用约束
