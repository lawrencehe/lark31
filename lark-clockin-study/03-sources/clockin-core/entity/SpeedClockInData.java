package com.ss.android.lark.appstrategy.clockin.entity;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\bH\u00c6\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/entity/SpeedClockInData;", "Ljava/io/Serializable;", "isInEnv", "", "isClockInSucceed", "clockInFailCodeName", "", "topSpeedRetryTimeDuration", "", "<init>", "(ZZLjava/lang/String;I)V", "()Z", "getClockInFailCodeName", "()Ljava/lang/String;", "getTopSpeedRetryTimeDuration", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes8.dex */
public final /* data */ class SpeedClockInData implements java.io.Serializable {

    @com.google.gson.annotations.SerializedName("clock_in_fail_code_name")
    private final java.lang.String clockInFailCodeName;

    @com.google.gson.annotations.SerializedName("is_clock_in_succeed")
    private final boolean isClockInSucceed;

    @com.google.gson.annotations.SerializedName("is_in_env")
    private final boolean isInEnv;

    @com.google.gson.annotations.SerializedName("top_speed_retry_time_duration")
    private final int topSpeedRetryTimeDuration;

    public SpeedClockInData() {
        this(false, false, null, 0, 15, null);
    }

    public static /* synthetic */ com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData copy$default(com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData speedClockInData, boolean z, boolean z2, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = speedClockInData.isInEnv;
        }
        if ((i2 & 2) != 0) {
            z2 = speedClockInData.isClockInSucceed;
        }
        if ((i2 & 4) != 0) {
            str = speedClockInData.clockInFailCodeName;
        }
        if ((i2 & 8) != 0) {
            i = speedClockInData.topSpeedRetryTimeDuration;
        }
        return speedClockInData.copy(z, z2, str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsInEnv() {
        return this.isInEnv;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsClockInSucceed() {
        return this.isClockInSucceed;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getClockInFailCodeName() {
        return this.clockInFailCodeName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTopSpeedRetryTimeDuration() {
        return this.topSpeedRetryTimeDuration;
    }

    public final com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData copy(boolean isInEnv, boolean isClockInSucceed, java.lang.String clockInFailCodeName, int topSpeedRetryTimeDuration) {
        return new com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData(isInEnv, isClockInSucceed, clockInFailCodeName, topSpeedRetryTimeDuration);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData)) {
            return false;
        }
        com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData speedClockInData = (com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData) other;
        return this.isInEnv == speedClockInData.isInEnv && this.isClockInSucceed == speedClockInData.isClockInSucceed && kotlin.jvm.internal.Intrinsics.areEqual(this.clockInFailCodeName, speedClockInData.clockInFailCodeName) && this.topSpeedRetryTimeDuration == speedClockInData.topSpeedRetryTimeDuration;
    }

    public int hashCode() {
        int iA = ((c.a(this.isInEnv) * 31) + c.a(this.isClockInSucceed)) * 31;
        java.lang.String str = this.clockInFailCodeName;
        return ((iA + (str == null ? 0 : str.hashCode())) * 31) + this.topSpeedRetryTimeDuration;
    }

    public java.lang.String toString() {
        return "SpeedClockInData(isInEnv=" + this.isInEnv + ", isClockInSucceed=" + this.isClockInSucceed + ", clockInFailCodeName=" + this.clockInFailCodeName + ", topSpeedRetryTimeDuration=" + this.topSpeedRetryTimeDuration + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getClockInFailCodeName() {
        return this.clockInFailCodeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTopSpeedRetryTimeDuration() {
        return this.topSpeedRetryTimeDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isClockInSucceed() {
        return this.isClockInSucceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInEnv() {
        return this.isInEnv;
    }

    public SpeedClockInData(boolean z, boolean z2, java.lang.String str, int i) {
        this.isInEnv = z;
        this.isClockInSucceed = z2;
        this.clockInFailCodeName = str;
        this.topSpeedRetryTimeDuration = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
      (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED] (LINE:100663296)) != (0 int)) ? false : (r2v0 boolean))
      (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED] (LINE:100663302)) != (0 int)) ? false : (r3v0 boolean))
      (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED] (LINE:100663307)) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
      (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED] (LINE:100663312)) != (0 int)) ? (0 int) : (r5v0 int))
     A[MD:(boolean, boolean, java.lang.String, int):void (m)] (LINE:100663317) call: com.ss.android.lark.appstrategy.clockin.entity.SpeedClockInData.<init>(boolean, boolean, java.lang.String, int):void type: THIS */
    public /* synthetic */ SpeedClockInData(boolean z, boolean z2, java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? 0 : i);
    }
}
