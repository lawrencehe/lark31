package com.ss.android.lark.appstrategy.service.impl;

/* loaded from: /tmp/larkdex/classes8.dex */
class i {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static com.ss.android.lark.appstrategy.service.impl.i a() {
        return com.ss.android.lark.appstrategy.service.impl.i.d.a;
    }

    private static final class d {
        private static final com.ss.android.lark.appstrategy.service.impl.i a = new com.ss.android.lark.appstrategy.service.impl.i(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private i() {
    }

    class a implements com.ss.android.lark.appstrategy.service.IAppStrategyManisService.a {
        final /* synthetic */ com.larksuite.framework.callback.IGetDataCallback a;

        @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.a
        public void onError(com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper errorResultWrapper) {
            com.larksuite.framework.callback.IGetDataCallback iGetDataCallback = this.a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResultWrapper.a);
            } else {
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SdkRequestProcessor$1", "46");
                com.ss.android.lark.log.Log.w("SdkRequestProcessor", "callback null");
            }
        }

        @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.a
        public void onSuccess(com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper successResultWrapper) {
            com.larksuite.framework.callback.IGetDataCallback iGetDataCallback = this.a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(successResultWrapper.a);
            } else {
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SdkRequestProcessor$1", "37");
                com.ss.android.lark.log.Log.w("SdkRequestProcessor", "callback null");
            }
        }

        a(com.larksuite.framework.callback.IGetDataCallback iGetDataCallback) {
            this.a = iGetDataCallback;
        }
    }

    class b implements com.ss.android.lark.appstrategy.service.IAppStrategyManisService.a {
        final /* synthetic */ com.larksuite.framework.callback.IGetDataCallback a;

        @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.a
        public void onError(com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper errorResultWrapper) {
            com.larksuite.framework.callback.IGetDataCallback iGetDataCallback = this.a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResultWrapper.a);
            } else {
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SdkRequestProcessor$2", "85");
                com.ss.android.lark.log.Log.w("SdkRequestProcessor", "callback null");
            }
        }

        @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.a
        public void onSuccess(com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper successResultWrapper) {
            com.larksuite.framework.callback.IGetDataCallback iGetDataCallback = this.a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(successResultWrapper);
            } else {
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SdkRequestProcessor$2", "76");
                com.ss.android.lark.log.Log.w("SdkRequestProcessor", "callback null");
            }
        }

        b(com.larksuite.framework.callback.IGetDataCallback iGetDataCallback) {
            this.a = iGetDataCallback;
        }
    }

    class c implements com.ss.android.lark.appstrategy.service.IAppStrategyManisService.a {
        final /* synthetic */ com.larksuite.framework.callback.IGetDataCallback a;

        @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.a
        public void onError(com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper errorResultWrapper) {
            com.larksuite.framework.callback.IGetDataCallback iGetDataCallback = this.a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResultWrapper.a);
            }
        }

        @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService.a
        public void onSuccess(com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper successResultWrapper) {
            com.larksuite.framework.callback.IGetDataCallback iGetDataCallback = this.a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(successResultWrapper.a);
            }
        }

        c(com.larksuite.framework.callback.IGetDataCallback iGetDataCallback) {
            this.a = iGetDataCallback;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:16777216) call: com.ss.android.lark.appstrategy.service.impl.i.<init>():void type: THIS */
    /* synthetic */ i(com.ss.android.lark.appstrategy.service.impl.i.a aVar) {
        this();
    }

    public void b(java.lang.String str, com.larksuite.framework.callback.IGetDataCallback<java.io.Serializable> iGetDataCallback) {
        android.content.Context context = u83.b.b().getContext();
        com.ss.android.lark.appstrategy.service.impl.i.a aVar = new com.ss.android.lark.appstrategy.service.impl.i.a(iGetDataCallback);
        if (com.larksuite.framework.utils.d0.h(context)) {
            new com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl(context).getOpenApp(str, aVar);
            return;
        }
        com.ss.android.lark.appstrategy.service.IAppStrategyManisService iAppStrategyManisService = (com.ss.android.lark.appstrategy.service.IAppStrategyManisService) sx7.b.f().c(u83.b.b().getContext(), com.ss.android.lark.appstrategy.service.IAppStrategyManisService.class);
        if (iAppStrategyManisService == null) {
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SdkRequestProcessor", "62");
            com.ss.android.lark.log.Log.e("SdkRequestProcessor", "app strategy manis service null");
        } else {
            iAppStrategyManisService.getOpenApp(str, aVar);
        }
    }

    public void c(java.lang.String str, com.ss.android.lark.appstrategy.service.IAppStrategyManisService.OpenAppInfoType openAppInfoType, com.larksuite.framework.callback.IGetDataCallback<android.os.Parcelable> iGetDataCallback) {
        android.content.Context context = u83.b.b().getContext();
        com.ss.android.lark.appstrategy.service.impl.i.b bVar = new com.ss.android.lark.appstrategy.service.impl.i.b(iGetDataCallback);
        if (com.larksuite.framework.utils.d0.h(context)) {
            new com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl(context).getOpenAppInfoV2(str, openAppInfoType.getType(), bVar);
            return;
        }
        com.ss.android.lark.appstrategy.service.IAppStrategyManisService iAppStrategyManisService = (com.ss.android.lark.appstrategy.service.IAppStrategyManisService) sx7.b.f().c(u83.b.b().getContext(), com.ss.android.lark.appstrategy.service.IAppStrategyManisService.class);
        if (iAppStrategyManisService == null) {
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SdkRequestProcessor", "99");
            com.ss.android.lark.log.Log.e("SdkRequestProcessor", "app strategy manis service null");
        } else {
            iAppStrategyManisService.getOpenAppInfoV2(str, openAppInfoType.getType(), bVar);
        }
    }

    public void d(java.lang.String str, java.lang.String str2, long j, com.larksuite.framework.callback.IGetDataCallback<java.io.Serializable> iGetDataCallback) {
        android.content.Context context = u83.b.b().getContext();
        com.ss.android.lark.appstrategy.service.impl.i.c cVar = new com.ss.android.lark.appstrategy.service.impl.i.c(iGetDataCallback);
        if (com.larksuite.framework.utils.d0.h(context)) {
            new com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl(context).updateLastUseTime(str, str2, j, cVar);
            return;
        }
        com.ss.android.lark.appstrategy.service.IAppStrategyManisService iAppStrategyManisService = (com.ss.android.lark.appstrategy.service.IAppStrategyManisService) sx7.b.f().c(u83.b.b().getContext(), com.ss.android.lark.appstrategy.service.IAppStrategyManisService.class);
        if (iAppStrategyManisService == null) {
            return;
        }
        iAppStrategyManisService.updateLastUseTime(str, str2, j, cVar);
    }
}
