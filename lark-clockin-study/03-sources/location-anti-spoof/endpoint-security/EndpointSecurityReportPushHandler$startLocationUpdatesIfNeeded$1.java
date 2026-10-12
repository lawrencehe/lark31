package com.ss.android.lark.endpoint.security.detection.factor;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler$startLocationUpdatesIfNeeded$1", f = "EndpointSecurityReportPushHandler.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/larkdex/classes11.dex */
final class EndpointSecurityReportPushHandler$startLocationUpdatesIfNeeded$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.app.Application $ctx;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EndpointSecurityReportPushHandler$startLocationUpdatesIfNeeded$1(android.app.Application application, com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler endpointSecurityReportPushHandler, kotlin.coroutines.Continuation<? super com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler$startLocationUpdatesIfNeeded$1> continuation) {
        super(2, continuation);
        this.$ctx = application;
        this.this$0 = endpointSecurityReportPushHandler;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler$startLocationUpdatesIfNeeded$1 endpointSecurityReportPushHandler$startLocationUpdatesIfNeeded$1 = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler$startLocationUpdatesIfNeeded$1(this.$ctx, this.this$0, continuation);
        endpointSecurityReportPushHandler$startLocationUpdatesIfNeeded$1.L$0 = obj;
        return endpointSecurityReportPushHandler$startLocationUpdatesIfNeeded$1;
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        long jLongValue;
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
            if (com.larksuite.framework.utils.DevEnvUtil.isDebugMode(this.$ctx)) {
                jLongValue = com.ss.android.lark.security.compliance.infra.storage.EndpointLocationDebugStorage.a.b();
            } else {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                    obj2 = kotlin.Result.constructor-impl(kotlin.coroutines.jvm.internal.Boxing.boxLong(cm6.f.a().k0()));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                    obj2 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
                }
                java.lang.Long lBoxLong = kotlin.coroutines.jvm.internal.Boxing.boxLong(60000L);
                if (kotlin.Result.isFailure-impl(obj2)) {
                    obj2 = lBoxLong;
                }
                jLongValue = ((java.lang.Number) obj2).longValue();
            }
            com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient iEndpointLocationClient = this.this$0.c;
            android.app.Application application = this.$ctx;
            kotlin.jvm.internal.Intrinsics.checkNotNull(application);
            this.label = 1;
            obj = iEndpointLocationClient.a(application, (int) jLongValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler$startLocationUpdatesIfNeeded$1", "184");
            com.ss.android.lark.log.Log.w("EMM_PushHandler", "start location updates failed");
            this.this$0.f = false;
        }
        return kotlin.Unit.INSTANCE;
    }
}
