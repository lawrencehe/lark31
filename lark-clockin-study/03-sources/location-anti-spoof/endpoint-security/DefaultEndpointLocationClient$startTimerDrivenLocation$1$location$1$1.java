package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/location/dto/LarkLocation;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startTimerDrivenLocation$1$location$1$1", f = "DefaultLocationClient.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/larkdex/classes11.dex */
final class DefaultEndpointLocationClient$startTimerDrivenLocation$1$location$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.ss.android.lark.location.dto.LarkLocation>, java.lang.Object> {
    final /* synthetic */ com.ss.android.lark.location.listener.LocationRequestOption $option;
    int label;
    final /* synthetic */ com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEndpointLocationClient$startTimerDrivenLocation$1$location$1$1(com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient defaultEndpointLocationClient, com.ss.android.lark.location.listener.LocationRequestOption locationRequestOption, kotlin.coroutines.Continuation<? super com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startTimerDrivenLocation$1$location$1$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultEndpointLocationClient;
        this.$option = locationRequestOption;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startTimerDrivenLocation$1$location$1$1(this.this$0, this.$option, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.ss.android.lark.location.dto.LarkLocation> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient defaultEndpointLocationClient = this.this$0;
            com.ss.android.lark.location.listener.LocationRequestOption locationRequestOption = this.$option;
            this.label = 1;
            obj = defaultEndpointLocationClient.s(locationRequestOption, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
