package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"isUsable", "", "Lcom/ss/android/lark/location/dto/LarkLocation;", "(Lcom/ss/android/lark/location/dto/LarkLocation;)Z", "endpoint-security-detection_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes11.dex */
public final class a {

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.ss.android.lark.endpoint.security.detection.location.a$a, reason: collision with other inner class name */
    static final class C0102a implements io.reactivex.functions.Consumer {
        private final /* synthetic */ kotlin.jvm.functions.Function1 a;

        C0102a(kotlin.jvm.functions.Function1 function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "function");
            this.a = function1;
        }

        public final /* synthetic */ void accept(java.lang.Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(com.ss.android.lark.location.dto.LarkLocation larkLocation) {
        if (larkLocation.j() == 0) {
            return true;
        }
        return false;
    }
}
