package com.ss.android.lark.endpoint.security.detection.factor;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u000b\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError;", "", "message", "", "<init>", "(Ljava/lang/String;)V", "LocationPermissionDenied", "LocationPermissionDeniedBefore", "PayloadEncodeFailed", "LocationServicesDisabled", "LocationAdminDisabledGPS", "LocationNotAuthorizedAlways", "LocationPSDARestricted", "LocationTimeout", "LocationNetwork", "LocationRiskOfFakeLocation", "LocationUnknown", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationAdminDisabledGPS;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationNetwork;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationNotAuthorizedAlways;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationPSDARestricted;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationPermissionDenied;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationPermissionDeniedBefore;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationRiskOfFakeLocation;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationServicesDisabled;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationTimeout;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationUnknown;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$PayloadEncodeFailed;", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes11.dex */
public abstract class EndpointSecurityFactorReportError extends java.lang.Throwable {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationAdminDisabledGPS;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationAdminDisabledGPS extends com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError {
        public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationAdminDisabledGPS INSTANCE = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationAdminDisabledGPS();

        private LocationAdminDisabledGPS() {
            super("location_admin_disabled_gps", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationNetwork;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationNetwork extends com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError {
        public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationNetwork INSTANCE = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationNetwork();

        private LocationNetwork() {
            super("location_network", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationNotAuthorizedAlways;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationNotAuthorizedAlways extends com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError {
        public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationNotAuthorizedAlways INSTANCE = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationNotAuthorizedAlways();

        private LocationNotAuthorizedAlways() {
            super("location_not_authorized_always", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationPSDARestricted;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationPSDARestricted extends com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError {
        public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationPSDARestricted INSTANCE = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationPSDARestricted();

        private LocationPSDARestricted() {
            super("location_psda_restricted", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationPermissionDenied;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationPermissionDenied extends com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError {
        public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationPermissionDenied INSTANCE = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationPermissionDenied();

        private LocationPermissionDenied() {
            super("location_permission_denied", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationPermissionDeniedBefore;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationPermissionDeniedBefore extends com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError {
        public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationPermissionDeniedBefore INSTANCE = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationPermissionDeniedBefore();

        private LocationPermissionDeniedBefore() {
            super("location_permission_denied_before", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationRiskOfFakeLocation;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationRiskOfFakeLocation extends com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError {
        public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationRiskOfFakeLocation INSTANCE = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationRiskOfFakeLocation();

        private LocationRiskOfFakeLocation() {
            super("location_risk_of_fake_location", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationServicesDisabled;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationServicesDisabled extends com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError {
        public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationServicesDisabled INSTANCE = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationServicesDisabled();

        private LocationServicesDisabled() {
            super("location_services_disabled", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationTimeout;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationTimeout extends com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError {
        public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationTimeout INSTANCE = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationTimeout();

        private LocationTimeout() {
            super("location_timeout", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$LocationUnknown;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LocationUnknown extends com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError {
        public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationUnknown INSTANCE = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationUnknown();

        private LocationUnknown() {
            super("location_unknown", null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError$PayloadEncodeFailed;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportError;", "<init>", "()V", "endpoint-security-detection-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PayloadEncodeFailed extends com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError {
        public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.PayloadEncodeFailed INSTANCE = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.PayloadEncodeFailed();

        private PayloadEncodeFailed() {
            super("payload_encode_failed", null);
        }
    }

    public /* synthetic */ EndpointSecurityFactorReportError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private EndpointSecurityFactorReportError(java.lang.String str) {
        super(str);
    }
}
