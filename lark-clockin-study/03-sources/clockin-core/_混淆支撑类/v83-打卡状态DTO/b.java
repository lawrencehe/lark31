package v83;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B/\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0011\u0012\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/GetConnectedWifiInfoResult;", "Lcom/ss/android/lark/appstrategy/clockin/dto/BaseResult;", "status", "Lcom/ss/android/lark/appstrategy/clockin/dto/Status;", "errCode", "", "errMsg", "", "wifiInfo", "Landroid/net/wifi/WifiInfo;", "<init>", "(Lcom/ss/android/lark/appstrategy/clockin/dto/Status;ILjava/lang/String;Landroid/net/wifi/WifiInfo;)V", "getWifiInfo", "()Landroid/net/wifi/WifiInfo;", "Success", "Fail", "NoPermission", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetConnectedWifiInfoResult$Fail;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetConnectedWifiInfoResult$NoPermission;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetConnectedWifiInfoResult$Success;", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes8.dex */
public abstract class b extends v83.a {
    private final android.net.wifi.WifiInfo d;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/GetConnectedWifiInfoResult$NoPermission;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetConnectedWifiInfoResult;", "<init>", "()V", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: v83.b$b, reason: collision with other inner class name */
    public static final class C0233b extends v83.b {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C0233b() {
            super(com.ss.android.lark.appstrategy.clockin.dto.Status.NO_PERMISSION, -1, "no permission", null, 8, null);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
      (r1v0 com.ss.android.lark.appstrategy.clockin.dto.Status)
      (r2v0 int)
      (r3v0 java.lang.String)
      (r4v0 android.net.wifi.WifiInfo)
     A[MD:(com.ss.android.lark.appstrategy.clockin.dto.Status, int, java.lang.String, android.net.wifi.WifiInfo):void (m)] call: v83.b.<init>(com.ss.android.lark.appstrategy.clockin.dto.Status, int, java.lang.String, android.net.wifi.WifiInfo):void type: THIS */
    public /* synthetic */ b(com.ss.android.lark.appstrategy.clockin.dto.Status status, int i, java.lang.String str, android.net.wifi.WifiInfo wifiInfo, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(status, i, str, wifiInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* renamed from: d, reason: from getter */
    public final android.net.wifi.WifiInfo getD() {
        return this.d;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/GetConnectedWifiInfoResult$Success;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetConnectedWifiInfoResult;", "wifiInfo", "Landroid/net/wifi/WifiInfo;", "<init>", "(Landroid/net/wifi/WifiInfo;)V", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends v83.b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(android.net.wifi.WifiInfo wifiInfo) {
            super(com.ss.android.lark.appstrategy.clockin.dto.Status.SUCCESS, 0, "success", wifiInfo, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wifiInfo, "wifiInfo");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/GetConnectedWifiInfoResult$Fail;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetConnectedWifiInfoResult;", "errCode", "", "errMsg", "", "<init>", "(ILjava/lang/String;)V", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends v83.b {
        public a(int i, java.lang.String str) {
            super(com.ss.android.lark.appstrategy.clockin.dto.Status.FAIL, i, str, null, 8, null);
        }
    }

    private b(com.ss.android.lark.appstrategy.clockin.dto.Status status, int i, java.lang.String str, android.net.wifi.WifiInfo wifiInfo) {
        super(status, i, str);
        this.d = wifiInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
      (r7v0 com.ss.android.lark.appstrategy.clockin.dto.Status)
      (r8v0 int)
      (r9v0 java.lang.String)
      (wrap:android.net.wifi.WifiInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (8 int) A[WRAPPED] (LINE:100663296)) != (0 int)) ? (null android.net.wifi.WifiInfo) : (r10v0 android.net.wifi.WifiInfo))
      (null kotlin.jvm.internal.DefaultConstructorMarker)
     A[MD:(com.ss.android.lark.appstrategy.clockin.dto.Status, int, java.lang.String, android.net.wifi.WifiInfo, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:100663307) call: v83.b.<init>(com.ss.android.lark.appstrategy.clockin.dto.Status, int, java.lang.String, android.net.wifi.WifiInfo, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ b(com.ss.android.lark.appstrategy.clockin.dto.Status status, int i, java.lang.String str, android.net.wifi.WifiInfo wifiInfo, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(status, i, str, (i2 & 8) != 0 ? null : wifiInfo, null);
    }
}
