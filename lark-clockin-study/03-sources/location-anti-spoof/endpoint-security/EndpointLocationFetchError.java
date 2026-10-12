package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0006\u0007\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError;", "", "message", "", "<init>", "(Ljava/lang/String;)V", "Timeout", "SdkRequestRejected", "SdkReturnedNull", "RiskOfFakeLocation", "Network", "PsdaRestricted", "AdminGpsDisabled", "Unknown", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$AdminGpsDisabled;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$Network;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$PsdaRestricted;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$RiskOfFakeLocation;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$SdkRequestRejected;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$SdkReturnedNull;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$Timeout;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$Unknown;", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes11.dex */
public abstract class EndpointLocationFetchError extends java.lang.Throwable {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$AdminGpsDisabled;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AdminGpsDisabled extends com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError {
        public static final com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.AdminGpsDisabled INSTANCE = new com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.AdminGpsDisabled();

        private AdminGpsDisabled() {
            super("location_admin_gps_disabled", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$Network;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Network extends com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError {
        public static final com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.Network INSTANCE = new com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.Network();

        private Network() {
            super("location_network", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$PsdaRestricted;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PsdaRestricted extends com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError {
        public static final com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.PsdaRestricted INSTANCE = new com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.PsdaRestricted();

        private PsdaRestricted() {
            super("location_psda_restricted", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$RiskOfFakeLocation;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RiskOfFakeLocation extends com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError {
        public static final com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.RiskOfFakeLocation INSTANCE = new com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.RiskOfFakeLocation();

        private RiskOfFakeLocation() {
            super("location_risk_of_fake_location", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$SdkRequestRejected;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SdkRequestRejected extends com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError {
        public static final com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.SdkRequestRejected INSTANCE = new com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.SdkRequestRejected();

        private SdkRequestRejected() {
            super("location_sdk_request_rejected", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$SdkReturnedNull;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SdkReturnedNull extends com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError {
        public static final com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.SdkReturnedNull INSTANCE = new com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.SdkReturnedNull();

        private SdkReturnedNull() {
            super("location_sdk_returned_null", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$Timeout;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Timeout extends com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError {
        public static final com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.Timeout INSTANCE = new com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.Timeout();

        private Timeout() {
            super("location_timeout", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError$Unknown;", "Lcom/ss/android/lark/endpoint/security/detection/location/EndpointLocationFetchError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Unknown extends com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError {
        public static final com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.Unknown INSTANCE = new com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.Unknown();

        private Unknown() {
            super("location_unknown", null);
        }
    }

    public /* synthetic */ EndpointLocationFetchError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private EndpointLocationFetchError(java.lang.String str) {
        super(str);
    }
}
