package v83;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/dto/BaseResult;", "", "status", "Lcom/ss/android/lark/appstrategy/clockin/dto/Status;", "errCode", "", "errMsg", "", "<init>", "(Lcom/ss/android/lark/appstrategy/clockin/dto/Status;ILjava/lang/String;)V", "getStatus", "()Lcom/ss/android/lark/appstrategy/clockin/dto/Status;", "getErrCode", "()I", "getErrMsg", "()Ljava/lang/String;", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes8.dex */
public class a {
    private final com.ss.android.lark.appstrategy.clockin.dto.Status a;
    private final int b;
    private final java.lang.String c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* renamed from: a, reason: from getter */
    public final int getB() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* renamed from: b, reason: from getter */
    public final java.lang.String getC() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* renamed from: c, reason: from getter */
    public final com.ss.android.lark.appstrategy.clockin.dto.Status getA() {
        return this.a;
    }

    public a(com.ss.android.lark.appstrategy.clockin.dto.Status status, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        this.a = status;
        this.b = i;
        this.c = str;
    }
}
