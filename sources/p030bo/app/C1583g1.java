package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.lang.Thread;

/* renamed from: bo.app.g1 */
public class C1583g1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    public static final String f5710b = AppboyLogger.getBrazeLogTag(C1583g1.class);

    /* renamed from: a */
    public C1600i0 f5711a;

    public C1583g1() {
    }

    /* renamed from: a */
    public void mo6084a(C1600i0 i0Var) {
        this.f5711a = i0Var;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            if (this.f5711a != null) {
                AppboyLogger.m5460w(f5710b, "Uncaught exception from thread. Publishing as Throwable event.", th);
                this.f5711a.mo6134a(th, Throwable.class);
            }
        } catch (Exception e) {
            AppboyLogger.m5460w(f5710b, "Failed to log throwable.", e);
        }
    }

    public C1583g1(C1600i0 i0Var) {
        this.f5711a = i0Var;
    }
}
