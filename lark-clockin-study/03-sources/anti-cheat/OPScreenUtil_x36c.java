package x36;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.provider.Settings;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.window.layout.WindowMetricsCalculator;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.passport.signinsdk_api.account.LoginType;
import com.ss.android.lark.passport.signinsdk_api.account.TenantTagEnum;
import com.ss.android.socialbase.downloader.api.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/openplatform/openapi/component/keyboard/util/OPScreenUtil;", BuildConfig.VERSION_NAME, "<init>", "()V", "isPad", BuildConfig.VERSION_NAME, "context", "Landroid/content/Context;", "isSupportedFoldDisplay", "isFoldableDevicePostureOpen", "getWindowHeightExcludeNavBar", BuildConfig.VERSION_NAME, "activity", "Landroid/app/Activity;", "TAG", BuildConfig.VERSION_NAME, "miniapp_release"}, k = TenantTagEnum.NOT_SURE, mv = {LoginType.GUEST, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes18.dex */
public final class c {
    public static final c a = new c();

    private c() {
    }

    private final boolean b(Context context) {
        boolean z;
        boolean zK = com.ss.android.lark.base.embedded.a.k();
        if (Settings.Global.getInt(context.getContentResolver(), "device_posture", 0) == 3) {
            z = true;
        } else {
            z = false;
        }
        if (com.ss.android.lark.base.embedded.a.i()) {
            if (Settings.Global.getInt(context.getContentResolver(), "oplus_system_device_state", 0) == 3) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!zK || !z) {
            return false;
        }
        return true;
    }

    public final int a(Activity activity) {
        int i;
        androidx.core.graphics.c insets;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect bounds = WindowMetricsCalculator.Companion.a().computeCurrentWindowMetrics(activity).getBounds();
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(activity.getWindow().getDecorView());
        if (rootWindowInsets != null && (insets = rootWindowInsets.getInsets(WindowInsetsCompat.Type.g())) != null) {
            i = insets.d;
        } else {
            i = 0;
        }
        return bounds.height() - i;
    }

    public final boolean c(Context context) {
        boolean zIsPad = true;
        if (context == null) {
            AppBrandLogger.w("KeyboardScreenUtil", new Object[]{"context can't be null"});
            return false;
        }
        if ((context.getResources().getConfiguration().screenLayout & 15) < 3) {
            zIsPad = false;
        }
        if (!zIsPad) {
            zIsPad = DeviceUtils.isPad();
        }
        if (!zIsPad) {
            return b(context);
        }
        return zIsPad;
    }
}
