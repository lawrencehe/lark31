package com.ss.android.lark.appstrategy.clockin;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ss.android.lark.appstrategy.clockin.SpeedClockInManager$requestSpeedClockIn$1", f = "SpeedClockInManager.kt", i = {0, 1}, l = {273, 166}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0"})
/* loaded from: /tmp/larkdex/classes8.dex */
final class SpeedClockInManager$requestSpeedClockIn$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<java.lang.String> $cheatAppList;
    final /* synthetic */ java.util.List<java.lang.Integer> $envTypeList;
    final /* synthetic */ boolean $needRiskInfo;
    final /* synthetic */ java.lang.String $token;
    final /* synthetic */ java.lang.String $triggerType;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpeedClockInManager$requestSpeedClockIn$1(java.lang.String str, java.lang.String str2, java.util.List<java.lang.Integer> list, boolean z, java.util.List<java.lang.String> list2, kotlin.coroutines.Continuation<? super com.ss.android.lark.appstrategy.clockin.SpeedClockInManager$requestSpeedClockIn$1> continuation) {
        super(2, continuation);
        this.$triggerType = str;
        this.$token = str2;
        this.$envTypeList = list;
        this.$needRiskInfo = z;
        this.$cheatAppList = list2;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.ss.android.lark.appstrategy.clockin.SpeedClockInManager$requestSpeedClockIn$1(this.$triggerType, this.$token, this.$envTypeList, this.$needRiskInfo, this.$cheatAppList, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.String str;
        kotlinx.coroutines.sync.a aVar;
        boolean z;
        java.lang.String str2;
        java.util.List<java.lang.Integer> list;
        java.util.List<java.lang.String> list2;
        kotlinx.coroutines.sync.a aVar2;
        boolean z2;
        java.lang.String str3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        str3 = (java.lang.String) this.L$1;
                        aVar2 = (kotlinx.coroutines.sync.a) this.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInManager$requestSpeedClockIn$1", "167");
                            com.ss.android.lark.log.Log.i("SpeedClockInManager", "endRequest: " + str3);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            aVar2.c((java.lang.Object) null);
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            aVar2.c((java.lang.Object) null);
                            throw th;
                        }
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                java.util.List<java.lang.String> list3 = (java.util.List) this.L$4;
                java.util.List<java.lang.Integer> list4 = (java.util.List) this.L$3;
                java.lang.String str4 = (java.lang.String) this.L$2;
                java.lang.String str5 = (java.lang.String) this.L$1;
                kotlinx.coroutines.sync.a aVar3 = (kotlinx.coroutines.sync.a) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                aVar = aVar3;
                str2 = str5;
                list2 = list3;
                list = list4;
                str = str4;
            } else {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.sync.a aVar4 = com.ss.android.lark.appstrategy.clockin.SpeedClockInManager.e;
                java.lang.String str6 = this.$triggerType;
                str = this.$token;
                java.util.List<java.lang.Integer> list5 = this.$envTypeList;
                boolean z3 = this.$needRiskInfo;
                java.util.List<java.lang.String> list6 = this.$cheatAppList;
                this.L$0 = aVar4;
                this.L$1 = str6;
                this.L$2 = str;
                this.L$3 = list5;
                this.L$4 = list6;
                this.Z$0 = z3;
                this.label = 1;
                if (aVar4.b((java.lang.Object) null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                aVar = aVar4;
                z = z3;
                str2 = str6;
                list = list5;
                list2 = list6;
            }
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInManager$requestSpeedClockIn$1", "165");
            com.ss.android.lark.log.Log.i("SpeedClockInManager", "startRequest: " + str2);
            com.ss.android.lark.appstrategy.clockin.SpeedClockInManager speedClockInManager = com.ss.android.lark.appstrategy.clockin.SpeedClockInManager.b;
            if (z) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.L$0 = aVar;
            this.L$1 = str2;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 2;
            if (speedClockInManager.w(str2, str, list, z2, list2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str3 = str2;
            aVar2 = aVar;
            ks7.c.d("modules/biz/openplatform/appstrategy-api/", "SpeedClockInManager$requestSpeedClockIn$1", "167");
            com.ss.android.lark.log.Log.i("SpeedClockInManager", "endRequest: " + str3);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            aVar2.c((java.lang.Object) null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th2) {
            th = th2;
            aVar2 = aVar;
            aVar2.c((java.lang.Object) null);
            throw th;
        }
    }
}
