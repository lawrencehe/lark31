package com.ss.android.lark.appstrategy.clockin.network;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/network/SpeedClockInException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "code", "", "msg", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes8.dex */
public final class SpeedClockInException extends java.lang.RuntimeException {
    private final int code;
    private final java.lang.String msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getMsg() {
        return this.msg;
    }

    public SpeedClockInException(int i, java.lang.String str) {
        super(str);
        this.code = i;
        this.msg = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED] (LINE:67108864)) != (0 int)) ? (-1 int) : (r1v0 int))
      (r2v0 java.lang.String)
     A[MD:(int, java.lang.String):void (m)] (LINE:67108869) call: com.ss.android.lark.appstrategy.clockin.network.SpeedClockInException.<init>(int, java.lang.String):void type: THIS */
    public /* synthetic */ SpeedClockInException(int i, java.lang.String str, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, str);
    }
}
