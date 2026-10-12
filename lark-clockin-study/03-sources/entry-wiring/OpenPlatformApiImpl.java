package com.ss.android.lark.integrator.openplatform;

@com.bytedance.i18n.claymore.ClaymoreImpl(com.ss.android.lark.openplatform_api.IOpenPlatformApi.class)
/* loaded from: /tmp/larkdex/classes14.dex */
public class OpenPlatformApiImpl implements com.ss.android.lark.openplatform_api.IOpenPlatformApi {
    private final java.util.List<we6.a> mPreloadTasks = new java.util.ArrayList();
    final com.ss.android.lark.appcenter.wrapper.AppCenterModule appCenterModule = com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.e();
    private final com.ss.android.lark.gadget.provider.ILittleAppService littleAppService = com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i();
    int PRELOAD_FROM_APP_FEED = 1;
    int PRELOAD_FROM_CHAT_BOT = 2;

    class a implements java.lang.Runnable {
        @Override // java.lang.Runnable
        public void run() {
            new com.larksuite.component.card.component.res.LynxResourceFetcher().g();
        }

        a() {
        }
    }

    class i implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ android.widget.ImageView a;
        final /* synthetic */ android.widget.LinearLayout b;

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            android.view.ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.width = this.b.getWidth();
            layoutParams.height = this.b.getHeight();
            this.a.setLayoutParams(layoutParams);
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        i(android.widget.ImageView imageView, android.widget.LinearLayout linearLayout) {
            this.a = imageView;
            this.b = linearLayout;
        }
    }

    public void preloadWebAppTabPageData(android.content.Context context, java.lang.String str) {
    }

    private void logout() {
        ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "1223");
        com.ss.android.lark.log.Log.i("OpenPlatformApiImpl", "logout");
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().checkAndInit();
    }

    public com.larksuite.framework.launch.task.ILaunchTask getInitOPMonitorTask() {
        return new com.ss.android.lark.integrator.openplatform.InitOPMonitorTask();
    }

    public com.larksuite.framework.launch.task.ILaunchTask getInitOPMonitorTaskForSimple() {
        return new com.ss.android.lark.integrator.openplatform.InitOPMonitorTaskForSimple();
    }

    public com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler getLittleAppQRCodeScanResultHandler() {
        return new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.f();
    }

    public com.larksuite.framework.apiplugin.f getPlugin() {
        return new com.ss.android.lark.openplatform.plugin.ShareWebContentPlugin();
    }

    public com.ss.android.lark.openplatform_api.d getWebContainerHelper() {
        return new a05.a();
    }

    public void onPreTaskStart() {
        com.ss.android.lark.appstrategy.clockin.SpeedClockInManager.b.l();
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().checkAndInit();
    }

    public void registerAppStrategyOnlinePush() {
        com.ss.android.lark.appstrategy.clockin.SpeedClockInManager.b.q();
        com.ss.android.lark.integrator.appstrategy.AppStrategyModuleProvider.d().a().a();
    }

    public void showJsInspectorDialog() {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.ss.android.lark.integrator.openplatform.i
            @Override // java.lang.Runnable
            public final void run() {
                com.bytedance.ee.webapp.debug.a.a();
            }
        });
    }

    public void doPreloadTask() {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().doPreloadTask();
        preloadUniversalCardResources();
    }

    public com.larksuite.component.blockit.BlockitInstance getBlockitInstance() {
        return lx4.a.a();
    }

    public java.util.Map<? extends java.lang.String, ? extends java.lang.Boolean> getFeatureConfigMap() {
        return com.ss.android.lark.openplatform.OpenPlatformModule.w();
    }

    public okhttp3.OkHttpClient getOkHttpClient() {
        return com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().j();
    }

    public com.ss.android.lark.openapi.move.AbstractInjectWebViewDelegate getWebAppDelegate() {
        return com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().C().getWebAppDelegate();
    }

    public void initAppCenterModule() {
        com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.e().d();
    }

    public void initSdkRequestProcessor() {
        com.ss.android.lark.integrator.appstrategy.AppStrategyModuleProvider.d().f();
    }

    public void killAllProcess() {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().killAllProcess();
    }

    public void miniAppCheckAndInit() {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().checkAndInit();
    }

    public void preloadUniversalCardResources() {
        if (ne4.f.a().isCurrentEnable("openplatform.universalcard.js_fetch")) {
            com.larksuite.framework.thread.CoreThreadPool.getDefault().getCachedThreadPool().execute(new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.a());
        } else {
            ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "1474");
            com.ss.android.lark.log.Log.i("LynxResourceFetcher", "fg enable false");
        }
    }

    public void registerWebLifecycleListener() {
        com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.e().i();
    }

    public void unInitAppCenterModule() {
        com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.e().n();
    }

    public boolean useNewMessageAction() {
        return com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().Y();
    }

    public gx5.a getActiveAppInfoManager() {
        return hz4.a.a;
    }

    public java.util.Map<java.lang.String, java.lang.String> getAutoInitModuleConfigMap() {
        return un5.a.a;
    }

    public void getOpenPlatformModule() {
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i();
    }

    public java.util.Map<java.lang.String, java.lang.String> getThirdPartyModuleConfigMap() {
        return un5.a.b;
    }

    public java.util.Map<java.lang.String, java.lang.String> getThirdPartyPrefixModuleConfigMap() {
        return un5.a.c;
    }

    class d implements com.ss.android.lark.openplatform.ailab.OPAILabProxy.a {
        final /* synthetic */ com.larksuite.framework.callback.IGetDataCallback a;
        final /* synthetic */ android.content.Context b;
        final /* synthetic */ int c;

        public void onError(com.ss.android.lark.openplatform.ailab.ErrorResultWrapper errorResultWrapper) {
            java.lang.String str = "back subprocess. doCheckFace err, " + errorResultWrapper.a.getDebugMsg();
            ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl$3", "584");
            com.ss.android.lark.log.Log.e("AILabManager", str);
            this.a.onError(errorResultWrapper.a);
            com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().D(this.b, this.c);
        }

        public void onSuccess(java.lang.String str) {
            ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl$3", "575");
            com.ss.android.lark.log.Log.i("AILabManager", "back subprocess. doCheckFace onSuccess");
            this.a.onSuccess(str);
            com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().D(this.b, this.c);
        }

        d(com.larksuite.framework.callback.IGetDataCallback iGetDataCallback, android.content.Context context, int i) {
            this.a = iGetDataCallback;
            this.b = context;
            this.c = i;
        }
    }

    class e implements com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.ScanCodeActivity.k {
        final /* synthetic */ com.ss.android.lark.openplatform_api.IOpenPlatformApi.d a;

        class a implements com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.ScanCodeActivity.j {
            final com.ss.android.lark.openplatform_api.IOpenPlatformApi.c a;
            final /* synthetic */ int[] b;

            class c implements com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.ScanCodeActivity.l {
                final /* synthetic */ com.ss.android.lark.openplatform_api.IOpenPlatformApi.e a;

                public java.lang.String getText() {
                    return this.a.getText();
                }

                c(com.ss.android.lark.openplatform_api.IOpenPlatformApi.e eVar) {
                    this.a = eVar;
                }
            }

            public androidx.fragment.app.Fragment asFragment() {
                return this.a.asFragment();
            }

            class b implements com.ss.android.lark.openplatform_api.IOpenPlatformApi.b {
                final /* synthetic */ com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.ScanCodeActivity.i a;

                public boolean a(com.ss.android.lark.openplatform_api.IOpenPlatformApi.e eVar) {
                    return this.a.a(com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.e.a.this.d(eVar));
                }

                b(com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.ScanCodeActivity.i iVar) {
                    this.a = iVar;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.ScanCodeActivity.l d(com.ss.android.lark.openplatform_api.IOpenPlatformApi.e eVar) {
                return new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.e.a.c(eVar);
            }

            public void a(com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.ScanCodeActivity.i iVar) {
                if (iVar == null) {
                    this.a.b((com.ss.android.lark.openplatform_api.IOpenPlatformApi.b) null);
                } else {
                    this.a.b(new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.e.a.b(iVar));
                }
            }

            public void b(com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.ScanCodeActivity.h hVar) {
                if (hVar == null) {
                    this.a.a((com.ss.android.lark.openplatform_api.IOpenPlatformApi.a) null);
                } else {
                    this.a.a(new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.e.a.C0047a(hVar));
                }
            }

            /* renamed from: com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl$e$a$a, reason: collision with other inner class name */
            class C0047a implements com.ss.android.lark.openplatform_api.IOpenPlatformApi.a {
                final /* synthetic */ com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.ScanCodeActivity.h a;

                C0047a(com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.ScanCodeActivity.h hVar) {
                    this.a = hVar;
                }

                public android.view.View a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
                    return this.a.a(layoutInflater, viewGroup, bundle);
                }
            }

            a(int[] iArr) {
                this.b = iArr;
                this.a = com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.e.this.a.a(iArr);
            }
        }

        public com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.ScanCodeActivity.j a(int[] iArr) {
            return new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.e.a(iArr);
        }

        e(com.ss.android.lark.openplatform_api.IOpenPlatformApi.d dVar) {
            this.a = dVar;
        }
    }

    class f implements com.ss.android.lark.biz.core.api.IQRCodeScanResultHandler {
        f() {
        }

        public boolean d(java.lang.String str, com.ss.android.lark.biz.core.api.u uVar, int i) {
            int i2;
            if (i == 2) {
                i2 = 1012;
            } else if (i == 3) {
                i2 = 1013;
            } else {
                i2 = 1011;
            }
            return com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().u(str, uVar.getContext(), i2);
        }
    }

    class g implements com.ss.android.lark.openplatform.OpenPlatformModule.g {
        final /* synthetic */ pz3.a a;

        public void onFailed(java.lang.String str) {
        }

        public void onSuccess(java.util.List<pz3.b> list) {
            pz3.a aVar = this.a;
            if (aVar != null) {
                aVar.onSuccess(list);
            }
        }

        g(pz3.a aVar) {
            this.a = aVar;
        }

        public void a(java.util.List<pz3.b> list, java.util.List<pz3.b> list2) {
            pz3.a aVar = this.a;
            if (aVar != null) {
                aVar.a(list, list2);
            }
        }
    }

    class h implements com.ss.android.lark.openplatform.openapi.api.plugin.passport.e.d {
        final /* synthetic */ com.ss.android.lark.openplatform_api.e a;

        public void a(org.json.JSONObject jSONObject) {
            com.ss.android.lark.openplatform_api.e eVar = this.a;
            if (eVar != null) {
                eVar.a(jSONObject);
            }
        }

        public void onLoginSuccess(java.lang.String str) {
            com.ss.android.lark.openplatform_api.e eVar = this.a;
            if (eVar != null) {
                eVar.onLoginSuccess(str);
            }
        }

        h(com.ss.android.lark.openplatform_api.e eVar) {
            this.a = eVar;
        }
    }

    class j implements android.view.View.OnClickListener {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.util.Map c;
        final /* synthetic */ int d;
        final /* synthetic */ java.lang.String e;
        final /* synthetic */ java.lang.String f;

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.ss.android.lark.openplatform.appsetting.AppSettingActivity.b6(this.a, this.b, this.c, true, this.d, this.e, this.f, "");
        }

        j(android.content.Context context, java.lang.String str, java.util.Map map, int i, java.lang.String str2, java.lang.String str3) {
            this.a = context;
            this.b = str;
            this.c = map;
            this.d = i;
            this.e = str2;
            this.f = str3;
        }
    }

    public class k implements a83.b {
        public java.util.Map<java.lang.String, z73.d> e(android.content.Context context) {
            java.util.HashMap map = new java.util.HashMap();
            map.putAll(com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().e(context));
            map.putAll(com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().o(context));
            return map;
        }
    }

    public void afterAppOnCreate(final android.content.Context context) {
        ((com.ss.android.lark.biz.core.api.ICoreApi) com.ss.android.lark.utils.ApiUtils.getApi(com.ss.android.lark.biz.core.api.ICoreApi.class)).perfBoostBeginSection("init_mini_app");
        final com.bytedance.ee.lark.infra.sandbox.context.IAppContext iAppContextB = com.ss.android.lark.integrator.littleapp.b.b(context);
        ((com.ss.android.lark.biz.core.api.ICoreApi) com.ss.android.lark.utils.ApiUtils.getApi(com.ss.android.lark.biz.core.api.ICoreApi.class)).perfBoostEndSection();
        com.larksuite.framework.thread.CoreThreadPool.getDefault().getCachedThreadPool().execute(new java.lang.Runnable() { // from class: com.ss.android.lark.integrator.openplatform.k
            @Override // java.lang.Runnable
            public final void run() {
                com.ss.android.lark.integrator.openplatform.MiniAppProcessInitorImpl.g(context, iAppContextB);
            }
        });
        com.ss.android.lark.integrator.openplatform.MiniAppProcessInitorImpl.l(((com.ss.android.lark.passport_api.IPassportApi) com.ss.android.lark.utils.ApiUtils.getApi(com.ss.android.lark.passport_api.IPassportApi.class)).getDeviceId());
        com.ss.android.lark.integrator.openplatform.MiniAppProcessInitorImpl.f();
        oi6.f.c().u1(context);
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().t();
        com.ss.android.lark.integrator.openplatform.MiniAppProcessInitorImpl.e(context);
        com.ss.android.lark.integrator.openplatform.MiniAppProcessInitorImpl.b();
    }

    public com.ss.android.lark.maintab.export.k buildMiniAppTabBadgeHandler(com.ss.android.lark.maintab.export.TabAppInfo tabAppInfo) {
        return new com.ss.android.lark.gadget.container.tab.tabgadget.GadgetTabBadgeHandler(tabAppInfo);
    }

    public com.ss.android.lark.maintab.export.k buildWebAppTabBadgeHandler(com.ss.android.lark.maintab.export.TabAppInfo tabAppInfo) {
        return new com.bytedance.ee.webapp.mainTab.v2.WebTabBadgeHandler(tabAppInfo);
    }

    public boolean canOpen(java.lang.String str) {
        return com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().canOpen(str);
    }

    public boolean canOpenAppLink(java.lang.String str) {
        return com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().canOpenAppLink(str);
    }

    public void enterBotChatByBotId(java.lang.String str) {
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().j(new com.ss.android.lark.openplatform_api.a(str, com.ss.android.lark.openplatform_api.ID_TYPE.BOT_ID, true, "contact_home", com.ss.android.lark.biz.im.api.bundle.SourceType.PROFILE.value));
    }

    public com.ss.android.lark.openplatform_api.ChatModel getChatModelByTC(java.lang.String str) {
        com.ss.android.lark.openplatform.plus.f fVarS = com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().s(str);
        if (fVarS != null && fVarS.a() != null) {
            return new com.ss.android.lark.openplatform_api.ChatModel(fVarS.a().a(), fVarS.a().b(), fVarS.b().getValue());
        }
        ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "889");
        com.ss.android.lark.log.Log.e("OpenPlatformApiImpl", "trigger bean is null: ");
        return new com.ss.android.lark.openplatform_api.ChatModel();
    }

    public java.util.List<we6.a> getPreloadTasks(int i2) {
        if (com.ss.android.lark.featuregating.FeatureGatingModule.getFeatureGatingService().isEnable("open.platform.disable.preload.task")) {
            ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "1343");
            com.ss.android.lark.log.Log.i("OpenPlatformApiImpl", "preload tasks has been block by fg");
            return null;
        }
        if (this.mPreloadTasks.isEmpty()) {
            this.mPreloadTasks.add(new com.ss.android.lark.integrator.openplatform.task.b(i2));
        }
        return this.mPreloadTasks;
    }

    public int getScene(com.ss.android.lark.biz.core.api.UrlParams.Source source) {
        if (source == null) {
            return 1000;
        }
        if (source.getValue() == com.ss.android.lark.biz.core.api.UrlParams.Source.APP_CARD_GROUP.getValue()) {
            return 1010;
        }
        if (source.getValue() == com.ss.android.lark.biz.core.api.UrlParams.Source.APP_CARD_SINGLE.getValue()) {
            return 1009;
        }
        if (source.getValue() == com.ss.android.lark.biz.core.api.UrlParams.Source.APP_CARD_LINK_SINGLE.getValue()) {
            return 1007;
        }
        if (source.getValue() == com.ss.android.lark.biz.core.api.UrlParams.Source.APP_CARD_LINK_GROUP.getValue()) {
            return 1008;
        }
        if (source.getValue() == com.ss.android.lark.biz.core.api.UrlParams.Source.APP_P2P_CHAT.getValue()) {
            return 1009;
        }
        if (source.getValue() == com.ss.android.lark.biz.core.api.UrlParams.Source.APP_GROUP_CHAT.getValue()) {
            return 1010;
        }
        if (source.getValue() == com.ss.android.lark.biz.core.api.UrlParams.Source.APP_CARD_FOOTER_LINK.getValue()) {
            return 1511;
        }
        if (source.getValue() == com.ss.android.lark.biz.core.api.UrlParams.Source.APP_THREAD_TOPIC.getValue()) {
            return 1514;
        }
        if (source.getValue() == com.ss.android.lark.biz.core.api.UrlParams.Source.QR.getValue()) {
            return 1011;
        }
        if (source.getValue() == com.ss.android.lark.biz.core.api.UrlParams.Source.SCAN_CAMERA.getValue()) {
            return 1013;
        }
        if (source.getValue() != com.ss.android.lark.biz.core.api.UrlParams.Source.SCAN_PARSE.getValue()) {
            return 1000;
        }
        return 1012;
    }

    public void initCardEnv(android.content.Context context) {
        vp0.b.a(context);
    }

    public void initMiniApp(android.content.Context context) {
        com.ss.android.lark.integrator.littleapp.b.b(context);
    }

    public void initOpenPlatformModule(android.content.Context context) {
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().E(context);
    }

    public void initProcessorDoInit(java.lang.String str) {
        un5.b.a(str);
    }

    public void initWebAppP0(android.content.Context context) {
        com.ss.android.lark.integrator.littleapp.b.c(context);
    }

    public boolean isLynxCard(com.bytedance.lark.pb.basic.v1.CardContent cardContent) {
        return bh5.a.a(cardContent);
    }

    public boolean isMiniProcess(android.content.Context context) {
        return com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().p(context);
    }

    public void notifyAppStrategyOnLoginStatusChanged(boolean z) {
        com.ss.android.lark.appstrategy.clockin.SpeedClockInManager.b.m(z);
        if (z) {
            com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().checkAndInit();
        } else {
            logout();
        }
    }

    public boolean onAppIntercpte(android.content.Context context) {
        return com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().L(context);
    }

    public void openDebugPanel(android.content.Context context) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().openDebugPanel(context);
    }

    public void preloadAppCenterData(android.content.Context context) {
        com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.e().g(context);
    }

    public void preloadAppCenterTabPageView(android.app.Activity activity) {
        com.ss.android.lark.integrator.appcenter.AppCenterModuleProvider.e().h(activity);
    }

    public void preloadBotChatLittleApp(android.content.Context context) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().C(context, 4, "chat_bot_create");
    }

    public void preloadCardLittleApp(android.content.Context context) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().C(context, 2, "message_card_show");
    }

    public void preloadLittleAppAfterRenderCrash(android.content.Context context) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().C(context, 2003, "from_after_render_crash");
    }

    public void preloadProcessFromFeed(int i2) {
        if (i2 == this.PRELOAD_FROM_APP_FEED) {
            com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().C(com.ss.android.lark.utils.LarkContext.getApplication(), 5, "app_feed");
        } else {
            com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().C(com.ss.android.lark.utils.LarkContext.getApplication(), 3, "chat_bot_clicked");
        }
    }

    public void preloadProcessFromMessageCard(android.content.Context context) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().C(context, 2, "msg_card");
    }

    public void preloadProcessFromQR(android.content.Context context) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().C(context, 6, "qr_scan");
    }

    public void preloadWebAppTabPageView(android.content.Context context) {
        if (com.ss.android.lark.featuregating.FeatureGatingModule.getFeatureGatingService().isEnable("open.platform.web.app.preload.view")) {
            com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().O(context);
        }
    }

    public void registerMetaUpdateListener(yo1.a aVar) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().registerMetaUpdateListener(aVar);
    }

    public void registerQRCodeScannerFactory(com.ss.android.lark.openplatform_api.IOpenPlatformApi.d dVar) {
        com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.ScanCodeActivity.h4(new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.e(dVar));
    }

    public void reportEnterChatCardRenderTiming(com.ss.android.lark.openplatform_api.b bVar) {
        if (bVar == null) {
            return;
        }
        com.larksuite.component.card.monitor.UniversalCardMonitorUtils.a.i(new com.larksuite.component.card.monitor.d(bVar.a(), bVar.e(), bVar.d(), bVar.c(), bVar.b(), bVar.f()));
    }

    public void reportRecentlyWebApp(java.lang.String str) {
        this.appCenterModule.k(str);
    }

    public void setRustInit(boolean z) {
        en0.a.p(z);
        pn0.i.d(z);
    }

    public void startChatWindowByOpenData(com.ss.android.lark.openplatform_api.a aVar) {
        com.ss.android.lark.openplatform.OpenPlatformModule.v().startChatWindowByOpenData(aVar);
    }

    public void triggerRefreshCache(com.ss.android.lark.chat.entity.chat.Chat chat) {
        boolean z;
        if (chat != null && !chat.isSecret()) {
            com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().X(new com.ss.android.openbusiness.data.AppShortCutChatData(chat.isCrossWithKa(), chat.isCrossTenant(), chat.isP2PChat(), chat.isGroup(), chat.getId(), chat.getName(), chat.getAvatarKey()));
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("chat null or secret not refresh cache: ");
        if (chat == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        java.lang.String string = sb.toString();
        ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "1067");
        com.ss.android.lark.log.Log.e("OpenPlatformApiImpl", string);
    }

    class b implements com.ss.android.lark.openplatform.openapi.component.photo.PhotoPreviewActivity.c {
        b(bb3.b bVar) {
        }

        public void a(int i, java.lang.String str) {
            throw null;
        }
    }

    class c implements com.ss.android.lark.openplatform.openapi.component.photo.PhotoPreviewActivity.c {
        final /* synthetic */ bb3.c a;

        c(bb3.c cVar) {
            this.a = cVar;
        }

        public void a(int i, java.lang.String str) {
            this.a.a(i, str);
        }
    }

    private void openMiniApp(android.content.Context context, java.lang.String str) {
        this.littleAppService.openAppBrand(context, str, 1000);
    }

    private void startAppDetailFloatWindow(java.lang.String str, boolean z) {
        zz6.g.c cVarA = zz6.g.b().a();
        startAppDetailFloatWindow(str, cVarA.a(), cVarA.b(), z);
    }

    public void checkGadgetUpdateAndDownload(android.content.Context context, java.lang.String str) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().checkGadgetUpdateAndDownload(context, str);
    }

    public void enterBotChatByBotIdFromSearch(java.lang.String str, boolean z) {
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().j(new com.ss.android.lark.openplatform_api.a(str, com.ss.android.lark.openplatform_api.ID_TYPE.BOT_ID, z, "search", com.ss.android.lark.biz.im.api.bundle.SourceType.SEARCH.value));
    }

    public void getAsyncGadgetPlusItems(com.ss.android.lark.chat.entity.chat.Chat chat, pz3.a aVar) {
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().q(new com.ss.android.openbusiness.data.AppShortCutChatData(chat.isCrossWithKa(), chat.isCrossTenant(), chat.isP2PChat(), chat.isGroup(), chat.getId(), chat.getName(), chat.getAvatarKey()), new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.g(aVar));
    }

    public void getChatIdByOpenChatId(java.lang.String str, com.larksuite.framework.callback.IGetDataCallback<java.lang.String> iGetDataCallback) {
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().t(str, iGetDataCallback);
    }

    public com.ss.android.lark.lynxkit.bridge.ILynxBridgeMethodDispatcher getOpLynxBridgeMethodDispatcher(com.bytedance.ee.lark.infra.sandbox.context.IAppContext iAppContext, boolean z) {
        return new f16.a(iAppContext, z);
    }

    public void getThreadIdByOpenThreadId(java.lang.String str, com.larksuite.framework.callback.IGetDataCallback<java.lang.String> iGetDataCallback) {
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().A(str, iGetDataCallback);
    }

    public java.util.List<java.lang.String> getTriggerMessageIds(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.ss.android.lark.openplatform.plus.g gVarE = com.ss.android.lark.openplatform.plus.TriggerCodeManager.c.a().e(str, str2);
        if (gVarE != null) {
            arrayList.addAll(gVarE.c());
        }
        java.lang.String str3 = "getTriggerMessageIds: " + android.text.TextUtils.join(", ", arrayList);
        ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "1425");
        com.ss.android.lark.log.Log.i("OpenPlatformApiImpl", str3);
        return arrayList;
    }

    public void handleFinish(android.content.Context context, java.lang.String str) {
        this.littleAppService.handleFinish(context, str);
    }

    public void insertAilabThreeElement(java.lang.String str, com.larksuite.framework.callback.IGetDataCallback<java.lang.String> iGetDataCallback) {
        com.ss.android.lark.openplatform.ailab.AILabManager.k(str, iGetDataCallback);
    }

    public boolean openAppBrandFromMain(android.content.Context context, java.lang.String str) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().openAppBrand(context, str, 1001);
        return true;
    }

    public void openBulletSchema(android.content.Context context, java.lang.String str) {
        ((com.ss.android.lark.biz.im.api.IIMApi) com.ss.android.lark.utils.ApiUtils.getApi(com.ss.android.lark.biz.im.api.IIMApi.class)).openBulletSchema(context, str);
    }

    public boolean openChooseChat(android.content.Context context, android.os.Bundle bundle) {
        return this.littleAppService.i(context, bundle);
    }

    public void openCreateActionMiniApp(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        if (((com.ss.android.lark.passport_api.IPassportApi) com.ss.android.lark.utils.ApiUtils.getApi(com.ss.android.lark.passport_api.IPassportApi.class)).envType() == 2) {
            str2 = "cli_9d230f08c66b5101";
        } else if (!((com.ss.android.lark.passport_api.IPassportApi) com.ss.android.lark.utils.ApiUtils.getApi(com.ss.android.lark.passport_api.IPassportApi.class)).isChinaMainlandGeo()) {
            str2 = "cli_9d3bb7fdac38d106";
        } else {
            str2 = "cli_9d0efd483037d108";
        }
        openMiniApp(context, java.lang.String.format("sslocal://microapp?app_id=%s&start_page=%s", str2, str));
    }

    public void openH5AppAboutActivity(android.content.Context context, java.lang.String str) {
        com.ss.android.lark.openplatform.appsetting.AppSettingActivity.b6(context, str, new java.util.HashMap(), true, com.ss.android.lark.openplatform_api.Scene.H5.getValue(), "", "", "");
    }

    public boolean openLittleAppFromMain(android.content.Context context, android.os.Bundle bundle) {
        java.lang.String string = bundle.getString("appId");
        java.lang.String string2 = bundle.getString("schema");
        java.lang.String string3 = bundle.getString("last_notification_seq_id");
        if (android.text.TextUtils.isEmpty(string)) {
            ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "605");
            com.ss.android.lark.log.Log.e("OpenPlatformApiImpl", "appId is null!");
            return false;
        }
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().u(context, string, string2, 1002, string3);
        return true;
    }

    public void openMiniAppByUriFromSearch(android.content.Context context, java.lang.String str) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().u(str, context, 1005);
    }

    public void openVoteMiniApp(android.content.Context context, java.lang.String str) {
        openMiniApp(context, "sslocal://microapp?app_id=tt26b3500eb9998b36&start_page=pages/vote-index/index?groupid=" + str);
    }

    public void preloadCardLittleApp(android.content.Context context, java.util.List<java.lang.String> list) {
        preloadCardLittleApp(context);
        ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "252");
        com.ss.android.lark.log.Log.i("OpenPlatformApiImpl", "preloadCardLittleApp with app_ids: " + list);
    }

    public void preloadProcessFromFirstScreenShow(android.content.Context context, com.larksuite.framework.callback.IGetDataCallback<java.lang.Boolean> iGetDataCallback) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().m(context, 8, "first_screen_show", iGetDataCallback);
    }

    public void preloadProcessFromLarkIdle(android.content.Context context, com.larksuite.framework.callback.IGetDataCallback<java.lang.Boolean> iGetDataCallback) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().m(context, 9, "lark_idle", iGetDataCallback);
    }

    public void preloadProcessFromMessageCard(android.content.Context context, java.util.List<java.lang.String> list) {
        preloadProcessFromMessageCard(context);
    }

    public void preloadTabPageData(android.content.Context context, java.lang.String str) {
        if (com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n() != null) {
            com.tt.refer.common.base.AppType appTypeK = com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().k();
            com.tt.refer.common.base.AppType appType = com.tt.refer.common.base.AppType.GadgetAPP;
            if (appType == appTypeK || com.tt.refer.common.base.AppType.WebGadgetAPP == appTypeK) {
                nr4.h.h().getMainDependency().notifyBootMileStoneFirstDataLoaded(str);
            }
            if (appType == appTypeK) {
                hn4.c.j().i();
                com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().checkAndInit();
                com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.d("OpenPlatformApiImpl", new java.lang.Object[]{"preloadTabPageData"});
                com.ss.android.lark.gadget.appmodel.sandbox.manager.a.k().f(com.ss.android.lark.gadget.appmodel.sandbox.manager.api.IAppSandboxEnvManagerService.SandBoxEnvType.MAIN_PROCESS).preloadEmptySandboxEnv();
            }
        }
    }

    public void reportRecentlyMiniApp(java.lang.String str, java.lang.String str2) {
        this.appCenterModule.j(str, str2);
    }

    public void requestAvatarAppList(android.content.Context context, com.larksuite.framework.callback.IGetDataCallback<java.lang.String> iGetDataCallback) {
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().U(context, iGetDataCallback);
    }

    public void requestUseEcoNetworkSimple(com.bytedance.lark.pb.basic.v1.SendHttpRequest.a aVar, com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.basic.v1.SendHttpResponse> iGetDataCallback) {
        com.ss.android.openbusiness.net.Service.g(aVar, iGetDataCallback);
    }

    public void retryDownloadGadgetApp(android.content.Context context, java.lang.String str) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().retryDownloadGadgetApp(context, str);
    }

    public void startMiniProgramActivity(android.content.Context context, java.lang.String str) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().x(context, str, 1001);
    }

    public void unRegisterProps(java.lang.String str, com.larksuite.component.blockit.props.a aVar) {
        lx4.a.a().t(str, aVar);
    }

    private void openH5Page(android.content.Context context, java.lang.String str, java.lang.String str2) {
        ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "909");
        com.ss.android.lark.log.Log.i("OpenPlatformApiImpl", "openApplyVisibleActivity() called with: context = [" + context + "], appId = [" + str + "]");
        java.lang.String domain = jc4.b.a().getDomain("open_appstore");
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https").authority(domain).appendPath("napi").appendPath("app-apply");
        if (!android.text.TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter("botId", str2);
        } else {
            builder.appendQueryParameter("appId", str);
        }
        java.lang.String string = builder.build().toString();
        ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "929");
        com.ss.android.lark.log.Log.i("OpenPlatformApiImpl", "openApplyVisibleActivity url: " + string);
        com.ss.android.lark.biz.core.api.UrlParams urlParamsD = com.ss.android.lark.biz.core.api.UrlParams.a().V(string).D();
        if (com.larksuite.framework.utils.d0.h(context)) {
            ((com.ss.android.lark.biz.core.api.ICoreApi) com.ss.android.lark.utils.ApiUtils.getApi(com.ss.android.lark.biz.core.api.ICoreApi.class)).openUrl(context, urlParamsD);
        } else {
            c36.a.e((android.app.Activity) context, string, (java.lang.String) null);
        }
    }

    public void doCheckFace(android.app.Activity activity, final java.lang.String str, final com.larksuite.framework.callback.IGetDataCallback<java.lang.String> iGetDataCallback) {
        final android.content.Context context = u83.b.b().getContext();
        if (com.larksuite.framework.utils.d0.h(context)) {
            ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "554");
            com.ss.android.lark.log.Log.i("AILabManager", "doCheckFace in main process");
            com.ss.android.lark.openplatform.ailab.AILabManager.f(activity, str, iGetDataCallback);
        } else {
            ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "559");
            com.ss.android.lark.log.Log.i("AILabManager", "doCheckFace in subprocess");
            final int taskId = activity.getTaskId();
            com.larksuite.framework.thread.CoreThreadPool.getDefault().getFixedThreadPool().submit(new java.lang.Runnable() { // from class: com.ss.android.lark.integrator.openplatform.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$doCheckFace$2(context, str, iGetDataCallback, taskId);
                }
            });
        }
    }

    public void enterBotChatByChatIdFromSearch(java.lang.String str, boolean z, int i2) {
        com.ss.android.lark.openplatform_api.a aVar = new com.ss.android.lark.openplatform_api.a(str, com.ss.android.lark.openplatform_api.ID_TYPE.CHAT_ID, z, "search", com.ss.android.lark.biz.im.api.bundle.SourceType.SEARCH.value);
        aVar.i(i2);
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().j(aVar);
    }

    public void getBotNameById(java.lang.String str, java.lang.String str2, com.larksuite.framework.callback.IGetDataCallback<java.lang.String> iGetDataCallback) {
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().r(str, str2, iGetDataCallback);
    }

    public void miniAppLogin(android.content.Context context, java.lang.String str, com.ss.android.lark.openplatform_api.e eVar) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().t(context, str, new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.h(eVar));
    }

    public void monitorDuration(java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) throws org.json.JSONException {
        com.ss.android.lark.integrator.littleapp.l.d().g(str, jSONObject, null);
    }

    public void openAppBrand(android.content.Context context, java.lang.String str, int i2) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().openAppBrand(context, str, i2);
    }

    public boolean openAppBrandFromMain(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().I(context, str, str2, 1001);
        return true;
    }

    public void openApplyVisibleActivity(android.content.Context context, java.lang.String str, java.lang.String str2) {
        appLyVisible(context, str, "", str2);
    }

    public void openTicketMiniApp(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.UnsupportedEncodingException {
        java.lang.String helpdeskMiniProgramAppId = kz4.b.E().D().getHelpdeskMiniProgramAppId();
        java.lang.String strEncode = java.lang.String.format("pages/mobile/index?chat_id=%s&locale=%s", str, str2);
        try {
            strEncode = java.net.URLEncoder.encode(strEncode, "UTF-8");
        } catch (java.io.UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        openMiniApp(context, java.lang.String.format("sslocal://microapp?app_id=%s&start_page=%s", helpdeskMiniProgramAppId, strEncode));
    }

    public boolean openUrl(android.content.Context context, java.lang.String str, int i2) {
        return com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().openUrl(context, str, i2);
    }

    public void restartGadgetApp(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().restartGadgetApp(context, str, str2);
    }

    public void startAppDetailActivity(android.content.Context context, java.lang.String str, boolean z) {
        if (com.ss.android.lark.desktopmode.utils.DesktopUtil.k(context)) {
            startAppDetailFloatWindow(str, z);
        } else {
            com.ss.android.lark.openplatform.appdetail.AppProfileActivity.M3(context, str, z);
        }
    }

    public void startMiniProgramActivity(android.content.Context context, java.lang.String str, int i2) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().x(context, str, i2);
    }

    public void startScanQRCodeActivity(int[] iArr, boolean z, final com.larksuite.framework.callback.IGetDataCallback<java.lang.String> iGetDataCallback) {
        int[] iArr2 = new int[iArr.length];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().v(com.ss.android.lark.utils.LarkContext.getApplication(), iArr2, z, new com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.c() { // from class: com.ss.android.lark.integrator.openplatform.f
            public final boolean a(android.content.Context context, java.lang.String str, int i2) {
                return com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.lambda$startScanQRCodeActivity$0(iGetDataCallback, context, str, i2);
            }
        });
    }

    private void appLyVisible(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "895");
        com.ss.android.lark.log.Log.i("OpenPlatformApiImpl", "appLyVisible() called with: context = [" + context + "], appId = [" + str + "], botId = [" + str2 + "], appName = [" + str3 + "]");
        openH5Page(context, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doCheckFace$2(android.content.Context context, java.lang.String str, com.larksuite.framework.callback.IGetDataCallback iGetDataCallback, int i2) {
        try {
            com.ss.android.lark.openplatform.ailab.OPAILabProxy oPAILabProxy = (com.ss.android.lark.openplatform.ailab.OPAILabProxy) sx7.b.f().c(context, com.ss.android.lark.openplatform.ailab.OPAILabProxy.class);
            if (oPAILabProxy == null) {
                ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "567");
                com.ss.android.lark.log.Log.e("AILabManager", "doCheckFace get ipc service failed");
            } else {
                ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "570");
                com.ss.android.lark.log.Log.i("AILabManager", "doCheckFace get ipc service");
                oPAILabProxy.doCheckFace(str, new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.d(iGetDataCallback, context, i2));
            }
        } catch (java.lang.Throwable th) {
            ks7.c.d("modules/biz/openplatform/openplatform-assembly/", "OpenPlatformApiImpl", "593");
            com.ss.android.lark.log.Log.e("OpenPlatformApiImpl", "Throwable", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$startScanQRCodeActivity$0(com.larksuite.framework.callback.IGetDataCallback iGetDataCallback, android.content.Context context, java.lang.String str, int i2) {
        if (iGetDataCallback == null) {
            return false;
        }
        iGetDataCallback.onSuccess(str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$startScanQRCodeActivity$1(com.larksuite.framework.callback.IGetDataCallback iGetDataCallback, android.content.Context context, java.lang.String str, int i2) {
        if (iGetDataCallback == null) {
            return false;
        }
        iGetDataCallback.onSuccess(str);
        return true;
    }

    private static void startAppDetailFloatWindow(java.lang.String str, int i2, int i3, boolean z) {
        com.ss.android.lark.desktopmode.base.FloatWindowParams floatWindowParamsL = new com.ss.android.lark.desktopmode.base.FloatWindowParams.b(com.ss.android.lark.desktopmode.base.DesktopConstants.UIType.FLOAT_POPOVER_P1).m(i2, i3).n("AppDetailFragment").l();
        com.ss.android.lark.openplatform.appdetail.AppProfileFragment appProfileFragment = new com.ss.android.lark.openplatform.appdetail.AppProfileFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("id", str);
        bundle.putBoolean("is_app", z);
        appProfileFragment.setArguments(bundle);
        i94.a.e().b(appProfileFragment, floatWindowParamsL);
    }

    public void checkAppStateStrategy(android.webkit.WebView webView, android.content.Context context, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        com.ss.android.lark.integrator.appstrategy.AppStrategyModuleProvider.d().c().b(webView, context, str, map);
    }

    public void doActions(android.content.Context context, com.larksuite.component.blockit.entity.ActionType actionType, com.larksuite.component.blockit.entity.BlockEntity blockEntity, com.larksuite.component.blockit.entity.BlockExtra blockExtra) {
        lx4.a.a().a(context, actionType, blockEntity, blockExtra);
    }

    public void generateBlockID(com.larksuite.component.blockit.entity.Domain domain, java.lang.String str, com.larksuite.component.blockit.entity.BlockTypeID blockTypeID, com.larksuite.framework.callback.IGetDataCallback<java.lang.String> iGetDataCallback) {
        lx4.a.a().c(domain, str, blockTypeID, iGetDataCallback);
    }

    public void generateBlockIDFromLocal(com.larksuite.component.blockit.entity.Domain domain, java.lang.String str, com.larksuite.component.blockit.entity.BlockTypeID blockTypeID, com.larksuite.framework.callback.IGetDataCallback<java.lang.String> iGetDataCallback) {
        lx4.a.a().d(domain, str, blockTypeID, iGetDataCallback);
    }

    public void monitorEvent(java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3) throws org.json.JSONException {
        com.ss.android.lark.integrator.littleapp.l.d().i(str, jSONObject, jSONObject2, jSONObject3);
    }

    public boolean openAppBrandFromLauncher(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().openAppBrandFromLauncher(context, str, str2, str3);
        return true;
    }

    public void openAppBrandFromSearch(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().o(com.ss.android.lark.utils.LarkContext.getApplication(), str, str2, str3, 1005, str4);
    }

    public void openBotUsePermissionPage(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        appLyVisible(context, str, str2, str3);
    }

    public void openLittleAppFromFeed(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().u(context, str, str2, 1002, str3);
    }

    public void openMessageAction(android.content.Context context, java.lang.String str, java.util.List<java.lang.String> list, java.util.List<java.lang.Integer> list2) {
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().N(context, list, list2, str);
    }

    public void startPreviewImage(androidx.fragment.app.Fragment fragment, java.util.List<com.ss.android.lark.biz.core.api.browser.PreviewRequest> list, int i2, bb3.b bVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.ss.android.lark.biz.core.api.browser.PreviewRequest previewRequest : list) {
            arrayList.add(new com.ss.android.lark.openplatform.infra.network.glide.GlideRequest(previewRequest.url, previewRequest.header, previewRequest.method, previewRequest.body));
        }
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().y(fragment, arrayList, i2, new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.b(bVar));
    }

    public void startPreviewImageV2(androidx.fragment.app.Fragment fragment, java.util.List<com.ss.android.lark.biz.core.api.browser.PreviewV2Request> list, int i2, bb3.c cVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.ss.android.lark.biz.core.api.browser.PreviewV2Request previewV2Request : list) {
            arrayList.add(new com.ss.android.lark.openplatform.infra.network.glide.GlideRequest(previewV2Request.url, previewV2Request.header, previewV2Request.method, previewV2Request.body));
        }
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().y(fragment, arrayList, i2, new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.c(cVar));
    }

    public void startScanQRCodeActivity(android.content.Context context, int[] iArr, boolean z, final com.larksuite.framework.callback.IGetDataCallback<java.lang.String> iGetDataCallback) {
        int[] iArr2 = new int[iArr.length];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().v(context, iArr2, z, new com.ss.android.lark.openplatform.openapi.api.plugin.scancode.impl.c() { // from class: com.ss.android.lark.integrator.openplatform.j
            public final boolean a(android.content.Context context2, java.lang.String str, int i2) {
                return com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.lambda$startScanQRCodeActivity$1(iGetDataCallback, context2, str, i2);
            }
        });
    }

    public void checkAppStateStrategy(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, com.ss.android.lark.openapi.a aVar) {
        com.ss.android.lark.integrator.appstrategy.AppStrategyModuleProvider.d().c().a(webView, str, str2, aVar);
    }

    public android.view.View getPopupWindowAppInfoBar(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2) {
        return getPopupWindowAppInfoBar(context, str, str2, str3, "", "", i2, new java.util.HashMap());
    }

    public void openLittleAppFromFeed(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i().o(context, str, str2, str3, 1002, str4);
    }

    public void registerProps(java.lang.String str, android.view.ViewGroup viewGroup, com.larksuite.component.blockit.props.e eVar, com.larksuite.component.blockit.entity.BlockExtra blockExtra, com.larksuite.component.blockit.props.a aVar) {
        lx4.a.a().p(str, viewGroup, eVar, blockExtra, aVar);
    }

    public void syncAuth(android.content.Context context, java.lang.String str, java.lang.String str2, com.tt.refer.common.base.AppType appType, java.lang.Object obj) {
        com.ss.android.lark.gadget.provider.ILittleAppService iLittleAppServiceI = com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider.n().i();
        if (obj instanceof com.ss.android.lark.openplatform.common.permission.j) {
            iLittleAppServiceI.l(context, str, str2, appType, (com.ss.android.lark.openplatform.common.permission.j) obj);
        }
    }

    public boolean tryOpenFilePreviewActivity(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        return this.littleAppService.F(activity, new com.ss.android.lark.openplatform.openapi.api.entity.RouteDriveSDKModel(str, str2, str3, z));
    }

    public void previewCard(android.content.Context context, java.util.List<java.lang.String> list, com.bytedance.lark.pb.basic.v1.CardContent cardContent, boolean z, java.lang.String str, final com.ss.android.lark.openplatform_api.c cVar) {
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().R(context, list, cardContent, z, new com.ss.android.lark.openplatform.OpenPlatformModule.h() { // from class: com.ss.android.lark.integrator.openplatform.g
            public final void a(boolean z2, boolean z3, java.lang.String str2) {
                cVar.a(z2, z3, str2);
            }
        });
    }

    public com.larksuite.component.blockit.entity.BlockEntity generateBlock(java.lang.String str, com.larksuite.component.blockit.entity.BlockTypeID blockTypeID, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return lx4.a.a().b(str, blockTypeID, str2, str3, str4, str5, str6);
    }

    public void previewCard(android.content.Context context, java.lang.String str, java.lang.String str2, com.bytedance.lark.pb.basic.v1.CardContent cardContent, boolean z, java.lang.String str3, final com.ss.android.lark.openplatform_api.c cVar) {
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().Q(context, str, str2, cardContent, z, str3, new com.ss.android.lark.openplatform.OpenPlatformModule.h() { // from class: com.ss.android.lark.integrator.openplatform.l
            public final void a(boolean z2, boolean z3, java.lang.String str4) {
                cVar.a(z2, z3, str4);
            }
        });
    }

    public android.view.View getPopupWindowAppInfoBar(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i2, java.util.Map<java.lang.String, java.lang.String> map) {
        android.view.View viewInflate = android.view.View.inflate(context, 2131496842, null);
        if (android.text.TextUtils.isEmpty(str2)) {
            viewInflate.setVisibility(4);
            viewInflate.setClickable(false);
            return viewInflate;
        }
        viewInflate.setVisibility(0);
        viewInflate.setClickable(true);
        android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(2131318244);
        if (textView != null) {
            textView.setText(str2);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) viewInflate.findViewById(2131306616);
        if (imageView != null && !android.text.TextUtils.isEmpty(str3)) {
            com.ss.android.lark.image.ImageLoader.with(context).load(str3).isAsync(true).into(imageView);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewInflate.findViewById(2131317414);
        if (linearLayout != null) {
            android.widget.ImageView imageView2 = (android.widget.ImageView) viewInflate.findViewById(2131297942);
            if (imageView2 != null && wr1.h.a(context)) {
                imageView2.setImageDrawable(context.getDrawable(2131231264));
            }
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.i(imageView2, linearLayout));
            int iDip2Px = (int) com.bytedance.common.utility.UIUtils.dip2Px(context, 4.0f);
            com.bytedance.common.utility.UIUtils.expandClickRegion(linearLayout, iDip2Px, iDip2Px, iDip2Px, iDip2Px);
            linearLayout.setOnClickListener(new com.ss.android.lark.integrator.openplatform.OpenPlatformApiImpl.j(context, str, map, i2, str4, str5));
        }
        return viewInflate;
    }

    public void openAddGroupBotPage(android.content.Context context, java.lang.String str, boolean z, boolean z2, com.ss.android.lark.chat.entity.chat.Chat.Type type, int i2, java.util.HashMap<java.lang.Long, com.ss.android.lark.chat.entity.chat.AutoMuteConfig> map, boolean z3) {
        com.ss.android.lark.integrator.openplatform.OpenPlatformModuleProvider.i().M(context, str, z, z2, new com.ss.android.openbusiness.bot.statistics.GroupBotStatistics.a(str, type, i2, com.ss.android.openbusiness.bot.statistics.GroupBotStatistics.OpenSource.AUTO_MUTE_BANNER, map, z3));
    }

    public void startAppSettingActivity(android.content.Context context, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z, int i2, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.ss.android.lark.openplatform.appsetting.AppSettingActivity.b6(context, str, map, z, i2, str2, str3, str4);
    }
}
