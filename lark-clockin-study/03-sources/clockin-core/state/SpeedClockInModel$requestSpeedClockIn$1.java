package com.ss.android.lark.appstrategy.clockin.state;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel", f = "SpeedClockInModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {109, 265}, m = "requestSpeedClockIn", n = {"this", "triggerType", "cheatAppList", "clockInInfo", "envTypeList", "needRiskInfo", "shouldRequestClockIn", "this", "triggerType", "trace", "url", "params", "startTime"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0"})
/* loaded from: /tmp/larkdex/classes8.dex */
final class SpeedClockInModel$requestSpeedClockIn$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    boolean Z$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpeedClockInModel$requestSpeedClockIn$1(com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel speedClockInModel, kotlin.coroutines.Continuation<? super com.ss.android.lark.appstrategy.clockin.state.SpeedClockInModel$requestSpeedClockIn$1> continuation) {
        super(continuation);
        this.this$0 = speedClockInModel;
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, null, null, false, null, this);
    }
}
