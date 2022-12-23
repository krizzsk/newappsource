package p565io.reactivex.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import je0.C23712e;
import le0.C24223a;
import le0.C24224b;
import p565io.reactivex.internal.disposables.EmptyDisposable;
import te0.C24954d;
import ve0.C25088a;

/* renamed from: io.reactivex.internal.schedulers.b */
public final class C23705b extends C23712e {

    /* renamed from: b */
    public static final RxThreadFactory f59910b = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: a */
    public final AtomicReference<ScheduledExecutorService> f59911a;

    /* renamed from: io.reactivex.internal.schedulers.b$a */
    public static final class C23706a extends C23712e.C23714b {

        /* renamed from: b */
        public final ScheduledExecutorService f59912b;

        /* renamed from: c */
        public final C24223a f59913c = new C24223a();

        /* renamed from: d */
        public volatile boolean f59914d;

        public C23706a(ScheduledExecutorService scheduledExecutorService) {
            this.f59912b = scheduledExecutorService;
        }

        /* renamed from: a */
        public final C24224b mo58930a(Runnable runnable, TimeUnit timeUnit) {
            if (this.f59914d) {
                return EmptyDisposable.INSTANCE;
            }
            C25088a.m62858c(runnable);
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(runnable, this.f59913c);
            this.f59913c.mo60401b(scheduledRunnable);
            try {
                scheduledRunnable.mo58925a(this.f59912b.submit(scheduledRunnable));
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                dispose();
                C25088a.m62857b(e);
                return EmptyDisposable.INSTANCE;
            }
        }

        public final void dispose() {
            if (!this.f59914d) {
                this.f59914d = true;
                this.f59913c.dispose();
            }
        }
    }

    static {
        Executors.newScheduledThreadPool(0).shutdown();
    }

    public C23705b() {
        RxThreadFactory rxThreadFactory = f59910b;
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f59911a = atomicReference;
        boolean z = C24954d.f63077a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, rxThreadFactory);
        if (C24954d.f63077a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            C24954d.f63080d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        atomicReference.lazySet(newScheduledThreadPool);
    }

    /* renamed from: a */
    public final C23712e.C23714b mo58928a() {
        return new C23706a(this.f59911a.get());
    }

    /* renamed from: c */
    public final C24224b mo58929c(Runnable runnable, TimeUnit timeUnit) {
        C25088a.m62858c(runnable);
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        try {
            scheduledDirectTask.mo58921a(this.f59911a.get().submit(scheduledDirectTask));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            C25088a.m62857b(e);
            return EmptyDisposable.INSTANCE;
        }
    }
}
