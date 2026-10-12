package com.ss.android.lark.endpoint.security.detection.factor;

@com.ss.android.lark.passportc.dwarf.UserScope
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\b\u0014\u0010\u0015J6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@\u00a2\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J0\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\"H\u0082@\u00a2\u0006\u0004\b#\u0010$J&\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0004\b(\u0010)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/DefaultEndpointSecurityFactorService;", "Lcom/ss/android/lark/endpoint/security/detection/factor/IEndpointSecurityFactorService;", "locationClient", "Lcom/ss/android/lark/endpoint/security/detection/location/IEndpointLocationClient;", "rustApi", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorRustApi;", "<init>", "(Lcom/ss/android/lark/endpoint/security/detection/location/IEndpointLocationClient;Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorRustApi;)V", "reportEnvironmentFactors", "Lkotlin/Result;", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorReportResult;", "context", "Landroid/content/Context;", "reportEnvironmentFactors-gIAlu-s", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportFactorsForPush", "config", "Lcom/ss/android/lark/endpoint/security/detection/factor/model/EndpointSecCollectionConfig;", "scene", "Lcom/bytedance/lark/pb/security/v1/EndpointSecurityInfoUploadScene;", "reportFactorsForPush-0E7RQCE", "(Lcom/ss/android/lark/endpoint/security/detection/factor/model/EndpointSecCollectionConfig;Lcom/bytedance/lark/pb/security/v1/EndpointSecurityInfoUploadScene;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportFactors", "reqLocPermIfNeeded", "", "reportFactors-yxL6bBk", "(Landroid/content/Context;Lcom/ss/android/lark/endpoint/security/detection/factor/model/EndpointSecCollectionConfig;Lcom/bytedance/lark/pb/security/v1/EndpointSecurityInfoUploadScene;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAndUpload", "fetchAndUpload-0E7RQCE", "mapLocationError", "", "err", "encodeAndUpload", "location", "Lcom/ss/android/lark/location/dto/LarkLocation;", "encodeAndUpload-BWLJW6A", "(Lcom/ss/android/lark/endpoint/security/detection/factor/model/EndpointSecCollectionConfig;Lcom/bytedance/lark/pb/security/v1/EndpointSecurityInfoUploadScene;Lcom/ss/android/lark/location/dto/LarkLocation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upload", "data", "", "upload-0E7RQCE", "(Ljava/lang/String;Lcom/bytedance/lark/pb/security/v1/EndpointSecurityInfoUploadScene;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes11.dex */
public final class DefaultEndpointSecurityFactorService implements com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityFactorService {
    public static final com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService.a c = new com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService.a(null);
    private final com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient a;
    private final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorRustApi b;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/DefaultEndpointSecurityFactorService$Companion;", "", "<init>", "()V", "TAG", "", "LOCATION_TIMEOUT_MS", "", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements io.reactivex.functions.Consumer {
        private final /* synthetic */ kotlin.jvm.functions.Function1 a;

        b(kotlin.jvm.functions.Function1 function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "function");
            this.a = function1;
        }

        public final /* synthetic */ void accept(java.lang.Object obj) {
            this.a.invoke(obj);
        }
    }

    private final java.lang.Throwable j(java.lang.Throwable th) {
        if (th instanceof com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.Timeout) {
            return com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationTimeout.INSTANCE;
        }
        if (th instanceof com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.Network) {
            return com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationNetwork.INSTANCE;
        }
        if (th instanceof com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.RiskOfFakeLocation) {
            return com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationRiskOfFakeLocation.INSTANCE;
        }
        if (th instanceof com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.PsdaRestricted) {
            return com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationPSDARestricted.INSTANCE;
        }
        if (th instanceof com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.AdminGpsDisabled) {
            return com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationAdminDisabledGPS.INSTANCE;
        }
        if (!(th instanceof com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.SdkRequestRejected) && !(th instanceof com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.SdkReturnedNull) && !(th instanceof com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.Unknown)) {
            return com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationUnknown.INSTANCE;
        }
        return com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationUnknown.INSTANCE;
    }

    @javax.inject.Inject
    public DefaultEndpointSecurityFactorService(com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient iEndpointLocationClient, com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorRustApi endpointSecurityFactorRustApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iEndpointLocationClient, "locationClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpointSecurityFactorRustApi, "rustApi");
        this.a = iEndpointLocationClient;
        this.b = endpointSecurityFactorRustApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityFactorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object b(android.content.Context context, kotlin.coroutines.Continuation<? super kotlin.Result<com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportResult>> continuation) {
        com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportEnvironmentFactors$1 defaultEndpointSecurityFactorService$reportEnvironmentFactors$1;
        if (continuation instanceof com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportEnvironmentFactors$1) {
            defaultEndpointSecurityFactorService$reportEnvironmentFactors$1 = (com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportEnvironmentFactors$1) continuation;
            int i = defaultEndpointSecurityFactorService$reportEnvironmentFactors$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultEndpointSecurityFactorService$reportEnvironmentFactors$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultEndpointSecurityFactorService$reportEnvironmentFactors$1 = new com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportEnvironmentFactors$1(this, continuation);
            }
        }
        com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportEnvironmentFactors$1 defaultEndpointSecurityFactorService$reportEnvironmentFactors$12 = defaultEndpointSecurityFactorService$reportEnvironmentFactors$1;
        java.lang.Object obj = defaultEndpointSecurityFactorService$reportEnvironmentFactors$12.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = defaultEndpointSecurityFactorService$reportEnvironmentFactors$12.label;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return ((kotlin.Result) obj).unbox-impl();
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "46");
        com.ss.android.lark.log.Log.i("EMM_FactorService", "reportEnvironmentFactors invoked");
        rc4.EndpointSecCollectionConfig endpointSecCollectionConfigA = rc4.EndpointSecCollectionConfig.d.a();
        com.bytedance.lark.pb.security.v1.EndpointSecurityInfoUploadScene endpointSecurityInfoUploadScene = com.bytedance.lark.pb.security.v1.EndpointSecurityInfoUploadScene.SYNC;
        defaultEndpointSecurityFactorService$reportEnvironmentFactors$12.label = 1;
        java.lang.Object objK = k(context, endpointSecCollectionConfigA, endpointSecurityInfoUploadScene, true, defaultEndpointSecurityFactorService$reportEnvironmentFactors$12);
        if (objK == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object i(rc4.EndpointSecCollectionConfig endpointSecCollectionConfig, com.bytedance.lark.pb.security.v1.EndpointSecurityInfoUploadScene endpointSecurityInfoUploadScene, kotlin.coroutines.Continuation<? super kotlin.Result<com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportResult>> continuation) {
        com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$fetchAndUpload$1 defaultEndpointSecurityFactorService$fetchAndUpload$1;
        java.lang.Object objE;
        com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService defaultEndpointSecurityFactorService;
        if (continuation instanceof com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$fetchAndUpload$1) {
            defaultEndpointSecurityFactorService$fetchAndUpload$1 = (com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$fetchAndUpload$1) continuation;
            int i = defaultEndpointSecurityFactorService$fetchAndUpload$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultEndpointSecurityFactorService$fetchAndUpload$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultEndpointSecurityFactorService$fetchAndUpload$1 = new com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$fetchAndUpload$1(this, continuation);
            }
        }
        java.lang.Object obj = defaultEndpointSecurityFactorService$fetchAndUpload$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = defaultEndpointSecurityFactorService$fetchAndUpload$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return ((kotlin.Result) obj).unbox-impl();
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            endpointSecurityInfoUploadScene = (com.bytedance.lark.pb.security.v1.EndpointSecurityInfoUploadScene) defaultEndpointSecurityFactorService$fetchAndUpload$1.L$2;
            endpointSecCollectionConfig = (rc4.EndpointSecCollectionConfig) defaultEndpointSecurityFactorService$fetchAndUpload$1.L$1;
            defaultEndpointSecurityFactorService = (com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService) defaultEndpointSecurityFactorService$fetchAndUpload$1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            objE = ((kotlin.Result) obj).unbox-impl();
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient iEndpointLocationClient = this.a;
            defaultEndpointSecurityFactorService$fetchAndUpload$1.L$0 = this;
            defaultEndpointSecurityFactorService$fetchAndUpload$1.L$1 = endpointSecCollectionConfig;
            defaultEndpointSecurityFactorService$fetchAndUpload$1.L$2 = endpointSecurityInfoUploadScene;
            defaultEndpointSecurityFactorService$fetchAndUpload$1.label = 1;
            objE = iEndpointLocationClient.e(defaultEndpointSecurityFactorService$fetchAndUpload$1);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
            defaultEndpointSecurityFactorService = this;
        }
        java.lang.Throwable th = kotlin.Result.exceptionOrNull-impl(objE);
        if (th == null) {
            defaultEndpointSecurityFactorService$fetchAndUpload$1.L$0 = null;
            defaultEndpointSecurityFactorService$fetchAndUpload$1.L$1 = null;
            defaultEndpointSecurityFactorService$fetchAndUpload$1.L$2 = null;
            defaultEndpointSecurityFactorService$fetchAndUpload$1.label = 2;
            java.lang.Object objH = defaultEndpointSecurityFactorService.h(endpointSecCollectionConfig, endpointSecurityInfoUploadScene, (com.ss.android.lark.location.dto.LarkLocation) objE, defaultEndpointSecurityFactorService$fetchAndUpload$1);
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objH;
        }
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "153");
        com.ss.android.lark.log.Log.e("EMM_FactorService", "fetchAndUpload: getCurrentLocationDetailed failed: " + th);
        return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(defaultEndpointSecurityFactorService.j(th)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.String str, com.bytedance.lark.pb.security.v1.EndpointSecurityInfoUploadScene endpointSecurityInfoUploadScene, kotlin.coroutines.Continuation<? super kotlin.Result<com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportResult>> continuation) {
        com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$upload$1 defaultEndpointSecurityFactorService$upload$1;
        java.lang.Object obj;
        if (continuation instanceof com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$upload$1) {
            defaultEndpointSecurityFactorService$upload$1 = (com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$upload$1) continuation;
            int i = defaultEndpointSecurityFactorService$upload$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultEndpointSecurityFactorService$upload$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultEndpointSecurityFactorService$upload$1 = new com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$upload$1(this, continuation);
            }
        }
        java.lang.Object objH = defaultEndpointSecurityFactorService$upload$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = defaultEndpointSecurityFactorService$upload$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.ResultKt.throwOnFailure(objH);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.ResultKt.throwOnFailure(objH);
            defaultEndpointSecurityFactorService$upload$1.L$0 = this;
            defaultEndpointSecurityFactorService$upload$1.L$1 = str;
            defaultEndpointSecurityFactorService$upload$1.L$2 = endpointSecurityInfoUploadScene;
            defaultEndpointSecurityFactorService$upload$1.label = 1;
            final kotlinx.coroutines.o oVar = new kotlinx.coroutines.o(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(defaultEndpointSecurityFactorService$upload$1), 1);
            oVar.S();
            try {
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(this.b.c(str, endpointSecurityInfoUploadScene).subscribe(new com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService.b(new kotlin.jvm.functions.Function1<com.bytedance.lark.pb.security.v1.EndpointSecurityInfoResponse, kotlin.Unit>() { // from class: com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$upload$2$disposable$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(com.bytedance.lark.pb.security.v1.EndpointSecurityInfoResponse endpointSecurityInfoResponse) {
                        java.lang.String str2 = "encodeAndUpload: upload success, code=" + endpointSecurityInfoResponse.code;
                        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService$upload$2$disposable$1$1", "206");
                        com.ss.android.lark.log.Log.i("EMM_FactorService", str2);
                        if (oVar.isActive()) {
                            kotlinx.coroutines.n<kotlin.Result<com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportResult>> nVar = oVar;
                            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                            java.lang.Long l = endpointSecurityInfoResponse.code;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l, "code");
                            nVar.resumeWith(kotlin.Result.constructor-impl(kotlin.Result.box-impl(kotlin.Result.constructor-impl(new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportResult(l.longValue())))));
                        }
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                        invoke((com.bytedance.lark.pb.security.v1.EndpointSecurityInfoResponse) obj2);
                        return kotlin.Unit.INSTANCE;
                    }
                }), new com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService.b(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$upload$2$disposable$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void invoke(java.lang.Throwable th) {
                        java.lang.String str2 = "encodeAndUpload: upload error, " + th.getMessage();
                        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService$upload$2$disposable$1$2", "212");
                        com.ss.android.lark.log.Log.e("EMM_FactorService", str2);
                        if (oVar.isActive()) {
                            kotlinx.coroutines.n<kotlin.Result<com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportResult>> nVar = oVar;
                            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(th);
                            nVar.resumeWith(kotlin.Result.constructor-impl(kotlin.Result.box-impl(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th)))));
                        }
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                        invoke((java.lang.Throwable) obj2);
                        return kotlin.Unit.INSTANCE;
                    }
                })));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
            }
            java.lang.Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
            if (th2 == null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "getOrElse(...)");
                final io.reactivex.disposables.Disposable disposable = (io.reactivex.disposables.Disposable) obj;
                oVar.r(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$upload$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                        invoke((java.lang.Throwable) obj2);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(java.lang.Throwable th3) {
                        disposable.dispose();
                    }
                });
            } else if (oVar.isActive()) {
                oVar.resumeWith(kotlin.Result.constructor-impl(kotlin.Result.box-impl(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th2)))));
            }
            objH = oVar.H();
            if (objH == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(defaultEndpointSecurityFactorService$upload$1);
            }
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return ((kotlin.Result) objH).unbox-impl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityFactorService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(rc4.EndpointSecCollectionConfig endpointSecCollectionConfig, com.bytedance.lark.pb.security.v1.EndpointSecurityInfoUploadScene endpointSecurityInfoUploadScene, kotlin.coroutines.Continuation<? super kotlin.Result<com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportResult>> continuation) {
        com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportFactorsForPush$1 defaultEndpointSecurityFactorService$reportFactorsForPush$1;
        if (continuation instanceof com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportFactorsForPush$1) {
            defaultEndpointSecurityFactorService$reportFactorsForPush$1 = (com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportFactorsForPush$1) continuation;
            int i = defaultEndpointSecurityFactorService$reportFactorsForPush$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultEndpointSecurityFactorService$reportFactorsForPush$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultEndpointSecurityFactorService$reportFactorsForPush$1 = new com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportFactorsForPush$1(this, continuation);
            }
        }
        com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportFactorsForPush$1 defaultEndpointSecurityFactorService$reportFactorsForPush$12 = defaultEndpointSecurityFactorService$reportFactorsForPush$1;
        java.lang.Object obj = defaultEndpointSecurityFactorService$reportFactorsForPush$12.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = defaultEndpointSecurityFactorService$reportFactorsForPush$12.label;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return ((kotlin.Result) obj).unbox-impl();
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "61");
        com.ss.android.lark.log.Log.i("EMM_FactorService", "reportFactorsForPush invoked, scene=" + endpointSecurityInfoUploadScene);
        android.app.Application applicationA = com.larksuite.framework.utils.a.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationA, "getApplication(...)");
        defaultEndpointSecurityFactorService$reportFactorsForPush$12.label = 1;
        java.lang.Object objK = k(applicationA, endpointSecCollectionConfig, endpointSecurityInfoUploadScene, false, defaultEndpointSecurityFactorService$reportFactorsForPush$12);
        if (objK == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object h(rc4.EndpointSecCollectionConfig endpointSecCollectionConfig, com.bytedance.lark.pb.security.v1.EndpointSecurityInfoUploadScene endpointSecurityInfoUploadScene, com.ss.android.lark.location.dto.LarkLocation larkLocation, kotlin.coroutines.Continuation<? super kotlin.Result<com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportResult>> continuation) {
        com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$encodeAndUpload$1 defaultEndpointSecurityFactorService$encodeAndUpload$1;
        boolean z;
        if (continuation instanceof com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$encodeAndUpload$1) {
            defaultEndpointSecurityFactorService$encodeAndUpload$1 = (com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$encodeAndUpload$1) continuation;
            int i = defaultEndpointSecurityFactorService$encodeAndUpload$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultEndpointSecurityFactorService$encodeAndUpload$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultEndpointSecurityFactorService$encodeAndUpload$1 = new com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$encodeAndUpload$1(this, continuation);
            }
        }
        java.lang.Object obj = defaultEndpointSecurityFactorService$encodeAndUpload$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = defaultEndpointSecurityFactorService$encodeAndUpload$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return ((kotlin.Result) obj).unbox-impl();
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        android.app.Application applicationA = com.larksuite.framework.utils.a.a();
        if (applicationA == null) {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("appContext is null")));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("encodeAndUpload, hasLocation=");
        if (larkLocation != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        java.lang.String string = sb.toString();
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "189");
        com.ss.android.lark.log.Log.i("EMM_FactorService", string);
        java.lang.String strE = com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorCollector.a.e(applicationA, endpointSecCollectionConfig, larkLocation);
        if (strE == null) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "192");
            com.ss.android.lark.log.Log.e("EMM_FactorService", "encodeAndUpload: encodePayload failed");
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.PayloadEncodeFailed.INSTANCE));
        }
        defaultEndpointSecurityFactorService$encodeAndUpload$1.label = 1;
        java.lang.Object objL = l(strE, endpointSecurityInfoUploadScene, defaultEndpointSecurityFactorService$encodeAndUpload$1);
        if (objL == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object k(android.content.Context context, rc4.EndpointSecCollectionConfig endpointSecCollectionConfig, com.bytedance.lark.pb.security.v1.EndpointSecurityInfoUploadScene endpointSecurityInfoUploadScene, boolean z, kotlin.coroutines.Continuation<? super kotlin.Result<com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportResult>> continuation) throws kotlin.NoWhenBranchMatchedException {
        com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportFactors$1 defaultEndpointSecurityFactorService$reportFactors$1;
        com.bytedance.lark.pb.security.v1.EndpointSecurityInfoUploadScene endpointSecurityInfoUploadScene2;
        com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService defaultEndpointSecurityFactorService;
        rc4.EndpointSecCollectionConfig endpointSecCollectionConfig2 = endpointSecCollectionConfig;
        if (continuation instanceof com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportFactors$1) {
            defaultEndpointSecurityFactorService$reportFactors$1 = (com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportFactors$1) continuation;
            int i = defaultEndpointSecurityFactorService$reportFactors$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultEndpointSecurityFactorService$reportFactors$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultEndpointSecurityFactorService$reportFactors$1 = new com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService$reportFactors$1(this, continuation);
            }
        }
        java.lang.Object objB = defaultEndpointSecurityFactorService$reportFactors$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = defaultEndpointSecurityFactorService$reportFactors$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                kotlin.ResultKt.throwOnFailure(objB);
                                return ((kotlin.Result) objB).unbox-impl();
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(objB);
                        return ((kotlin.Result) objB).unbox-impl();
                    }
                    endpointSecurityInfoUploadScene2 = (com.bytedance.lark.pb.security.v1.EndpointSecurityInfoUploadScene) defaultEndpointSecurityFactorService$reportFactors$1.L$2;
                    endpointSecCollectionConfig2 = (rc4.EndpointSecCollectionConfig) defaultEndpointSecurityFactorService$reportFactors$1.L$1;
                    defaultEndpointSecurityFactorService = (com.ss.android.lark.endpoint.security.detection.factor.DefaultEndpointSecurityFactorService) defaultEndpointSecurityFactorService$reportFactors$1.L$0;
                    kotlin.ResultKt.throwOnFailure(objB);
                } else {
                    kotlin.ResultKt.throwOnFailure(objB);
                    return ((kotlin.Result) objB).unbox-impl();
                }
            } else {
                kotlin.ResultKt.throwOnFailure(objB);
                return ((kotlin.Result) objB).unbox-impl();
            }
        } else {
            kotlin.ResultKt.throwOnFailure(objB);
            java.lang.String str = "reportFactors begin, scene=" + endpointSecurityInfoUploadScene + ", needCoord=" + endpointSecCollectionConfig.getNeedCoordinate() + ", needVpn=" + endpointSecCollectionConfig.getNeedDetectVpnProxy() + ", needTz=" + endpointSecCollectionConfig.getNeedTimezone() + ", reqPermIfNeeded=" + z;
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "90");
            com.ss.android.lark.log.Log.i("EMM_FactorService", str);
            if (!endpointSecCollectionConfig.getNeedCoordinate()) {
                ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "94");
                com.ss.android.lark.log.Log.i("EMM_FactorService", "reportFactors: skip coordinate, upload directly");
                defaultEndpointSecurityFactorService$reportFactors$1.label = 1;
                java.lang.Object objH = h(endpointSecCollectionConfig2, endpointSecurityInfoUploadScene, null, defaultEndpointSecurityFactorService$reportFactors$1);
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objH;
            }
            if (!this.a.f(context)) {
                ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "101");
                com.ss.android.lark.log.Log.i("EMM_FactorService", "reportFactors: location services disabled at device level");
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationServicesDisabled.INSTANCE));
            }
            if (this.a.g(context)) {
                ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "106");
                com.ss.android.lark.log.Log.i("EMM_FactorService", "reportFactors: has permission, getCurrentLocation");
                defaultEndpointSecurityFactorService$reportFactors$1.label = 2;
                java.lang.Object objI = i(endpointSecCollectionConfig2, endpointSecurityInfoUploadScene, defaultEndpointSecurityFactorService$reportFactors$1);
                if (objI == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objI;
            }
            if (z) {
                com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient iEndpointLocationClient = this.a;
                defaultEndpointSecurityFactorService$reportFactors$1.L$0 = this;
                defaultEndpointSecurityFactorService$reportFactors$1.L$1 = endpointSecCollectionConfig2;
                defaultEndpointSecurityFactorService$reportFactors$1.L$2 = endpointSecurityInfoUploadScene;
                defaultEndpointSecurityFactorService$reportFactors$1.label = 3;
                objB = iEndpointLocationClient.b(context, defaultEndpointSecurityFactorService$reportFactors$1);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                endpointSecurityInfoUploadScene2 = endpointSecurityInfoUploadScene;
                defaultEndpointSecurityFactorService = this;
            } else {
                ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "135");
                com.ss.android.lark.log.Log.i("EMM_FactorService", "reportFactors: no permission and not allowed to request, degrade to vpn/timezone only");
                defaultEndpointSecurityFactorService$reportFactors$1.label = 5;
                java.lang.Object objH2 = h(endpointSecCollectionConfig2, endpointSecurityInfoUploadScene, null, defaultEndpointSecurityFactorService$reportFactors$1);
                if (objH2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objH2;
            }
        }
        com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult locationPermissionRequestResult = (com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult) objB;
        if (kotlin.jvm.internal.Intrinsics.areEqual(locationPermissionRequestResult, com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.c.a)) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "118");
            com.ss.android.lark.log.Log.i("EMM_FactorService", "reportFactors: permission granted, getCurrentLocation");
            defaultEndpointSecurityFactorService$reportFactors$1.L$0 = null;
            defaultEndpointSecurityFactorService$reportFactors$1.L$1 = null;
            defaultEndpointSecurityFactorService$reportFactors$1.L$2 = null;
            defaultEndpointSecurityFactorService$reportFactors$1.label = 4;
            java.lang.Object objI2 = defaultEndpointSecurityFactorService.i(endpointSecCollectionConfig2, endpointSecurityInfoUploadScene2, defaultEndpointSecurityFactorService$reportFactors$1);
            if (objI2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objI2;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(locationPermissionRequestResult, com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.b.a)) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "122");
            com.ss.android.lark.log.Log.i("EMM_FactorService", "reportFactors: location permission denied this time");
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationPermissionDenied.INSTANCE));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(locationPermissionRequestResult, com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.a.a)) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "126");
            com.ss.android.lark.log.Log.i("EMM_FactorService", "reportFactors: location permission denied before, need go-to-settings");
            kotlin.Result.Companion companion3 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorReportError.LocationPermissionDeniedBefore.INSTANCE));
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(locationPermissionRequestResult, com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.d.a)) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointSecurityFactorService", "130");
            com.ss.android.lark.log.Log.e("EMM_FactorService", "reportFactors: location permission request unavailable");
            kotlin.Result.Companion companion4 = kotlin.Result.Companion;
            return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("location_permission_unavailable")));
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
