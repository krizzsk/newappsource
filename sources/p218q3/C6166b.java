package p218q3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p205p3.C6045j;

/* renamed from: q3.b */
public final class C6166b implements C6165a {

    /* renamed from: a */
    public final C6045j f19549a;

    /* renamed from: b */
    public final Handler f19550b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final C6167a f19551c = new C6167a();

    /* renamed from: q3.b$a */
    public class C6167a implements Executor {
        public C6167a() {
        }

        public final void execute(Runnable runnable) {
            C6166b.this.f19550b.post(runnable);
        }
    }

    public C6166b(ExecutorService executorService) {
        this.f19549a = new C6045j(executorService);
    }

    /* renamed from: a */
    public final void mo22153a(Runnable runnable) {
        this.f19549a.execute(runnable);
    }
}
