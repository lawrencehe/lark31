package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/LocationCoordinateUtil;", "", "<init>", "()V", "A", "", "EE", "isInChinaBoundingBox", "", "latitude", "longitude", "wgs84ToGcj02", "Lkotlin/Pair;", "transformLat", "x", "y", "transformLon", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ss.android.lark.endpoint.security.detection.location.e, reason: from Kotlin metadata */
/* loaded from: /tmp/larkdex/classes11.dex */
public final class LocationCoordinateUtil {
    public static final com.ss.android.lark.endpoint.security.detection.location.LocationCoordinateUtil a = new com.ss.android.lark.endpoint.security.detection.location.LocationCoordinateUtil();

    private LocationCoordinateUtil() {
    }

    public final boolean a(double d, double d2) {
        if (72.004d <= d2 && d2 <= 137.8347d) {
            if (0.8293d <= d && d <= 55.8271d) {
                return true;
            }
        }
        return false;
    }

    private final double b(double d, double d2) {
        double d3 = d * 2.0d;
        double dSqrt = (-100.0d) + d3 + (d2 * 3.0d) + (d2 * 0.2d * d2) + (0.1d * d * d2) + (java.lang.Math.sqrt(java.lang.Math.abs(d)) * 0.2d) + ((((java.lang.Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (java.lang.Math.sin(d3 * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d);
        double d4 = d2 * 3.141592653589793d;
        return dSqrt + ((((java.lang.Math.sin(d4) * 20.0d) + (java.lang.Math.sin((d2 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((java.lang.Math.sin((d2 / 12.0d) * 3.141592653589793d) * 160.0d) + (java.lang.Math.sin(d4 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
    }

    private final double c(double d, double d2) {
        double d3 = d * 0.1d;
        return d + 300.0d + (d2 * 2.0d) + (d3 * d) + (d3 * d2) + (java.lang.Math.sqrt(java.lang.Math.abs(d)) * 0.1d) + ((((java.lang.Math.sin((6.0d * d) * 3.141592653589793d) * 20.0d) + (java.lang.Math.sin((d * 2.0d) * 3.141592653589793d) * 20.0d)) * 2.0d) / 3.0d) + ((((java.lang.Math.sin(d * 3.141592653589793d) * 20.0d) + (java.lang.Math.sin((d / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((java.lang.Math.sin((d / 12.0d) * 3.141592653589793d) * 150.0d) + (java.lang.Math.sin((d / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
    }

    public final kotlin.Pair<java.lang.Double, java.lang.Double> d(double d, double d2) {
        double d3 = d2 - 105.0d;
        double d4 = d - 35.0d;
        double dB = b(d3, d4);
        double dC = c(d3, d4);
        double d5 = (d / 180.0d) * 3.141592653589793d;
        double dSin = java.lang.Math.sin(d5);
        double d6 = 1 - ((0.006693421622965943d * dSin) * dSin);
        double dSqrt = java.lang.Math.sqrt(d6);
        return kotlin.TuplesKt.to(java.lang.Double.valueOf(d + ((dB * 180.0d) / ((6335552.717000426d / (d6 * dSqrt)) * 3.141592653589793d))), java.lang.Double.valueOf(d2 + ((dC * 180.0d) / (((6378245.0d / dSqrt) * java.lang.Math.cos(d5)) * 3.141592653589793d))));
    }
}
