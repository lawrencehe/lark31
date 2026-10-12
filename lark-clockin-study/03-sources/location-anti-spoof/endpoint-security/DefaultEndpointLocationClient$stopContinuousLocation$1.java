package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$stopContinuousLocation$1", f = "DefaultLocationClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/larkdex/classes11.dex */
final class DefaultEndpointLocationClient$stopContinuousLocation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ n75.d $pendingCallback;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEndpointLocationClient$stopContinuousLocation$1(com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient defaultEndpointLocationClient, n75.d dVar, kotlin.coroutines.Continuation<? super com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$stopContinuousLocation$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultEndpointLocationClient;
        this.$pendingCallback = dVar;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$stopContinuousLocation$1 defaultEndpointLocationClient$stopContinuousLocation$1 = new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$stopContinuousLocation$1(this.this$0, this.$pendingCallback, continuation);
        defaultEndpointLocationClient$stopContinuousLocation$1.L$0 = obj;
        return defaultEndpointLocationClient$stopContinuousLocation$1;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient defaultEndpointLocationClient = this.this$0;
            n75.d dVar = this.$pendingCallback;
            try {
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                obj2 = kotlin.Result.constructor-impl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(defaultEndpointLocationClient.q().f(dVar)));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                obj2 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
            }
            java.lang.Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj2);
            if (th2 != null) {
                ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient$stopContinuousLocation$1", "249");
                com.ss.android.lark.log.Log.e("DefaultLocationClient", "stopLocation threw: " + th2);
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
