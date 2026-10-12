package com.ss.android.lark.appstrategy.clockin.state;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/state/SpeedClockInLocationManager;", "", "<init>", "()V", "getLocation", "Lcom/ss/android/lark/appstrategy/clockin/dto/GetLocationResult;", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocationType", "", "type", "Companion", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes8.dex */
public final class SpeedClockInLocationManager {
    public static final com.ss.android.lark.appstrategy.clockin.state.SpeedClockInLocationManager.a a = new com.ss.android.lark.appstrategy.clockin.state.SpeedClockInLocationManager.a(null);

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/state/SpeedClockInLocationManager$Companion;", "", "<init>", "()V", "TAG", "", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.ss.android.lark.appstrategy.clockin.state.SpeedClockInLocationManager.a.<init>():void type: THIS */
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int b(java.lang.String str) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "wgs84")) {
            return 1;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "gcj02")) {
            return 2;
        }
        return 0;
    }

    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation<? super v83.c> continuation) {
        boolean z;
        final kotlin.coroutines.SafeContinuation safeContinuation = new kotlin.coroutines.SafeContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        android.app.Application application = com.ss.android.lark.utils.LarkContext.getApplication();
        boolean z2 = true;
        if (androidx.core.content.ContextCompat.checkSelfPermission(application, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (androidx.core.content.ContextCompat.checkSelfPermission(application, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            z2 = false;
        }
        if (!z && !z2) {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            safeContinuation.resumeWith(kotlin.Result.constructor-impl(new v83.c.C0234c()));
        } else {
            u83.b.b().getLocationV2(str, new com.larksuite.framework.callback.IGetDataCallback<com.ss.android.lark.appstrategy.dto.SimpleLocation>() { // from class: com.ss.android.lark.appstrategy.clockin.state.SpeedClockInLocationManager$getLocation$2$1
                /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
                public void onError(com.larksuite.framework.callback.Entity.ErrorResult err) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(err, "err");
                    kotlin.coroutines.Continuation<v83.c> continuation2 = safeContinuation;
                    kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                    continuation2.resumeWith(kotlin.Result.constructor-impl(new v83.c.a(err.getCode(), err.getDebugMsg())));
                }

                /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
                public void onSuccess(com.ss.android.lark.appstrategy.dto.SimpleLocation data) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInLocationManager$getLocation$2$1", "37");
                    com.ss.android.lark.log.Log.i("SpeedClockInLocationManager", "getLocationV2 success");
                    kotlin.coroutines.Continuation<v83.c> continuation2 = safeContinuation;
                    kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                    continuation2.resumeWith(kotlin.Result.constructor-impl(new v83.c.d(new v83.c.Location(data.getLatitude(), data.getLongitude(), data.getAccuracy(), this.b(data.getType())))));
                }
            });
        }
        java.lang.Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
