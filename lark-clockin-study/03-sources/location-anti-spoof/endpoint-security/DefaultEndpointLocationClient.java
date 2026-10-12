package com.ss.android.lark.endpoint.security.detection.location;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\t\b\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\f\u0010\u001e\u001a\u00020\u000f*\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\n\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0014H\u0096@\u00a2\u0006\u0002\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140'H\u0096@\u00a2\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140'H\u0082@\u00a2\u0006\u0004\b+\u0010%J\u0018\u0010,\u001a\u0004\u0018\u00010\u00142\u0006\u0010-\u001a\u00020.H\u0082@\u00a2\u0006\u0002\u0010/J\u0010\u00100\u001a\u0002012\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u00102\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0002\u00103J\b\u00104\u001a\u000205H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/DefaultEndpointLocationClient;", "Lcom/ss/android/lark/endpoint/security/detection/location/IEndpointLocationClient;", "<init>", "()V", "locationClient", "Lcom/ss/android/lark/location/listener/ILocation;", "getLocationClient", "()Lcom/ss/android/lark/location/listener/ILocation;", "locationClient$delegate", "Lkotlin/Lazy;", "isLocating", "Ljava/util/concurrent/atomic/AtomicBoolean;", "locationTimerJob", "Lkotlinx/coroutines/Job;", "foregroundRuntimeOwnerId", "", "locationCallBack", "Lcom/ss/android/lark/location/listener/LocationCallBack;", "latestLocation", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/ss/android/lark/location/dto/LarkLocation;", "startContinuousLocation", "", "context", "Landroid/content/Context;", "intervalMillis", "", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startNativeContinuousLocation", "startTimerDrivenLocation", "toMonitorReason", "Lcom/ss/android/lark/endpoint/security/detection/location/LocationPermissionRequestResult;", "stopContinuousLocation", "", "isGpsSupported", "hasLocationPermission", "getCurrentLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentLocationDetailed", "Lkotlin/Result;", "getCurrentLocationDetailed-IoAF18A", "isLocationServicesEnabled", "requestOnceLocationDetailed", "requestOnceLocationDetailed-IoAF18A", "requestBackgroundAwareOnceLocation", "option", "Lcom/ss/android/lark/location/listener/LocationRequestOption;", "(Lcom/ss/android/lark/location/listener/LocationRequestOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNotificationConfig", "Lcom/ss/android/lark/endpoint/security/detection/location/NotificationConfig;", "requestLocationPermission", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocationPriority", "Lcom/ss/android/lark/location/listener/LocationRequestOption$LocationPriority;", "Companion", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes11.dex */
public final class DefaultEndpointLocationClient implements com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient {
    public static final com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient.a g = new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient.a(null);
    private static final java.util.concurrent.atomic.AtomicLong h = new java.util.concurrent.atomic.AtomicLong(0);
    private kotlinx.coroutines.Job c;
    private n75.d e;
    private final kotlin.Lazy a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<n75.b>() { // from class: com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$locationClient$2
        public final n75.b invoke() {
            return com.ss.android.lark.location.service.g.a().getLocationClient(com.larksuite.framework.utils.a.a(), new com.ss.android.lark.location.dto.LocationClientConfig());
        }
    });
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    private java.lang.String d = "";
    private final kotlinx.coroutines.flow.i0<com.ss.android.lark.location.dto.LarkLocation> f = kotlinx.coroutines.flow.s0.a((java.lang.Object) null);

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/ss/android/lark/endpoint/security/detection/location/DefaultEndpointLocationClient$Companion;", "", "<init>", "()V", "TAG", "", "LOCATION_FLOW_ID", "Ljava/util/concurrent/atomic/AtomicLong;", "MIN_INTERVAL_MILLIS", "", "ONCE_LOCATION_TIMEOUT_MILLIS", "", "BG_AWARE_ONCE_BOOTSTRAP_INTERVAL_MILLIS", "endpoint-security-detection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ kotlin.enums.a<com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority> a = kotlin.enums.b.a(com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n75.b q() {
        java.lang.Object value = this.a.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n75.b) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority r() {
        java.lang.Object next;
        java.lang.String strC = com.ss.android.lark.security.compliance.infra.storage.EndpointLocationDebugStorage.a.c();
        java.util.Iterator it = com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient.b.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority) next).name(), strC)) {
                break;
            }
        }
        com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority locationPriority = (com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority) next;
        if (locationPriority == null) {
            locationPriority = com.ss.android.lark.location.listener.LocationRequestOption.LocationPriority.PRIORITY_HIGH_ACCURACY;
        }
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "493");
        com.ss.android.lark.log.Log.i("DefaultLocationClient", "getLocationPriority: stored=" + strC + ", priority=" + locationPriority);
        return locationPriority;
    }

    @javax.inject.Inject
    public DefaultEndpointLocationClient() {
    }

    private final com.ss.android.lark.endpoint.security.detection.location.NotificationConfig p(android.content.Context context) {
        java.lang.String strMustacheFormat = com.ss.android.lark.utils.UIHelper.mustacheFormat(2131827664, "APP_DISPLAY_NAME", com.ss.android.lark.utils.UIHelper.getAppName());
        java.lang.String string = context.getString(2131827665);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNull(strMustacheFormat);
        return new com.ss.android.lark.endpoint.security.detection.location.NotificationConfig(2131241897, string, strMustacheFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object t(kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.ss.android.lark.location.dto.LarkLocation>> continuation) {
        com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$requestOnceLocationDetailed$1 defaultEndpointLocationClient$requestOnceLocationDetailed$1;
        if (continuation instanceof com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$requestOnceLocationDetailed$1) {
            defaultEndpointLocationClient$requestOnceLocationDetailed$1 = (com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$requestOnceLocationDetailed$1) continuation;
            int i = defaultEndpointLocationClient$requestOnceLocationDetailed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultEndpointLocationClient$requestOnceLocationDetailed$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultEndpointLocationClient$requestOnceLocationDetailed$1 = new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$requestOnceLocationDetailed$1(this, continuation);
            }
        }
        java.lang.Object objH = defaultEndpointLocationClient$requestOnceLocationDetailed$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = defaultEndpointLocationClient$requestOnceLocationDetailed$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.ResultKt.throwOnFailure(objH);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.ResultKt.throwOnFailure(objH);
            final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
            if (!p75.a.a()) {
                ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "315");
                com.ss.android.lark.log.Log.i("DefaultLocationClient", "requestOnceLocationDetailed: admin disabled GPS, fail directly");
                u(atomicBoolean, jElapsedRealtime, false, "sdk_request_rejected");
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                return kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.AdminGpsDisabled.INSTANCE));
            }
            defaultEndpointLocationClient$requestOnceLocationDetailed$1.L$0 = this;
            defaultEndpointLocationClient$requestOnceLocationDetailed$1.L$1 = atomicBoolean;
            defaultEndpointLocationClient$requestOnceLocationDetailed$1.J$0 = jElapsedRealtime;
            defaultEndpointLocationClient$requestOnceLocationDetailed$1.label = 1;
            kotlinx.coroutines.o oVar = new kotlinx.coroutines.o(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(defaultEndpointLocationClient$requestOnceLocationDetailed$1), 1);
            oVar.S();
            com.ss.android.lark.location.listener.LocationRequestOption locationRequestOption = new com.ss.android.lark.location.listener.LocationRequestOption();
            locationRequestOption.f(r());
            locationRequestOption.g(false);
            if (!q().d(new com.bytedance.supervisor.token.Token("LARK-PSDA-advanced_login_geo_get_location_android"), com.ss.android.lark.location.dto.Scene.Passport.INSTANCE, new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient.d(oVar, atomicBoolean, jElapsedRealtime), locationRequestOption)) {
                ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "366");
                com.ss.android.lark.log.Log.e("DefaultLocationClient", "getLocationWithOption returned false");
                u(atomicBoolean, jElapsedRealtime, false, "sdk_request_rejected");
                if (oVar.isActive()) {
                    kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                    oVar.resumeWith(kotlin.Result.constructor-impl(kotlin.Result.box-impl(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.SdkRequestRejected.INSTANCE)))));
                }
            }
            oVar.r(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$requestOnceLocationDetailed$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(java.lang.Throwable th) {
                    ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient$requestOnceLocationDetailed$2$1", "371");
                    com.ss.android.lark.log.Log.i("DefaultLocationClient", "once location: cancelled");
                    com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient.u(atomicBoolean, jElapsedRealtime, false, "cancelled");
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((java.lang.Throwable) obj);
                    return kotlin.Unit.INSTANCE;
                }
            });
            objH = oVar.H();
            if (objH == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(defaultEndpointLocationClient$requestOnceLocationDetailed$1);
            }
            if (objH == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return ((kotlin.Result) objH).unbox-impl();
    }

    private final boolean v(int i) {
        com.ss.android.lark.location.listener.LocationRequestOption locationRequestOption = new com.ss.android.lark.location.listener.LocationRequestOption();
        locationRequestOption.f(r());
        locationRequestOption.h(true);
        locationRequestOption.g(false);
        this.e = new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient.e();
        return q().a(new com.bytedance.supervisor.token.Token("LARK-PSDA-advanced_login_geo_get_location_android"), com.ss.android.lark.location.dto.Scene.Passport.INSTANCE, this.e, i, locationRequestOption);
    }

    private final boolean w(int i) {
        int iCoerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(i, 1000);
        kotlinx.coroutines.Job job = this.c;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.c = kotlinx.coroutines.BuildersKt.launch$default(com.ss.android.lark.security.compliance.infra.base.a.a(), kotlinx.coroutines.Dispatchers.getIO(), (kotlinx.coroutines.CoroutineStart) null, new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startTimerDrivenLocation$1(this, iCoerceAtLeast, null), 2, (java.lang.Object) null);
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final java.lang.String x(com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult locationPermissionRequestResult) throws kotlin.NoWhenBranchMatchedException {
        if (locationPermissionRequestResult instanceof com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.c) {
            return "ok";
        }
        if (locationPermissionRequestResult instanceof com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.b) {
            return "permission_denied_this_time";
        }
        if (locationPermissionRequestResult instanceof com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.a) {
            return "permission_denied_before";
        }
        if (locationPermissionRequestResult instanceof com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.d) {
            return "permission_unavailable";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object c(kotlin.coroutines.Continuation<? super com.ss.android.lark.location.dto.LarkLocation> continuation) {
        com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$getCurrentLocation$1 defaultEndpointLocationClient$getCurrentLocation$1;
        java.lang.Object objE;
        if (continuation instanceof com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$getCurrentLocation$1) {
            defaultEndpointLocationClient$getCurrentLocation$1 = (com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$getCurrentLocation$1) continuation;
            int i = defaultEndpointLocationClient$getCurrentLocation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultEndpointLocationClient$getCurrentLocation$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultEndpointLocationClient$getCurrentLocation$1 = new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$getCurrentLocation$1(this, continuation);
            }
        }
        java.lang.Object obj = defaultEndpointLocationClient$getCurrentLocation$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = defaultEndpointLocationClient$getCurrentLocation$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                objE = ((kotlin.Result) obj).unbox-impl();
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            defaultEndpointLocationClient$getCurrentLocation$1.label = 1;
            objE = e(defaultEndpointLocationClient$getCurrentLocation$1);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (kotlin.Result.isFailure-impl(objE)) {
            return null;
        }
        return objE;
    }

    @Override // com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient
    public void d(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "236");
        com.ss.android.lark.log.Log.i("DefaultLocationClient", "stopContinuousLocation");
        kotlinx.coroutines.Job job = this.c;
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.c = null;
        n75.d dVar = this.e;
        this.e = null;
        if (dVar != null) {
            kotlinx.coroutines.BuildersKt.launch$default(com.ss.android.lark.security.compliance.infra.base.a.a(), kotlinx.coroutines.Dispatchers.getIO(), (kotlinx.coroutines.CoroutineStart) null, new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$stopContinuousLocation$1(this, dVar, null), 2, (java.lang.Object) null);
        }
        com.ss.android.lark.endpoint.security.detection.location.LocationBackgroundRuntime locationBackgroundRuntime = com.ss.android.lark.endpoint.security.detection.location.LocationBackgroundRuntime.a;
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        locationBackgroundRuntime.b(applicationContext, this.d);
        this.f.setValue((java.lang.Object) null);
        if (this.b.getAndSet(false)) {
            com.ss.android.lark.endpoint.security.detection.location.EndpointLocationMonitor.a.b("stop");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object e(kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.ss.android.lark.location.dto.LarkLocation>> continuation) {
        com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$getCurrentLocationDetailed$1 defaultEndpointLocationClient$getCurrentLocationDetailed$1;
        if (continuation instanceof com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$getCurrentLocationDetailed$1) {
            defaultEndpointLocationClient$getCurrentLocationDetailed$1 = (com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$getCurrentLocationDetailed$1) continuation;
            int i = defaultEndpointLocationClient$getCurrentLocationDetailed$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultEndpointLocationClient$getCurrentLocationDetailed$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultEndpointLocationClient$getCurrentLocationDetailed$1 = new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$getCurrentLocationDetailed$1(this, continuation);
            }
        }
        java.lang.Object obj = defaultEndpointLocationClient$getCurrentLocationDetailed$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = defaultEndpointLocationClient$getCurrentLocationDetailed$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
                return ((kotlin.Result) obj).unbox-impl();
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.ss.android.lark.location.dto.LarkLocation larkLocation = (com.ss.android.lark.location.dto.LarkLocation) this.f.getValue();
        if (larkLocation != null) {
            return kotlin.Result.constructor-impl(larkLocation);
        }
        defaultEndpointLocationClient$getCurrentLocationDetailed$1.label = 1;
        java.lang.Object objT = t(defaultEndpointLocationClient$getCurrentLocationDetailed$1);
        if (objT == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objT;
    }

    @Override // com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient
    public boolean f(android.content.Context context) {
        android.location.LocationManager locationManager;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.lang.Object objS = u1.a.s(context.getApplicationContext(), "location");
        if (objS instanceof android.location.LocationManager) {
            locationManager = (android.location.LocationManager) objS;
        } else {
            locationManager = null;
        }
        if (locationManager == null) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "290");
            com.ss.android.lark.log.Log.e("DefaultLocationClient", "isLocationServicesEnabled: LocationManager unavailable");
            return false;
        }
        boolean zA = androidx.core.location.a.a(locationManager);
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "294");
        com.ss.android.lark.log.Log.i("DefaultLocationClient", "isLocationServicesEnabled=" + zA);
        return zA;
    }

    @Override // com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient
    public boolean g(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return p75.f.a.a(context);
    }

    @Override // com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient
    public boolean isGpsSupported(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.location.gps");
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "269");
        com.ss.android.lark.log.Log.i("DefaultLocationClient", "isGpsSupported=" + zHasSystemFeature);
        return zHasSystemFeature;
    }

    @Override // com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient
    public boolean isLocating(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return this.b.get();
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032,\u0010\u0005\u001a(\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\b0\u0006H\n\u00a2\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "location", "Lcom/ss/android/lark/location/dto/LarkLocation;", "kotlin.jvm.PlatformType", "<unused var>", "", "Landroid/location/Location;", "", "onLocationChange", "(Lcom/ss/android/lark/location/dto/LarkLocation;Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements n75.d {
        final /* synthetic */ kotlinx.coroutines.n<com.ss.android.lark.location.dto.LarkLocation> a;
        final /* synthetic */ com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient b;

        c(kotlinx.coroutines.n<? super com.ss.android.lark.location.dto.LarkLocation> nVar, com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient defaultEndpointLocationClient) {
            this.a = nVar;
            this.b = defaultEndpointLocationClient;
        }

        public final void a(com.ss.android.lark.location.dto.LarkLocation larkLocation, java.util.List<android.location.Location> list) {
            java.lang.Object obj;
            if (this.a.isActive()) {
                n75.d dVar = this.b.e;
                if (dVar != null) {
                    this.b.e = null;
                    com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient defaultEndpointLocationClient = this.b;
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(java.lang.Boolean.valueOf(defaultEndpointLocationClient.q().f(dVar)));
                    } catch (java.lang.Throwable th) {
                        kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
                    }
                    java.lang.Throwable th2 = kotlin.Result.exceptionOrNull-impl(obj);
                    if (th2 != null) {
                        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient$requestBackgroundAwareOnceLocation$2$cb$1", "397");
                        com.ss.android.lark.log.Log.e("DefaultLocationClient", "stopLocation in callback threw: " + th2);
                    }
                }
                this.a.resumeWith(kotlin.Result.constructor-impl(larkLocation));
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032,\u0010\u0005\u001a(\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\b0\u0006H\n\u00a2\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "location", "Lcom/ss/android/lark/location/dto/LarkLocation;", "kotlin.jvm.PlatformType", "<unused var>", "", "Landroid/location/Location;", "", "onLocationChange", "(Lcom/ss/android/lark/location/dto/LarkLocation;Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d implements n75.d {
        final /* synthetic */ kotlinx.coroutines.n<kotlin.Result<? extends com.ss.android.lark.location.dto.LarkLocation>> a;
        final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean b;
        final /* synthetic */ long c;

        d(kotlinx.coroutines.n<? super kotlin.Result<? extends com.ss.android.lark.location.dto.LarkLocation>> nVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, long j) {
            this.a = nVar;
            this.b = atomicBoolean;
            this.c = j;
        }

        public final void a(com.ss.android.lark.location.dto.LarkLocation larkLocation, java.util.List<android.location.Location> list) {
            java.lang.Integer numValueOf;
            java.lang.String str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("once location received, errorCode=");
            java.lang.Throwable th = null;
            if (larkLocation != null) {
                numValueOf = java.lang.Integer.valueOf(larkLocation.j());
            } else {
                numValueOf = null;
            }
            sb.append(numValueOf);
            java.lang.String string = sb.toString();
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient$requestOnceLocationDetailed$2$started$1", "330");
            com.ss.android.lark.log.Log.i("DefaultLocationClient", string);
            if (larkLocation == null) {
                th = com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.SdkReturnedNull.INSTANCE;
            } else if (larkLocation.j() != 0) {
                if (larkLocation.j() == 40100 || larkLocation.j() == 40400) {
                    th = com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.AdminGpsDisabled.INSTANCE;
                } else if (larkLocation.j() == 40200) {
                    th = com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.PsdaRestricted.INSTANCE;
                } else {
                    th = com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.Unknown.INSTANCE;
                }
            }
            if (th != null || larkLocation == null) {
                if (th != null) {
                    if (th instanceof com.ss.android.lark.endpoint.security.detection.location.EndpointLocationFetchError.SdkReturnedNull) {
                        str = "sdk_returned_null";
                    } else {
                        str = "sdk_request_rejected";
                    }
                    com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient.u(this.b, this.c, false, str);
                    if (this.a.isActive()) {
                        kotlinx.coroutines.n<kotlin.Result<? extends com.ss.android.lark.location.dto.LarkLocation>> nVar = this.a;
                        kotlin.Result.Companion companion = kotlin.Result.Companion;
                        nVar.resumeWith(kotlin.Result.constructor-impl(kotlin.Result.box-impl(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th)))));
                        return;
                    }
                    return;
                }
                return;
            }
            com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient.u(this.b, this.c, true, "ok");
            if (this.a.isActive()) {
                this.a.resumeWith(kotlin.Result.constructor-impl(kotlin.Result.box-impl(kotlin.Result.constructor-impl(larkLocation))));
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032,\u0010\u0005\u001a(\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\b0\u0006H\n\u00a2\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "location", "Lcom/ss/android/lark/location/dto/LarkLocation;", "kotlin.jvm.PlatformType", "<unused var>", "", "Landroid/location/Location;", "", "onLocationChange", "(Lcom/ss/android/lark/location/dto/LarkLocation;Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e implements n75.d {
        e() {
        }

        public final void a(com.ss.android.lark.location.dto.LarkLocation larkLocation, java.util.List<android.location.Location> list) {
            com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient.this.f.setValue(larkLocation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object s(com.ss.android.lark.location.listener.LocationRequestOption locationRequestOption, kotlin.coroutines.Continuation<? super com.ss.android.lark.location.dto.LarkLocation> continuation) {
        kotlinx.coroutines.o oVar = new kotlinx.coroutines.o(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        oVar.S();
        final com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient.c cVar = new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient.c(oVar, this);
        this.e = cVar;
        if (!q().a(new com.bytedance.supervisor.token.Token("LARK-PSDA-advanced_login_geo_get_location_android"), com.ss.android.lark.location.dto.Scene.Passport.INSTANCE, cVar, 1000, locationRequestOption)) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "411");
            com.ss.android.lark.log.Log.e("DefaultLocationClient", "bg-aware once location: requestLocationWithOption returned false");
            this.e = null;
            if (oVar.isActive()) {
                oVar.resumeWith(kotlin.Result.constructor-impl((java.lang.Object) null));
            }
        } else {
            oVar.r(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$requestBackgroundAwareOnceLocation$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(java.lang.Throwable th) {
                    java.lang.Object obj;
                    if (this.this$0.e == cVar) {
                        this.this$0.e = null;
                    }
                    com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient defaultEndpointLocationClient = this.this$0;
                    n75.d dVar = cVar;
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(java.lang.Boolean.valueOf(defaultEndpointLocationClient.q().f(dVar)));
                    } catch (java.lang.Throwable th2) {
                        kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                        obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th2));
                    }
                    java.lang.Throwable th3 = kotlin.Result.exceptionOrNull-impl(obj);
                    if (th3 != null) {
                        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient$requestBackgroundAwareOnceLocation$2$1", "423");
                        com.ss.android.lark.log.Log.e("DefaultLocationClient", "stopLocation in cancel threw: " + th3);
                    }
                }

                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((java.lang.Throwable) obj);
                    return kotlin.Unit.INSTANCE;
                }
            });
        }
        java.lang.Object objH = oVar.H();
        if (objH == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objH;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object b(android.content.Context context, kotlin.coroutines.Continuation<? super com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult> continuation) {
        com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$requestLocationPermission$1 defaultEndpointLocationClient$requestLocationPermission$1;
        java.lang.Object obj;
        if (continuation instanceof com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$requestLocationPermission$1) {
            defaultEndpointLocationClient$requestLocationPermission$1 = (com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$requestLocationPermission$1) continuation;
            int i = defaultEndpointLocationClient$requestLocationPermission$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultEndpointLocationClient$requestLocationPermission$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultEndpointLocationClient$requestLocationPermission$1 = new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$requestLocationPermission$1(this, continuation);
            }
        }
        java.lang.Object objH = defaultEndpointLocationClient$requestLocationPermission$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = defaultEndpointLocationClient$requestLocationPermission$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    kotlin.ResultKt.throwOnFailure(objH);
                } else {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.ResultKt.throwOnFailure(objH);
                if (g(context)) {
                    return com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.c.a;
                }
                if (!(context instanceof android.app.Activity)) {
                    ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "447");
                    com.ss.android.lark.log.Log.e("DefaultLocationClient", "Failed: context is not Activity");
                    return com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.d.a;
                }
                defaultEndpointLocationClient$requestLocationPermission$1.L$0 = this;
                defaultEndpointLocationClient$requestLocationPermission$1.L$1 = context;
                defaultEndpointLocationClient$requestLocationPermission$1.label = 1;
                final kotlinx.coroutines.o oVar = new kotlinx.coroutines.o(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(defaultEndpointLocationClient$requestLocationPermission$1), 1);
                oVar.S();
                try {
                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(new com.ss.android.lark.permission.rxPermission.c((android.app.Activity) context).t(new com.bytedance.supervisor.token.Token("LARK-PSDA-advanced_login_geo_request_permission_android"), new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"}).subscribe(new com.ss.android.lark.endpoint.security.detection.location.a.C0102a(new kotlin.jvm.functions.Function1<kc6.b, kotlin.Unit>() { // from class: com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$requestLocationPermission$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void invoke(kc6.b bVar) {
                            java.lang.Object obj2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "perm");
                            if (!oVar.isActive()) {
                                return;
                            }
                            if (bVar.b) {
                                obj2 = com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.c.a;
                            } else if (bVar.c) {
                                obj2 = com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.b.a;
                            } else {
                                obj2 = com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.a.a;
                            }
                            java.lang.String str = "requestLocationPermission result=" + kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(obj2.getClass()).getSimpleName() + ", granted=" + bVar.b + ", rationale=" + bVar.c;
                            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient$requestLocationPermission$2$1$1", "469");
                            com.ss.android.lark.log.Log.i("DefaultLocationClient", str);
                            oVar.resumeWith(kotlin.Result.constructor-impl(obj2));
                        }

                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                            invoke((kc6.b) obj2);
                            return kotlin.Unit.INSTANCE;
                        }
                    }), new com.ss.android.lark.endpoint.security.detection.location.a.C0102a(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$requestLocationPermission$2$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void invoke(java.lang.Throwable th) {
                            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient$requestLocationPermission$2$1$2", "473");
                            com.ss.android.lark.log.Log.e("DefaultLocationClient", "requestLocationPermission stream error: " + th);
                            if (oVar.isActive()) {
                                kotlinx.coroutines.n<com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult> nVar = oVar;
                                kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                                nVar.resumeWith(kotlin.Result.constructor-impl(com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.d.a));
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
                if (th2 != null) {
                    ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "478");
                    com.ss.android.lark.log.Log.e("DefaultLocationClient", "requestLocationPermission threw: " + th2);
                    if (oVar.isActive()) {
                        oVar.resumeWith(kotlin.Result.constructor-impl(com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.d.a));
                    }
                }
                objH = oVar.H();
                if (objH == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(defaultEndpointLocationClient$requestLocationPermission$1);
                }
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return objH;
        } catch (java.lang.Exception e2) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "483");
            com.ss.android.lark.log.Log.e("DefaultLocationClient", "requestLocationPermission failed: " + e2);
            return com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.d.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.ss.android.lark.endpoint.security.detection.location.IEndpointLocationClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(android.content.Context context, int i, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startContinuousLocation$1 defaultEndpointLocationClient$startContinuousLocation$1;
        android.content.Context applicationContext;
        com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient defaultEndpointLocationClient;
        int i2;
        long j;
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean zV;
        if (continuation instanceof com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startContinuousLocation$1) {
            defaultEndpointLocationClient$startContinuousLocation$1 = (com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startContinuousLocation$1) continuation;
            int i3 = defaultEndpointLocationClient$startContinuousLocation$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                defaultEndpointLocationClient$startContinuousLocation$1.label = i3 - Integer.MIN_VALUE;
            } else {
                defaultEndpointLocationClient$startContinuousLocation$1 = new com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient$startContinuousLocation$1(this, continuation);
            }
        }
        java.lang.Object objB = defaultEndpointLocationClient$startContinuousLocation$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = defaultEndpointLocationClient$startContinuousLocation$1.label;
        if (i4 != 0) {
            if (i4 == 1) {
                j = defaultEndpointLocationClient$startContinuousLocation$1.J$0;
                i2 = defaultEndpointLocationClient$startContinuousLocation$1.I$0;
                applicationContext = (android.content.Context) defaultEndpointLocationClient$startContinuousLocation$1.L$1;
                defaultEndpointLocationClient = (com.ss.android.lark.endpoint.security.detection.location.DefaultEndpointLocationClient) defaultEndpointLocationClient$startContinuousLocation$1.L$0;
                kotlin.ResultKt.throwOnFailure(objB);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.ResultKt.throwOnFailure(objB);
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (!this.b.compareAndSet(false, true)) {
                ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "81");
                com.ss.android.lark.log.Log.e("DefaultLocationClient", "duplicate start");
                com.ss.android.lark.endpoint.security.detection.location.EndpointLocationMonitor.a.d(false, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, "duplicate_start");
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
            }
            applicationContext = context.getApplicationContext();
            this.d = "DefaultLocationClient-" + h.incrementAndGet();
            defaultEndpointLocationClient$startContinuousLocation$1.L$0 = this;
            defaultEndpointLocationClient$startContinuousLocation$1.L$1 = applicationContext;
            defaultEndpointLocationClient$startContinuousLocation$1.I$0 = i;
            defaultEndpointLocationClient$startContinuousLocation$1.J$0 = jElapsedRealtime;
            defaultEndpointLocationClient$startContinuousLocation$1.label = 1;
            objB = b(context, defaultEndpointLocationClient$startContinuousLocation$1);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            defaultEndpointLocationClient = this;
            i2 = i;
            j = jElapsedRealtime;
        }
        com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult locationPermissionRequestResult = (com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult) objB;
        if (!(locationPermissionRequestResult instanceof com.ss.android.lark.endpoint.security.detection.location.LocationPermissionRequestResult.c)) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "95");
            com.ss.android.lark.log.Log.e("DefaultLocationClient", "Failed to check location permission");
            defaultEndpointLocationClient.b.set(false);
            com.ss.android.lark.endpoint.security.detection.location.EndpointLocationMonitor.a.d(false, android.os.SystemClock.elapsedRealtime() - j, defaultEndpointLocationClient.x(locationPermissionRequestResult));
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(cm6.f.a().L()));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Boolean boolBoxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        if (kotlin.Result.isFailure-impl(obj)) {
            obj = boolBoxBoolean;
        }
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "110");
        com.ss.android.lark.log.Log.i("DefaultLocationClient", "startContinuousLocation: backgroundLocationEnabled=" + zBooleanValue);
        if (zBooleanValue) {
            com.ss.android.lark.endpoint.security.detection.location.LocationBackgroundRuntime locationBackgroundRuntime = com.ss.android.lark.endpoint.security.detection.location.LocationBackgroundRuntime.a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext);
            if (!locationBackgroundRuntime.a(applicationContext, defaultEndpointLocationClient.p(applicationContext), defaultEndpointLocationClient.d)) {
                ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "116");
                com.ss.android.lark.log.Log.e("DefaultLocationClient", "Failed to start location foreground service");
                defaultEndpointLocationClient.b.set(false);
                com.ss.android.lark.endpoint.security.detection.location.EndpointLocationMonitor.a.d(false, android.os.SystemClock.elapsedRealtime() - j, "foreground_service_failed");
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
            }
        }
        defaultEndpointLocationClient.f.setValue((java.lang.Object) null);
        try {
            obj2 = kotlin.Result.constructor-impl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(cm6.f.a().G()));
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion3 = kotlin.Result.Companion;
            obj2 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th2));
        }
        java.lang.Boolean boolBoxBoolean2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        if (kotlin.Result.isFailure-impl(obj2)) {
            obj2 = boolBoxBoolean2;
        }
        boolean zBooleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "133");
        com.ss.android.lark.log.Log.i("DefaultLocationClient", "startContinuousLocation: timerMode=" + zBooleanValue2 + ", intervalMs=" + i2);
        if (zBooleanValue2) {
            zV = defaultEndpointLocationClient.w(i2);
        } else {
            zV = defaultEndpointLocationClient.v(i2);
        }
        if (!zV) {
            ks7.c.d("modules/biz/security-compliance/endpoint-security-detection/", "DefaultEndpointLocationClient", "142");
            com.ss.android.lark.log.Log.e("DefaultLocationClient", "Failed to start location update, timerMode=" + zBooleanValue2);
            defaultEndpointLocationClient.b.set(false);
            com.ss.android.lark.endpoint.security.detection.location.LocationBackgroundRuntime locationBackgroundRuntime2 = com.ss.android.lark.endpoint.security.detection.location.LocationBackgroundRuntime.a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext);
            locationBackgroundRuntime2.b(applicationContext, defaultEndpointLocationClient.d);
            com.ss.android.lark.endpoint.security.detection.location.EndpointLocationMonitor.a.d(false, android.os.SystemClock.elapsedRealtime() - j, "sdk_request_rejected");
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        com.ss.android.lark.endpoint.security.detection.location.EndpointLocationMonitor endpointLocationMonitor = com.ss.android.lark.endpoint.security.detection.location.EndpointLocationMonitor.a;
        endpointLocationMonitor.d(true, android.os.SystemClock.elapsedRealtime() - j, "ok");
        endpointLocationMonitor.b("start");
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, long j, boolean z, java.lang.String str) {
        if (atomicBoolean.compareAndSet(false, true)) {
            com.ss.android.lark.endpoint.security.detection.location.EndpointLocationMonitor.a.c(z, android.os.SystemClock.elapsedRealtime() - j, str);
        }
    }
}
