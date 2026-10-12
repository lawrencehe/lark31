package com.ss.android.lark.appstrategy.clockin.state;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\tH\u0002\u00a8\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/state/SpeedClockInWifiManager;", "", "<init>", "()V", "getConnectedWifiInfo", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetConnectedWifiInfoResult;", "getScanWifiList", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetScanWifiListResult;", "startScan", "", "getWifiManager", "Landroid/net/wifi/WifiManager;", "checkPermission", "Companion", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ss.android.lark.appstrategy.clockin.state.b, reason: from Kotlin metadata */
/* loaded from: /tmp/larkdex/classes8.dex */
public final class SpeedClockInWifiManager {
    public static final com.ss.android.lark.appstrategy.clockin.state.SpeedClockInWifiManager.a a = new com.ss.android.lark.appstrategy.clockin.state.SpeedClockInWifiManager.a(null);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/state/SpeedClockInWifiManager$Companion;", "", "<init>", "()V", "ERR_CODE_GET_WIFI_MANAGER_ERROR", "", "ERR_MSG_GET_WIFI_MANAGER_ERROR", "", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.ss.android.lark.appstrategy.clockin.state.b$a */
    public static final class a {
        private a() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.ss.android.lark.appstrategy.clockin.state.b.a.<init>():void type: THIS */
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static android.net.wifi.WifiInfo b(android.net.wifi.WifiManager wifiManager) {
        cw0.d dVarB = new cw0.c().b(102301, "android/net/wifi/WifiManager", "getConnectionInfo", wifiManager, new java.lang.Object[0], "android.net.wifi.WifiInfo", new cw0.b(false, "()Landroid/net/wifi/WifiInfo;", "-1353233334781815241"));
        return dVarB.b() ? (android.net.wifi.WifiInfo) dVarB.a() : wifiManager.getConnectionInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final boolean a() {
        if (u83.b.b().getFgValue("attendance.top_speed_clock_in.forbid_bssid")) {
            return false;
        }
        android.app.Application application = com.ss.android.lark.utils.LarkContext.getApplication();
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (androidx.core.content.ContextCompat.checkSelfPermission(application, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                return false;
            }
        } else if (i == 28) {
            boolean z = androidx.core.content.ContextCompat.checkSelfPermission(application, "android.permission.ACCESS_FINE_LOCATION") == 0;
            boolean z2 = androidx.core.content.ContextCompat.checkSelfPermission(application, "android.permission.ACCESS_COARSE_LOCATION") == 0;
            if (!z && !z2) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final v83.b c() {
        if (!a()) {
            return new v83.b.C0233b();
        }
        try {
            android.net.wifi.WifiInfo wifiInfoB = b(e());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wifiInfoB, "getConnectionInfo(...)");
            return new v83.b.c(wifiInfoB);
        } catch (java.lang.Exception unused) {
            return new v83.b.a(-100, "get WifiManager error");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final v83.d d() {
        if (!a()) {
            return new v83.d.b();
        }
        try {
            return new v83.d.c(mp1.a.a.l(e(), "LARK-PSDA-op_api_wifi_get_scan_results_speed_clock"));
        } catch (java.lang.Exception unused) {
            return new v83.d.a(-100, "get WifiManager error");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.net.wifi.WifiManager e() {
        java.lang.Object objS = u1.a.s(com.ss.android.lark.utils.LarkContext.getApplication().getApplicationContext(), "wifi");
        kotlin.jvm.internal.Intrinsics.checkNotNull(objS, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        return (android.net.wifi.WifiManager) objS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean f() {
        if (!a()) {
            return false;
        }
        try {
            return mp1.a.a.x(e(), "LARK-PSDA-op_api_wifi_start_scan_speed_clock");
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
