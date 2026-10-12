package u83;

/* loaded from: /tmp/larkdex/classes8.dex */
public class b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static a93.a b() {
        return (a93.a) com.ss.android.lark.utils.ApiUtils.getApi(a93.a.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void e() {
        com.ss.android.lark.appstrategy.clockin.SpeedClockInManager.b.j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public b() {
        com.bytedance.ee.appstrategy.c.a(b().getLocale());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public c93.a a() {
        return com.ss.android.lark.appstrategy.service.impl.AppStrategyService.s();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public c93.b c() {
        return com.ss.android.lark.appstrategy.service.impl.l.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void d() {
        android.os.Handler backgroundHandler = com.larksuite.framework.thread.CoreThreadPool.getBackgroundHandler();
        final com.ss.android.lark.appstrategy.clockin.SpeedClockInManager speedClockInManager = com.ss.android.lark.appstrategy.clockin.SpeedClockInManager.b;
        java.util.Objects.requireNonNull(speedClockInManager);
        backgroundHandler.post(new java.lang.Runnable() { // from class: u83.a
            @Override // java.lang.Runnable
            public final void run() {
                speedClockInManager.k();
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void f() {
        com.ss.android.lark.appstrategy.service.impl.AppStrategyService.s().A();
    }
}
