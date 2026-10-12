package com.ss.android.lark.endpoint.security.detection.factor;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/VpnDetector;", "", "<init>", "()V", "TAG", "", "isVpnActive", "", "context", "Landroid/content/Context;", "checkByConnectivityManager", "checkByNetworkInterface", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ss.android.lark.endpoint.security.detection.factor.h, reason: from Kotlin metadata */
/* loaded from: /tmp/larkdex/classes11.dex */
public final class VpnDetector {
    public static final com.ss.android.lark.endpoint.security.detection.factor.VpnDetector a = new com.ss.android.lark.endpoint.security.detection.factor.VpnDetector();

    private VpnDetector() {
    }

    private final boolean b() {
        java.lang.Object obj;
        java.util.Enumeration<java.net.NetworkInterface> networkInterfaces;
        boolean z;
        java.lang.String name;
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            z = false;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
        }
        if (networkInterfaces == null) {
            return false;
        }
        java.util.ArrayList list = java.util.Collections.list(networkInterfaces);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.net.NetworkInterface networkInterface = (java.net.NetworkInterface) it.next();
                if (networkInterface.isUp() && (name = networkInterface.getName()) != null && (kotlin.text.StringsKt.startsWith$default(name, "tun", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(name, "tap", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(name, "ppp", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(name, "ipsec", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(name, "utun", false, 2, (java.lang.Object) null))) {
                    z = true;
                    break;
                }
            }
        }
        obj = kotlin.Result.constructor-impl(java.lang.Boolean.valueOf(z));
        java.lang.Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            java.lang.String str = "checkByNetworkInterface error: " + th2.getMessage();
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "VpnDetector", "67");
            com.ss.android.lark.log.Log.w("EMM_VpnDetector", str);
            obj = java.lang.Boolean.FALSE;
        }
        return ((java.lang.Boolean) obj).booleanValue();
    }

    private final boolean a(android.content.Context context) {
        android.net.ConnectivityManager connectivityManager;
        java.lang.Object obj;
        boolean z;
        android.net.NetworkCapabilities networkCapabilities;
        java.lang.Object objS = u1.a.s(context, "connectivity");
        if (objS instanceof android.net.ConnectivityManager) {
            connectivityManager = (android.net.ConnectivityManager) objS;
        } else {
            connectivityManager = null;
        }
        boolean zHasTransport = false;
        if (connectivityManager == null) {
            return false;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
                if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                    return false;
                }
                zHasTransport = networkCapabilities.hasTransport(4);
            } else {
                android.net.Network[] allNetworks = connectivityManager.getAllNetworks();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allNetworks, "getAllNetworks(...)");
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    android.net.NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(allNetworks[i]);
                    if (networkCapabilities2 != null && networkCapabilities2.hasTransport(4)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        zHasTransport = true;
                        break;
                    }
                    i++;
                }
            }
            obj = kotlin.Result.constructor-impl(java.lang.Boolean.valueOf(zHasTransport));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            java.lang.String str = "checkByConnectivityManager error: " + th2.getMessage();
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "VpnDetector", "49");
            com.ss.android.lark.log.Log.w("EMM_VpnDetector", str);
            obj = java.lang.Boolean.FALSE;
        }
        return ((java.lang.Boolean) obj).booleanValue();
    }

    public final boolean c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (a(context)) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "VpnDetector", "25");
            com.ss.android.lark.log.Log.i("EMM_VpnDetector", "isVpnActive=true (by NetworkCapabilities.TRANSPORT_VPN)");
            return true;
        }
        boolean zB = b();
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "VpnDetector", "29");
        com.ss.android.lark.log.Log.i("EMM_VpnDetector", "isVpnActive=" + zB + " (by NetworkInterface name prefix)");
        return zB;
    }
}
