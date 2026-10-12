package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u00a8\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/LocationForegroundService;", "Landroid/app/Service;", "<init>", "()V", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onStartCommand", "", "flags", "startId", "onDestroy", "", "startLocationForeground", "", "updateLocationForeground", "createNotification", "Landroid/app/Notification;", "createNotificationChannel", "jumpToBatterySettingIntent", "context", "Landroid/content/Context;", "Companion", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes11.dex */
public final class LocationForegroundService extends android.app.Service {
    public static final com.ss.android.lark.endpoint.security.detection.location.LocationForegroundService.a a = new com.ss.android.lark.endpoint.security.detection.location.LocationForegroundService.a(null);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/LocationForegroundService$Companion;", "", "<init>", "()V", "TAG", "", "CHANNEL_ID", "NOTIFICATION_ID", "", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            stopForeground(true);
        } catch (java.lang.Exception e) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationForegroundService", "46");
            com.ss.android.lark.log.Log.e("LocationForegroundService", "stopForeground failed.", e);
        }
        super.onDestroy();
    }

    private final void b() {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            return;
        }
        java.lang.Object systemService = getSystemService("notification");
        android.app.NotificationManager notificationManager = systemService instanceof android.app.NotificationManager ? (android.app.NotificationManager) systemService : null;
        if (notificationManager == null) {
            return;
        }
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("endpoint_security_detection_location", getString(2131827666), 2);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(false);
        notificationChannel.setShowBadge(false);
        notificationManager.createNotificationChannel(notificationChannel);
    }

    private final android.app.Notification a(android.content.Intent intent) {
        boolean z;
        boolean z2;
        int i;
        int intExtra = intent.getIntExtra("com.ss.android.lark.endpoint.security.detection.location.NOTIFICATION_ICON_RES_ID", 0);
        java.lang.String stringExtra = intent.getStringExtra("com.ss.android.lark.endpoint.security.detection.location.NOTIFICATION_TITLE");
        java.lang.String stringExtra2 = intent.getStringExtra("com.ss.android.lark.endpoint.security.detection.location.NOTIFICATION_CONTENT");
        if (intExtra != 0) {
            if (stringExtra != null && !kotlin.text.StringsKt.isBlank(stringExtra)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (stringExtra2 != null && !kotlin.text.StringsKt.isBlank(stringExtra2)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    b();
                    android.content.Intent intentC = c(this);
                    if (android.os.Build.VERSION.SDK_INT >= 23) {
                        i = 201326592;
                    } else {
                        i = 134217728;
                    }
                    return new androidx.core.app.NotificationCompat.Builder(this, "endpoint_security_detection_location").setSmallIcon(intExtra).setContentTitle(stringExtra).setContentText(stringExtra2).setContentIntent(android.app.PendingIntent.getActivity(this, 0, intentC, i)).setCategory("service").setPriority(-1).setVisibility(-1).setOngoing(true).build();
                }
            }
        }
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationForegroundService", "89");
        com.ss.android.lark.log.Log.e("LocationForegroundService", "createNotification failed. invalid notification config.");
        return null;
    }

    private final android.content.Intent c(android.content.Context context) {
        java.lang.String packageName;
        java.lang.String packageName2;
        java.lang.String packageName3;
        if (!com.larksuite.framework.utils.RomUtils.v() && !com.larksuite.framework.utils.RomUtils.y() && !com.larksuite.framework.utils.RomUtils.D()) {
            return new android.content.Intent("android.settings.SETTINGS");
        }
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationForegroundService", "136");
        com.ss.android.lark.log.Log.i("LocationForegroundService", "jumpToBatterySetting");
        try {
            java.lang.String str = "";
            if (com.larksuite.framework.utils.RomUtils.v()) {
                if (android.os.Build.VERSION.SDK_INT >= 35) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setComponent(new android.content.ComponentName("com.miui.securitycenter", "com.miui.powercenter.legacypowerrank.PowerDetailActivity"));
                    if (context != null && (packageName3 = context.getPackageName()) != null) {
                        str = packageName3;
                    }
                    intent.putExtra("package_name", str);
                    intent.addFlags(268435456);
                    return intent;
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setComponent(new android.content.ComponentName("com.miui.powerkeeper", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity"));
                if (context != null && (packageName2 = context.getPackageName()) != null) {
                    str = packageName2;
                }
                intent2.putExtra("package_name", str);
                intent2.addFlags(268435456);
                return intent2;
            }
            if (com.larksuite.framework.utils.RomUtils.y()) {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.addFlags(268435456);
                intent3.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                if (context != null && (packageName = context.getPackageName()) != null) {
                    str = packageName;
                }
                intent3.setData(android.net.Uri.fromParts("package", str, null));
                return intent3;
            }
            if (com.larksuite.framework.utils.RomUtils.D()) {
                int i = android.os.Build.VERSION.SDK_INT;
                if (i >= 35) {
                    android.content.Intent intent4 = new android.content.Intent();
                    intent4.setComponent(new android.content.ComponentName("com.iqoo.powersaving", "com.iqoo.powersaving.BackgroundHighUsageActivity"));
                    intent4.addFlags(268435456);
                    return intent4;
                }
                if (i >= 23) {
                    android.content.Intent intent5 = new android.content.Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                    intent5.addFlags(268435456);
                    return intent5;
                }
                return new android.content.Intent("android.settings.SETTINGS");
            }
            return new android.content.Intent("android.settings.SETTINGS");
        } catch (java.lang.Exception e) {
            java.lang.String str2 = "jumpToBatterySetting: " + e.getMessage();
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationForegroundService", "187");
            com.ss.android.lark.log.Log.e("LocationForegroundService", str2);
            return new android.content.Intent("android.settings.SETTINGS");
        }
    }

    private final boolean d(android.content.Intent intent) {
        try {
            android.app.Notification notificationA = a(intent);
            if (notificationA == null) {
                return false;
            }
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                startForeground(7801001, notificationA, 8);
            } else {
                startForeground(7801001, notificationA);
            }
            return true;
        } catch (java.lang.Exception e) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationForegroundService", "65");
            com.ss.android.lark.log.Log.e("LocationForegroundService", "startLocationForeground failed.", e);
            return false;
        }
    }

    private final void e(android.content.Intent intent) {
        android.app.NotificationManager notificationManager;
        try {
            android.app.Notification notificationA = a(intent);
            if (notificationA == null) {
                return;
            }
            java.lang.Object systemService = getSystemService("notification");
            if (systemService instanceof android.app.NotificationManager) {
                notificationManager = (android.app.NotificationManager) systemService;
            } else {
                notificationManager = null;
            }
            if (notificationManager == null) {
                return;
            }
            notificationManager.notify(7801001, notificationA);
        } catch (java.lang.Exception e) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "LocationForegroundService", "77");
            com.ss.android.lark.log.Log.e("LocationForegroundService", "updateLocationForeground failed.", e);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int flags, int startId) {
        java.lang.String action;
        if (intent != null) {
            action = intent.getAction();
        } else {
            action = null;
        }
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -508301017) {
                if (iHashCode == 1027779782 && action.equals("com.ss.android.lark.endpoint.security.detection.location.UPDATE_NOTIFICATION")) {
                    e(intent);
                    return 2;
                }
            } else if (action.equals("com.ss.android.lark.endpoint.security.detection.location.START")) {
                if (!d(intent)) {
                    stopSelf();
                    return 2;
                }
                return 2;
            }
        }
        stopSelf();
        return 2;
    }
}
