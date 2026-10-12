package com.ss.android.lark.appstrategy.clockin.network;

@kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"com/ss/android/lark/appstrategy/clockin/network/SpeedClockInNetworkUtilsKt$sendHttpRequest$2$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onSuccess", "", "data", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
/* loaded from: /tmp/larkdex/classes8.dex */
public final class SpeedClockInNetworkUtilsKt$sendHttpRequest$2$1 implements com.larksuite.framework.callback.IGetDataCallback<java.lang.String> {
    final /* synthetic */ kotlinx.coroutines.n<com.ss.android.lark.appstrategy.clockin.entity.BaseResp<java.io.Serializable>> $continuation;
    final /* synthetic */ com.google.gson.Gson $gson;

    /* JADX DEBUG: Method merged with bridge method: onError(Ljava/lang/Object;)V */
    public void onError(com.larksuite.framework.callback.Entity.ErrorResult err) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(err, "err");
        kotlinx.coroutines.n<com.ss.android.lark.appstrategy.clockin.entity.BaseResp<java.io.Serializable>> nVar = this.$continuation;
        kotlin.Result.Companion companion = kotlin.Result.Companion;
        nVar.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new com.ss.android.lark.appstrategy.clockin.network.SpeedClockInException(err.getCode(), err.getDebugMsg()))));
    }

    /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
    public void onSuccess(java.lang.String data) {
        com.ss.android.lark.appstrategy.clockin.entity.BaseResp baseResp = null;
        if (data != null) {
            com.google.gson.Gson gson = this.$gson;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
            try {
                baseResp = (com.ss.android.lark.appstrategy.clockin.entity.BaseResp) gson.fromJson(data, com.google.gson.reflect.TypeToken.getParameterized(com.ss.android.lark.appstrategy.clockin.entity.BaseResp.class, new java.lang.reflect.Type[]{java.io.Serializable.class}).getType());
            } catch (java.lang.Exception unused) {
            }
        }
        if (baseResp == null) {
            kotlinx.coroutines.n<com.ss.android.lark.appstrategy.clockin.entity.BaseResp<java.io.Serializable>> nVar = this.$continuation;
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            nVar.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new com.ss.android.lark.appstrategy.clockin.network.SpeedClockInException(-2, "Parse response error"))));
            return;
        }
        this.$continuation.resumeWith(kotlin.Result.constructor-impl(baseResp));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.n<? super com.ss.android.lark.appstrategy.clockin.entity.BaseResp<java.io.Serializable>> */
    /* JADX WARN: Multi-variable type inference failed */
    public SpeedClockInNetworkUtilsKt$sendHttpRequest$2$1(kotlinx.coroutines.n<? super com.ss.android.lark.appstrategy.clockin.entity.BaseResp<java.io.Serializable>> nVar, com.google.gson.Gson gson) {
        this.$continuation = nVar;
        this.$gson = gson;
    }
}
