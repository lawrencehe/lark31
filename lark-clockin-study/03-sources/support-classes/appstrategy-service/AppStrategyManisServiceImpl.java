package com.ss.android.lark.appstrategy.service.impl;

@com.ss.android.lark.manis.annotation.RemoteServiceImpl(service = com.ss.android.lark.appstrategy.service.IAppStrategyManisService.class)
/* loaded from: /tmp/larkdex/classes8.dex */
public class AppStrategyManisServiceImpl implements com.ss.android.lark.appstrategy.service.IAppStrategyManisService {
    private android.content.Context mContext;

    public AppStrategyManisServiceImpl(android.content.Context context) {
        this.mContext = context;
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService
    public void getOpenApp(java.lang.String str, final com.ss.android.lark.appstrategy.service.IAppStrategyManisService.a aVar) {
        com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateRequest.a aVarD = new com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateRequest.a().a(str).d(java.lang.Boolean.TRUE);
        com.bytedance.lark.pb.basic.v1.Command command = com.bytedance.lark.pb.basic.v1.Command.GET_OPEN_APP;
        com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse> iGetDataCallback = new com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl.1
            /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
            public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                aVar.onError(new com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper(errorResult));
            }

            /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
            public void onSuccess(com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse getOpenAppStateResponse) {
                aVar.onSuccess(new com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper((java.io.Serializable) getOpenAppStateResponse));
            }
        };
        final com.squareup.wire.ProtoAdapter protoAdapter = com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse.ADAPTER;
        java.util.Objects.requireNonNull(protoAdapter);
        com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(command, aVarD, iGetDataCallback, new com.ss.android.lark.sdk.SdkSender.IParser() { // from class: com.ss.android.lark.appstrategy.service.impl.b
            public final java.lang.Object parse(byte[] bArr) {
                return (com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse) protoAdapter.decode(bArr);
            }
        });
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService
    public void getOpenAppInfoV2(final java.lang.String str, int i, final com.ss.android.lark.appstrategy.service.IAppStrategyManisService.a aVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyManisServiceImpl", "71");
            com.ss.android.lark.log.Log.w("AppStrategyManisServiceImpl", "appId null");
            aVar.onSuccess(new com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper(null, po.a.a(10103, "client.open_platform.gadget.app_strategy.middle.manis", 0L, 0L, 0L, "manis service appId null", (java.lang.String) null, "ma", false, (java.lang.String) null)));
            return;
        }
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (i == com.ss.android.lark.appstrategy.service.IAppStrategyManisService.OpenAppInfoType.MiniApp.getType()) {
            final com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoRequest.a aVarC = new com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoRequest.a().a(str).c(com.bytedance.lark.pb.openplatform.v1.GetDataStrategy.LocalOnly);
            com.bytedance.lark.pb.basic.v1.Command command = com.bytedance.lark.pb.basic.v1.Command.GET_MINI_APP_INFO_WITH_TIPS;
            com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse> iGetDataCallback = new com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl.2
                /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
                public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                    java.lang.String str2 = "get mini app info from local err=" + errorResult.getDebugMsg();
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyManisServiceImpl$2", "192");
                    com.ss.android.lark.log.Log.e("AppStrategyManisServiceImpl", str2);
                    new com.ss.android.lark.opmonitor.service.OPMonitor(mc4.n.b).addCategoryValue("appID", str).addCategoryValue("strategy", "local").setError(errorResult).setErrorMessage("get mini app info from net err=" + errorResult.getDebugMsg()).flush();
                    aVar.onError(new com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper(errorResult));
                }

