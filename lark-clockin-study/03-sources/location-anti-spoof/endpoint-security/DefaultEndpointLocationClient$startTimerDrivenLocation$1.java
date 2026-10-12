package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startTimerDrivenLocation$1", f = "DefaultLocationClient.kt", i = {0, 1}, l = {211, 222}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
/* loaded from: /tmp/larkdex/classes11.dex */
final class DefaultEndpointLocationClient$startTimerDrivenLocation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int $safeInterval;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEndpointLocationClient$startTimerDrivenLocation$1(com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient defaultEndpointLocationClient, int i, kotlin.coroutines.Continuation<? super com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startTimerDrivenLocation$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultEndpointLocationClient;
        this.$safeInterval = i;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startTimerDrivenLocation$1 defaultEndpointLocationClient$startTimerDrivenLocation$1 = new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startTimerDrivenLocation$1(this.this$0, this.$safeInterval, continuation);
        defaultEndpointLocationClient$startTimerDrivenLocation$1.L$0 = obj;
        return defaultEndpointLocationClient$startTimerDrivenLocation$1;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:9|(3:47|10|11)|45|23|30|(1:33)|34|(1:38)|39|(1:41)(3:42|16|(4:18|49|19|(1:21)(9:22|45|23|30|(0)|34|(2:36|38)|39|(0)(0)))(2:43|44))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d3 -> B:16:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Throwable th;
        kotlinx.coroutines.CoroutineScope coroutineScope2;
        java.lang.Object obj2;
        com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startTimerDrivenLocation$1 defaultEndpointLocationClient$startTimerDrivenLocation$1;
        java.lang.Object obj3;
        java.lang.Throwable th2;
        com.ss.android.lark.location.dto.LarkLocation larkLocation;
        long j;
        com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startTimerDrivenLocation$1 defaultEndpointLocationClient$startTimerDrivenLocation$12;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlinx.coroutines.CoroutineScope coroutineScope3 = (kotlinx.coroutines.CoroutineScope) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    coroutineScope2 = coroutineScope3;
                    obj2 = coroutine_suspended;
                    defaultEndpointLocationClient$startTimerDrivenLocation$1 = this;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    coroutineScope2 = coroutineScope3;
                    obj2 = coroutine_suspended;
                    defaultEndpointLocationClient$startTimerDrivenLocation$1 = this;
                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                    obj3 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
                    th2 = kotlin.Result.exceptionOrNull-impl(obj3);
                    if (th2 != null) {
                    }
                    larkLocation = (com.ss.android.lark.location.dto.LarkLocation) obj3;
                    if (larkLocation != null) {
                    }
                    j = defaultEndpointLocationClient$startTimerDrivenLocation$1.$safeInterval;
                    defaultEndpointLocationClient$startTimerDrivenLocation$1.L$0 = coroutineScope2;
                    defaultEndpointLocationClient$startTimerDrivenLocation$1.label = 2;
                    if (kotlinx.coroutines.DelayKt.delay(j, defaultEndpointLocationClient$startTimerDrivenLocation$1) == obj2) {
                    }
                }
                obj3 = kotlin.Result.constructor-impl((com.ss.android.lark.location.dto.LarkLocation) obj);
                th2 = kotlin.Result.exceptionOrNull-impl(obj3);
                if (th2 != null) {
                    ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient$startTimerDrivenLocation$1", "215");
                    com.ss.android.lark.log.Log.e("DefaultLocationClient", "timer once location threw: " + th2);
                    obj3 = null;
                }
                larkLocation = (com.ss.android.lark.location.dto.LarkLocation) obj3;
                if (larkLocation != null && com.ss.android.lark.endpoint.security.detection.location.a.b(larkLocation)) {
                    defaultEndpointLocationClient$startTimerDrivenLocation$1.this$0.f.setValue(larkLocation);
                }
                j = defaultEndpointLocationClient$startTimerDrivenLocation$1.$safeInterval;
                defaultEndpointLocationClient$startTimerDrivenLocation$1.L$0 = coroutineScope2;
                defaultEndpointLocationClient$startTimerDrivenLocation$1.label = 2;
                if (kotlinx.coroutines.DelayKt.delay(j, defaultEndpointLocationClient$startTimerDrivenLocation$1) == obj2) {
                    return obj2;
                }
                defaultEndpointLocationClient$startTimerDrivenLocation$12 = defaultEndpointLocationClient$startTimerDrivenLocation$1;
                coroutine_suspended = obj2;
                coroutineScope = coroutineScope2;
                if (!kotlinx.coroutines.JobKt.isActive(coroutineScope.getCoroutineContext())) {
                    com.ss.android.lark.location.listener.LocationRequestOption locationRequestOption = new com.ss.android.lark.location.listener.LocationRequestOption();
                    locationRequestOption.f(defaultEndpointLocationClient$startTimerDrivenLocation$12.this$0.r());
                    locationRequestOption.h(true);
                    locationRequestOption.g(false);
                    com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient defaultEndpointLocationClient = defaultEndpointLocationClient$startTimerDrivenLocation$12.this$0;
                    try {
                    } catch (java.lang.Throwable th5) {
                        java.lang.Object obj4 = coroutine_suspended;
                        defaultEndpointLocationClient$startTimerDrivenLocation$1 = defaultEndpointLocationClient$startTimerDrivenLocation$12;
                        th = th5;
                        coroutineScope2 = coroutineScope;
                        obj2 = obj4;
                        kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                        obj3 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
                        th2 = kotlin.Result.exceptionOrNull-impl(obj3);
                        if (th2 != null) {
                        }
                        larkLocation = (com.ss.android.lark.location.dto.LarkLocation) obj3;
                        if (larkLocation != null) {
                        }
                        j = defaultEndpointLocationClient$startTimerDrivenLocation$1.$safeInterval;
                        defaultEndpointLocationClient$startTimerDrivenLocation$1.L$0 = coroutineScope2;
                        defaultEndpointLocationClient$startTimerDrivenLocation$1.label = 2;
                        if (kotlinx.coroutines.DelayKt.delay(j, defaultEndpointLocationClient$startTimerDrivenLocation$1) == obj2) {
                        }
                    }
                    kotlin.Result.Companion companion3 = kotlin.Result.Companion;
                    com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startTimerDrivenLocation$1$location$1$1 defaultEndpointLocationClient$startTimerDrivenLocation$1$location$1$1 = new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startTimerDrivenLocation$1$location$1$1(defaultEndpointLocationClient, locationRequestOption, null);
                    defaultEndpointLocationClient$startTimerDrivenLocation$12.L$0 = coroutineScope;
                    defaultEndpointLocationClient$startTimerDrivenLocation$12.label = 1;
                    java.lang.Object objD = kotlinx.coroutines.TimeoutKt.d(15000L, defaultEndpointLocationClient$startTimerDrivenLocation$1$location$1$1, defaultEndpointLocationClient$startTimerDrivenLocation$12);
                    if (objD == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    java.lang.Object obj5 = coroutine_suspended;
                    defaultEndpointLocationClient$startTimerDrivenLocation$1 = defaultEndpointLocationClient$startTimerDrivenLocation$12;
                    obj = objD;
                    coroutineScope2 = coroutineScope;
                    obj2 = obj5;
                    obj3 = kotlin.Result.constructor-impl((com.ss.android.lark.location.dto.LarkLocation) obj);
                    th2 = kotlin.Result.exceptionOrNull-impl(obj3);
                    if (th2 != null) {
                    }
                    larkLocation = (com.ss.android.lark.location.dto.LarkLocation) obj3;
                    if (larkLocation != null) {
                        defaultEndpointLocationClient$startTimerDrivenLocation$1.this$0.f.setValue(larkLocation);
                    }
                    j = defaultEndpointLocationClient$startTimerDrivenLocation$1.$safeInterval;
                    defaultEndpointLocationClient$startTimerDrivenLocation$1.L$0 = coroutineScope2;
                    defaultEndpointLocationClient$startTimerDrivenLocation$1.label = 2;
                    if (kotlinx.coroutines.DelayKt.delay(j, defaultEndpointLocationClient$startTimerDrivenLocation$1) == obj2) {
                    }
                } else {
                    return kotlin.Unit.INSTANCE;
                }
            }
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
        }
        defaultEndpointLocationClient$startTimerDrivenLocation$12 = this;
        if (!kotlinx.coroutines.JobKt.isActive(coroutineScope.getCoroutineContext())) {
        }
    }
}
