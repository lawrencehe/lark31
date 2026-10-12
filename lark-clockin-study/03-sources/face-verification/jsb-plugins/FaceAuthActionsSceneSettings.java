package com.larksuite.framework.lark.open.plugin.openapi.liveAuthentication;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.google.gson.annotations.SerializedName;
import com.ss.android.lark.appsetting.annotation.AppConfig;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.passport.signinsdk_api.account.LoginType;
import com.ss.android.lark.passport.signinsdk_api.account.TenantTagEnum;
import com.ss.android.socialbase.downloader.api.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@AppConfig(key = "faceAuthActionsScene")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/larksuite/framework/lark/open/plugin/openapi/liveAuthentication/FaceAuthActionsSceneSettings;", BuildConfig.VERSION_NAME, "<init>", "()V", "appIds", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "Companion", "lark-open-plugin_release"}, k = TenantTagEnum.NOT_SURE, mv = {LoginType.GUEST, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes3.dex */
public final class FaceAuthActionsSceneSettings {
    public static final a a = new a(null);

    @SerializedName("appIds")
    public List<String> appIds = CollectionsKt.emptyList();

    @JvmStatic
    public static final boolean a(String str) {
        return a.a(str);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/larksuite/framework/lark/open/plugin/openapi/liveAuthentication/FaceAuthActionsSceneSettings$Companion;", BuildConfig.VERSION_NAME, "<init>", "()V", "TAG", BuildConfig.VERSION_NAME, "enable", BuildConfig.VERSION_NAME, "appId", "lark-open-plugin_release"}, k = TenantTagEnum.NOT_SURE, mv = {LoginType.GUEST, 0, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean a(String str) {
            List<String> list;
            List<String> list2;
            FaceAuthActionsSceneSettings faceAuthActionsSceneSettings = (FaceAuthActionsSceneSettings) SettingManager.getInstance().get(FaceAuthActionsSceneSettings.class);
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("config appIds: ");
            if (faceAuthActionsSceneSettings != null) {
                list = faceAuthActionsSceneSettings.appIds;
            } else {
                list = null;
            }
            sb.append(list);
            objArr[0] = sb.toString();
            AppBrandLogger.i("faceAuthActionsScene", objArr);
            if (faceAuthActionsSceneSettings != null && (list2 = faceAuthActionsSceneSettings.appIds) != null && CollectionsKt.contains(list2, str)) {
                return true;
            }
            return false;
        }
    }
}
