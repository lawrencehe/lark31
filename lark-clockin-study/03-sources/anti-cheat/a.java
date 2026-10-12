package com.ss.android.lark.openplatform.openapi.api.plugin.security;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.openplatform.infra.util.e;
import com.ss.android.socialbase.downloader.api.BuildConfig;
import com.suite.lark.emm.impl.clipboard.utils.TextViewMenuUtilsKt;
import cw0.c;
import cw0.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/larkdex/classes18.dex */
public class a {
    static boolean c() {
        Process processD = null;
        try {
            processD = d(Runtime.getRuntime(), new String[]{"which", "su"});
            if (new BufferedReader(new InputStreamReader(processD.getInputStream())).readLine() != null) {
                processD.destroy();
                return true;
            }
            processD.destroy();
            return false;
        } catch (Throwable th) {
            try {
                AppBrandLogger.e("AntiCheatingAPIUtil", new Object[]{th});
                return false;
            } finally {
                if (processD != null) {
                    processD.destroy();
                }
            }
        }
    }

    private static Process d(Runtime runtime, String[] strArr) {
        d dVarB = new c().b(102900, "java/lang/Runtime", "exec", runtime, new Object[]{strArr}, "java.lang.Process", new cw0.b(false, "([Ljava/lang/String;)Ljava/lang/Process;", "3980420259525266226"));
        return dVarB.b() ? (Process) dVarB.a() : runtime.exec(strArr);
    }

    static boolean b() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/sbin/", "/vendor/bin/", "/usr/local/bin/", "/data/local/", "/data/local/bin/", "/data/local/xbin/", "/cache/", "/data/", "/dev/"};
        for (int i = 0; i < 14; i++) {
            try {
                File fileB = com.bytedance.ee.lark.infra.foundation.utils.c.b(strArr[i] + "su");
                if (fileB != null && fileB.exists()) {
                    AppBrandLogger.i("AntiCheatingAPIUtil", new Object[]{"find su in : " + strArr[i]});
                    return true;
                }
            } catch (Exception e) {
                AppBrandLogger.e("AntiCheatingAPIUtil", new Object[]{e});
            }
        }
        return false;
    }

    public static boolean g() {
        return b() || c();
    }

    static String f(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.VERSION_NAME;
        }
        Class<?> cls = Class.forName("android.os.SystemProperties");
        return (String) cls.getMethod("get", String.class).invoke(cls, str);
    }

    public static boolean h(Context context) {
        if (context == null || Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", 0) <= 0) {
            return false;
        }
        return true;
    }

    public static boolean i(Context context) {
        boolean z;
        try {
            if (f("ro.kernel.qemu").equals("1")) {
                AppBrandLogger.i("AntiCheatingAPIUtil", new Object[]{"ro.kernel.qemu is 1"});
                return true;
            }
        } catch (Exception e) {
            AppBrandLogger.e("AntiCheatingAPIUtil", new Object[]{e});
        }
        if (!x36.c.a.c(context) && context != null) {
            Intent intent = new Intent();
            intent.setData(Uri.parse("tel:123456"));
            intent.setAction("android.intent.action.DIAL");
            TextViewMenuUtilsKt.b(intent);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                z = true;
            } else {
                z = false;
            }
            AppBrandLogger.i("AntiCheatingAPIUtil", new Object[]{"action_dial canResolveIntent: " + z});
        } else {
            z = true;
        }
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.toLowerCase().contains("vbox") && !str.toLowerCase().contains("test-keys")) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT) && !((TelephonyManager) u1.a.s(context, "phone")).getNetworkOperatorName().toLowerCase().equals("android") && z)) {
                return false;
            }
        }
        return true;
    }

    static boolean a(Context context, String str) throws PackageManager.NameNotFoundException {
        if (context == null) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.w("AntiCheatingAPIUtil", new Object[]{"package" + str});
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 512);
            AppBrandLogger.w("AntiCheatingAPIUtil", new Object[]{"exist app: " + str});
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static ArrayList<String> e(Context context, List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (context != null && list != null && list.size() != 0) {
            for (String str : list) {
                if (a(context, str)) {
                    u1.a.H(arrayList, e.c(str));
                }
            }
            return arrayList;
        }
        AppBrandLogger.w("AntiCheatingAPIUtil", new Object[]{"context: " + context});
        AppBrandLogger.w("AntiCheatingAPIUtil", new Object[]{"blackAppList: " + list});
        return arrayList;
    }
}
