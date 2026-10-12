package com.ss.android.lark.endpoint.security.detection.factor;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportResult;", "", "code", "", "<init>", "(J)V", "getCode", "()J", "isSuccess", "", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ss.android.lark.endpoint.security.detection.factor.b, reason: from Kotlin metadata and from toString */
/* loaded from: /tmp/larkdex/classes11.dex */
public final /* data */ class EndpointSecurityFactorReportResult {

    /* renamed from: a, reason: from toString */
    private final long code;

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportResult) && this.code == ((com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportResult) other).code;
    }

    public int hashCode() {
        return androidx.collection.j.a(this.code);
    }

    public java.lang.String toString() {
        return "EndpointSecurityFactorReportResult(code=" + this.code + ')';
    }

    public final boolean b() {
        return this.code == 0;
    }

    /* renamed from: a, reason: from getter */
    public final long getCode() {
        return this.code;
    }

    public EndpointSecurityFactorReportResult(long j) {
        this.code = j;
    }
}
