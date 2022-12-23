package te0;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import je0.C23712e;
import le0.C24224b;
import ne0.C24495a;
import p565io.reactivex.internal.disposables.EmptyDisposable;
import p565io.reactivex.internal.schedulers.ScheduledRunnable;
import ve0.C25088a;

/* renamed from: te0.c */
public class C24953c extends C23712e.C23714b {

    /* renamed from: b */
    public final ScheduledExecutorService f63075b;

    /* renamed from: c */
    public volatile boolean f63076c;

    public C24953c(ThreadFactory threadFactory) {
        boolean z = C24954d.f63077a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (C24954d.f63077a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            C24954d.f63080d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.f63075b = newScheduledThreadPool;
    }

    /* renamed from: a */
    public final C24224b mo58930a(Runnable runnable, TimeUnit timeUnit) {
        if (this.f63076c) {
            return EmptyDisposable.INSTANCE;
        }
        return mo61517c(runnable, timeUnit, (C24495a) null);
    }

    /* renamed from: b */
    public final void mo58931b(Runnable runnable) {
        mo58930a(runnable, (TimeUnit) null);
    }

    /* renamed from: c */
    public final ScheduledRunnable mo61517c(Runnable runnable, TimeUnit timeUnit, C24495a aVar) {
        C25088a.m62858c(runnable);
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, aVar);
        if (aVar != null && !aVar.mo60401b(scheduledRunnable)) {
            return scheduledRunnable;
        }
        try {
            scheduledRunnable.mo58925a(this.f63075b.submit(scheduledRunnable));
        } catch (RejectedExecutionException e) {
            if (aVar != null) {
                aVar.mo60402c(scheduledRunnable);
            }
            C25088a.m62857b(e);
        }
        return scheduledRunnable;
    }

    public final void dispose() {
        if (!this.f63076c) {
            this.f63076c = true;
            this.f63075b.shutdownNow();
        }
    }
}