                /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
                public void onSuccess(final com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse getMiniAppControlInfoResponse) {
                    boolean z;
                    new com.ss.android.lark.opmonitor.service.OPMonitor(mc4.n.a).addCategoryValue("appID", str).addCategoryValue("strategy", "local").flush();
                    com.bytedance.lark.pb.openplatform.v1.MiniAppInfo miniAppInfo = getMiniAppControlInfoResponse.app_info;
                    if (miniAppInfo != null && miniAppInfo.status == com.bytedance.lark.pb.openplatform.v1.CommonUsageStatus.USABLE) {
                        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyManisServiceImpl$2", "105");
                        com.ss.android.lark.log.Log.i("AppStrategyManisServiceImpl", "get mini app info from local usable");
                        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
                        java.lang.String str2 = str;
                        if (getMiniAppControlInfoResponse.app_info == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aVar.onSuccess(new com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper(getMiniAppControlInfoResponse, po.a.a(10000, "client.open_platform.gadget.app_strategy.middle.manis", 0L, jCurrentTimeMillis2, 0L, (java.lang.String) null, str2, "ma", z, "local")));
                        aVarC.c(com.bytedance.lark.pb.openplatform.v1.GetDataStrategy.NetOnly);
                        com.bytedance.lark.pb.basic.v1.Command command2 = com.bytedance.lark.pb.basic.v1.Command.GET_MINI_APP_INFO_WITH_TIPS;
                        com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoRequest.a aVar2 = aVarC;
                        com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse> iGetDataCallback2 = new com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl.2.1
                            /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
                            public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                                new com.ss.android.lark.opmonitor.service.OPMonitor(mc4.n.b).addCategoryValue("appID", str).addCategoryValue("strategy", "network").setError(errorResult).setErrorMessage("get mini app info from net err=" + errorResult.getDebugMsg()).flush();
                            }

                            /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
                            public void onSuccess(com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse getMiniAppControlInfoResponse2) {
                                new com.ss.android.lark.opmonitor.service.OPMonitor(mc4.n.a).addCategoryValue("appID", str).addCategoryValue("strategy", "network").flush();
                            }
                        };
                        com.squareup.wire.ProtoAdapter protoAdapter = com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse.ADAPTER;
                        java.util.Objects.requireNonNull(protoAdapter);
                        com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(command2, aVar2, iGetDataCallback2, new com.ss.android.lark.appstrategy.service.impl.c(protoAdapter));
                        return;
                    }
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyManisServiceImpl$2", "146");
                    com.ss.android.lark.log.Log.i("AppStrategyManisServiceImpl", "get mini app info from net");
                    final long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis();
                    aVarC.c(com.bytedance.lark.pb.openplatform.v1.GetDataStrategy.NetOnly);
                    com.bytedance.lark.pb.basic.v1.Command command3 = com.bytedance.lark.pb.basic.v1.Command.GET_MINI_APP_INFO_WITH_TIPS;
                    com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoRequest.a aVar3 = aVarC;
                    com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse> iGetDataCallback3 = new com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl.2.2
                        /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
                        public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                            java.lang.String str3 = "get mini app info from net err=" + errorResult.getDebugMsg();
                            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyManisServiceImpl$2$2", "173");
                            com.ss.android.lark.log.Log.e("AppStrategyManisServiceImpl", str3);
                            new com.ss.android.lark.opmonitor.service.OPMonitor(mc4.n.b).addCategoryValue("appID", str).addCategoryValue("strategy", "network").setError(errorResult).setErrorMessage("get mini app info from net err=" + errorResult.getDebugMsg()).flush();
                            if (getMiniAppControlInfoResponse.app_info != null) {
                                aVar.onSuccess(new com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper((java.io.Serializable) getMiniAppControlInfoResponse));
                            } else {
                                aVar.onError(new com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper(errorResult));
                            }
                        }

                        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
                        public void onSuccess(com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse getMiniAppControlInfoResponse2) {
                            boolean z2;
                            new com.ss.android.lark.opmonitor.service.OPMonitor(mc4.n.a).addCategoryValue("appID", str).addCategoryValue("strategy", "network").flush();
                            long jCurrentTimeMillis4 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
                            long jCurrentTimeMillis5 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis3;
                            java.lang.String str3 = str;
                            if (getMiniAppControlInfoResponse2.app_info == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            aVar.onSuccess(new com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper(getMiniAppControlInfoResponse2, po.a.a(10000, "client.open_platform.gadget.app_strategy.middle.manis", 0L, jCurrentTimeMillis4, jCurrentTimeMillis5, (java.lang.String) null, str3, "ma", z2, "net")));
                        }
                    };
                    com.squareup.wire.ProtoAdapter protoAdapter2 = com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse.ADAPTER;
                    java.util.Objects.requireNonNull(protoAdapter2);
                    com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(command3, aVar3, iGetDataCallback3, new com.ss.android.lark.appstrategy.service.impl.c(protoAdapter2));
                }
            };
            com.squareup.wire.ProtoAdapter protoAdapter = com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse.ADAPTER;
            java.util.Objects.requireNonNull(protoAdapter);
            com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(command, aVarC, iGetDataCallback, new com.ss.android.lark.appstrategy.service.impl.c(protoAdapter));
            return;
        }
        final com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoRequest.a aVarC2 = new com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoRequest.a().a(str).c(com.bytedance.lark.pb.openplatform.v1.GetDataStrategy.LocalOnly);
        com.bytedance.lark.pb.basic.v1.Command command2 = com.bytedance.lark.pb.basic.v1.Command.GET_H5_INFO_WITH_TIPS;
        com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse> iGetDataCallback2 = new com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl.3
            /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
            public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                java.lang.String str2 = "get h5 info from local err=" + errorResult.getDebugMsg();
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyManisServiceImpl$3", "271");
                com.ss.android.lark.log.Log.e("AppStrategyManisServiceImpl", str2);
                aVar.onError(new com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper(errorResult));
            }

            /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
            public void onSuccess(com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse getH5ControlInfoResponse) {
                com.bytedance.lark.pb.openplatform.v1.H5Info h5Info = getH5ControlInfoResponse.h5_info;
                if (h5Info != null && h5Info.status == com.bytedance.lark.pb.openplatform.v1.CommonUsageStatus.USABLE) {
                    ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyManisServiceImpl$3", "215");
                    com.ss.android.lark.log.Log.i("AppStrategyManisServiceImpl", "get h5 info from local usable");
                    aVar.onSuccess(new com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper(getH5ControlInfoResponse, po.a.a(10000, "client.open_platform.gadget.app_strategy.middle.manis", 0L, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, 0L, (java.lang.String) null, str, "h5", false, "local")));
                    aVarC2.c(com.bytedance.lark.pb.openplatform.v1.GetDataStrategy.NetOnly);
                    com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(com.bytedance.lark.pb.basic.v1.Command.GET_H5_INFO_WITH_TIPS, aVarC2, (com.larksuite.framework.callback.IGetDataCallback) null, (com.ss.android.lark.sdk.SdkSender.IParser) null);
                    return;
                }
                final long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyManisServiceImpl$3", "239");
                com.ss.android.lark.log.Log.i("AppStrategyManisServiceImpl", "get h5 info from net");
                aVarC2.c(com.bytedance.lark.pb.openplatform.v1.GetDataStrategy.NetOnly);
                com.bytedance.lark.pb.basic.v1.Command command3 = com.bytedance.lark.pb.basic.v1.Command.GET_H5_INFO_WITH_TIPS;
                com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoRequest.a aVar2 = aVarC2;
                com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse> iGetDataCallback3 = new com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl.3.1
                    /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
                    public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                        java.lang.String str2 = "get h5 info from net err=" + errorResult.getDebugMsg();
                        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "AppStrategyManisServiceImpl$3$1", "262");
                        com.ss.android.lark.log.Log.e("AppStrategyManisServiceImpl", str2);
                        aVar.onError(new com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper(errorResult));
                    }

                    /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
                    public void onSuccess(com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse getH5ControlInfoResponse2) {
                        aVar.onSuccess(new com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper(getH5ControlInfoResponse2, po.a.a(10000, "client.open_platform.gadget.app_strategy.middle.manis", 0L, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, java.lang.System.currentTimeMillis() - jCurrentTimeMillis2, (java.lang.String) null, str, "h5", false, "net")));
                    }
                };
                com.squareup.wire.ProtoAdapter protoAdapter2 = com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse.ADAPTER;
                java.util.Objects.requireNonNull(protoAdapter2);
                com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(command3, aVar2, iGetDataCallback3, new com.ss.android.lark.appstrategy.service.impl.d(protoAdapter2));
            }
        };
        com.squareup.wire.ProtoAdapter protoAdapter2 = com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse.ADAPTER;
        java.util.Objects.requireNonNull(protoAdapter2);
        com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(command2, aVarC2, iGetDataCallback2, new com.ss.android.lark.appstrategy.service.impl.d(protoAdapter2));
    }

    @Override // com.ss.android.lark.appstrategy.service.IAppStrategyManisService
    public void updateLastUseTime(java.lang.String str, java.lang.String str2, long j, final com.ss.android.lark.appstrategy.service.IAppStrategyManisService.a aVar) {
        com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppLastHappenTimeRequest.a aVarD = new com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppLastHappenTimeRequest.a().a(str).b(str2).d(java.lang.String.valueOf(j));
        com.bytedance.lark.pb.basic.v1.Command command = com.bytedance.lark.pb.basic.v1.Command.UPDATE_OPEN_APP_LAST_HAPPEN;
        com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppLastHappenTimeResponse> iGetDataCallback = new com.larksuite.framework.callback.IGetDataCallback<com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppLastHappenTimeResponse>() { // from class: com.ss.android.lark.appstrategy.service.impl.AppStrategyManisServiceImpl.4
            /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
            public void onError(com.larksuite.framework.callback.Entity.ErrorResult errorResult) {
                aVar.onError(new com.ss.android.lark.appstrategy.service.impl.dto.ErrorResultWrapper(errorResult));
            }

            /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
            public void onSuccess(com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppLastHappenTimeResponse updateOpenAppLastHappenTimeResponse) {
                aVar.onSuccess(new com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper((java.io.Serializable) updateOpenAppLastHappenTimeResponse));
            }
        };
        final com.squareup.wire.ProtoAdapter protoAdapter = com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppLastHappenTimeResponse.ADAPTER;
        java.util.Objects.requireNonNull(protoAdapter);
        com.ss.android.lark.sdk.SdkSender.asynSendRequestNonWrap(command, aVarD, iGetDataCallback, new com.ss.android.lark.sdk.SdkSender.IParser() { // from class: com.ss.android.lark.appstrategy.service.impl.a
            public final java.lang.Object parse(byte[] bArr) {
                return (com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppLastHappenTimeResponse) protoAdapter.decode(bArr);
            }
        });
    }
}
