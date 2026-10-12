package com.ss.android.lark.appstrategy.clockin;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ss.android.lark.appstrategy.clockin.SpeedClockInManager$requestConfig$1", f = "SpeedClockInManager.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /tmp/larkdex/classes8.dex */
final class SpeedClockInManager$requestConfig$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $oldVersionConfigHandler;
    final /* synthetic */ java.lang.String $triggerType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpeedClockInManager$requestConfig$1(java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super com.ss.android.lark.appstrategy.clockin.SpeedClockInManager$requestConfig$1> continuation) {
        super(2, continuation);
        this.$triggerType = str;
        this.$oldVersionConfigHandler = function0;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.ss.android.lark.appstrategy.clockin.SpeedClockInManager$requestConfig$1(this.$triggerType, this.$oldVersionConfigHandler, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel speedClockInModel = com.ss.android.lark.appstrategy.clockin.SpeedClockInManager.d;
            java.lang.String str = this.$triggerType;
            this.label = 1;
            obj = speedClockInModel.c(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInConfigData speedClockInConfigData = (com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInConfigData) obj;
        if (speedClockInConfigData == null) {
            com.ss.android.lark.appstrategy.clockin.SpeedClockInManager.i = true;
            return kotlin.Unit.INSTANCE;
        }
        com.ss.android.lark.appstrategy.clockin.SpeedClockInManager.i = false;
        java.lang.String str2 = "requestConfig isNewVersion=" + speedClockInConfigData.isNewVersion();
        ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInManager$requestConfig$1", "125");
        com.ss.android.lark.log.Log.i("SpeedClockInManager", str2);
        if (speedClockInConfigData.isNewVersion()) {
            if (speedClockInConfigData.isNeedSpeedClockIn()) {
                com.ss.android.lark.appstrategy.clockin.SpeedClockInManager.b.x(speedClockInConfigData.getEnvironmentTypeList(), speedClockInConfigData.getNeedRiskInfo(), speedClockInConfigData.getCheatAppList());
            }
        } else {
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.$oldVersionConfigHandler;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
