package p531he;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: he.e */
public final class C17395e {

    /* renamed from: a */
    public final Executor f44805a;

    /* renamed from: b */
    public Task<Void> f44806b = Tasks.forResult(null);

    /* renamed from: c */
    public final Object f44807c = new Object();

    /* renamed from: d */
    public final ThreadLocal<Boolean> f44808d = new ThreadLocal<>();

    /* renamed from: he.e$a */
    public class C17396a implements Runnable {
        public C17396a() {
        }

        public final void run() {
            C17395e.this.f44808d.set(Boolean.TRUE);
        }
    }

    public C17395e(Executor executor) {
        this.f44805a = executor;
        executor.execute(new C17396a());
    }

    /* renamed from: a */
    public final <T> Task<T> mo49869a(Callable<T> callable) {
        Task<TContinuationResult> continueWith;
        synchronized (this.f44807c) {
            continueWith = this.f44806b.continueWith(this.f44805a, new C17400g(callable));
            this.f44806b = continueWith.continueWith(this.f44805a, new C17402h());
        }
        return continueWith;
    }
}
