package y83;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ss/android/lark/appstrategy/clockin/scheduler/SpeedClockInScheduler;", "", "<init>", "()V", "handler", "Landroid/os/Handler;", "scheduleAfterMillis", "", "millis", "", "runnable", "Ljava/lang/Runnable;", "appstrategy-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: /tmp/larkdex/classes8.dex */
public final class a {
    private final android.os.Handler a = new android.os.Handler(android.os.Looper.getMainLooper());

    public final void a(long j, java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.a.removeCallbacksAndMessages(null);
        this.a.postDelayed(runnable, j);
    }
}
