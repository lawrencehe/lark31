package com.ss.android.lark.endpoint.security.detection.factor;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService", f = "DefaultEndpointSecurityFactorService.kt", i = {}, l = {62}, m = "reportFactorsForPush-0E7RQCE", n = {}, s = {})
/* loaded from: /tmp/larkdex/classes11.dex */
final class DefaultEndpointSecurityFactorService$reportFactorsForPush$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEndpointSecurityFactorService$reportFactorsForPush$1(com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService defaultEndpointSecurityFactorService, kotlin.coroutines.Continuation<? super com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportFactorsForPush$1> continuation) {
        super(continuation);
        this.this$0 = defaultEndpointSecurityFactorService;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objA = this.this$0.a(null, null, this);
        return objA == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.Result.box-impl(objA);
    }
}
