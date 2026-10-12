package v83;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B;\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/GetScanWifiListResult;", "Lcom/ss/android/lark/appstrategy/clockin/dto/BaseResult;", "status", "Lcom/ss/android/lark/appstrategy/clockin/dto/Status;", "errCode", "", "errMsg", "", "scanResults", "", "Landroid/net/wifi/ScanResult;", "<init>", "(Lcom/ss/android/lark/appstrategy/clockin/dto/Status;ILjava/lang/String;Ljava/util/List;)V", "getScanResults", "()Ljava/util/List;", "Success", "Fail", "NoPermission", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetScanWifiListResult$Fail;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetScanWifiListResult$NoPermission;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetScanWifiListResult$Success;", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes8.dex */
public abstract class d extends v83.a {
    private final java.util.List<android.net.wifi.ScanResult> d;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/GetScanWifiListResult$NoPermission;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetScanWifiListResult;", "<init>", "()V", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends v83.d {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public b() {
            super(com.ss.android.lark.appstrategy.clockin.dto.Status.NO_PERMISSION, -1, "no permission", null, 8, null);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.ss.android.lark.appstrategy.clockin.dto.Status), (r2v0 int), (r3v0 java.lang.String), (r4v0 java.util.List) A[MD:(com.ss.android.lark.appstrategy.clockin.dto.Status, int, java.lang.String, java.util.List<android.net.wifi.ScanResult>):void (m)] call: v83.d.<init>(com.ss.android.lark.appstrategy.clockin.dto.Status, int, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ d(com.ss.android.lark.appstrategy.clockin.dto.Status status, int i, java.lang.String str, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(status, i, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<android.net.wifi.ScanResult> d() {
        return this.d;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/GetScanWifiListResult$Success;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetScanWifiListResult;", "scanResults", "", "Landroid/net/wifi/ScanResult;", "<init>", "(Ljava/util/List;)V", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends v83.d {
        public c(java.util.List<android.net.wifi.ScanResult> list) {
            super(com.ss.android.lark.appstrategy.clockin.dto.Status.SUCCESS, 0, "success", list, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/GetScanWifiListResult$Fail;", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetScanWifiListResult;", "errCode", "", "errMsg", "", "<init>", "(ILjava/lang/String;)V", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends v83.d {
        public a(int i, java.lang.String str) {
            super(com.ss.android.lark.appstrategy.clockin.dto.Status.FAIL, i, str, null, 8, null);
        }
    }

    private d(com.ss.android.lark.appstrategy.clockin.dto.Status status, int i, java.lang.String str, java.util.List<android.net.wifi.ScanResult> list) {
        super(status, i, str);
        this.d = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(com.ss.android.lark.appstrategy.clockin.dto.Status status, int i, java.lang.String str, java.util.List list, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        java.lang.String str2;
        java.util.List list2;
        com.ss.android.lark.appstrategy.clockin.dto.Status status2 = (i2 & 1) != 0 ? com.ss.android.lark.appstrategy.clockin.dto.Status.NO_PERMISSION : status;
        if ((i2 & 2) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i2 & 8) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        this(status2, i3, str2, list2, null);
    }
}
