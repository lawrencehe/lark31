package com.ss.android.lark.endpoint.security.detection.factor;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler$handlePush$1", f = "EndpointSecurityReportPushHandler.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/larkdex/classes11.dex */
final class EndpointSecurityReportPushHandler$handlePush$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ rc4.EndpointSecCollectionConfig $config;
    final /* synthetic */ com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityFactorService $factorService;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EndpointSecurityReportPushHandler$handlePush$1(com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityFactorService iEndpointSecurityFactorService, rc4.EndpointSecCollectionConfig endpointSecCollectionConfig, kotlin.coroutines.Continuation<? super com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler$handlePush$1> continuation) {
        super(2, continuation);
        this.$factorService = iEndpointSecurityFactorService;
        this.$config = endpointSecCollectionConfig;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler$handlePush$1(this.$factorService, this.$config, continuation);
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object objA;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                objA = ((kotlin.Result) obj).unbox-impl();
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityFactorService iEndpointSecurityFactorService = this.$factorService;
            rc4.EndpointSecCollectionConfig endpointSecCollectionConfig = this.$config;
            com.bytedance.lark.pb.security.v1.EndpointSecurityInfoUploadScene endpointSecurityInfoUploadScene = com.bytedance.lark.pb.security.v1.EndpointSecurityInfoUploadScene.SYNC;
            this.label = 1;
            objA = iEndpointSecurityFactorService.a(endpointSecCollectionConfig, endpointSecurityInfoUploadScene, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (kotlin.Result.isSuccess-impl(objA)) {
            java.lang.String str = "push report finished, code=" + ((com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportResult) objA).getCode();
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler$handlePush$1", "144");
            com.ss.android.lark.log.Log.i("EMM_PushHandler", str);
        }
        java.lang.Throwable th = kotlin.Result.exceptionOrNull-impl(objA);
        if (th != null) {
            java.lang.String str2 = "push report failed: " + th.getMessage();
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler$handlePush$1", "145");
            com.ss.android.lark.log.Log.e("EMM_PushHandler", str2);
        }
        return kotlin.Unit.INSTANCE;
    }
}
