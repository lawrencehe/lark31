package com.ss.android.lark.appstrategy.service.impl;

/* loaded from: /tmp/larkdex/classes8.dex */
public class l implements c93.b {
    private static java.lang.String a;
    private static java.lang.String b;

    class b implements com.bytedance.ee.appstrategy.d {
        final /* synthetic */ com.ss.android.lark.openapi.a a;
        final /* synthetic */ android.app.Activity b;
        final /* synthetic */ android.content.Context c;
        final /* synthetic */ c93.a d;
        final /* synthetic */ java.lang.String e;
        final /* synthetic */ com.bytedance.ee.appstrategy.b f;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void c() {
            u83.b.b().openApplyVisibleActivity(this.b, this.e, this.f.d);
        }

        public void b(java.lang.String str) {
            u83.b.b().startChatActivityByChatterId(this.c, str);
        }

        public void onResult(boolean z) {
            com.ss.android.lark.openapi.a aVar;
            if (!z && (aVar = this.a) != null) {
                aVar.a();
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy$2", "149");
                com.ss.android.lark.log.Log.i("WebAppStateStrategy", "showDialog handle callBack");
            } else {
                if (z && !this.b.isDestroyed() && !this.b.isFinishing()) {
                    this.b.finish();
                    return;
                }
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy$2", "153");
                com.ss.android.lark.log.Log.i("WebAppStateStrategy", "handleOpenAppDataV1===\u300bshouldClose---" + z);
            }
        }

        public void a(java.lang.String str, java.lang.String str2) {
            this.d.d(this.e, str, str2);
        }

        b(com.ss.android.lark.openapi.a aVar, android.app.Activity activity, android.content.Context context, c93.a aVar2, java.lang.String str, com.bytedance.ee.appstrategy.b bVar) {
            this.a = aVar;
            this.b = activity;
            this.c = context;
            this.d = aVar2;
            this.e = str;
            this.f = bVar;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static com.ss.android.lark.appstrategy.service.impl.l h() {
        return com.ss.android.lark.appstrategy.service.impl.l.d.a;
    }

    private static final class d {
        private static final com.ss.android.lark.appstrategy.service.impl.l a = new com.ss.android.lark.appstrategy.service.impl.l();
    }

    class a implements po.e {
        final /* synthetic */ android.content.Context a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ c93.a c;
        final /* synthetic */ com.ss.android.lark.openapi.a d;

        public void onResult(java.lang.String str) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                int iOptInt = jSONObject.optInt("version", -1);
                int iOptInt2 = jSONObject.optInt("code", -1);
                java.lang.String strOptString = jSONObject.optString("content");
                if (iOptInt != com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper.DataVersion.V1.ordinal()) {
                    if (iOptInt != com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper.DataVersion.V2.ordinal()) {
                        com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.w("WebAppStateStrategy", new java.lang.Object[]{"open app data wrapper type undefined"});
                        return;
                    } else {
                        com.ss.android.lark.appstrategy.service.impl.l.this.j(this.a, iOptInt2, strOptString, this.d);
                        return;
                    }
                }
                com.ss.android.lark.appstrategy.service.impl.l.this.i(this.a, iOptInt2, strOptString, this.b, this.c, this.d);
            } catch (org.json.JSONException e) {
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy$1", "96");
                com.ss.android.lark.log.Log.e("WebAppStateStrategy", "open app data wrapper to json err", e);
            }
        }

        a(android.content.Context context, java.lang.String str, c93.a aVar, com.ss.android.lark.openapi.a aVar2) {
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = aVar2;
        }
    }

    class c implements po.d {
        final /* synthetic */ android.app.Activity a;
        final /* synthetic */ android.content.Context b;

        public void c(java.lang.String str, java.lang.String str2) {
            if (!this.a.isDestroyed() && !this.a.isFinishing()) {
                this.a.finish();
                u83.b.b().openApplyVisibleActivity(this.a, str, str2);
            }
        }

        public void d(java.lang.String str, java.lang.String str2) {
            if (!this.a.isDestroyed() && !this.a.isFinishing()) {
                this.a.finish();
            } else {
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy$3", "221");
                com.ss.android.lark.log.Log.i("WebAppStateStrategy", "finalActivity is missing");
            }
        }

        public void se(java.lang.String str, java.lang.String str2) {
            if (!this.a.isDestroyed() && !this.a.isFinishing()) {
                this.a.finish();
            }
        }

        c(android.app.Activity activity, android.content.Context context) {
            this.a = activity;
            this.b = context;
        }

        public void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            u83.b.b().openUrl(this.b, str3);
        }

