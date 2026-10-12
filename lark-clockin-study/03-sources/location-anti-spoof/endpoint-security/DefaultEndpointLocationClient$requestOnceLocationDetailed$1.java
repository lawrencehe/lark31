package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient", f = "DefaultLocationClient.kt", i = {0, 0, 0}, l = {534}, m = "requestOnceLocationDetailed-IoAF18A", n = {"this", "reported", "startTime"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: /tmp/larkdex/classes11.dex */
final class DefaultEndpointLocationClient$requestOnceLocationDetailed$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEndpointLocationClient$requestOnceLocationDetailed$1(com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient defaultEndpointLocationClient, kotlin.coroutines.Continuation<? super com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$requestOnceLocationDetailed$1> continuation) {
        super(continuation);
        this.this$0 = defaultEndpointLocationClient;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objT = this.this$0.t(this);
        return objT == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : kotlin.Result.box-impl(objT);
    }
}
