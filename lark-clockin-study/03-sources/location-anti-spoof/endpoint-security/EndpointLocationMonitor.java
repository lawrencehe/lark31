package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u00c0\u0002\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005J(\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationMonitor;", "", "<init>", "()V", "SERVICE_NAME", "", "reportRequestOnceLocation", "", "success", "", "durationMs", "", "reason", "reportStartContinuousLocation", "reportContinuousLocation", "action", "report", "event", "Event", "Action", "Reason", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ss.android.lark.endpoint.security.detection.location.c, reason: from Kotlin metadata */
/* loaded from: /tmp/larkdex/classes11.dex */
public final class EndpointLocationMonitor {
    public static final com.ss.android.lark.endpoint.security.detection.location.EndpointLocationMonitor a = new com.ss.android.lark.endpoint.security.detection.location.EndpointLocationMonitor();

    private EndpointLocationMonitor() {
    }

    public final void b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "action");
        am6.a.g(am6.a.a, "scs_endpoint_location", kotlin.collections.MapsKt.mapOf(new kotlin.Pair[]{kotlin.TuplesKt.to("event", "continuous_location"), kotlin.TuplesKt.to("action", str)}), (java.util.Map) null, (java.util.Map) null, 0, 28, (java.lang.Object) null);
    }

    public final void c(boolean z, long j, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "reason");
        a("request_once_location", z, j, str);
    }

    public final void d(boolean z, long j, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "reason");
        a("start_continuous_location", z, j, str);
    }

    private final void a(java.lang.String str, boolean z, long j, java.lang.String str2) {
        am6.a.g(am6.a.a, "scs_endpoint_location", kotlin.collections.MapsKt.mapOf(new kotlin.Pair[]{kotlin.TuplesKt.to("event", str), kotlin.TuplesKt.to("success", java.lang.Boolean.valueOf(z)), kotlin.TuplesKt.to("reason", str2)}), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("duration_ms", java.lang.Long.valueOf(j))), (java.util.Map) null, !z ? 1 : 0, 8, (java.lang.Object) null);
    }
}
