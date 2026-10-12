package com.ss.android.lark.endpoint.security.detection.factor;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService", f = "DefaultEndpointSecurityFactorService.kt", i = {0, 0, 0}, l = {230}, m = "upload-0E7RQCE", n = {"this", "data", "scene"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: /tmp/larkdex/classes11.dex */
final class DefaultEndpointSecurityFactorService$upload$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEndpointSecurityFactorService$upload$1(com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService defaultEndpointSecurityFactorService, kotlin.coroutines.Continuation<? super com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$upload$1> continuation) {
        super(continuation);
        this.this$0 = defaultEndpointSecurityFactorService;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objL = this.this$0.l(null, null, this);
        return objL == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objL : kotlin.Result.box-impl(objL);
    }
}
