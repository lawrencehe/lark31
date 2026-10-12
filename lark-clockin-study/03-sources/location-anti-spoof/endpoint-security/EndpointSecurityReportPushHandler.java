package com.ss.android.lark.endpoint.security.detection.factor;

@com.ss.android.lark.passportc.dwarf.UserScope
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityReportPushHandler;", "Lcom/ss/android/lark/passportc/convention/repository/UserScopeRepository;", "Lcom/ss/android/lark/endpoint/security/detection/factor/IEndpointSecurityReportPushHandler;", "passport", "Lcom/ss/android/lark/passportc/api/IPassportUserService;", "rustClient", "Lcom/bytedance/lark/rustclient/api/IRustClient;", "locationClient", "Lcom/ss/android/lark/endpoint/security/detection/location/IEndpointLocationClient;", "rustApi", "Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorRustApi;", "<init>", "(Lcom/ss/android/lark/passportc/api/IPassportUserService;Lcom/bytedance/lark/rustclient/api/IRustClient;Lcom/ss/android/lark/endpoint/security/detection/location/IEndpointLocationClient;Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityFactorRustApi;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "locationStarted", "", "preparing", "", "state", "Lcom/ss/android/lark/passportc/entity/UserStatePayload;", "destroy", "handlePush", "msg", "Lcom/bytedance/lark/pb/security/v1/PushEndpointSecurityReportResponse;", "applyLocationUpdates", "config", "Lcom/ss/android/lark/endpoint/security/detection/factor/model/EndpointSecCollectionConfig;", "startLocationUpdatesIfNeeded", "stopLocationUpdates", "Companion", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes11.dex */
public final class EndpointSecurityReportPushHandler extends ac6.c implements com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityReportPushHandler {
    public static final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler.a g = new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler.a(null);
    private final com.bytedance.lark.rustclient.api.m b;
    private final com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient c;
    private final com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorRustApi d;
    private final io.reactivex.disposables.CompositeDisposable e;
    private boolean f;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/factor/EndpointSecurityReportPushHandler$Companion;", "", "<init>", "()V", "TAG", "", "LOCATION_INTERVAL_MS", "", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    private final void q0() {
        if (this.f) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler", "166");
            com.ss.android.lark.log.Log.i("EMM_PushHandler", "location updates already running, skip");
            return;
        }
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler", "169");
        com.ss.android.lark.log.Log.i("EMM_PushHandler", "start location updates");
        this.f = true;
        kotlinx.coroutines.BuildersKt.launch$default(com.ss.android.lark.security.compliance.infra.base.a.a(), (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler$startLocationUpdatesIfNeeded$1(com.larksuite.framework.utils.a.a(), this, null), 3, (java.lang.Object) null);
    }

    private final void r0() {
        if (this.f) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler", "194");
            com.ss.android.lark.log.Log.i("EMM_PushHandler", "stop location updates");
            com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient iEndpointLocationClient = this.c;
            android.app.Application applicationA = com.larksuite.framework.utils.a.a();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationA, "getApplication(...)");
            iEndpointLocationClient.d(applicationA);
            this.f = false;
        }
    }

    private final void n0(rc4.EndpointSecCollectionConfig endpointSecCollectionConfig) {
        if (endpointSecCollectionConfig.getNeedCoordinate()) {
            q0();
        } else {
            r0();
        }
    }

    protected void e0(dc6.h hVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "state");
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler", "100");
        com.ss.android.lark.log.Log.i("EMM_PushHandler", "destroy: dispose subscription");
        this.e.dispose();
        this.e.clear();
        r0();
    }

    protected void j0(dc6.h hVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "state");
        java.lang.String str = "preparing: subscribing PUSH_ENDPOINT_SECURITY_REPORT for userId=" + getPassport().getSession().b();
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler", "71");
        com.ss.android.lark.log.Log.i("EMM_PushHandler", str);
        if (!cm6.f.a().M()) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler", "73");
            com.ss.android.lark.log.Log.i("EMM_PushHandler", "preparing skip");
            return;
        }
        io.reactivex.disposables.CompositeDisposable compositeDisposable = this.e;
        com.bytedance.lark.rustclient.api.m mVar = this.b;
        com.bytedance.lark.pb.basic.v1.Command command = com.bytedance.lark.pb.basic.v1.Command.PUSH_ENDPOINT_SECURITY_REPORT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(command, "PUSH_ENDPOINT_SECURITY_REPORT");
        com.squareup.wire.ProtoAdapter protoAdapter = com.bytedance.lark.pb.security.v1.PushEndpointSecurityReportResponse.ADAPTER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(protoAdapter, "ADAPTER");
        compositeDisposable.add(com.bytedance.lark.rustclient.api.RustOutputKt.h(mVar.cm(command, protoAdapter), new kotlin.jvm.functions.Function1<com.bytedance.lark.pb.security.v1.PushEndpointSecurityReportResponse, kotlin.Unit>() { // from class: com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler$preparing$1
            {
                super(1);
            }

            public final void invoke(com.bytedance.lark.pb.security.v1.PushEndpointSecurityReportResponse pushEndpointSecurityReportResponse) {
                com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler endpointSecurityReportPushHandler = this.this$0;
                kotlin.jvm.internal.Intrinsics.checkNotNull(pushEndpointSecurityReportResponse);
                endpointSecurityReportPushHandler.o0(pushEndpointSecurityReportResponse);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.bytedance.lark.pb.security.v1.PushEndpointSecurityReportResponse) obj);
                return kotlin.Unit.INSTANCE;
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler$preparing$2
            public final void invoke(java.lang.Throwable th) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "e");
                java.lang.String str2 = "subscribe failed: " + th.getMessage();
                ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler$preparing$2", "82");
                com.ss.android.lark.log.Log.e("EMM_PushHandler", str2);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((java.lang.Throwable) obj);
                return kotlin.Unit.INSTANCE;
            }
        }));
        this.e.add(com.ss.android.lark.security.compliance.infra.extension.RxjavaExKt.b(com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorRustApi.b(this.d, com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchScene.BLOCKED_BY_GEO_UNKNOWN, null, 2, null)).subscribe(new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler.b(new kotlin.jvm.functions.Function1<com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchResponse, kotlin.Unit>() { // from class: com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler$preparing$3
            public final void invoke(com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchResponse endpointSecuritySwitchResponse) {
                java.lang.String str2 = "switchScene BLOCKED_BY_GEO_UNKNOWN ok, reportConfigLen=" + endpointSecuritySwitchResponse.report_config.length();
                ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler$preparing$3", "93");
                com.ss.android.lark.log.Log.i("EMM_PushHandler", str2);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((com.bytedance.lark.pb.security.v1.EndpointSecuritySwitchResponse) obj);
                return kotlin.Unit.INSTANCE;
            }
        }), new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler.b(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler$preparing$4
            public final void invoke(java.lang.Throwable th) {
                java.lang.String str2 = "switchScene BLOCKED_BY_GEO_UNKNOWN failed: " + th.getMessage();
                ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler$preparing$4", "94");
                com.ss.android.lark.log.Log.e("EMM_PushHandler", str2);
            }

            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((java.lang.Throwable) obj);
                return kotlin.Unit.INSTANCE;
            }
        })));
    }

    public void o0(com.bytedance.lark.pb.security.v1.PushEndpointSecurityReportResponse pushEndpointSecurityReportResponse) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushEndpointSecurityReportResponse, "msg");
        java.lang.String str = "handlePush: scene=" + pushEndpointSecurityReportResponse.scene;
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler", "107");
        com.ss.android.lark.log.Log.i("EMM_PushHandler", str);
        android.app.Application applicationA = com.larksuite.framework.utils.a.a();
        rc4.EndpointSecCollectionConfig endpointSecCollectionConfigG = com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorCollector.a.g(pushEndpointSecurityReportResponse.report_config);
        if (endpointSecCollectionConfigG != null) {
            com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient iEndpointLocationClient = this.c;
            kotlin.jvm.internal.Intrinsics.checkNotNull(applicationA);
            rc4.EndpointSecCollectionConfig endpointSecCollectionConfigB = endpointSecCollectionConfigG.b(iEndpointLocationClient.isGpsSupported(applicationA));
            if (endpointSecCollectionConfigB != null) {
                n0(endpointSecCollectionConfigB);
                if (!endpointSecCollectionConfigB.c()) {
                    ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler", "122");
                    com.ss.android.lark.log.Log.i("EMM_PushHandler", "handlePush: no factor enabled in config, skip report");
                    return;
                }
                com.ss.android.lark.passportc.entity.UserSession session = getPassport().getSession();
                try {
                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                    android.app.Application applicationA2 = com.larksuite.framework.utils.a.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationA2, "getApplication(...)");
                    obj = kotlin.Result.constructor-impl((com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityFactorService) cc6.l.c(((com.ss.android.lark.passportc.internal.t) cc6.l.a(applicationA2, com.ss.android.lark.passportc.internal.t.class)).c(session), com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityFactorService.class));
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
                }
                if (kotlin.Result.isFailure-impl(obj)) {
                    obj = null;
                }
                com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityFactorService iEndpointSecurityFactorService = (com.ss.android.lark.endpoint.security.detection.factor.IEndpointSecurityFactorService) obj;
                if (iEndpointSecurityFactorService == null) {
                    ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler", "136");
                    com.ss.android.lark.log.Log.e("EMM_PushHandler", "handlePush: cannot resolve IEndpointSecurityFactorService via SPI, abort");
                    return;
                } else {
                    kotlinx.coroutines.BuildersKt.launch$default(com.ss.android.lark.security.compliance.infra.base.a.a(), (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityReportPushHandler$handlePush$1(iEndpointSecurityFactorService, endpointSecCollectionConfigB, null), 3, (java.lang.Object) null);
                    return;
                }
            }
        }
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "EndpointSecurityReportPushHandler", "114");
        com.ss.android.lark.log.Log.i("EMM_PushHandler", "handlePush: empty/invalid config (after gps gating), skip");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @javax.inject.Inject
    public EndpointSecurityReportPushHandler(com.ss.android.lark.passportc.api.p pVar, com.bytedance.lark.rustclient.api.m mVar, com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient iEndpointLocationClient, com.ss.android.lark.endpoint.security.detection.factor.EndpointSecurityFactorRustApi endpointSecurityFactorRustApi) {
        super(pVar);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "passport");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "rustClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iEndpointLocationClient, "locationClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpointSecurityFactorRustApi, "rustApi");
        this.b = mVar;
        this.c = iEndpointLocationClient;
        this.d = endpointSecurityFactorRustApi;
        this.e = new io.reactivex.disposables.CompositeDisposable();
        com.ss.android.lark.passportc.api.x.a(this);
    }
}
