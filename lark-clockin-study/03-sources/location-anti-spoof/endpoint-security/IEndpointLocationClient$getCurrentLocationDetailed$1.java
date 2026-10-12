package com.ss.android.lark.endpoint.security.detection.location;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient$DefaultImpls", f = "IEndpointLocationClient.kt", i = {}, l = {60}, m = "getCurrentLocationDetailed-IoAF18A", n = {}, s = {})
/* loaded from: /tmp/larkdex/classes11.dex */
final class IEndpointLocationClient$getCurrentLocationDetailed$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;

    IEndpointLocationClient$getCurrentLocationDetailed$1(kotlin.coroutines.Continuation<? super com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient$getCurrentLocationDetailed$1> continuation) {
        super(continuation);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        java.lang.Object objA = com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient.DefaultImpls.a(null, this);
        return objA == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.Result.box-impl(objA);
    }
}