        public void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            u83.b.b().startChatActivityByChatterId(this.b, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(android.app.Activity activity, po.c cVar, android.content.Context context) {
        com.bytedance.ee.appstrategy.e.b(activity, cVar, new com.ss.android.lark.appstrategy.service.impl.l.c(activity, context));
    }

    private boolean m(int i, java.lang.Object obj, android.app.Activity activity) {
        if (i == 0 && obj != null && activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            return true;
        }
        return false;
    }

    private void g(android.webkit.WebView webView, android.content.Context context, java.lang.String str, com.ss.android.lark.openapi.a aVar) {
        a = str;
        b = webView.getContext().toString();
        com.ss.android.lark.appstrategy.service.impl.AppStrategyService appStrategyServiceS = com.ss.android.lark.appstrategy.service.impl.AppStrategyService.s();
        appStrategyServiceS.b(str, true, new com.ss.android.lark.appstrategy.service.impl.l.a(context, str, appStrategyServiceS, aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(final android.content.Context context, int i, java.lang.String str, com.ss.android.lark.openapi.a aVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "180");
            com.ss.android.lark.log.Log.e("WebAppStateStrategy", "dialog data v2 null");
            if (aVar != null) {
                aVar.a();
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "183");
                com.ss.android.lark.log.Log.i("WebAppStateStrategy", "handleOpenAppDataV2 handle callBack");
                return;
            }
            return;
        }
        try {
            final po.c cVarA = po.c.a(new org.json.JSONObject(str));
            final android.app.Activity checkedBrowserActivity = u83.b.b().getCheckedBrowserActivity();
            java.lang.ref.WeakReference<yr1.d> webAppFragment = u83.b.b().getWebAppFragment(cVarA.a);
            if (i == 10000) {
                i = 0;
            }
            boolean zM = m(i, cVarA, checkedBrowserActivity);
            if (webAppFragment != null && webAppFragment.get() != null && webAppFragment.get().isActive()) {
                checkedBrowserActivity = webAppFragment.get().h();
            }
            if (!zM) {
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "207");
                com.ss.android.lark.log.Log.i("WebAppStateStrategy", "not need showDialog");
                if (aVar != null) {
                    aVar.a();
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "210");
                    com.ss.android.lark.log.Log.i("WebAppStateStrategy", "handleOpenAppDataV2 handle callBack");
                    return;
                }
                return;
            }
            com.larksuite.framework.thread.ThreadUtils.runOnUIThread(new java.lang.Runnable() { // from class: com.ss.android.lark.appstrategy.service.impl.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.l(checkedBrowserActivity, cVarA, context);
                }
            });
        } catch (org.json.JSONException e) {
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "191");
            com.ss.android.lark.log.Log.e("WebAppStateStrategy", "h5 recv", e);
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @Override // c93.b
    public void a(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, com.ss.android.lark.openapi.a aVar) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && webView != null && webView.getContext() != null) {
            if (str.equals(a) && android.text.TextUtils.equals(b, webView.getContext().toString())) {
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "76");
                com.ss.android.lark.log.Log.i("WebAppStateStrategy", "new ---same webView & appId");
                aVar.a();
                return;
            }
            g(webView, webView.getContext(), str, aVar);
            return;
        }
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "70");
        com.ss.android.lark.log.Log.e("WebAppStateStrategy", "new ---params is check fail");
        aVar.a();
    }

    @Override // c93.b
    public void b(android.webkit.WebView webView, android.content.Context context, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str2 = map.get("app_id");
        if (java.lang.Boolean.parseBoolean(map.get("is_Tab_Mode"))) {
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "51");
            com.ss.android.lark.log.Log.i("WebAppStateStrategy", "is tabMode,return");
            return;
        }
        if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str) && webView != null && webView.getContext() != null) {
            if (android.text.TextUtils.equals(str2, a) && android.text.TextUtils.equals(b, webView.getContext().toString())) {
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "61");
                com.ss.android.lark.log.Log.i("WebAppStateStrategy", "same webView & appId");
                return;
            } else {
                g(webView, context, str2, null);
                return;
            }
        }
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "56");
        com.ss.android.lark.log.Log.e("WebAppStateStrategy", "params is check fail");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final android.content.Context context, int i, java.lang.String str, final java.lang.String str2, final c93.a aVar, final com.ss.android.lark.openapi.a aVar2) {
        if (android.text.TextUtils.isEmpty(str)) {
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "118");
            com.ss.android.lark.log.Log.e("WebAppStateStrategy", "h5 v1 recv open app data content null");
            if (aVar2 != null) {
                aVar2.a();
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "121");
                com.ss.android.lark.log.Log.i("WebAppStateStrategy", "handle callBack success");
                return;
            }
            return;
        }
        final com.bytedance.ee.appstrategy.b bVarA = com.bytedance.ee.appstrategy.b.a(str);
        android.app.Activity checkedBrowserActivity = u83.b.b().getCheckedBrowserActivity();
        java.lang.ref.WeakReference<yr1.d> webAppFragment = u83.b.b().getWebAppFragment(str2);
        boolean zM = m(i, bVarA, checkedBrowserActivity);
        if (webAppFragment != null && webAppFragment.get() != null && webAppFragment.get().isActive()) {
            checkedBrowserActivity = webAppFragment.get().h();
        }
        final android.app.Activity activity = checkedBrowserActivity;
        if (!zM) {
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "135");
            com.ss.android.lark.log.Log.i("WebAppStateStrategy", "not need showDialog");
            if (aVar2 != null) {
                aVar2.a();
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "WebAppStateStrategy", "138");
                com.ss.android.lark.log.Log.i("WebAppStateStrategy", "handle callBack success");
                return;
            }
            return;
        }
        com.larksuite.framework.thread.ThreadUtils.runOnUIThread(new java.lang.Runnable() { // from class: com.ss.android.lark.appstrategy.service.impl.k
            @Override // java.lang.Runnable
            public final void run() {
                this.a.k(activity, bVarA, aVar2, context, aVar, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(android.app.Activity activity, com.bytedance.ee.appstrategy.b bVar, com.ss.android.lark.openapi.a aVar, android.content.Context context, c93.a aVar2, java.lang.String str) {
        com.bytedance.ee.appstrategy.e.a(activity, bVar, new com.ss.android.lark.appstrategy.service.impl.l.b(aVar, activity, context, aVar2, str, bVar));
    }
}
