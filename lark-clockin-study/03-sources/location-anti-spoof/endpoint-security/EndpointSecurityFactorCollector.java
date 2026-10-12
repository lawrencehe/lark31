package com.ss.android.lark.endpoint.security.detection.factor;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\r\u001a\u00020\u0005J\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u0017\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000fH\u0002\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\t\u00a8\u0006!"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorCollector;", "", "<init>", "()V", "TAG", "", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "Lcom/google/gson/Gson;", "parsePushConfig", "Lcom/ss/android/lark/endpoint/security/detection/factor/model/EndpointSecCollectionConfig;", "json", "currentTimezoneId", "getAutoTimeZone", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Boolean;", "encodePayload", "config", "location", "Lcom/ss/android/lark/location/dto/LarkLocation;", "buildGeoInfo", "Lcom/google/gson/JsonElement;", "buildNetworkInfo", "Lcom/google/gson/JsonObject;", "autoTimezoneState", "", "enabled", "(Ljava/lang/Boolean;)I", "parseB64ExtraJsonObject", "b64Extra", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ss.android.lark.endpoint.security.detection.factor.a, reason: from Kotlin metadata */
/* loaded from: /tmp/larkdex/classes11.dex */
public final class EndpointSecurityFactorCollector {
    public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorCollector a = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorCollector();
    private static final com.google.gson.Gson b = new com.google.gson.GsonBuilder().serializeNulls().create();

    private EndpointSecurityFactorCollector() {
    }

    public final java.lang.String d() {
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "getID(...)");
        return id;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final int a(java.lang.Boolean bool) throws kotlin.NoWhenBranchMatchedException {
        if (kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.TRUE)) {
            return 1;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.FALSE)) {
            return 2;
        }
        if (bool == null) {
            return 0;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final java.lang.Boolean f(android.content.Context context) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            boolean z = true;
            if (android.provider.Settings.Global.getInt(context.getContentResolver(), "auto_time_zone") != 1) {
                z = false;
            }
            obj = kotlin.Result.constructor-impl(java.lang.Boolean.valueOf(z));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            java.lang.String str = "getAutoTimeZone failed: " + th2.getMessage();
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityFactorCollector", "55");
            com.ss.android.lark.log.Log.w("EMM_FactorCollector", str);
        }
        if (kotlin.Result.isFailure-impl(obj)) {
            obj = null;
        }
        return (java.lang.Boolean) obj;
    }

    public final rc4.EndpointSecCollectionConfig g(java.lang.String str) {
        boolean z;
        java.lang.Object obj;
        if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
            z = false;
        } else {
            z = true;
        }
        java.lang.Object obj2 = null;
        if (z) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityFactorCollector", "37");
            com.ss.android.lark.log.Log.w("EMM_FactorCollector", "parsePushConfig: empty json");
            return null;
        }
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityFactorCollector", "40");
        com.ss.android.lark.log.Log.i("EMM_FactorCollector", "parsePushConfig: raw=" + str);
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(((rc4.EndpointSecurityPushConfig) b.fromJson(str, rc4.EndpointSecurityPushConfig.class)).a());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            java.lang.String str2 = "parsePushConfig failed: " + th2.getMessage();
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityFactorCollector", "44");
            com.ss.android.lark.log.Log.w("EMM_FactorCollector", str2);
        }
        if (!kotlin.Result.isFailure-impl(obj)) {
            obj2 = obj;
        }
        return (rc4.EndpointSecCollectionConfig) obj2;
    }

    private final com.google.gson.JsonElement b(rc4.EndpointSecCollectionConfig endpointSecCollectionConfig, com.ss.android.lark.location.dto.LarkLocation larkLocation) {
        if (endpointSecCollectionConfig.getNeedCoordinate() && larkLocation != null) {
            double latitude = larkLocation.getLatitude();
            double longitude = larkLocation.getLongitude();
            if (larkLocation.g() == com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem.WGS) {
                com.ss.android.lark.endpoint.security.detection.location.LocationCoordinateUtil locationCoordinateUtil = com.ss.android.lark.endpoint.security.detection.location.LocationCoordinateUtil.a;
                if (locationCoordinateUtil.a(latitude, longitude)) {
                    kotlin.Pair<java.lang.Double, java.lang.Double> pairD = locationCoordinateUtil.d(latitude, longitude);
                    latitude = ((java.lang.Number) pairD.component1()).doubleValue();
                    longitude = ((java.lang.Number) pairD.component2()).doubleValue();
                }
            }
            com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
            jsonObject.addProperty("lng", java.lang.String.valueOf(longitude));
            jsonObject.addProperty("lat", java.lang.String.valueOf(latitude));
            return jsonObject;
        }
        com.google.gson.JsonNull jsonNull = com.google.gson.JsonNull.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jsonNull, "INSTANCE");
        return jsonNull;
    }

    private final com.google.gson.JsonObject c(android.content.Context context, rc4.EndpointSecCollectionConfig endpointSecCollectionConfig) throws kotlin.NoWhenBranchMatchedException {
        int iA;
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        if (endpointSecCollectionConfig.getNeedDetectVpnProxy()) {
            jsonObject.addProperty("vpnProxy", java.lang.Boolean.valueOf(com.ss.android.lark.endpoint.security.detection.factor.VpnDetector.a.c(context)));
        } else {
            jsonObject.add("vpnProxy", com.google.gson.JsonNull.INSTANCE);
        }
        if (endpointSecCollectionConfig.getNeedTimezone()) {
            jsonObject.addProperty("timezone", a.d());
        } else {
            jsonObject.add("timezone", com.google.gson.JsonNull.INSTANCE);
        }
        if (endpointSecCollectionConfig.getNeedTimezone()) {
            com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorCollector endpointSecurityFactorCollector = a;
            iA = endpointSecurityFactorCollector.a(endpointSecurityFactorCollector.f(context));
        } else {
            iA = 0;
        }
        jsonObject.addProperty("autoTimezone", java.lang.Integer.valueOf(iA));
        return jsonObject;
    }

    public final java.lang.String e(android.content.Context context, rc4.EndpointSecCollectionConfig endpointSecCollectionConfig, com.ss.android.lark.location.dto.LarkLocation larkLocation) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpointSecCollectionConfig, "config");
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorCollector endpointSecurityFactorCollector = a;
        jsonObject.add("geoInfo", endpointSecurityFactorCollector.b(endpointSecCollectionConfig, larkLocation));
        jsonObject.add("networkInfo", endpointSecurityFactorCollector.c(context, endpointSecCollectionConfig));
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            java.lang.String json = b.toJson(jsonObject);
            kotlin.jvm.internal.Intrinsics.checkNotNull(json);
            byte[] bytes = json.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            obj = kotlin.Result.constructor-impl(android.util.Base64.encodeToString(bytes, 2));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            java.lang.String str = "encodePayload failed: " + th2.getMessage();
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityFactorCollector", "81");
            com.ss.android.lark.log.Log.e("EMM_FactorCollector", str);
        }
        if (kotlin.Result.isFailure-impl(obj)) {
            obj = null;
        }
        return (java.lang.String) obj;
    }
}
