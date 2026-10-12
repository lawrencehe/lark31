package com.ss.android.lark.appstrategy.clockin.state;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/state/SpeedClockInStore;", "", "<init>", "()V", "config", "Lcom/ss/android/lark/appstrategy/clockin/entity/SpeedClockInConfigData;", "getConfig", "()Lcom/ss/android/lark/appstrategy/clockin/entity/SpeedClockInConfigData;", "setConfig", "(Lcom/ss/android/lark/appstrategy/clockin/entity/SpeedClockInConfigData;)V", "clockInData", "Lcom/ss/android/lark/appstrategy/clockin/entity/SpeedClockInData;", "getClockInData", "()Lcom/ss/android/lark/appstrategy/clockin/entity/SpeedClockInData;", "setClockInData", "(Lcom/ss/android/lark/appstrategy/clockin/entity/SpeedClockInData;)V", "clear", "", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ss.android.lark.appstrategy.clockin.state.a, reason: from Kotlin metadata */
/* loaded from: /tmp/larkdex/classes8.dex */
public final class SpeedClockInStore {
    private volatile com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInConfigData a;
    private volatile com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a() {
        this.a = null;
        this.b = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* renamed from: b, reason: from getter */
    public final com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData getB() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* renamed from: c, reason: from getter */
    public final com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInConfigData getA() {
        return this.a;
    }

    public final void d(com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData speedClockInData) {
        this.b = speedClockInData;
    }

    public final void e(com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInConfigData speedClockInConfigData) {
        this.a = speedClockInConfigData;
    }
}
