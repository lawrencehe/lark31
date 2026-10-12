package com.ss.android.lark.endpoint.security.detection.factor;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u000b\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorRustApi;", "", "rustClient", "Lcom/bytedance/lark/rustclient/api/IRustClient;", "<init>", "(Lcom/bytedance/lark/rustclient/api/IRustClient;)V", "upload", "Lio/reactivex/Single;", "Lcom/bytedance/lark/pb/security/v1/EndpointSecurityInfoResponse;", "data", "", "scene", "Lcom/bytedance/lark/pb/security/v1/EndpointSecurityInfoUploadScene;", "switchScene", "Lcom/bytedance/lark/pb/security/v1/EndpointSecuritySwitchResponse;", "Lcom/bytedance/lark/pb/security/v1/EndpointSecuritySwitchScene;", "extra", "Companion", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes11.dex */
public final class EndpointSecurityFactorRustApi {
    public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorRustApi.a b = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorRustApi.a(null);
    private final com.bytedance.lark.rustclient.api.m a;

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorRustApi$Companion;", "", "<init>", "()V", "TAG", "", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements io.reactivex.functions.Function {
        private final /* synthetic */ kotlin.jvm.functions.Function1 a;

        b(kotlin.jvm.functions.Function1 function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "function");
            this.a = function1;
        }

        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
            return this.a.invoke(obj);
        }
    }

    @javax.inject.Inject
    public EndpointSecurityFactorRustApi(com.bytedance.lark.rustclient.api.m mVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "rustClient");
        this.a = mVar;
    }

    public final io.reactivex.Single<com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchResponse> a(com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchScene endpointSecuritySwitchScene, java.lang.String str) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpointSecuritySwitchScene, "scene");
        com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchRequest.a aVarC = new com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchRequest.a().c(endpointSecuritySwitchScene);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            aVarC.b(str);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(aVarC);
        com.squareup.wire.ProtoAdapter protoAdapter = com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchResponse.ADAPTER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(protoAdapter, "ADAPTER");
        com.bytedance.lark.pb.basic.v1.Command command = com.bytedance.lark.pb.basic.v1.Command.ENDPOINT_SECURITY_SWITCH;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(command, "ENDPOINT_SECURITY_SWITCH");
        com.bytedance.lark.rustclient.api.d dVar = new com.bytedance.lark.rustclient.api.d(aVarC, protoAdapter, command, (java.lang.String) null, (com.bytedance.lark.sdk.StreamDataSource) null, (com.ss.android.lark.sdk.k) null, (com.ss.android.lark.pb.improto.Command) null, (java.lang.Boolean) null, 248, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityFactorRustApi", "90");
        com.ss.android.lark.log.Log.i("EMM_FactorRustApi", "switchScene: scene=" + endpointSecuritySwitchScene);
        io.reactivex.Single<com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchResponse> singleFlatMap = this.a.Tj(dVar).a().singleOrError().flatMap(new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorRustApi.b(new kotlin.jvm.functions.Function1<com.bytedance.lark.rustclient.api.s<com.bytedance.lark.sdk.refactor.b, com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchResponse>, io.reactivex.SingleSource<? extends com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchResponse>>() { // from class: com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorRustApi$switchScene$1
            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final io.reactivex.SingleSource<? extends com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchResponse> invoke(com.bytedance.lark.rustclient.api.s<com.bytedance.lark.sdk.refactor.b, com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchResponse> sVar) throws kotlin.NoWhenBranchMatchedException {
                java.lang.String str2;
                com.bytedance.lark.pb.basic.v1.LarkError.ErrorDetails errorDetails;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "output");
                if (sVar instanceof com.bytedance.lark.rustclient.api.u) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("switchScene success, reportConfigLen=");
                    com.bytedance.lark.rustclient.api.u uVar = (com.bytedance.lark.rustclient.api.u) sVar;
                    sb.append(((com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchResponse) uVar.c()).report_config.length());
                    java.lang.String string = sb.toString();
                    ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityFactorRustApi$switchScene$1", "98");
                    com.ss.android.lark.log.Log.i("EMM_FactorRustApi", string);
                    return io.reactivex.Single.just(uVar.c());
                }
                if (sVar instanceof com.bytedance.lark.rustclient.api.c) {
                    com.bytedance.lark.rustclient.api.c cVar = (com.bytedance.lark.rustclient.api.c) sVar;
                    com.bytedance.lark.pb.basic.v1.LarkError larkErrorF = cVar.c().f();
                    java.lang.Integer num = null;
                    if (larkErrorF != null && (errorDetails = larkErrorF.details) != null) {
                        str2 = errorDetails.x_tt_logid;
                    } else {
                        str2 = null;
                    }
                    com.bytedance.lark.pb.basic.v1.LarkError larkErrorF2 = cVar.c().f();
                    if (larkErrorF2 != null) {
                        num = larkErrorF2.code;
                    }
                    java.lang.String str3 = "switchScene error, logId=" + str2 + ", code=" + num + ", msg=" + cVar.c().d();
                    ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityFactorRustApi$switchScene$1", "104");
                    com.ss.android.lark.log.Log.e("EMM_FactorRustApi", str3);
                    return io.reactivex.Single.error(cVar.c().c());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public final io.reactivex.Single<com.bytedance.lark.pb.security.v1.EndpointSecurityInfoResponse> c(java.lang.String str, com.bytedance.lark.pb.security.v1.EndpointSecurityInfoUploadScene endpointSecurityInfoUploadScene) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpointSecurityInfoUploadScene, "scene");
        com.bytedance.lark.pb.security.v1.EndpointSecurityInfoRequest.a aVarC = new com.bytedance.lark.pb.security.v1.EndpointSecurityInfoRequest.a().b(str).c(endpointSecurityInfoUploadScene);
        kotlin.jvm.internal.Intrinsics.checkNotNull(aVarC);
        com.squareup.wire.ProtoAdapter protoAdapter = com.bytedance.lark.pb.security.v1.EndpointSecurityInfoResponse.ADAPTER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(protoAdapter, "ADAPTER");
        com.bytedance.lark.pb.basic.v1.Command command = com.bytedance.lark.pb.basic.v1.Command.ENDPOINT_SECURITY_INFO_UPLOAD;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(command, "ENDPOINT_SECURITY_INFO_UPLOAD");
        com.bytedance.lark.rustclient.api.d dVar = new com.bytedance.lark.rustclient.api.d(aVarC, protoAdapter, command, (java.lang.String) null, (com.bytedance.lark.sdk.StreamDataSource) null, (com.ss.android.lark.sdk.k) null, (com.ss.android.lark.pb.improto.Command) null, (java.lang.Boolean) null, 248, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        java.lang.String str2 = "upload: scene=" + endpointSecurityInfoUploadScene + ", dataLen=" + str.length();
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityFactorRustApi", "50");
        com.ss.android.lark.log.Log.i("EMM_FactorRustApi", str2);
        io.reactivex.Single<com.bytedance.lark.pb.security.v1.EndpointSecurityInfoResponse> singleFlatMap = this.a.Tj(dVar).a().singleOrError().flatMap(new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorRustApi.b(new kotlin.jvm.functions.Function1<com.bytedance.lark.rustclient.api.s<com.bytedance.lark.sdk.refactor.b, com.bytedance.lark.pb.security.v1.EndpointSecurityInfoResponse>, io.reactivex.SingleSource<? extends com.bytedance.lark.pb.security.v1.EndpointSecurityInfoResponse>>() { // from class: com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorRustApi$upload$1
            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final io.reactivex.SingleSource<? extends com.bytedance.lark.pb.security.v1.EndpointSecurityInfoResponse> invoke(com.bytedance.lark.rustclient.api.s<com.bytedance.lark.sdk.refactor.b, com.bytedance.lark.pb.security.v1.EndpointSecurityInfoResponse> sVar) throws kotlin.NoWhenBranchMatchedException {
                java.lang.String str3;
                com.bytedance.lark.pb.basic.v1.LarkError.ErrorDetails errorDetails;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sVar, "output");
                if (sVar instanceof com.bytedance.lark.rustclient.api.u) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("upload success, code=");
                    com.bytedance.lark.rustclient.api.u uVar = (com.bytedance.lark.rustclient.api.u) sVar;
                    sb.append(((com.bytedance.lark.pb.security.v1.EndpointSecurityInfoResponse) uVar.c()).code);
                    java.lang.String string = sb.toString();
                    ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityFactorRustApi$upload$1", "58");
                    com.ss.android.lark.log.Log.i("EMM_FactorRustApi", string);
                    return io.reactivex.Single.just(uVar.c());
                }
                if (sVar instanceof com.bytedance.lark.rustclient.api.c) {
                    com.bytedance.lark.rustclient.api.c cVar = (com.bytedance.lark.rustclient.api.c) sVar;
                    com.bytedance.lark.pb.basic.v1.LarkError larkErrorF = cVar.c().f();
                    java.lang.Integer num = null;
                    if (larkErrorF != null && (errorDetails = larkErrorF.details) != null) {
                        str3 = errorDetails.x_tt_logid;
                    } else {
                        str3 = null;
                    }
                    com.bytedance.lark.pb.basic.v1.LarkError larkErrorF2 = cVar.c().f();
                    if (larkErrorF2 != null) {
                        num = larkErrorF2.code;
                    }
                    java.lang.String str4 = "upload error, logId=" + str3 + ", code=" + num + ", msg=" + cVar.c().d();
                    ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityFactorRustApi$upload$1", "64");
                    com.ss.android.lark.log.Log.e("EMM_FactorRustApi", str4);
                    return io.reactivex.Single.error(cVar.c().c());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public static /* synthetic */ io.reactivex.Single b(com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorRustApi endpointSecurityFactorRustApi, com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchScene endpointSecuritySwitchScene, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return endpointSecurityFactorRustApi.a(endpointSecuritySwitchScene, str);
    }
}
