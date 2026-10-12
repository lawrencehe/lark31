package me5;

/* loaded from: /tmp/larkdex/classes16.dex */
public class a {

    /* renamed from: me5.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0216a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.values().length];
            a = iArr;
            try {
                iArr[com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.PRIORITY_HIGH_ACCURACY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                a[com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                a[com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.DEVICE_SENSORS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public static com.ss.android.lark.location.dto.LarkLocation a(com.amap.api.location.AMapLocation aMapLocation) {
        com.ss.android.lark.location.dto.LarkLocation larkLocation = new com.ss.android.lark.location.dto.LarkLocation(aMapLocation);
        larkLocation.setLatitude(aMapLocation.getLatitude());
        larkLocation.setLongitude(aMapLocation.getLongitude());
        larkLocation.G(aMapLocation.getAddress());
        larkLocation.H(aMapLocation.getCity());
        larkLocation.V(aMapLocation.getDistrict());
        larkLocation.n0(aMapLocation.getProvince());
        larkLocation.o0(aMapLocation.getStreet());
        larkLocation.p0(aMapLocation.getStreetNum());
        boolean z = true;
        if (aMapLocation.getLocationType() != 1) {
            z = false;
        }
        larkLocation.g0(z);
        larkLocation.c0(aMapLocation.getErrorCode());
        larkLocation.e0(aMapLocation.isMock());
        larkLocation.l0(aMapLocation.getLocationType());
        larkLocation.d0(aMapLocation.getErrorInfo());
        if (com.amap.api.location.CoordinateConverter.isAMapDataAvailable(larkLocation.getLatitude(), larkLocation.getLongitude())) {
            larkLocation.J(com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem.GCJ);
        } else {
            larkLocation.J(com.ss.android.lark.location.dto.LarkLocation.CoordinateSystem.WGS);
        }
        return larkLocation;
    }

    public static com.amap.api.location.AMapLocationClientOption.AMapLocationMode b(com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority locationPriority) {
        int i = me5.a.C0216a.a[locationPriority.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Battery_Saving;
                }
                return com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Device_Sensors;
            }
            return com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Battery_Saving;
        }
        return com.amap.api.location.AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;
    }

    public static double c(com.amap.api.services.core.LatLonPoint latLonPoint) {
        if (latLonPoint == null) {
            return 0.0d;
        }
        return latLonPoint.getLatitude();
    }

    public static double d(com.amap.api.services.core.LatLonPoint latLonPoint) {
        if (latLonPoint == null) {
            return 0.0d;
        }
        return latLonPoint.getLongitude();
    }

    public static int e(com.ss.android.lark.location.dto.POIInfo pOIInfo) {
        if (pOIInfo == null || g(pOIInfo.getLatitude(), pOIInfo.getLongitude())) {
            return 0;
        }
        return pOIInfo.getZoomLevel();
    }

    public static boolean f(double d, double d2) {
        return !g(d, d2);
    }

    public static boolean g(double d, double d2) {
        return !com.amap.api.location.CoordinateConverter.isAMapDataAvailable(d, d2);
    }
}
