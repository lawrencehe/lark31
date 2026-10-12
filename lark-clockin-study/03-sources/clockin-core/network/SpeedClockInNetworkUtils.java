package com.ss.android.lark.appstrategy.clockin.network;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\b\u0010\r\u001a\u00020\u0005H\u0002R\u0011\u0010\u0004\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/network/SpeedClockInNetworkUtils;", "", "<init>", "()V", "urlConfig", "", "getUrlConfig", "()Ljava/lang/String;", "urlClockIn", "getUrlClockIn", "getBaseRequestParams", "", "traceId", "getHost", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ss.android.lark.appstrategy.clockin.network.a, reason: from Kotlin metadata */
/* loaded from: /tmp/larkdex/classes8.dex */
public final class SpeedClockInNetworkUtils {
    public static final com.ss.android.lark.appstrategy.clockin.network.SpeedClockInNetworkUtils a = new com.ss.android.lark.appstrategy.clockin.network.SpeedClockInNetworkUtils();

    private SpeedClockInNetworkUtils() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final java.lang.String b() {
        return "https://" + u83.b.b().getDomain("ems_oa");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String c() {
        return b() + "/attendance/v2/clock_in/top_speed_clock_in";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String d() {
        return b() + "/attendance/v2/clock_in/get_top_speed_clock_in_config";
    }

    public final java.util.Map<java.lang.String, java.lang.Object> a(java.lang.String str) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("device_trace_id", str);
        }
        return linkedHashMap;
    }
}
