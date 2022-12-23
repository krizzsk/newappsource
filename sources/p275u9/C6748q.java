package p275u9;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p337z9.C7506a;

/* renamed from: u9.q */
public final class C6748q implements Executor {

    /* renamed from: b */
    public final Executor f20878b;

    /* renamed from: u9.q$a */
    public static class C6749a implements Runnable {

        /* renamed from: b */
        public final Runnable f20879b;

        public C6749a(Runnable runnable) {
            this.f20879b = runnable;
        }

        public final void run() {
            try {
                this.f20879b.run();
            } catch (Exception unused) {
                C7506a.m17227b("Executor");
            }
        }
    }

    public C6748q(ExecutorService executorService) {
        this.f20878b = executorService;
    }

    public final void execute(Runnable runnable) {
        this.f20878b.execute(new C6749a(runnable));
    }
}
