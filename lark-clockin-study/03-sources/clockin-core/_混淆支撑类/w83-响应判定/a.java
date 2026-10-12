package w83;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"%\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"success", "", "T", "Ljava/io/Serializable;", "Lcom/ss/android/lark/appstrategy/clockin/entity/BaseResp;", "getSuccess", "(Lcom/ss/android/lark/appstrategy/clockin/entity/BaseResp;)Z", "appstrategy-api_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes8.dex */
public final class a {
    public static final <T extends java.io.Serializable> boolean a(com.ss.android.lark.appstrategy.clockin.entity.BaseResp<T> baseResp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseResp, "<this>");
        java.lang.Integer code = baseResp.getCode();
        if (code != null && code.intValue() == 0) {
            return true;
        }
        return false;
    }
}
