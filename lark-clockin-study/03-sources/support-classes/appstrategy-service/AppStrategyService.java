package com.ss.android.lark.appstrategy.service.impl;

/* loaded from: /tmp/larkdex/classes8.dex */
public class AppStrategyService implements c93.a {
    private com.ss.android.lark.http.netstate.a a;
    private com.ss.android.lark.http.netstate.NetworkUtils.NetworkType b;
    private android.net.wifi.WifiInfo c;
    private java.util.List<android.net.wifi.ScanResult> d;
    private com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope e;
    private final java.lang.Object f = new java.lang.Object();
    private boolean g;
    private boolean h;

    private static android.net.wifi.WifiInfo q(android.net.wifi.WifiManager wifiManager) {
        cw0.d dVarB = new cw0.c().b(102301, "android/net/wifi/WifiManager", "getConnectionInfo", wifiManager, new java.lang.Object[0], "android.net.wifi.WifiInfo", new cw0.b(false, "()Landroid/net/wifi/WifiInfo;", "258804619226566587"));
        return dVarB.b() ? (android.net.wifi.WifiInfo) dVarB.a() : wifiManager.getConnectionInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private java.util.Map<java.lang.String, java.lang.String> w() {
        java.util.HashMap map = new java.util.HashMap();
        map.put("cookie", "session=" + u83.b.b().getLoginDependency().getSession());
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void D() throws org.json.JSONException {
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "656");
        com.ss.android.lark.log.Log.i("AppStrategyService", " account change ");
        y("account_change");
        com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue = b93.c.c(b93.d.a).addCategoryValue("trigger_type", "account_change");
        com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope = this.e;
        oPMonitorAddCategoryValue.addCategoryValue("snapshot_id", appStrategyUserScope != null ? appStrategyUserScope.getSnapshotId() : "").flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void E() {
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "629");
        com.ss.android.lark.log.Log.i("AppStrategyService", " onBackToFrontEvent");
        java.lang.String userId = u83.b.b().getLoginDependency().getUserId();
        if (android.text.TextUtils.isEmpty(userId)) {
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "632");
            com.ss.android.lark.log.Log.i("AppStrategyService", " user id is empty");
            return;
        }
        com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue = b93.c.c(b93.d.a).addCategoryValue("trigger_type", "back_to_front");
        com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope = this.e;
        oPMonitorAddCategoryValue.addCategoryValue("snapshot_id", appStrategyUserScope != null ? appStrategyUserScope.getSnapshotId() : "").flush();
        com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope2 = (com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope) fy6.a.b().getJSONObject(t(userId), com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope.class);
        this.e = appStrategyUserScope2;
        if (K(appStrategyUserScope2)) {
            S(this.e.isHasLocationScope(), this.e.isHasWifiScope(), null, "back_to_front", "LARK-PSDA-op_app_strategy_on_back_to_front");
            return;
        }
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "649");
        com.ss.android.lark.log.Log.i("AppStrategyService", "onBackToFrontEvent: currentUserScope null ");
        y("back_to_front");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void G() throws org.json.JSONException {
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "605");
        com.ss.android.lark.log.Log.i("AppStrategyService", " pre task start");
        y("start_up");
        com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue = b93.c.c(b93.d.a).addCategoryValue("trigger_type", "start_up");
        com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope = this.e;
        oPMonitorAddCategoryValue.addCategoryValue("snapshot_id", appStrategyUserScope != null ? appStrategyUserScope.getSnapshotId() : "").flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void P() {
        synchronized (this.f) {
            if (this.a != null) {
                com.ss.android.lark.http.netstate.c.b().h(this.a);
                this.a = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void R() {
        this.b = com.ss.android.lark.http.netstate.NetworkUtils.c(u83.b.b().getContext());
        android.content.Context context = u83.b.b().getContext();
        if (context != null) {
            boolean z = androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
            boolean fgValue = u83.b.b().getFgValue("attendance.top_speed_clock_in.forbid_bssid");
            android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) u1.a.s(context.getApplicationContext(), "wifi");
            if (z && !fgValue && wifiManager != null) {
                this.c = q(wifiManager);
                mp1.a aVar = mp1.a.a;
                aVar.x(wifiManager, "LARK-PSDA-op_api_wifi_start_scan_app_strategy");
                this.d = aVar.l(wifiManager, "LARK-PSDA-op_api_wifi_get_scan_results_app_strategy");
            }
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "1206");
            com.ss.android.lark.log.Log.i("AppStrategyService", " get wifiinfo  grant " + z);
            d93.c.c(z, z ? null : " ACCESS_FINE_LOCATION permission deny");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static com.ss.android.lark.appstrategy.service.impl.AppStrategyService s() {
        return com.ss.android.lark.appstrategy.service.impl.AppStrategyService.e.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // c93.a
    public void a() {
        com.ss.android.lark.sdk.j.b().d(com.bytedance.lark.pb.basic.v1.Command.PUSH_OPEN_COMMON, new com.ss.android.lark.appstrategy.service.impl.AppStrategyService.d());
    }

    private static final class e {
        private static final com.ss.android.lark.appstrategy.service.impl.AppStrategyService a = new com.ss.android.lark.appstrategy.service.impl.AppStrategyService();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void A() {
        com.ss.android.lark.appstrategy.service.impl.i.a();
    }

    /* renamed from: com.ss.android.lark.appstrategy.service.impl.AppStrategyService$1, reason: invalid class name */
    class AnonymousClass1 implements com.larksuite.framework.callback.IGetDataCallback<java.io.Serializable> {
        final /* synthetic */ java.lang.String val$appid;
        final /* synthetic */ po.e val$callback;
        final /* synthetic */ boolean val$isH5;
        final /* synthetic */ long val$startTime;

        /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
        public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
            this.val$callback.onResult(new com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper(com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper.DataVersion.V1, -1, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null).toString());
            d93.c.a(this.val$isH5, this.val$appid, java.lang.System.currentTimeMillis() - this.val$startTime, false, -2, "rust error:" + errorResult.getDebugMsg());
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        public void onSuccess(java.io.Serializable serializable) {
            if (serializable != null && (serializable instanceof com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse)) {
                com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse getOpenAppStateResponse = (com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse) serializable;
                com.bytedance.lark.pb.basic.v1.OpenApp openApp = getOpenAppStateResponse.open_app;
                if (openApp == null) {
                    this.val$callback.onResult(new com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper(com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper.DataVersion.V1, -1, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null).toString());
                    d93.c.a(this.val$isH5, this.val$appid, java.lang.System.currentTimeMillis() - this.val$startTime, false, -1, "rust return null");
                    return;
                }
                com.bytedance.lark.pb.basic.v1.AppTipsContent appTipsContent = openApp.app_tips;
                if (appTipsContent == null) {
                    this.val$callback.onResult(new com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper(com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper.DataVersion.V1, -1, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null).toString());
                    d93.c.a(this.val$isH5, this.val$appid, java.lang.System.currentTimeMillis() - this.val$startTime, false, -1, "app_tips is  null");
                } else {
                    this.val$callback.onResult(new com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper(com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper.DataVersion.V1, 0, (java.lang.String) null, com.bytedance.ee.appstrategy.b.b(appTipsContent.i18n_title, appTipsContent.i18n_msg, com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.H(appTipsContent.actions), getOpenAppStateResponse.open_app.i18n_name).c(), (java.util.Map) null).toString());
                    d93.c.a(this.val$isH5, this.val$appid, java.lang.System.currentTimeMillis() - this.val$startTime, true, 0, "success");
                }
            }
        }

        AnonymousClass1(po.e eVar, boolean z, java.lang.String str, long j) {
            this.val$callback = eVar;
            this.val$isH5 = z;
            this.val$appid = str;
            this.val$startTime = j;
        }
    }

    /* renamed from: com.ss.android.lark.appstrategy.service.impl.AppStrategyService$11, reason: invalid class name */
    class AnonymousClass11 implements com.larksuite.framework.callback.IGetDataCallback<java.lang.String> {
        final /* synthetic */ long val$startTime;
        final /* synthetic */ java.lang.String val$triggerType;
        final /* synthetic */ java.lang.String val$userId;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSuccess$0(java.lang.String str) {
            com.ss.android.lark.appstrategy.service.impl.AppStrategyService appStrategyService = com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this;
            appStrategyService.S(appStrategyService.e.isHasLocationScope(), com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e.isHasWifiScope(), null, str, "LARK-PSDA-op_app_strategy_get_terminal_info");
        }

        /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
        public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
            java.lang.String snapshotId;
            com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.g = false;
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$11", "1004");
            com.ss.android.lark.log.Log.e("AppStrategyService", "get user scope err," + errorResult);
            com.ss.android.lark.opmonitor.service.OPMonitor errorMessage = b93.c.c(b93.d.d).addCategoryValue("trigger_type", this.val$triggerType).setDuration(java.lang.System.currentTimeMillis() - this.val$startTime).setErrorCode(java.lang.String.valueOf(errorResult.getErrorCode())).setErrorMessage(errorResult.getDebugMsg());
            if (com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e != null) {
                snapshotId = com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e.getSnapshotId();
            } else {
                snapshotId = "";
            }
            errorMessage.addCategoryValue("snapshot_id", snapshotId).flush();
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        public void onSuccess(java.lang.String str) throws org.json.JSONException {
            boolean z;
            java.lang.String snapshotId;
            boolean z2 = false;
            com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.g = false;
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$11", "980");
            com.ss.android.lark.log.Log.i("AppStrategyService", "get user scope success ");
            com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.I(this.val$userId, str);
            com.ss.android.lark.appstrategy.service.impl.AppStrategyService appStrategyService = com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this;
            if (appStrategyService.K(appStrategyService.e)) {
                android.os.Handler backgroundHandler = com.larksuite.framework.thread.CoreThreadPool.getBackgroundHandler();
                final java.lang.String str2 = this.val$triggerType;
                backgroundHandler.post(new java.lang.Runnable() { // from class: com.ss.android.lark.appstrategy.service.impl.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.lambda$onSuccess$0(str2);
                    }
                });
            }
            com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue = b93.c.c(b93.d.c).addCategoryValue("trigger_type", this.val$triggerType);
            if (com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e != null && com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e.isHasLocationScope()) {
                z = true;
            } else {
                z = false;
            }
            com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue2 = oPMonitorAddCategoryValue.addCategoryValue("location_switch", java.lang.Boolean.valueOf(z));
            if (com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e != null && com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e.isHasWifiScope()) {
                z2 = true;
            }
            com.ss.android.lark.opmonitor.service.OPMonitor duration = oPMonitorAddCategoryValue2.addCategoryValue("wifi_switch", java.lang.Boolean.valueOf(z2)).setDuration(java.lang.System.currentTimeMillis() - this.val$startTime);
            if (com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e != null) {
                snapshotId = com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e.getSnapshotId();
            } else {
                snapshotId = "";
            }
            duration.addCategoryValue("snapshot_id", snapshotId).flush();
        }

        AnonymousClass11(java.lang.String str, java.lang.String str2, long j) {
            this.val$userId = str;
            this.val$triggerType = str2;
            this.val$startTime = j;
        }
    }

    /* renamed from: com.ss.android.lark.appstrategy.service.impl.AppStrategyService$8, reason: invalid class name */
    class AnonymousClass8 implements com.larksuite.framework.callback.IGetDataCallback<com.ss.android.lark.appstrategy.dto.SimpleLocation> {
        final /* synthetic */ boolean val$flagWifi;
        final /* synthetic */ android.net.wifi.WifiInfo val$lastWifi;
        final /* synthetic */ java.util.List val$scanWifiList;
        final /* synthetic */ long val$startTime;
        final /* synthetic */ java.lang.String val$triggerType;
        final /* synthetic */ java.lang.String val$uid;

        /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
        public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
            com.ss.android.lark.appstrategy.service.impl.AppStrategyService appStrategyService = com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this;
            appStrategyService.T(null, this.val$lastWifi, appStrategyService.c, this.val$scanWifiList, false, this.val$flagWifi, true, this.val$triggerType, errorResult.getErrorCode(), this.val$uid);
            com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.h = false;
            java.lang.String str = " getLocation err,msg " + errorResult.toString();
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$8", "748");
            com.ss.android.lark.log.Log.i("AppStrategyService", str);
            d93.c.b(false, java.lang.System.currentTimeMillis() - this.val$startTime, "get location err,msg " + errorResult.getDebugMsg() + " errCode " + errorResult.getCode());
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        public void onSuccess(final com.ss.android.lark.appstrategy.dto.SimpleLocation simpleLocation) {
            java.util.concurrent.ExecutorService cachedThreadPool = com.larksuite.framework.thread.CoreThreadPool.getDefault().getCachedThreadPool();
            final android.net.wifi.WifiInfo wifiInfo = this.val$lastWifi;
            final java.util.List list = this.val$scanWifiList;
            final boolean z = this.val$flagWifi;
            final java.lang.String str = this.val$triggerType;
            final java.lang.String str2 = this.val$uid;
            final long j = this.val$startTime;
            cachedThreadPool.execute(new java.lang.Runnable() { // from class: com.ss.android.lark.appstrategy.service.impl.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onSuccess$0(simpleLocation, wifiInfo, list, z, str, str2, j);
                }
            });
        }

        AnonymousClass8(android.net.wifi.WifiInfo wifiInfo, java.util.List list, boolean z, java.lang.String str, java.lang.String str2, long j) {
            this.val$lastWifi = wifiInfo;
            this.val$scanWifiList = list;
            this.val$flagWifi = z;
            this.val$triggerType = str;
            this.val$uid = str2;
            this.val$startTime = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSuccess$0(com.ss.android.lark.appstrategy.dto.SimpleLocation simpleLocation, android.net.wifi.WifiInfo wifiInfo, java.util.List list, boolean z, java.lang.String str, java.lang.String str2, long j) {
            java.lang.String str3;
            boolean z2 = com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.z(simpleLocation);
            com.ss.android.lark.appstrategy.service.impl.AppStrategyService appStrategyService = com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this;
            appStrategyService.T(simpleLocation, wifiInfo, appStrategyService.c, list, z2, z, true, str, 0, str2);
            com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.h = false;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - j;
            if (z2) {
                str3 = null;
            } else {
                str3 = " location not in scope";
            }
            d93.c.b(z2, jCurrentTimeMillis, str3);
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$8", "738");
            com.ss.android.lark.log.Log.i("AppStrategyService", " getLocation success in scope " + z2);
        }
    }

    class a implements com.ss.android.lark.sdk.SdkSender.IParser<java.lang.String> {
        a() {
        }

        /* JADX DEBUG: Method merged with bridge method: parse([B)Ljava/lang/Object; */
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.String parse(byte[] bArr) throws java.io.IOException {
            return ((com.bytedance.lark.pb.basic.v1.SendHttpResponse) com.bytedance.lark.pb.basic.v1.SendHttpResponse.ADAPTER.decode(bArr)).json_body;
        }
    }

    class b implements com.ss.android.lark.sdk.SdkSender.IParser<java.lang.String> {
        b() {
        }

        /* JADX DEBUG: Method merged with bridge method: parse([B)Ljava/lang/Object; */
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public java.lang.String parse(byte[] bArr) throws java.io.IOException {
            return ((com.bytedance.lark.pb.basic.v1.SendHttpResponse) com.bytedance.lark.pb.basic.v1.SendHttpResponse.ADAPTER.decode(bArr)).json_body;
        }
    }

    class c implements com.ss.android.lark.http.netstate.a {
        c() {
        }

        public void d(com.ss.android.lark.http.netstate.NetworkUtils.NetworkType networkType) throws org.json.JSONException {
            com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.C(networkType);
        }
    }

    class d implements com.ss.android.lark.sdk.j.c {
        d() {
        }

        public void a(byte[] bArr, java.lang.String str, boolean z, boolean z2) throws org.json.JSONException {
            java.lang.String snapshotId;
            try {
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$7", "563");
                com.ss.android.lark.log.Log.i("AppStrategyService", " push open platform setting ");
                java.util.List<com.bytedance.lark.pb.openplatform.v1.PushOpenCommonRequest.OpenEvent> list = ((com.bytedance.lark.pb.openplatform.v1.PushOpenCommonRequest) com.bytedance.lark.pb.openplatform.v1.PushOpenCommonRequest.ADAPTER.decode(bArr)).events;
                if (list != null && list.size() > 0) {
                    boolean z3 = false;
                    for (com.bytedance.lark.pb.openplatform.v1.PushOpenCommonRequest.OpenEvent openEvent : list) {
                        if (openEvent.event_type == com.bytedance.lark.pb.openplatform.v1.PushOpenCommonRequest.EventType.USER_UPLOAD_SETTING_UPDATED) {
                            z3 = true;
                        }
                        try {
                            u83.b.b().checkOpenPlatformInit();
                            ((p76.b) com.ss.android.lark.openplatform.common.util.e0.a(p76.b.class)).runQuickWorkerOnPush(openEvent.event_type.getValue(), u83.b.b().getContext());
                        } catch (java.lang.Throwable th) {
                            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$7", "581");
                            com.ss.android.lark.log.Log.e("AppStrategyService", "Throwable", th);
                        }
                    }
                    if (z3) {
                        com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.y("push");
                        com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue = b93.c.c(b93.d.a).addCategoryValue("trigger_type", "push");
                        if (com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e != null) {
                            snapshotId = com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e.getSnapshotId();
                        } else {
                            snapshotId = "";
                        }
                        oPMonitorAddCategoryValue.addCategoryValue("snapshot_id", snapshotId).flush();
                    }
                }
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(android.net.wifi.WifiInfo wifiInfo) {
        S(this.e.isHasLocationScope(), this.e.isHasWifiScope(), wifiInfo, "network_change", "LARK-PSDA-op_app_strategy_network_state_change");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.ArrayList<com.bytedance.ee.appstrategy.b.a> H(java.util.List<com.bytedance.lark.pb.basic.v1.ActionInfo> list) {
        boolean z;
        java.util.ArrayList<com.bytedance.ee.appstrategy.b.a> arrayList = new java.util.ArrayList<>();
        if (list != null) {
            for (com.bytedance.lark.pb.basic.v1.ActionInfo actionInfo : list) {
                if (actionInfo != null && actionInfo.operator_code != null && actionInfo.action_code != null) {
                    com.bytedance.ee.appstrategy.b.a aVar = new com.bytedance.ee.appstrategy.b.a();
                    if (actionInfo.operator_code.getValue() == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.f = z;
                    aVar.a = actionInfo.i18n_text;
                    int value = actionInfo.action_code.getValue();
                    aVar.b = value;
                    if (value == 4) {
                        com.ss.android.lark.statistics.Statistics.sendEvent("app_states_unavailable_show");
                    }
                    com.bytedance.lark.pb.basic.v1.ActionExtraInfo actionExtraInfo = actionInfo.extra;
                    if (actionExtraInfo != null) {
                        aVar.c = actionExtraInfo.admin_id;
                        aVar.d = actionExtraInfo.params;
                        aVar.e = actionExtraInfo.url;
                    }
                    u1.a.H(arrayList, aVar);
                }
            }
        }
        return arrayList;
    }

    private void J(android.content.Context context) {
        if (u83.b.b().getFgValue("attendance.top_speed_clock_in.forbid_bssid")) {
            return;
        }
        if (this.a != null && com.ss.android.lark.http.netstate.NetworkUtils.f(context)) {
            return;
        }
        synchronized (this.f) {
            if (this.a == null) {
                this.a = new com.ss.android.lark.appstrategy.service.impl.AppStrategyService.c();
                com.ss.android.lark.http.netstate.c.b().f(this.a);
            }
            R();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K(com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope) {
        boolean z;
        if (appStrategyUserScope != null && (appStrategyUserScope.isHasWifiScope() || appStrategyUserScope.isHasLocationScope())) {
            z = true;
        } else {
            z = false;
        }
        if (appStrategyUserScope != null) {
            java.lang.String str = "shouldUpload: wifi" + appStrategyUserScope.isHasWifiScope() + " location :" + appStrategyUserScope.isHasLocationScope();
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "1053");
            com.ss.android.lark.log.Log.i("AppStrategyService", str);
        } else {
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "1058");
            com.ss.android.lark.log.Log.i("AppStrategyService", "shouldUpload: strategyUserScope null ");
        }
        return z;
    }

    private java.lang.String r(android.net.wifi.WifiInfo wifiInfo) {
        if (wifiInfo != null) {
            return mp1.a.a.j(wifiInfo, "LARK-PSDA-op_api_wifi_bssid_app_strategy");
        }
        return "";
    }

    private java.lang.String t(java.lang.String str) {
        return java.lang.String.format("%s_%s", str, "key_appstrategy_user_scope");
    }

    private java.lang.String x(android.net.wifi.WifiInfo wifiInfo) {
        if (wifiInfo != null) {
            return mp1.a.a.k(wifiInfo, "LARK-PSDA-op_api_wifi_ssid_app_strategy");
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z(com.ss.android.lark.appstrategy.dto.SimpleLocation simpleLocation) {
        com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope;
        java.util.List<com.ss.android.lark.appstrategy.userscope.CircleScope> circleScopes;
        java.lang.String userId = u83.b.b().getLoginDependency().getUserId();
        if (android.text.TextUtils.isEmpty(userId) || (appStrategyUserScope = (com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope) fy6.a.b().getJSONObject(t(userId), com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope.class)) == null || !appStrategyUserScope.isHasLocationScope() || (circleScopes = appStrategyUserScope.getCircleScopes()) == null || circleScopes.size() <= 0) {
            return false;
        }
        int size = circleScopes.size();
        for (int i = 0; i < size; i++) {
            com.ss.android.lark.appstrategy.userscope.CircleScope circleScope = circleScopes.get(i);
            if (circleScope != null && circleScope.getLocation() != null && d93.b.a(simpleLocation, circleScope.getLocation()) < circleScope.getRadius()) {
                return true;
            }
        }
        return false;
    }

    public void C(com.ss.android.lark.http.netstate.NetworkUtils.NetworkType networkType) throws org.json.JSONException {
        java.lang.String snapshotId;
        java.lang.String str = " network change " + networkType.getNativeName();
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "667");
        com.ss.android.lark.log.Log.i("AppStrategyService", str);
        java.lang.String userId = u83.b.b().getLoginDependency().getUserId();
        if (!android.text.TextUtils.isEmpty(userId)) {
            com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue = b93.c.c(b93.d.a).addCategoryValue("trigger_type", "network_change");
            com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope = this.e;
            if (appStrategyUserScope != null) {
                snapshotId = appStrategyUserScope.getSnapshotId();
            } else {
                snapshotId = "";
            }
            oPMonitorAddCategoryValue.addCategoryValue("snapshot_id", snapshotId).flush();
            this.e = (com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope) fy6.a.b().getJSONObject(t(userId), com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope.class);
        }
        if (this.e == null) {
            return;
        }
        final android.net.wifi.WifiInfo wifiInfo = this.c;
        R();
        if (K(this.e)) {
            com.larksuite.framework.thread.CoreThreadPool.getBackgroundHandler().post(new java.lang.Runnable() { // from class: com.ss.android.lark.appstrategy.service.impl.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.B(wifiInfo);
                }
            });
            return;
        }
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "692");
        com.ss.android.lark.log.Log.i("AppStrategyService", "networkStateChange: clock_in_opt_open");
        y("network_change");
    }

    public void F(boolean z) throws org.json.JSONException {
        java.lang.String snapshotId;
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "616");
        com.ss.android.lark.log.Log.i("AppStrategyService", " login status change:" + z);
        if (z) {
            y("login");
            com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue = b93.c.c(b93.d.a).addCategoryValue("trigger_type", "login");
            com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope = this.e;
            if (appStrategyUserScope != null) {
                snapshotId = appStrategyUserScope.getSnapshotId();
            } else {
                snapshotId = "";
            }
            oPMonitorAddCategoryValue.addCategoryValue("snapshot_id", snapshotId).flush();
        }
    }

    po.c L(com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse getBotControlInfoResponse) {
        com.bytedance.lark.pb.openplatform.v1.BotInfo botInfo;
        com.bytedance.lark.pb.openplatform.v1.GuideTips guideTips;
        if (getBotControlInfoResponse != null && (botInfo = getBotControlInfoResponse.bot_info) != null && botInfo.status != com.bytedance.lark.pb.openplatform.v1.CommonUsageStatus.USABLE && (guideTips = getBotControlInfoResponse.tips) != null) {
            return new po.c(botInfo.app_id, botInfo.local_name, guideTips.local_title, guideTips.local_content, O(guideTips.buttons));
        }
        return null;
    }

    po.c M(com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse getH5ControlInfoResponse) {
        com.bytedance.lark.pb.openplatform.v1.H5Info h5Info;
        com.bytedance.lark.pb.openplatform.v1.GuideTips guideTips;
        if (getH5ControlInfoResponse != null && (h5Info = getH5ControlInfoResponse.h5_info) != null && h5Info.status != com.bytedance.lark.pb.openplatform.v1.CommonUsageStatus.USABLE && (guideTips = getH5ControlInfoResponse.tips) != null) {
            return new po.c(h5Info.app_id, h5Info.local_name, guideTips.local_title, guideTips.local_content, O(guideTips.buttons));
        }
        return null;
    }

    po.c N(com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse getMiniAppControlInfoResponse) {
        com.bytedance.lark.pb.openplatform.v1.MiniAppInfo miniAppInfo;
        com.bytedance.lark.pb.openplatform.v1.GuideTips guideTips;
        if (getMiniAppControlInfoResponse != null && (miniAppInfo = getMiniAppControlInfoResponse.app_info) != null && miniAppInfo.status != com.bytedance.lark.pb.openplatform.v1.CommonUsageStatus.USABLE && (guideTips = getMiniAppControlInfoResponse.tips) != null) {
            return new po.c(miniAppInfo.app_id, miniAppInfo.local_name, guideTips.local_title, guideTips.local_content, O(guideTips.buttons));
        }
        return null;
    }

    java.util.List<po.f> O(java.util.List<com.bytedance.lark.pb.openplatform.v1.Button> list) {
        if (list != null && !list.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            for (com.bytedance.lark.pb.openplatform.v1.Button button : list) {
                arrayList.add(new po.f(button.local_content, button.schema, button.extras));
            }
            return arrayList;
        }
        return null;
    }

    public void y(java.lang.String str) throws org.json.JSONException {
        java.lang.String snapshotId;
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "950");
        com.ss.android.lark.log.Log.i("AppStrategyService", "getTerminalInfo " + str);
        if (this.g) {
            return;
        }
        java.lang.String userId = u83.b.b().getLoginDependency().getUserId();
        if (!android.text.TextUtils.isEmpty(userId)) {
            this.g = true;
            try {
                new org.json.JSONObject().put("user_id", userId);
            } catch (org.json.JSONException e2) {
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "963");
                com.ss.android.lark.log.Log.e("AppStrategyService", e2);
            }
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue = b93.c.c(b93.d.b).addCategoryValue("trigger_type", str);
            com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope = this.e;
            if (appStrategyUserScope != null) {
                snapshotId = appStrategyUserScope.getSnapshotId();
            } else {
                snapshotId = "";
            }
            oPMonitorAddCategoryValue.addCategoryValue("snapshot_id", snapshotId).flush();
            com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(com.bytedance.lark.pb.basic.v1.Command.SEND_HTTP, new com.bytedance.lark.pb.basic.v1.SendHttpRequest.a().e(com.bytedance.lark.pb.basic.v1.SendHttpRequest.Method.GET).c(w()).h(d93.a.a), new com.ss.android.lark.appstrategy.service.impl.AppStrategyService.AnonymousClass11(userId, str, jCurrentTimeMillis), new com.ss.android.lark.appstrategy.service.impl.AppStrategyService.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope;
        java.lang.String str3;
        java.lang.String str4;
        com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope2;
        java.util.ArrayList arrayList;
        org.json.JSONArray jSONArray;
        com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope3;
        java.util.ArrayList arrayList2;
        int i;
        org.json.JSONArray jSONArray2;
        com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope4;
        java.util.ArrayList arrayList3;
        java.lang.String str5;
        int i2;
        com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope5 = new com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.String str6 = "modules/biz/openplatform/appstrategy-api/";
        if (!android.text.TextUtils.isEmpty(str2)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                if (jSONObject.has("data")) {
                    org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (jSONObject2.has("wifi")) {
                        appStrategyUserScope5.setHasWifiScope(true);
                        J(u83.b.b().getContext());
                    } else {
                        d93.c.c(false, " wifi flag not open");
                        P();
                    }
                    try {
                        if (jSONObject2.has("location")) {
                            try {
                                appStrategyUserScope5.setHasLocationScope(true);
                                org.json.JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONObject("location").optJSONArray("geofences");
                                if (jSONArrayOptJSONArray != null) {
                                    int length = jSONArrayOptJSONArray.length();
                                    int i3 = 0;
                                    while (i3 < length) {
                                        org.json.JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i3);
                                        if (jSONObject3 != null) {
                                            java.lang.String strOptString = jSONObject3.optString("type");
                                            java.lang.String str7 = "latitude";
                                            if (android.text.TextUtils.equals(strOptString, "circle")) {
                                                com.ss.android.lark.appstrategy.userscope.CircleScope circleScope = new com.ss.android.lark.appstrategy.userscope.CircleScope();
                                                org.json.JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("center");
                                                if (jSONObjectOptJSONObject != null) {
                                                    jSONArray = jSONArrayOptJSONArray;
                                                    i = length;
                                                    str3 = str6;
                                                    try {
                                                        circleScope.setLocation(new com.ss.android.lark.appstrategy.dto.SimpleLocation(jSONObjectOptJSONObject.optDouble("latitude"), jSONObjectOptJSONObject.optDouble("longitude")));
                                                    } catch (org.json.JSONException e2) {
                                                        e = e2;
                                                        appStrategyUserScope = appStrategyUserScope5;
                                                        str4 = str3;
                                                        ks7.c.d(str4, "AppStrategyService", "1149");
                                                        com.ss.android.lark.log.Log.e("AppStrategyService", e);
                                                        ks7.c.d(str4, "AppStrategyService", "1153");
                                                        com.ss.android.lark.log.Log.i("AppStrategyService", "parseUserScope: fg open ");
                                                        if (appStrategyUserScope.isHasLocationScope()) {
                                                        }
                                                        this.e = appStrategyUserScope;
                                                        fy6.a.b().putJSONObject(t(str), appStrategyUserScope);
                                                    }
                                                } else {
                                                    jSONArray = jSONArrayOptJSONArray;
                                                    i = length;
                                                    str3 = str6;
                                                }
                                                circleScope.setRadius(jSONObject3.optInt("radius"));
                                                arrayList4.add(circleScope);
                                            } else {
                                                jSONArray = jSONArrayOptJSONArray;
                                                i = length;
                                                str3 = str6;
                                                if (android.text.TextUtils.equals(strOptString, "polygon")) {
                                                    org.json.JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray("coords");
                                                    com.ss.android.lark.appstrategy.userscope.PolygonScope polygonScope = new com.ss.android.lark.appstrategy.userscope.PolygonScope();
                                                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                                    if (jSONArrayOptJSONArray2 != null) {
                                                        int length2 = jSONArrayOptJSONArray2.length();
                                                        int i4 = 0;
                                                        while (i4 < length2) {
                                                            org.json.JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i4);
                                                            if (jSONObjectOptJSONObject2 != null) {
                                                                jSONArray2 = jSONArrayOptJSONArray2;
                                                                appStrategyUserScope4 = appStrategyUserScope5;
                                                                arrayList3 = arrayList4;
                                                                str5 = str7;
                                                                i2 = length2;
                                                                arrayList6.add(new com.ss.android.lark.appstrategy.dto.SimpleLocation(jSONObjectOptJSONObject2.optDouble(str7), jSONObjectOptJSONObject2.optDouble("longitude")));
                                                            } else {
                                                                jSONArray2 = jSONArrayOptJSONArray2;
                                                                appStrategyUserScope4 = appStrategyUserScope5;
                                                                arrayList3 = arrayList4;
                                                                str5 = str7;
                                                                i2 = length2;
                                                            }
                                                            i4++;
                                                            jSONArrayOptJSONArray2 = jSONArray2;
                                                            appStrategyUserScope5 = appStrategyUserScope4;
                                                            arrayList4 = arrayList3;
                                                            str7 = str5;
                                                            length2 = i2;
                                                        }
                                                    }
                                                    appStrategyUserScope3 = appStrategyUserScope5;
                                                    arrayList2 = arrayList4;
                                                    polygonScope.setLocationList(arrayList6);
                                                    arrayList5.add(polygonScope);
                                                }
                                            }
                                            appStrategyUserScope3 = appStrategyUserScope5;
                                            arrayList2 = arrayList4;
                                        } else {
                                            jSONArray = jSONArrayOptJSONArray;
                                            appStrategyUserScope3 = appStrategyUserScope5;
                                            arrayList2 = arrayList4;
                                            i = length;
                                            str3 = str6;
                                        }
                                        i3++;
                                        jSONArrayOptJSONArray = jSONArray;
                                        str6 = str3;
                                        length = i;
                                        appStrategyUserScope5 = appStrategyUserScope3;
                                        arrayList4 = arrayList2;
                                    }
                                }
                                appStrategyUserScope2 = appStrategyUserScope5;
                                arrayList = arrayList4;
                                str3 = str6;
                            } catch (org.json.JSONException e3) {
                                e = e3;
                                str3 = str6;
                            }
                        } else {
                            appStrategyUserScope2 = appStrategyUserScope5;
                            arrayList = arrayList4;
                            str3 = "modules/biz/openplatform/appstrategy-api/";
                            d93.c.b(false, -1L, " location flag not open");
                        }
                        if (jSONObject2.has("rule_snapshot_id")) {
                            appStrategyUserScope = appStrategyUserScope2;
                            try {
                                appStrategyUserScope.setSnapshotId(jSONObject2.optString("rule_snapshot_id"));
                            } catch (org.json.JSONException e4) {
                                e = e4;
                                str4 = str3;
                                ks7.c.d(str4, "AppStrategyService", "1149");
                                com.ss.android.lark.log.Log.e("AppStrategyService", e);
                                ks7.c.d(str4, "AppStrategyService", "1153");
                                com.ss.android.lark.log.Log.i("AppStrategyService", "parseUserScope: fg open ");
                                if (appStrategyUserScope.isHasLocationScope()) {
                                }
                                this.e = appStrategyUserScope;
                                fy6.a.b().putJSONObject(t(str), appStrategyUserScope);
                            }
                        } else {
                            appStrategyUserScope = appStrategyUserScope2;
                        }
                        appStrategyUserScope.setCircleScopes(arrayList);
                        appStrategyUserScope.setPolygonScopes(arrayList5);
                    } catch (org.json.JSONException e5) {
                        e = e5;
                        appStrategyUserScope = appStrategyUserScope2;
                    }
                } else {
                    appStrategyUserScope = appStrategyUserScope5;
                    str3 = "modules/biz/openplatform/appstrategy-api/";
                }
                str4 = str3;
            } catch (org.json.JSONException e6) {
                e = e6;
                appStrategyUserScope = appStrategyUserScope5;
                str3 = "modules/biz/openplatform/appstrategy-api/";
            }
        } else {
            appStrategyUserScope = appStrategyUserScope5;
            str4 = "modules/biz/openplatform/appstrategy-api/";
        }
        ks7.c.d(str4, "AppStrategyService", "1153");
        com.ss.android.lark.log.Log.i("AppStrategyService", "parseUserScope: fg open ");
        if (appStrategyUserScope.isHasLocationScope() && !appStrategyUserScope.isHasWifiScope()) {
            ks7.c.d(str4, "AppStrategyService", "1158");
            com.ss.android.lark.log.Log.i("AppStrategyService", "parseUserScope: data null ");
        } else {
            this.e = appStrategyUserScope;
            fy6.a.b().putJSONObject(t(str), appStrategyUserScope);
        }
    }

    @Override // c93.a
    public void e(final java.lang.String str, final c93.a.b bVar) {
        java.lang.System.currentTimeMillis();
        final com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoRequest.a aVarD = new com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoRequest.a().a(str).d(com.bytedance.lark.pb.openplatform.v1.GetDataStrategy.LocalOnly);
        com.bytedance.lark.pb.basic.v1.Command command = com.bytedance.lark.pb.basic.v1.Command.GET_BOT_INFO_WITH_TIPS;
        com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse> iGetDataCallback = new com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyService.4
            /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
            public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                java.lang.String str2 = " get bot state err " + errorResult.getDebugMsg();
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$4", "502");
                com.ss.android.lark.log.Log.e("AppStrategyService", str2);
                bVar.onError(errorResult.getDebugMsg());
                new com.ss.android.lark.opmonitor.service.OPMonitor(mc4.n.f).addCategoryValue("appID", str).addCategoryValue("strategy", "local").setError(errorResult).setErrorMessage("rust error:" + errorResult.getDebugMsg()).flush();
            }

            /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
            public void onSuccess(final com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse getBotControlInfoResponse) {
                final com.bytedance.lark.pb.openplatform.v1.BotInfo botInfo = getBotControlInfoResponse.bot_info;
                new com.ss.android.lark.opmonitor.service.OPMonitor(mc4.n.e).addCategoryValue("appID", str).addCategoryValue("strategy", "local").flush();
                if (botInfo != null && botInfo.status == com.bytedance.lark.pb.openplatform.v1.CommonUsageStatus.USABLE) {
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$4", "426");
                    com.ss.android.lark.log.Log.i("AppStrategyService", " get bot appstate use local");
                    bVar.a(botInfo.bot_id, null);
                    aVarD.d(com.bytedance.lark.pb.openplatform.v1.GetDataStrategy.NetOnly);
                    com.bytedance.lark.pb.basic.v1.Command command2 = com.bytedance.lark.pb.basic.v1.Command.GET_BOT_INFO_WITH_TIPS;
                    com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoRequest.a aVar = aVarD;
                    com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse> iGetDataCallback2 = new com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyService.4.1
                        /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
                        public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                            new com.ss.android.lark.opmonitor.service.OPMonitor(mc4.n.f).addCategoryValue("appID", str).addCategoryValue("strategy", "network").setError(errorResult).setErrorMessage("rust error:" + errorResult.getDebugMsg()).flush();
                            java.lang.String str2 = " get bot state err " + errorResult.getDebugMsg();
                            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$4$1", "449");
                            com.ss.android.lark.log.Log.e("AppStrategyService", str2);
                        }

                        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
                        public void onSuccess(com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse getBotControlInfoResponse2) {
                            new com.ss.android.lark.opmonitor.service.OPMonitor(mc4.n.e).addCategoryValue("appID", str).addCategoryValue("strategy", "network").flush();
                        }
                    };
                    com.squareup.wire.ProtoAdapter protoAdapter = com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse.ADAPTER;
                    java.util.Objects.requireNonNull(protoAdapter);
                    com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(command2, aVar, iGetDataCallback2, new com.ss.android.lark.appstrategy.service.impl.e(protoAdapter));
                    return;
                }
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$4", "457");
                com.ss.android.lark.log.Log.i("AppStrategyService", " get bot appstate from net ");
                aVarD.d(com.bytedance.lark.pb.openplatform.v1.GetDataStrategy.NetOnly);
                com.bytedance.lark.pb.basic.v1.Command command3 = com.bytedance.lark.pb.basic.v1.Command.GET_BOT_INFO_WITH_TIPS;
                com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoRequest.a aVar2 = aVarD;
                com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse> iGetDataCallback3 = new com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyService.4.2
                    /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
                    public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                        new com.ss.android.lark.opmonitor.service.OPMonitor(mc4.n.f).addCategoryValue("appID", str).addCategoryValue("strategy", "network").setError(errorResult).setErrorMessage("rust error:" + errorResult.getDebugMsg()).flush();
                        java.lang.String str2 = " get bot state err " + errorResult.getDebugMsg();
                        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$4$2", "487");
                        com.ss.android.lark.log.Log.e("AppStrategyService", str2);
                        if (botInfo != null) {
                            bVar.a(botInfo.bot_id, com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.L(getBotControlInfoResponse));
                        } else {
                            bVar.onError(errorResult.getDebugMsg());
                        }
                    }

                    /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
                    public void onSuccess(com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse getBotControlInfoResponse2) {
                        new com.ss.android.lark.opmonitor.service.OPMonitor(mc4.n.e).addCategoryValue("appID", str).addCategoryValue("strategy", "network").flush();
                        if (getBotControlInfoResponse2.bot_info == null) {
                            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$4$2", "469");
                            com.ss.android.lark.log.Log.e("AppStrategyService", " bot info null ");
                            bVar.onError(" bot info null");
                        } else {
                            bVar.a(getBotControlInfoResponse2.bot_info.bot_id, com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.L(getBotControlInfoResponse2));
                        }
                    }
                };
                com.squareup.wire.ProtoAdapter protoAdapter2 = com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse.ADAPTER;
                java.util.Objects.requireNonNull(protoAdapter2);
                com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(command3, aVar2, iGetDataCallback3, new com.ss.android.lark.appstrategy.service.impl.e(protoAdapter2));
            }
        };
        com.squareup.wire.ProtoAdapter protoAdapter = com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse.ADAPTER;
        java.util.Objects.requireNonNull(protoAdapter);
        com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(command, aVarD, iGetDataCallback, new com.ss.android.lark.appstrategy.service.impl.e(protoAdapter));
    }

    public void Q(java.lang.String str, java.lang.String str2, long j) {
        com.ss.android.lark.appstrategy.service.impl.i.a().d(str, str2, j, new com.larksuite.framework.callback.IGetDataCallback<java.io.Serializable>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyService.5
            /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
            public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
            }

            /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
            public void onSuccess(java.io.Serializable serializable) {
            }
        });
    }

    @Override // c93.a
    public void b(final java.lang.String str, final boolean z, final po.e eVar) {
        com.ss.android.lark.appstrategy.service.IAppStrategyManisService.OpenAppInfoType openAppInfoType;
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "213");
        com.ss.android.lark.log.Log.i("AppStrategyService", "getAppState begin appId=" + str + " isH5=" + z);
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        com.ss.android.lark.appstrategy.service.impl.i iVarA = com.ss.android.lark.appstrategy.service.impl.i.a();
        if (z) {
            openAppInfoType = com.ss.android.lark.appstrategy.service.IAppStrategyManisService.OpenAppInfoType.H5;
        } else {
            openAppInfoType = com.ss.android.lark.appstrategy.service.IAppStrategyManisService.OpenAppInfoType.MiniApp;
        }
        iVarA.c(str, openAppInfoType, new com.larksuite.framework.callback.IGetDataCallback<android.os.Parcelable>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyService.2
            /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
            public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                java.lang.String str2;
                java.lang.String str3 = "errMsg=" + errorResult.getDebugMsg();
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$2", "277");
                com.ss.android.lark.log.Log.e("AppStrategyService", str3);
                java.lang.String debugMsg = errorResult.getDebugMsg();
                java.lang.String str4 = str;
                if (z) {
                    str2 = "h5";
                } else {
                    str2 = "ma";
                }
                eVar.onResult(new com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper(com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper.DataVersion.V2, 10110, errorResult.getDisplayMsg(), (java.lang.String) null, po.a.a(10110, "client.open_platform.gadget.app_strategy.middle.service", 0L, 0L, 0L, debugMsg, str4, str2, true, (java.lang.String) null)).toString());
                d93.c.a(z, str, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, false, -2, "rust error:" + errorResult.getDebugMsg());
            }

            /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
            public void onSuccess(android.os.Parcelable parcelable) {
                java.lang.String str2;
                if (parcelable != null && (parcelable instanceof com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper)) {
                    com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper successResultWrapper = (com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper) parcelable;
                    com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse getMiniAppControlInfoResponse = successResultWrapper.a;
                    java.lang.String string = null;
                    if (getMiniAppControlInfoResponse instanceof com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse) {
                        po.c cVarN = com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.N(getMiniAppControlInfoResponse);
                        com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper.DataVersion dataVersion = com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper.DataVersion.V2;
                        if (cVarN != null) {
                            string = cVarN.toString();
                        }
                        eVar.onResult(new com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper(dataVersion, 10000, (java.lang.String) null, string, successResultWrapper.b).toString());
                        return;
                    }
                    if (getMiniAppControlInfoResponse instanceof com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse) {
                        po.c cVarM = com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.M((com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse) getMiniAppControlInfoResponse);
                        com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper.DataVersion dataVersion2 = com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper.DataVersion.V2;
                        if (cVarM != null) {
                            string = cVarM.toString();
                        }
                        eVar.onResult(new com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper(dataVersion2, 10000, (java.lang.String) null, string, successResultWrapper.b).toString());
                        return;
                    }
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$2", "271");
                    com.ss.android.lark.log.Log.w("AppStrategyService", "app strategy service result wrapper response type undefined");
                    return;
                }
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$2", "221");
                com.ss.android.lark.log.Log.e("AppStrategyService", "resp type error");
                java.lang.String str3 = str;
                if (z) {
                    str2 = "h5";
                } else {
                    str2 = "ma";
                }
                eVar.onResult(new com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper(com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper.DataVersion.V2, 10100, "app strategy service result wrapper type error", (java.lang.String) null, po.a.a(10100, "client.open_platform.gadget.app_strategy.middle.service", 0L, 0L, 0L, "app strategy service result wrapper type error", str3, str2, true, (java.lang.String) null)).toString());
            }
        });
    }

    @Override // c93.a
    public void c(final java.lang.String str, final boolean z, final c93.a.InterfaceC0007a interfaceC0007a) {
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        Q(str, null, jCurrentTimeMillis);
        com.ss.android.lark.appstrategy.service.impl.i.a().b(str, new com.larksuite.framework.callback.IGetDataCallback<java.io.Serializable>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyService.3
            /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
            public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                interfaceC0007a.onError(errorResult.getDebugMsg());
                d93.c.a(z, str, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, false, -2, "rust error:" + errorResult.getDebugMsg());
            }

            /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
            public void onSuccess(java.io.Serializable serializable) {
                if (!(serializable instanceof com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse)) {
                    interfaceC0007a.onError("openappstate response null ");
                    return;
                }
                com.bytedance.lark.pb.basic.v1.OpenApp openApp = ((com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse) serializable).open_app;
                if (openApp == null) {
                    interfaceC0007a.onError("open app null");
                    d93.c.a(z, str, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, false, -1, "open_app null");
                    return;
                }
                com.bytedance.lark.pb.basic.v1.OpenApp.State state = openApp.state;
                if (state == null) {
                    interfaceC0007a.onError("app state null");
                    d93.c.a(z, str, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, false, -1, "app_state null");
                    return;
                }
                java.lang.String str2 = "appid " + str + " appstate " + state.getValue();
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$3", "392");
                com.ss.android.lark.log.Log.i("AppStrategyService", str2);
                interfaceC0007a.onSuccess(state.getValue());
            }
        });
    }

    @Override // c93.a
    public void d(java.lang.String str, java.lang.String str2, java.lang.String str3) throws org.json.JSONException {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("cli_id", str);
                jSONObject.put("apply_param", str3);
            } catch (org.json.JSONException unused) {
            }
            com.bytedance.lark.pb.basic.v1.SendHttpRequest.a aVarD = new com.bytedance.lark.pb.basic.v1.SendHttpRequest.a().e(com.bytedance.lark.pb.basic.v1.SendHttpRequest.Method.POST).h(str2).c(w()).d(jSONObject.toString());
            com.bytedance.lark.pb.basic.v1.Command command = com.bytedance.lark.pb.basic.v1.Command.SEND_HTTP;
            com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.basic.v1.SendHttpResponse> iGetDataCallback = new com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.basic.v1.SendHttpResponse>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyService.6
                /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
                public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                }

                /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
                public void onSuccess(com.bytedance.lark.pb.basic.v1.SendHttpResponse sendHttpResponse) {
                }
            };
            com.squareup.wire.ProtoAdapter protoAdapter = com.bytedance.lark.pb.basic.v1.SendHttpResponse.ADAPTER;
            java.util.Objects.requireNonNull(protoAdapter);
            com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(command, aVarD, iGetDataCallback, new com.larksuite.component.card.action.b(protoAdapter));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(boolean z, boolean z2, android.net.wifi.WifiInfo wifiInfo, java.lang.String str, java.lang.String str2) {
        java.lang.String snapshotId;
        java.lang.String str3 = java.util.UUID.randomUUID().toString() + "-" + java.lang.System.currentTimeMillis();
        com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue = b93.c.c(b93.d.e).addCategoryValue("trigger_type", str).addCategoryValue("location_switch", java.lang.Boolean.valueOf(z)).addCategoryValue("wifi_switch", java.lang.Boolean.valueOf(z2)).addCategoryValue("terminal_uid", str3);
        com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope = this.e;
        if (appStrategyUserScope != null) {
            snapshotId = appStrategyUserScope.getSnapshotId();
        } else {
            snapshotId = "";
        }
        oPMonitorAddCategoryValue.addCategoryValue("snapshot_id", snapshotId).flush();
        if (z2) {
            R();
            if (!z) {
                T(null, wifiInfo, this.c, this.d, false, true, false, str, 0, str3);
            }
        }
        if (z) {
            v(z2, wifiInfo, this.d, str, str3, str2);
        }
    }

    private void u(boolean z, android.net.wifi.WifiInfo wifiInfo, java.util.List<android.net.wifi.ScanResult> list, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.h) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        this.h = true;
        u83.b.b().getLocation(str3, new com.ss.android.lark.appstrategy.service.impl.AppStrategyService.AnonymousClass8(wifiInfo, list, z, str, str2, jCurrentTimeMillis));
    }

    private void v(boolean z, android.net.wifi.WifiInfo wifiInfo, java.util.List<android.net.wifi.ScanResult> list, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        boolean z2;
        android.content.Context context = u83.b.b().getContext();
        if (context != null) {
            boolean z3 = true;
            if (androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (androidx.core.content.ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                z3 = false;
            }
            if (!z2 && !z3) {
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "711");
                com.ss.android.lark.log.Log.i("AppStrategyService", " location permission deny");
                T(null, wifiInfo, this.c, list, false, z, true, str, 2000, str2);
                d93.c.b(false, -1L, " location permission deny");
                return;
            }
            u(z, wifiInfo, list, str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void T(final com.ss.android.lark.appstrategy.dto.SimpleLocation simpleLocation, final android.net.wifi.WifiInfo wifiInfo, final android.net.wifi.WifiInfo wifiInfo2, final java.util.List<android.net.wifi.ScanResult> list, final boolean z, final boolean z2, final boolean z3, final java.lang.String str, int i, final java.lang.String str2) {
        java.lang.String snapshotId;
        android.net.wifi.WifiInfo wifiInfo3;
        boolean z4;
        boolean z5;
        boolean z6;
        java.lang.String str3;
        java.lang.String snapshotId2;
        org.json.JSONObject jSONObject;
        boolean zIsAppRealForeground = u83.b.b().isAppRealForeground();
        com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue = b93.c.d(b93.d.f, simpleLocation, wifiInfo, wifiInfo2, list, z, z2, z3, str).addCategoryValue("is_front", java.lang.Boolean.valueOf(zIsAppRealForeground)).addCategoryValue("terminal_uid", str2);
        com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope = this.e;
        if (appStrategyUserScope != null) {
            snapshotId = appStrategyUserScope.getSnapshotId();
        } else {
            snapshotId = "";
        }
        oPMonitorAddCategoryValue.addCategoryValue("snapshot_id", snapshotId).setErrorCode(java.lang.String.valueOf(i)).flush();
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "805");
        com.ss.android.lark.log.Log.i("AppStrategyService", " is foreground " + zIsAppRealForeground);
        if (!zIsAppRealForeground) {
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "808");
            com.ss.android.lark.log.Log.e("AppStrategyService", "upload terminal info early return. is foreground " + zIsAppRealForeground);
            return;
        }
        boolean z7 = false;
        if (!z3 || simpleLocation == null || !z) {
            if (z2) {
                if (wifiInfo2 == null) {
                    str3 = str2;
                    wifiInfo3 = wifiInfo;
                    if (wifiInfo3 == null) {
                        if (list != null) {
                            if (list.size() < 1) {
                            }
                        }
                    }
                } else {
                    str3 = str2;
                    wifiInfo3 = wifiInfo;
                }
                if (android.text.TextUtils.isEmpty(u83.b.b().getLoginDependency().getUserId())) {
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "825");
                    com.ss.android.lark.log.Log.e("AppStrategyService", "upload terminal info early return. user ID is empty ");
                    return;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("timestamp", java.lang.String.valueOf(u83.b.b().getNtpTime()));
                    if (simpleLocation != null) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put("longitude", simpleLocation.getLongitude());
                        jSONObject3.put("latitude", simpleLocation.getLatitude());
                        jSONObject3.put("accuracy", simpleLocation.getAccuracy());
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        jSONObject4.put("coord", jSONObject3);
                        jSONObject2.put("location", jSONObject4);
                    }
                    if (wifiInfo3 != null) {
                        jSONObject = new org.json.JSONObject();
                        java.lang.String strX = x(wifiInfo3);
                        if (!android.text.TextUtils.isEmpty(strX)) {
                            jSONObject.put("lastSSID", strX.replace("\"", ""));
                        }
                        jSONObject.put("lastBSSID", r(wifiInfo3));
                    } else {
                        jSONObject = null;
                    }
                    if (wifiInfo2 != null) {
                        if (jSONObject == null) {
                            jSONObject = new org.json.JSONObject();
                        }
                        java.lang.String strX2 = x(wifiInfo2);
                        if (!android.text.TextUtils.isEmpty(strX2)) {
                            jSONObject.put("SSID", strX2.replace("\"", ""));
                        } else {
                            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "864");
                            com.ss.android.lark.log.Log.i("AppStrategyService", "upload terminal ssid is null");
                        }
                        java.lang.String strR = r(wifiInfo2);
                        jSONObject.put("BSSID", strR);
                        if (!android.text.TextUtils.isEmpty(strR)) {
                            java.lang.String str4 = "upload terminal WiFi info BSSID:" + com.bytedance.ee.lark.infra.foundation.utils.i.b(strR, 2, '*', new char[]{'/', '.', '-', '_'});
                            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "869");
                            com.ss.android.lark.log.Log.i("AppStrategyService", str4);
                        } else {
                            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "873");
                            com.ss.android.lark.log.Log.i("AppStrategyService", "upload terminal bssid is null");
                        }
                    } else {
                        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "876");
                        com.ss.android.lark.log.Log.i("AppStrategyService", "upload terminal WiFi info is null");
                    }
                    if (list != null && list.size() > 0) {
                        org.json.JSONArray jSONArray = new org.json.JSONArray();
                        for (android.net.wifi.ScanResult scanResult : list) {
                            if (scanResult != null) {
                                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                                jSONObject5.put("SSID", scanResult.SSID);
                                jSONObject5.put("BSSID", scanResult.BSSID);
                                jSONArray.put(jSONObject5);
                            }
                        }
                        jSONObject2.put("scanWifi", jSONArray);
                    }
                    if (jSONObject != null) {
                        jSONObject2.put("wifi", jSONObject);
                    }
                    jSONObject2.put("deviceID", u83.b.b().getDeviceId());
                } catch (org.json.JSONException e2) {
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "897");
                    com.ss.android.lark.log.Log.e("AppStrategyService", e2);
                }
                com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue2 = b93.c.d(b93.d.g, simpleLocation, wifiInfo, wifiInfo2, list, z, z2, z3, str).addCategoryValue("terminal_uid", str3);
                com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope appStrategyUserScope2 = this.e;
                if (appStrategyUserScope2 != null) {
                    snapshotId2 = appStrategyUserScope2.getSnapshotId();
                } else {
                    snapshotId2 = "";
                }
                oPMonitorAddCategoryValue2.addCategoryValue("snapshot_id", snapshotId2).flush();
                final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(com.bytedance.lark.pb.basic.v1.Command.SEND_HTTP, new com.bytedance.lark.pb.basic.v1.SendHttpRequest.a().e(com.bytedance.lark.pb.basic.v1.SendHttpRequest.Method.POST).c(w()).h(d93.a.b).d(jSONObject2.toString()), new com.larksuite.framework.callback.IGetDataCallback<java.lang.String>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyService.9
                    /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
                    public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                        java.lang.String snapshotId3;
                        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$9", "928");
                        com.ss.android.lark.log.Log.e("AppStrategyService", "upload terminal info err," + errorResult);
                        com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue3 = b93.c.d(b93.d.i, simpleLocation, wifiInfo, wifiInfo2, list, z, z2, z3, str).setDuration(java.lang.System.currentTimeMillis() - jCurrentTimeMillis).addCategoryValue("terminal_uid", str2);
                        if (com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e != null) {
                            snapshotId3 = com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e.getSnapshotId();
                        } else {
                            snapshotId3 = "";
                        }
                        oPMonitorAddCategoryValue3.addCategoryValue("snapshot_id", snapshotId3).setErrorMessage(errorResult.getDebugMsg()).setErrorCode(java.lang.String.valueOf(errorResult.getErrorCode())).flush();
                    }

                    /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
                    public void onSuccess(java.lang.String str5) {
                        java.lang.String snapshotId3;
                        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService$9", "916");
                        com.ss.android.lark.log.Log.i("AppStrategyService", "upload terminal info success");
                        com.ss.android.lark.opmonitor.service.OPMonitor oPMonitorAddCategoryValue3 = b93.c.d(b93.d.h, simpleLocation, wifiInfo, wifiInfo2, list, z, z2, z3, str).setDuration(java.lang.System.currentTimeMillis() - jCurrentTimeMillis).addCategoryValue("terminal_uid", str2);
                        if (com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e != null) {
                            snapshotId3 = com.ss.android.lark.appstrategy.service.impl.AppStrategyService.this.e.getSnapshotId();
                        } else {
                            snapshotId3 = "";
                        }
                        oPMonitorAddCategoryValue3.addCategoryValue("snapshot_id", snapshotId3).flush();
                    }
                }, new com.ss.android.lark.appstrategy.service.impl.AppStrategyService.a());
                return;
            }
            wifiInfo3 = wifiInfo;
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "815");
            com.ss.android.lark.log.Log.e("AppStrategyService", "upload terminal info early return. location flag:" + z3 + "\twifi flag:" + z2 + "\tin scope:" + z);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("location null:");
            if (simpleLocation == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            sb.append(z4);
            sb.append("\twifi null:");
            if (wifiInfo2 == null) {
                z5 = true;
            } else {
                z5 = false;
            }
            sb.append(z5);
            sb.append("\tlast wifi null:");
            if (wifiInfo3 == null) {
                z6 = true;
            } else {
                z6 = false;
            }
            sb.append(z6);
            sb.append("\tscan wifi empty:");
            if (list == null || list.size() < 1) {
                z7 = true;
            }
            sb.append(z7);
            java.lang.String string = sb.toString();
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyService", "817");
            com.ss.android.lark.log.Log.e("AppStrategyService", string);
            return;
        }
    }
}
