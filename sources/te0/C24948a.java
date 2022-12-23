package te0;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import je0.C23712e;
import le0.C24223a;
import le0.C24224b;
import p565io.reactivex.internal.disposables.EmptyDisposable;
import p565io.reactivex.internal.schedulers.RxThreadFactory;

/* renamed from: te0.a */
public final class C24948a extends C23712e {

    /* renamed from: b */
    public static final RxThreadFactory f63055b;

    /* renamed from: c */
    public static final RxThreadFactory f63056c;

    /* renamed from: d */
    public static final long f63057d = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: e */
    public static final TimeUnit f63058e = TimeUnit.SECONDS;

    /* renamed from: f */
    public static final C24951c f63059f;

    /* renamed from: g */
    public static final C24949a f63060g;

    /* renamed from: a */
    public final AtomicReference<C24949a> f63061a;

    /* renamed from: te0.a$a */
    public static final class C24949a implements Runnable {

        /* renamed from: b */
        public final long f63062b;

        /* renamed from: c */
        public final ConcurrentLinkedQueue<C24951c> f63063c;

        /* renamed from: d */
        public final C24223a f63064d;

        /* renamed from: e */
        public final ScheduledExecutorService f63065e;

        /* renamed from: f */
        public final ScheduledFuture f63066f;

        /* renamed from: g */
        public final ThreadFactory f63067g;

        public C24949a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            long j2;
            ScheduledFuture<?> scheduledFuture;
            if (timeUnit != null) {
                j2 = timeUnit.toNanos(j);
            } else {
                j2 = 0;
            }
            long j3 = j2;
            this.f63062b = j3;
            this.f63063c = new ConcurrentLinkedQueue<>();
            this.f63064d = new C24223a();
            this.f63067g = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C24948a.f63056c);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j3, j3, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f63065e = scheduledExecutorService;
            this.f63066f = scheduledFuture;
        }

        public final void run() {
            if (!this.f63063c.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<C24951c> it = this.f63063c.iterator();
                while (it.hasNext()) {
                    C24951c next = it.next();
                    if (next.f63072d > nanoTime) {
                        return;
                    }
                    if (this.f63063c.remove(next)) {
                        this.f63064d.mo60402c(next);
                    }
                }
            }
        }
    }

    /* renamed from: te0.a$b */
    public static final class C24950b extends C23712e.C23714b {

        /* renamed from: b */
        public final C24223a f63068b;

        /* renamed from: c */
        public final C24949a f63069c;

        /* renamed from: d */
        public final C24951c f63070d;

        /* renamed from: e */
        public final AtomicBoolean f63071e = new AtomicBoolean();

        public C24950b(C24949a aVar) {
            C24951c cVar;
            C24951c cVar2;
            this.f63069c = aVar;
            this.f63068b = new C24223a();
            if (aVar.f63064d.f61529c) {
                cVar = C24948a.f63059f;
            } else {
                while (true) {
                    if (aVar.f63063c.isEmpty()) {
                        cVar2 = new C24951c(aVar.f63067g);
                        aVar.f63064d.mo60401b(cVar2);
                        break;
                    }
                    cVar2 = aVar.f63063c.poll();
                    if (cVar2 != null) {
                        break;
                    }
                }
                cVar = cVar2;
            }
            this.f63070d = cVar;
        }

        /* renamed from: a */
        public final C24224b mo58930a(Runnable runnable, TimeUnit timeUnit) {
            if (this.f63068b.f61529c) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f63070d.mo61517c(runnable, timeUnit, this.f63068b);
        }

        public final void dispose() {
            if (this.f63071e.compareAndSet(false, true)) {
                this.f63068b.dispose();
                C24949a aVar = this.f63069c;
                C24951c cVar = this.f63070d;
                aVar.getClass();
                cVar.f63072d = System.nanoTime() + aVar.f63062b;
                aVar.f63063c.offer(cVar);
            }
        }
    }

    /* renamed from: te0.a$c */
    public static final class C24951c extends C24953c {

        /* renamed from: d */
        public long f63072d = 0;

        public C24951c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C24951c cVar = new C24951c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f63059f = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", max, false);
        f63055b = rxThreadFactory;
        f63056c = new RxThreadFactory("RxCachedWorkerPoolEvictor", max, false);
        C24949a aVar = new C24949a(0, (TimeUnit) null, rxThreadFactory);
        f63060g = aVar;
        aVar.f63064d.dispose();
        ScheduledFuture scheduledFuture = aVar.f63066f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = aVar.f63065e;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C24948a() {
        boolean z;
        RxThreadFactory rxThreadFactory = f63055b;
        C24949a aVar = f63060g;
        AtomicReference<C24949a> atomicReference = new AtomicReference<>(aVar);
        this.f63061a = atomicReference;
        C24949a aVar2 = new C24949a(f63057d, f63058e, rxThreadFactory);
        while (true) {
            if (!atomicReference.compareAndSet(aVar, aVar2)) {
                if (atomicReference.get() != aVar) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            aVar2.f63064d.dispose();
            ScheduledFuture scheduledFuture = aVar2.f63066f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = aVar2.f63065e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    public final C23712e.C23714b mo58928a() {
        return new C24950b(this.f63061a.get());
    }
}
