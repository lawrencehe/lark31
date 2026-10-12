package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient", f = "DefaultLocationClient.kt", i = {}, l = {283}, m = "getCurrentLocationDetailed-IoAF18A", n = {}, s = {})
/* loaded from: /tmp/larkdex/classes11.dex */
final class DefaultEndpointLocationClient$getCurrentLocationDetailed$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEndpointLocationClient$getCurrentLocationDetailed$1(com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient defaultEndpointLocationClient, kotlin.coroutines.Continuation<? super com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$getCurrentLocationDetailed$1> continuation) {
        super(continuation);
        this.this$0 = defaultEndpointLocationClient;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objE = this.this$0.e(this);
        return objE == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : kotlin.Result.box-impl(objE);
    }
}
