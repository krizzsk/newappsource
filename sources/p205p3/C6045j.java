package p205p3;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: p3.j */
public final class C6045j implements Executor {

    /* renamed from: b */
    public final ArrayDeque<C6046a> f19267b = new ArrayDeque<>();

    /* renamed from: c */
    public final Executor f19268c;

    /* renamed from: d */
    public final Object f19269d = new Object();

    /* renamed from: e */
    public volatile Runnable f19270e;

    /* renamed from: p3.j$a */
    public static class C6046a implements Runnable {

        /* renamed from: b */
        public final C6045j f19271b;

        /* renamed from: c */
        public final Runnable f19272c;

        public C6046a(C6045j jVar, Runnable runnable) {
            this.f19271b = jVar;
            this.f19272c = runnable;
        }

        public final void run() {
            try {
                this.f19272c.run();
            } finally {
                this.f19271b.mo22032a();
            }
        }
    }

    public C6045j(ExecutorService executorService) {
        this.f19268c = executorService;
    }

    /* renamed from: a */
    public final void mo22032a() {
        synchronized (this.f19269d) {
            Runnable poll = this.f19267b.poll();
            this.f19270e = poll;
            if (poll != null) {
                this.f19268c.execute(this.f19270e);
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f19269d) {
            this.f19267b.add(new C6046a(this, runnable));
            if (this.f19270e == null) {
                mo22032a();
            }
        }
    }
}
