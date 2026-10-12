# 复现手册:飞书极速打卡模块逆向分析

完整记录本次分析的工具链与操作步骤,可照抄复现。

## 0. 环境要求

| 组件 | 版本 | 用途 |
|---|---|---|
| Java(JDK) | OpenJDK 21 | 运行 REA JADX 引擎 |
| rea-agents | 6.3.0(npm) | REA CLI(证据化分析) |
| jadx-headless-mcp | 0.7.1 | REA 的 Android 分析引擎(BYO) |
| jadx CLI | 1.5.2 | 批量反编译(读整包源码) |
| 内存 | ≥13GB 可用 | 引擎堆 8GB + jadx |

```bash
# 依赖安装
mkdir -p ~/tools
# jadx CLI
curl -sL -o ~/tools/jadx.zip https://github.com/skylot/jadx/releases/download/v1.5.2/jadx-1.5.2.zip
unzip -q -o ~/tools/jadx.zip -d ~/tools/jadx-1.5.2 && chmod +x ~/tools/jadx-1.5.2/bin/jadx
# REA 的 JADX MCP 引擎(SHA-256 校验:6e5eacf5...ff75)
curl -sL -o ~/tools/jadx-headless-mcp-0.7.1-all.jar \
  https://github.com/1013503897/jadx-headless-mcp/releases/download/v0.7.1/jadx-headless-mcp-0.7.1-all.jar

# REA CLI(本地安装;原版 120s 超时不够加载 371MB APK,已把
# dist/android/JadxProvider.js 的 OPERATION_TIMEOUT_MS 调至 30 分钟)
mkdir -p ~/rea-cli && cd ~/rea-cli && npm init -y && npm install rea-agents@6.3.0
sed -i 's/OPERATION_TIMEOUT_MS = 120_000;/OPERATION_TIMEOUT_MS = 1_800_000;/' \
  node_modules/rea-agents/dist/android/JadxProvider.js
sed -i 's/{ timeout: 120_000, signal }/{ timeout: 600_000, signal }/' \
  node_modules/rea-agents/dist/android/JadxSession.js
cat > run.sh << 'EOF'
#!/bin/bash
export REA_JADX_MCP_JAR=/home/opc/tools/jadx-headless-mcp-0.7.1-all.jar
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk
export REA_JADX_HEAP_MIB=8192
cd ~/rea-cli && ./node_modules/.bin/rea "$@"
EOF
chmod +x run.sh
```

## 1. 包概览(REA,产出证据 JSON)

```bash
~/rea-cli/run.sh inspect-android-package ~/31/lark.apk --format json > 01-package.json
# → 包名/版本/权限/manifest 全文,APK 加载耗时 ~110s,136,068 类
```

注意:文件名必须以 `.apk` 结尾(`.apk.1` 会被识别为 zip 拒绝)。

## 2. 定位打卡类

REA 的 search-android-classes 在该 APK 上因类清单校验失败
("inventory duplicated or differs"),但其 partial_observation 里包含了
完整分页 list_classes 结果 → 从失败 JSON 中本地提取全量类名:

```bash
python3 - << 'EOF'
import json
d = json.load(open('classes-attendance.json'))   # 失败的搜索结果
names, seen = [], set()
for c in d['details']['partial_observation']['calls']:
    if c['operation'] != 'list_classes': continue
    j = json.loads(c['response']['content'][0]['text'])
    for n in j['items']:
        if n not in seen: seen.add(n); names.append(n)
json.dump(names, open('all-classes.json','w'))
EOF
# 关键词过滤:attendance / clockin / Punch / sapass / Timesheet ...
# → 命中 com.ss.android.lark.appstrategy.clockin.*(19 类)
```

## 3. 定位目标类所在 dex

```bash
unzip -q ~/31/lark.apk 'classes*.dex' -d /tmp/larkdex
for f in /tmp/larkdex/classes*.dex; do
  grep -q "appstrategy/clockin" "$f" && echo "FOUND in $f"
done
# → classes8.dex(主体)、classes14.dex(入口装配)
```

## 4. 批量反编译(只反编译相关 dex,加 --show-bad-code 兜底)

```bash
~/tools/jadx-1.5.2/bin/jadx --no-res --no-imports --escape-unicode \
  --show-bad-code --comments-level debug -j 4 -d src3 /tmp/larkdex/classes8.dex
~/tools/jadx-1.5.2/bin/jadx --no-res --no-imports --escape-unicode \
  --show-bad-code -j 4 -d src14 /tmp/larkdex/classes14.dex
# 协议/风控/日历签到类用 --single-class 定点提取(见 03-sources 各子目录)
```

经验:
- `--single-class` 每次都要重载 dex,逐类跑 19 个类会超时;优先反编译整个 dex 再挑目录
- 反编译失败的方法(`Method dump skipped`)必须加 `--show-bad-code` 重跑才可见
- Kotlin `@Metadata` 的 d2 数组保留了原始方法名/参数名,是读混淆代码的地图

## 5. 阅读顺序建议(对应 03-sources)

1. `clockin-core/SpeedClockInManager.java` — 先看 @Metadata d2 里的方法清单
2. `clockin-core/network/SpeedClockInNetworkUtils.java` — URL 在这
3. `clockin-core/state/SpeedClockInModel.java` — d() 是打卡主流程,c() 是拉配置
4. `clockin-core/entity/*` — 协议字段(@SerializedName)
5. `anti-cheat/a.java` — 风控检测
6. `attendance-push-protobuf/` — 长连接推送协议
7. `entry-wiring/OpenPlatformApiImpl.java` — 谁在调用 Manager

## 6. 踩坑记录

| 坑 | 解法 |
|---|---|
| `.apk.1` 后缀被拒 | 复制改名为 `.apk` |
| REA CLI 120s 操作超时 | 本地安装并调大 OPERATION_TIMEOUT_MS |
| 6GB JVM 堆 OOM | 必须 8GB(REA_JADX_HEAP_MIB=8192) |
| `pkill -f jadx` 自杀 shell | pkill 匹配到了自身命令行,换精确模式 |
| search-android-classes 完整性校验失败 | 从 partial_observation 提取分页结果,本地过滤 |
| 个别方法 `Method dump skipped` | `--show-bad-code` 重跑(注意分支极性可能有伪影) |
