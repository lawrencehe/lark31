package com.ss.android.lark.appstrategy.clockin.state;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000eJH\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/state/SpeedClockInModel;", "", "store", "Lcom/ss/android/lark/appstrategy/clockin/state/SpeedClockInStore;", "<init>", "(Lcom/ss/android/lark/appstrategy/clockin/state/SpeedClockInStore;)V", "locationManager", "Lcom/ss/android/lark/appstrategy/clockin/state/SpeedClockInLocationManager;", "wifiManager", "Lcom/ss/android/lark/appstrategy/clockin/state/SpeedClockInWifiManager;", "requestConfig", "Lcom/ss/android/lark/appstrategy/clockin/entity/SpeedClockInConfigData;", "triggerType", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestSpeedClockIn", "Lcom/ss/android/lark/appstrategy/clockin/entity/SpeedClockInData;", "token", "pushEnvTypeList", "", "", "needRiskInfo", "", "cheatAppList", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startWifiScan", "", "isStopClockInBackground", "createTopSpeedClockInRisk", "Lcom/ss/android/lark/appstrategy/clockin/entity/TopSpeedClockInRisk;", "Companion", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes8.dex */
public final class SpeedClockInModel {
    public static final com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel.a d = new com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel.a(null);
    private final com.ss.android.lark.appstrategy.clockin.state.SpeedClockInStore a;
    private final com.ss.android.lark.appstrategy.clockin.state.SpeedClockInLocationManager b;
    private final com.ss.android.lark.appstrategy.clockin.state.SpeedClockInWifiManager c;

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/state/SpeedClockInModel$Companion;", "", "<init>", "()V", "TAG", "", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel.a.<init>():void type: THIS */
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void e() {
        this.c.f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean b() {
        a93.a aVarB = u83.b.b();
        boolean z = !(aVarB != null && aVarB.isAppRealForeground());
        boolean zIsEnable = ne4.f.a().isEnable("openplatform.speedclockin.allow_bg_location");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("isStopClockInBackground background: ");
        sb.append(z);
        sb.append(", fgEnable: ");
        sb.append(zIsEnable);
        sb.append(", dependency is null : ");
        sb.append(u83.b.b() == null);
        java.lang.String string = sb.toString();
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "226");
        com.ss.android.lark.log.Log.i("SpeedClockInModel", string);
        if (!z || zIsEnable) {
            return false;
        }
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "229");
        com.ss.android.lark.log.Log.e("SpeedClockInModel", "isStopClockInBackground return true");
        return true;
    }

    public SpeedClockInModel(com.ss.android.lark.appstrategy.clockin.state.SpeedClockInStore speedClockInStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(speedClockInStore, "store");
        this.a = speedClockInStore;
        this.b = new com.ss.android.lark.appstrategy.clockin.state.SpeedClockInLocationManager();
        this.c = new com.ss.android.lark.appstrategy.clockin.state.SpeedClockInWifiManager();
    }

    private final com.ss.android.lark.appstrategy.clockin.entity.TopSpeedClockInRisk a(java.util.List<java.lang.String> list) {
        try {
            android.app.Application application = com.ss.android.lark.utils.LarkContext.getApplication();
            return new com.ss.android.lark.appstrategy.clockin.entity.TopSpeedClockInRisk(com.ss.android.lark.openplatform.openapi.api.plugin.security.a.g(), com.ss.android.lark.openplatform.openapi.api.plugin.security.a.i(application), com.ss.android.lark.openplatform.openapi.api.plugin.security.a.h(application), com.ss.android.lark.openplatform.openapi.api.plugin.security.a.e(application, list), u83.b.b().getDeviceId(), 2, com.ss.android.lark.openplatform.infra.util.d.k() + ", " + com.ss.android.lark.openplatform.infra.util.d.t(), true);
        } catch (java.lang.Exception e) {
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "249");
            com.ss.android.lark.log.Log.e("SpeedClockInModel", "createTopSpeedClockInRisk fail: " + e);
            return new com.ss.android.lark.appstrategy.clockin.entity.TopSpeedClockInRisk(false, false, false, null, null, 0, null, false, 255, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(java.lang.String str, kotlin.coroutines.Continuation<? super com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInConfigData> continuation) {
        com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel$requestConfig$1 speedClockInModel$requestConfig$1;
        com.ss.android.lark.opmonitor.trace.OPTrace oPTrace;
        long j;
        com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel speedClockInModel;
        java.lang.String str2;
        com.ss.android.lark.opmonitor.trace.OPTrace oPTrace2;
        com.ss.android.lark.appstrategy.clockin.entity.BaseResp baseResp;
        java.lang.String str3 = str;
        if (continuation instanceof com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel$requestConfig$1) {
            speedClockInModel$requestConfig$1 = (com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel$requestConfig$1) continuation;
            int i = speedClockInModel$requestConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                speedClockInModel$requestConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                speedClockInModel$requestConfig$1 = new com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel$requestConfig$1(this, continuation);
            }
        }
        java.lang.Object objH = speedClockInModel$requestConfig$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = speedClockInModel$requestConfig$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                j = speedClockInModel$requestConfig$1.J$0;
                oPTrace2 = (com.ss.android.lark.opmonitor.trace.OPTrace) speedClockInModel$requestConfig$1.L$2;
                java.lang.String str4 = (java.lang.String) speedClockInModel$requestConfig$1.L$1;
                speedClockInModel = (com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel) speedClockInModel$requestConfig$1.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(objH);
                    str2 = str4;
                    try {
                        baseResp = (com.ss.android.lark.appstrategy.clockin.entity.BaseResp) objH;
                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - j;
                        if (!w83.a.a(baseResp)) {
                            com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInConfigData speedClockInConfigData = (com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInConfigData) baseResp.getData();
                            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "60");
                            com.ss.android.lark.log.Log.i("SpeedClockInModel", "requestConfig response success, data=" + speedClockInConfigData);
                            if (speedClockInConfigData == null) {
                                x83.b.a.f(str2, jCurrentTimeMillis, kotlin.coroutines.jvm.internal.Boxing.boxInt(-3), "Data is null", oPTrace2);
                            } else {
                                x83.b.a.h(str2, jCurrentTimeMillis, speedClockInConfigData.isNewVersion(), speedClockInConfigData.isOpened(), speedClockInConfigData.getEnvironmentTypeList(), speedClockInConfigData.getBeginTime(), speedClockInConfigData.getEndTime(), oPTrace2);
                            }
                            if (speedClockInConfigData != null && speedClockInConfigData.isNewVersion() && speedClockInConfigData.isOpened()) {
                                speedClockInModel.a.a();
                                return speedClockInConfigData;
                            }
                            speedClockInModel.a.e(speedClockInConfigData);
                            return speedClockInConfigData;
                        }
                        java.lang.String str5 = "requestConfig response fail, response.code:" + baseResp.getCode() + ", response.msg:" + baseResp.getMsg();
                        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "79");
                        com.ss.android.lark.log.Log.i("SpeedClockInModel", str5);
                        x83.b.a.f(str2, jCurrentTimeMillis, baseResp.getCode(), baseResp.getMsg(), oPTrace2);
                        return null;
                    } catch (com.ss.android.lark.appstrategy.clockin.network.SpeedClockInException e) {
                        e = e;
                        java.lang.String str6 = str2;
                        oPTrace = oPTrace2;
                        str3 = str6;
                    }
                } catch (com.ss.android.lark.appstrategy.clockin.network.SpeedClockInException e2) {
                    e = e2;
                    oPTrace = oPTrace2;
                    str3 = str4;
                }
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.ResultKt.throwOnFailure(objH);
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "43");
            com.ss.android.lark.log.Log.i("SpeedClockInModel", "requestConfig start, triggerType=" + str3);
            com.ss.android.lark.opmonitor.trace.OPTrace oPTraceG = x83.b.a.g(str3);
            long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.ss.android.lark.appstrategy.clockin.network.SpeedClockInNetworkUtils speedClockInNetworkUtils = com.ss.android.lark.appstrategy.clockin.network.SpeedClockInNetworkUtils.a;
            java.lang.String strD = speedClockInNetworkUtils.d();
            java.util.Map<java.lang.String, java.lang.Object> mapA = speedClockInNetworkUtils.a(oPTraceG.getTracingID());
            try {
                speedClockInModel$requestConfig$1.L$0 = this;
                speedClockInModel$requestConfig$1.L$1 = str3;
                speedClockInModel$requestConfig$1.L$2 = oPTraceG;
                speedClockInModel$requestConfig$1.L$3 = strD;
                speedClockInModel$requestConfig$1.L$4 = mapA;
                speedClockInModel$requestConfig$1.J$0 = jCurrentTimeMillis2;
                speedClockInModel$requestConfig$1.label = 1;
                final kotlinx.coroutines.o oVar = new kotlinx.coroutines.o(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(speedClockInModel$requestConfig$1), 1);
                oVar.S();
                final com.google.gson.Gson gson = new com.google.gson.Gson();
                try {
                    com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(com.bytedance.lark.pb.basic.v1.Command.SEND_HTTP, new com.bytedance.lark.pb.basic.v1.SendHttpRequest.a().e(com.bytedance.lark.pb.basic.v1.SendHttpRequest.Method.POST).h(strD).c(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cookie", "session=" + u83.b.b().getLoginDependency().getSession()))).d(gson.toJson(mapA)), new com.larksuite.framework.callback.IGetDataCallback<java.lang.String>() { // from class: com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel$requestConfig$$inlined$sendHttpRequest$1
                        /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
                        public void onError(com.larksuite.framework.callback.Entity.ErrorResult err) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(err, "err");
                            kotlinx.coroutines.n nVar = oVar;
                            kotlin.Result.Companion companion = kotlin.Result.Companion;
                            nVar.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new com.ss.android.lark.appstrategy.clockin.network.SpeedClockInException(err.getCode(), err.getDebugMsg()))));
                        }

                        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
                        public void onSuccess(java.lang.String data) {
                            com.ss.android.lark.appstrategy.clockin.entity.BaseResp baseResp2 = null;
                            if (data != null) {
                                try {
                                    baseResp2 = (com.ss.android.lark.appstrategy.clockin.entity.BaseResp) gson.fromJson(data, com.google.gson.reflect.TypeToken.getParameterized(com.ss.android.lark.appstrategy.clockin.entity.BaseResp.class, new java.lang.reflect.Type[]{com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInConfigData.class}).getType());
                                } catch (java.lang.Exception unused) {
                                }
                            }
                            if (baseResp2 == null) {
                                kotlinx.coroutines.n nVar = oVar;
                                kotlin.Result.Companion companion = kotlin.Result.Companion;
                                nVar.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new com.ss.android.lark.appstrategy.clockin.network.SpeedClockInException(-2, "Parse response error"))));
                                return;
                            }
                            oVar.resumeWith(kotlin.Result.constructor-impl(baseResp2));
                        }
                    }, com.ss.android.lark.appstrategy.clockin.network.b.a);
                } catch (java.lang.Exception e3) {
                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                    oVar.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(e3)));
                }
                objH = oVar.H();
                if (objH == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(speedClockInModel$requestConfig$1);
                }
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
                speedClockInModel = this;
                str2 = str3;
                oPTrace2 = oPTraceG;
                j = jCurrentTimeMillis2;
                baseResp = (com.ss.android.lark.appstrategy.clockin.entity.BaseResp) objH;
                long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis() - j;
                if (!w83.a.a(baseResp)) {
                }
            } catch (com.ss.android.lark.appstrategy.clockin.network.SpeedClockInException e4) {
                e = e4;
                oPTrace = oPTraceG;
                j = jCurrentTimeMillis2;
            }
        }
        java.lang.String str7 = "requestConfig error, e.code=" + e.getCode() + ", e.msg=" + e.getMsg();
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "52");
        com.ss.android.lark.log.Log.i("SpeedClockInModel", str7);
        x83.b.a.f(str3, java.lang.System.currentTimeMillis() - j, kotlin.coroutines.jvm.internal.Boxing.boxInt(e.getCode()), e.getMsg(), oPTrace);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(java.lang.String str, java.lang.String str2, java.util.List<java.lang.Integer> list, boolean z, java.util.List<java.lang.String> list2, kotlin.coroutines.Continuation<? super com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData> continuation) {
        com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel$requestSpeedClockIn$1 speedClockInModel$requestSpeedClockIn$1;
        java.util.Map<? extends java.lang.String, ? extends java.lang.Object> linkedHashMap;
        boolean z2;
        com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel speedClockInModel;
        java.util.List<java.lang.String> list3;
        int i;
        int i2;
        v83.c cVar;
        java.lang.Object obj;
        java.lang.String str3;
        boolean zContains;
        int i3;
        v83.b bVar;
        v83.d dVar;
        java.lang.String tracingID;
        long j;
        com.ss.android.lark.opmonitor.trace.OPTrace oPTrace;
        java.lang.String str4;
        long j2;
        com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel speedClockInModel2;
        com.ss.android.lark.opmonitor.trace.OPTrace oPTrace2;
        v83.d dVar2;
        v83.b bVar2;
        java.util.Collection collectionEmptyList;
        java.lang.String strJ;
        double longitude;
        double latitude;
        int gpsMapType;
        long j3;
        com.ss.android.lark.appstrategy.clockin.entity.BaseResp baseResp;
        java.lang.String str5 = str;
        java.util.List<java.lang.Integer> list4 = list;
        if (continuation instanceof com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel$requestSpeedClockIn$1) {
            speedClockInModel$requestSpeedClockIn$1 = (com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel$requestSpeedClockIn$1) continuation;
            int i4 = speedClockInModel$requestSpeedClockIn$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                speedClockInModel$requestSpeedClockIn$1.label = i4 - Integer.MIN_VALUE;
            } else {
                speedClockInModel$requestSpeedClockIn$1 = new com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel$requestSpeedClockIn$1(this, continuation);
            }
        }
        java.lang.Object objH = speedClockInModel$requestSpeedClockIn$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = speedClockInModel$requestSpeedClockIn$1.label;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    j2 = speedClockInModel$requestSpeedClockIn$1.J$0;
                    com.ss.android.lark.opmonitor.trace.OPTrace oPTrace3 = (com.ss.android.lark.opmonitor.trace.OPTrace) speedClockInModel$requestSpeedClockIn$1.L$2;
                    java.lang.String str6 = (java.lang.String) speedClockInModel$requestSpeedClockIn$1.L$1;
                    speedClockInModel2 = (com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel) speedClockInModel$requestSpeedClockIn$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(objH);
                        oPTrace2 = oPTrace3;
                        str3 = str6;
                        try {
                            baseResp = (com.ss.android.lark.appstrategy.clockin.entity.BaseResp) objH;
                            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - j2;
                            if (!w83.a.a(baseResp)) {
                                com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData speedClockInData = (com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData) baseResp.getData();
                                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "193");
                                com.ss.android.lark.log.Log.i("SpeedClockInModel", "requestSpeedClockIn response success, data=" + speedClockInData);
                                if (speedClockInData == null) {
                                    x83.b.a.i(str3, jCurrentTimeMillis, kotlin.coroutines.jvm.internal.Boxing.boxInt(-3), "Data is null", oPTrace2);
                                } else {
                                    x83.b.a.k(str3, jCurrentTimeMillis, speedClockInData.isInEnv(), speedClockInData.isClockInSucceed(), speedClockInData.getTopSpeedRetryTimeDuration(), speedClockInData.getClockInFailCodeName(), oPTrace2);
                                }
                                speedClockInModel2.a.d(speedClockInData);
                                return speedClockInData;
                            }
                            java.lang.String str7 = "requestSpeedClockIn response fail, response.code:" + baseResp.getCode() + ", response.msg:" + baseResp.getMsg();
                            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "207");
                            com.ss.android.lark.log.Log.i("SpeedClockInModel", str7);
                            x83.b.a.i(str3, jCurrentTimeMillis, baseResp.getCode(), baseResp.getMsg(), oPTrace2);
                            return null;
                        } catch (com.ss.android.lark.appstrategy.clockin.network.SpeedClockInException e) {
                            e = e;
                            str4 = str3;
                            j3 = j2;
                            oPTrace = oPTrace2;
                        }
                    } catch (com.ss.android.lark.appstrategy.clockin.network.SpeedClockInException e2) {
                        e = e2;
                        str4 = str6;
                        j = j2;
                        oPTrace = oPTrace3;
                        j3 = j;
                        java.lang.String str8 = "requestSpeedClockIn error, e.code=" + e.getCode() + ", e.msg=" + e.getMsg();
                        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "185");
                        com.ss.android.lark.log.Log.i("SpeedClockInModel", str8);
                        x83.b.a.i(str4, java.lang.System.currentTimeMillis() - j3, kotlin.coroutines.jvm.internal.Boxing.boxInt(e.getCode()), e.getMsg(), oPTrace);
                        return null;
                    }
                } else {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                int i6 = speedClockInModel$requestSpeedClockIn$1.I$0;
                boolean z3 = speedClockInModel$requestSpeedClockIn$1.Z$0;
                java.util.List<java.lang.Integer> list5 = (java.util.List) speedClockInModel$requestSpeedClockIn$1.L$4;
                linkedHashMap = (java.util.Map) speedClockInModel$requestSpeedClockIn$1.L$3;
                list3 = (java.util.List) speedClockInModel$requestSpeedClockIn$1.L$2;
                java.lang.String str9 = (java.lang.String) speedClockInModel$requestSpeedClockIn$1.L$1;
                speedClockInModel = (com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel) speedClockInModel$requestSpeedClockIn$1.L$0;
                kotlin.ResultKt.throwOnFailure(objH);
                i = i6;
                str5 = str9;
                z2 = z3;
                list4 = list5;
                obj = objH;
            }
        } else {
            kotlin.ResultKt.throwOnFailure(objH);
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "91");
            com.ss.android.lark.log.Log.i("SpeedClockInModel", "requestSpeedClockIn start " + str5);
            linkedHashMap = new java.util.LinkedHashMap<>();
            if (list4 == null) {
                return null;
            }
            x83.b.a.d(str5, list4);
            boolean zContains2 = list4.contains(kotlin.coroutines.jvm.internal.Boxing.boxInt(1));
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "106");
            com.ss.android.lark.log.Log.i("SpeedClockInModel", "requestSpeedClockIn usingGps: " + zContains2);
            if (zContains2 && !b()) {
                com.ss.android.lark.appstrategy.clockin.state.SpeedClockInLocationManager speedClockInLocationManager = this.b;
                speedClockInModel$requestSpeedClockIn$1.L$0 = this;
                speedClockInModel$requestSpeedClockIn$1.L$1 = str5;
                speedClockInModel$requestSpeedClockIn$1.L$2 = list2;
                speedClockInModel$requestSpeedClockIn$1.L$3 = linkedHashMap;
                speedClockInModel$requestSpeedClockIn$1.L$4 = list4;
                z2 = z;
                speedClockInModel$requestSpeedClockIn$1.Z$0 = z2;
                speedClockInModel$requestSpeedClockIn$1.I$0 = 0;
                speedClockInModel$requestSpeedClockIn$1.label = 1;
                java.lang.Object objA = speedClockInLocationManager.a(str2, speedClockInModel$requestSpeedClockIn$1);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                speedClockInModel = this;
                list3 = list2;
                obj = objA;
                i = 0;
            } else {
                z2 = z;
                speedClockInModel = this;
                list3 = list2;
                i = 0;
                i2 = 2;
                cVar = null;
                java.util.List<java.lang.Integer> list6 = list4;
                str3 = str5;
                zContains = list6.contains(kotlin.coroutines.jvm.internal.Boxing.boxInt(i2));
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "125");
                com.ss.android.lark.log.Log.i("SpeedClockInModel", "requestSpeedClockIn usingWifi: " + zContains);
                if (!zContains && !speedClockInModel.b()) {
                    v83.b bVarC = speedClockInModel.c.c();
                    java.lang.String str10 = "requestSpeedClockIn using wifi, connStatus=" + bVarC.getA();
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "130");
                    com.ss.android.lark.log.Log.i("SpeedClockInModel", str10);
                    com.ss.android.lark.appstrategy.clockin.dto.Status a2 = bVarC.getA();
                    com.ss.android.lark.appstrategy.clockin.dto.Status status = com.ss.android.lark.appstrategy.clockin.dto.Status.SUCCESS;
                    if (a2 == status) {
                        android.net.wifi.WifiInfo d2 = bVarC.getD();
                        if (d2 == null || (strJ = mp1.a.a.j(d2, "LARK-PSDA-op_api_wifi_bssid_speed_clock_model")) == null) {
                            strJ = "";
                        }
                        linkedHashMap.put("wifi_mac_address", strJ);
                        linkedHashMap.put("network_security_type", kotlin.coroutines.jvm.internal.Boxing.boxInt(com.ss.android.lark.openplatform.openapi.api.plugin.device.plugin.wifi.a.d(bVarC.getD(), speedClockInModel.c.e())));
                        i = 1;
                    }
                    v83.d dVarD = speedClockInModel.c.d();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    int i7 = i;
                    sb.append("requestSpeedClockIn using wifi, scanStatus=");
                    sb.append(dVarD.getA());
                    java.lang.String string = sb.toString();
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "141");
                    com.ss.android.lark.log.Log.i("SpeedClockInModel", string);
                    if (dVarD.getA() == status) {
                        java.util.List<android.net.wifi.ScanResult> listD = dVarD.d();
                        if (listD != null) {
                            java.util.List<android.net.wifi.ScanResult> list7 = listD;
                            collectionEmptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list7, 10));
                            java.util.Iterator it = list7.iterator();
                            while (it.hasNext()) {
                                android.net.wifi.ScanResult scanResult = (android.net.wifi.ScanResult) it.next();
                                collectionEmptyList.add(kotlin.collections.MapsKt.mapOf(new kotlin.Pair[]{kotlin.TuplesKt.to("name", scanResult.SSID), kotlin.TuplesKt.to("mac_address", scanResult.BSSID), kotlin.TuplesKt.to("network_security_type", kotlin.coroutines.jvm.internal.Boxing.boxInt(com.ss.android.lark.openplatform.openapi.api.plugin.device.plugin.wifi.a.l(scanResult)))}));
                                it = it;
                                dVarD = dVarD;
                                bVarC = bVarC;
                            }
                            dVar2 = dVarD;
                            bVar2 = bVarC;
                        } else {
                            dVar2 = dVarD;
                            bVar2 = bVarC;
                            collectionEmptyList = kotlin.collections.CollectionsKt.emptyList();
                        }
                        linkedHashMap.put("scan_wifi_list", collectionEmptyList);
                        dVar = dVar2;
                        bVar = bVar2;
                        i3 = 1;
                    } else {
                        i3 = i7;
                        dVar = dVarD;
                        bVar = bVarC;
                    }
                } else {
                    i3 = i;
                    bVar = null;
                    dVar = null;
                }
                if (i3 == 0) {
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "157");
                    com.ss.android.lark.log.Log.i("SpeedClockInModel", "requestSpeedClockIn check success");
                    x83.b bVar3 = x83.b.a;
                    bVar3.e(str3, list6, cVar, bVar, dVar);
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "169");
                    com.ss.android.lark.log.Log.i("SpeedClockInModel", "requestSpeedClockIn needRiskInfo: " + z2);
                    if (z2) {
                        linkedHashMap.put("risk_info", speedClockInModel.a(list3));
                    }
                    linkedHashMap.put("device_id", u83.b.b().getDeviceId());
                    com.ss.android.lark.opmonitor.trace.OPTrace oPTraceJ = bVar3.j(str3);
                    long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                    com.ss.android.lark.appstrategy.clockin.network.SpeedClockInNetworkUtils speedClockInNetworkUtils = com.ss.android.lark.appstrategy.clockin.network.SpeedClockInNetworkUtils.a;
                    java.lang.String strC = speedClockInNetworkUtils.c();
                    if (oPTraceJ != null) {
                        tracingID = oPTraceJ.getTracingID();
                    } else {
                        tracingID = null;
                    }
                    java.util.Map<java.lang.String, java.lang.Object> mapA = speedClockInNetworkUtils.a(tracingID);
                    mapA.putAll(linkedHashMap);
                    try {
                        speedClockInModel$requestSpeedClockIn$1.L$0 = speedClockInModel;
                        speedClockInModel$requestSpeedClockIn$1.L$1 = str3;
                        speedClockInModel$requestSpeedClockIn$1.L$2 = oPTraceJ;
                        speedClockInModel$requestSpeedClockIn$1.L$3 = strC;
                        speedClockInModel$requestSpeedClockIn$1.L$4 = mapA;
                        speedClockInModel$requestSpeedClockIn$1.J$0 = jCurrentTimeMillis2;
                        speedClockInModel$requestSpeedClockIn$1.label = 2;
                        final kotlinx.coroutines.o oVar = new kotlinx.coroutines.o(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(speedClockInModel$requestSpeedClockIn$1), 1);
                        oVar.S();
                        final com.google.gson.Gson gson = new com.google.gson.Gson();
                        try {
                            com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(com.bytedance.lark.pb.basic.v1.Command.SEND_HTTP, new com.bytedance.lark.pb.basic.v1.SendHttpRequest.a().e(com.bytedance.lark.pb.basic.v1.SendHttpRequest.Method.POST).h(strC).c(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cookie", "session=" + u83.b.b().getLoginDependency().getSession()))).d(gson.toJson(mapA)), new com.larksuite.framework.callback.IGetDataCallback<java.lang.String>() { // from class: com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel$requestSpeedClockIn$$inlined$sendHttpRequest$1
                                /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
                                public void onError(com.larksuite.framework.callback.Entity.ErrorResult err) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(err, "err");
                                    kotlinx.coroutines.n nVar = oVar;
                                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                                    nVar.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new com.ss.android.lark.appstrategy.clockin.network.SpeedClockInException(err.getCode(), err.getDebugMsg()))));
                                }

                                /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
                                public void onSuccess(java.lang.String data) {
                                    com.ss.android.lark.appstrategy.clockin.entity.BaseResp baseResp2 = null;
                                    if (data != null) {
                                        try {
                                            baseResp2 = (com.ss.android.lark.appstrategy.clockin.entity.BaseResp) gson.fromJson(data, com.google.gson.reflect.TypeToken.getParameterized(com.ss.android.lark.appstrategy.clockin.entity.BaseResp.class, new java.lang.reflect.Type[]{com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData.class}).getType());
                                        } catch (java.lang.Exception unused) {
                                        }
                                    }
                                    if (baseResp2 == null) {
                                        kotlinx.coroutines.n nVar = oVar;
                                        kotlin.Result.Companion companion = kotlin.Result.Companion;
                                        nVar.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new com.ss.android.lark.appstrategy.clockin.network.SpeedClockInException(-2, "Parse response error"))));
                                        return;
                                    }
                                    oVar.resumeWith(kotlin.Result.constructor-impl(baseResp2));
                                }
                            }, com.ss.android.lark.appstrategy.clockin.network.b.a);
                        } catch (java.lang.Exception e3) {
                            kotlin.Result.Companion companion = kotlin.Result.Companion;
                            oVar.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(e3)));
                        }
                        objH = oVar.H();
                        if (objH == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(speedClockInModel$requestSpeedClockIn$1);
                        }
                        if (objH == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        j2 = jCurrentTimeMillis2;
                        speedClockInModel2 = speedClockInModel;
                        oPTrace2 = oPTraceJ;
                        baseResp = (com.ss.android.lark.appstrategy.clockin.entity.BaseResp) objH;
                        long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis() - j2;
                        if (!w83.a.a(baseResp)) {
                        }
                    } catch (com.ss.android.lark.appstrategy.clockin.network.SpeedClockInException e4) {
                        e = e4;
                        j = jCurrentTimeMillis2;
                        oPTrace = oPTraceJ;
                        str4 = str3;
                        j3 = j;
                        java.lang.String str82 = "requestSpeedClockIn error, e.code=" + e.getCode() + ", e.msg=" + e.getMsg();
                        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "185");
                        com.ss.android.lark.log.Log.i("SpeedClockInModel", str82);
                        x83.b.a.i(str4, java.lang.System.currentTimeMillis() - j3, kotlin.coroutines.jvm.internal.Boxing.boxInt(e.getCode()), e.getMsg(), oPTrace);
                        return null;
                    }
                } else {
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "162");
                    com.ss.android.lark.log.Log.i("SpeedClockInModel", "requestSpeedClockIn check fail");
                    x83.b.a.c(str3, list6, cVar, bVar, dVar);
                    return null;
                }
            }
        }
        v83.c cVar2 = (v83.c) obj;
        java.lang.String str11 = "requestSpeedClockIn using gps, status=" + cVar2.getA();
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "110");
        com.ss.android.lark.log.Log.i("SpeedClockInModel", str11);
        if (cVar2.getA() == com.ss.android.lark.appstrategy.clockin.dto.Status.SUCCESS) {
            kotlin.Pair[] pairArr = new kotlin.Pair[4];
            v83.c.Location d3 = cVar2.getD();
            double accuracy = 0.0d;
            if (d3 != null) {
                longitude = d3.getLongitude();
            } else {
                longitude = 0.0d;
            }
            pairArr[0] = kotlin.TuplesKt.to("longitude", kotlin.coroutines.jvm.internal.Boxing.boxDouble(longitude));
            v83.c.Location d4 = cVar2.getD();
            if (d4 != null) {
                latitude = d4.getLatitude();
            } else {
                latitude = 0.0d;
            }
            pairArr[1] = kotlin.TuplesKt.to("latitude", kotlin.coroutines.jvm.internal.Boxing.boxDouble(latitude));
            v83.c.Location d5 = cVar2.getD();
            if (d5 != null) {
                accuracy = d5.getAccuracy();
            }
            pairArr[2] = kotlin.TuplesKt.to("accuracy", kotlin.coroutines.jvm.internal.Boxing.boxDouble(accuracy));
            v83.c.Location d6 = cVar2.getD();
            if (d6 != null) {
                gpsMapType = d6.getGpsMapType();
            } else {
                gpsMapType = 1;
            }
            pairArr[3] = kotlin.TuplesKt.to("gps_map_type", kotlin.coroutines.jvm.internal.Boxing.boxInt(gpsMapType));
            linkedHashMap.put("gps", kotlin.collections.MapsKt.mapOf(pairArr));
            cVar = cVar2;
            i = 1;
        } else {
            cVar = cVar2;
        }
        i2 = 2;
        java.util.List<java.lang.Integer> list62 = list4;
        str3 = str5;
        zContains = list62.contains(kotlin.coroutines.jvm.internal.Boxing.boxInt(i2));
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "125");
        com.ss.android.lark.log.Log.i("SpeedClockInModel", "requestSpeedClockIn usingWifi: " + zContains);
        if (!zContains) {
            i3 = i;
            bVar = null;
            dVar = null;
            if (i3 == 0) {
            }
        }
        java.lang.String str822 = "requestSpeedClockIn error, e.code=" + e.getCode() + ", e.msg=" + e.getMsg();
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInModel", "185");
        com.ss.android.lark.log.Log.i("SpeedClockInModel", str822);
        x83.b.a.i(str4, java.lang.System.currentTimeMillis() - j3, kotlin.coroutines.jvm.internal.Boxing.boxInt(e.getCode()), e.getMsg(), oPTrace);
        return null;
    }
}
