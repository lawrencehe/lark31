package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/LocationBackgroundRuntime;", "", "<init>", "()V", "TAG", "", "ACTION_START", "ACTION_UPDATE_NOTIFICATION", "EXTRA_NOTIFICATION_ICON_RES_ID", "EXTRA_NOTIFICATION_TITLE", "EXTRA_NOTIFICATION_CONTENT", "runtimeOwners", "", "acquireHostForegroundRuntime", "", "context", "Landroid/content/Context;", "notificationConfig", "Lcom/ss/android/lark/endpoint/security/detection/location/NotificationConfig;", "ownerId", "updateHostForegroundNotification", "", "releaseHostForegroundRuntime", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ss.android.lark.endpoint.security.detection.location.d, reason: from Kotlin metadata */
/* loaded from: /tmp/larkdex/classes11.dex */
public final class LocationBackgroundRuntime {
    public static final com.ss.android.lark.endpoint.security.detection.location.LocationBackgroundRuntime a = new com.ss.android.lark.endpoint.security.detection.location.LocationBackgroundRuntime();
    private static final java.util.Set<java.lang.String> b = new java.util.LinkedHashSet();

    private LocationBackgroundRuntime() {
    }

    public final synchronized void b(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "ownerId");
        java.util.Set<java.lang.String> set = b;
        if (!set.remove(str)) {
            java.lang.String str2 = "releaseHostForegroundRuntime called repeatedly. ownerId:" + str + ", refCount:" + set.size();
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationBackgroundRuntime", "85");
            com.ss.android.lark.log.Log.i("LocationBackgroundRuntime", str2);
            return;
        }
        int size = set.size();
        if (size > 0) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationBackgroundRuntime", "93");
            com.ss.android.lark.log.Log.i("LocationBackgroundRuntime", "releaseHostForegroundRuntime called. refCount:" + size);
            return;
        }
        try {
            context.getApplicationContext().stopService(new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) com.ss.android.lark.endpoint.security.detection.location.LocationForegroundService.class));
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationBackgroundRuntime", "100");
            com.ss.android.lark.log.Log.i("LocationBackgroundRuntime", "releaseHostForegroundRuntime called. stop service.");
        } catch (java.lang.Exception e) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationBackgroundRuntime", "102");
            com.ss.android.lark.log.Log.e("LocationBackgroundRuntime", "releaseHostForegroundRuntime failed.", e);
        }
    }

    public final synchronized boolean a(android.content.Context context, com.ss.android.lark.endpoint.security.detection.location.NotificationConfig notificationConfig, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationConfig, "notificationConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "ownerId");
        android.content.Context applicationContext = context.getApplicationContext();
        java.util.Set<java.lang.String> set = b;
        boolean z = true;
        if (!set.add(str)) {
            java.lang.String str2 = "acquireHostForegroundRuntime called repeatedly. ownerId:" + str + ", refCount:" + set.size();
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationBackgroundRuntime", "31");
            com.ss.android.lark.log.Log.i("LocationBackgroundRuntime", str2);
            return true;
        }
        int size = set.size();
        if (size > 1) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationBackgroundRuntime", "39");
            com.ss.android.lark.log.Log.i("LocationBackgroundRuntime", "acquireHostForegroundRuntime called. refCount:" + size);
            return true;
        }
        try {
            android.content.Intent intent = new android.content.Intent(applicationContext, (java.lang.Class<?>) com.ss.android.lark.endpoint.security.detection.location.LocationForegroundService.class);
            intent.setAction("com.ss.android.lark.endpoint.security.detection.location.START");
            intent.putExtra("com.ss.android.lark.endpoint.security.detection.location.NOTIFICATION_ICON_RES_ID", notificationConfig.getNotificationIconResId());
            intent.putExtra("com.ss.android.lark.endpoint.security.detection.location.NOTIFICATION_TITLE", notificationConfig.getNotificationTitle());
            intent.putExtra("com.ss.android.lark.endpoint.security.detection.location.NOTIFICATION_CONTENT", notificationConfig.getNotificationContent());
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                androidx.core.content.ContextCompat.startForegroundService(applicationContext, intent);
            } else {
                applicationContext.startService(intent);
            }
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationBackgroundRuntime", "54");
            com.ss.android.lark.log.Log.i("LocationBackgroundRuntime", "acquireHostForegroundRuntime called. start service.");
        } catch (java.lang.Exception e) {
            b.remove(str);
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationBackgroundRuntime", "58");
            com.ss.android.lark.log.Log.e("LocationBackgroundRuntime", "acquireHostForegroundRuntime failed.", e);
            z = false;
        }
        return z;
    }
}
