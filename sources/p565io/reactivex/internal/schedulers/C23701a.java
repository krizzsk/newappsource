package p565io.reactivex.internal.schedulers;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import je0.C23712e;
import le0.C24223a;
import le0.C24224b;
import ne0.C24496b;
import p565io.reactivex.internal.disposables.EmptyDisposable;
import te0.C24953c;
import ve0.C25088a;

/* renamed from: io.reactivex.internal.schedulers.a */
public final class C23701a extends C23712e {

    /* renamed from: b */
    public static final C23703b f59897b;

    /* renamed from: c */
    public static final RxThreadFactory f59898c;

    /* renamed from: d */
    public static final int f59899d;

    /* renamed from: e */
    public static final C23704c f59900e;

    /* renamed from: a */
    public final AtomicReference<C23703b> f59901a;

    /* renamed from: io.reactivex.internal.schedulers.a$a */
    public static final class C23702a extends C23712e.C23714b {

        /* renamed from: b */
        public final C24496b f59902b;

        /* renamed from: c */
        public final C24223a f59903c;

        /* renamed from: d */
        public final C24496b f59904d;

        /* renamed from: e */
        public final C23704c f59905e;

        /* renamed from: f */
        public volatile boolean f59906f;

        public C23702a(C23704c cVar) {
            this.f59905e = cVar;
            C24496b bVar = new C24496b();
            this.f59902b = bVar;
            C24223a aVar = new C24223a();
            this.f59903c = aVar;
            C24496b bVar2 = new C24496b();
            this.f59904d = bVar2;
            bVar2.mo60401b(bVar);
            bVar2.mo60401b(aVar);
        }

        /* renamed from: a */
        public final C24224b mo58930a(Runnable runnable, TimeUnit timeUnit) {
            if (this.f59906f) {
                return EmptyDisposable.INSTANCE;
            }
            return this.f59905e.mo61517c(runnable, timeUnit, this.f59903c);
        }

        /* renamed from: b */
        public final void mo58931b(Runnable runnable) {
            if (this.f59906f) {
                EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
            } else {
                this.f59905e.mo61517c(runnable, TimeUnit.MILLISECONDS, this.f59902b);
            }
        }

        public final void dispose() {
            if (!this.f59906f) {
                this.f59906f = true;
                this.f59904d.dispose();
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.a$b */
    public static final class C23703b {

        /* renamed from: a */
        public final int f59907a;

        /* renamed from: b */
        public final C23704c[] f59908b;

        /* renamed from: c */
        public long f59909c;

        public C23703b(int i, ThreadFactory threadFactory) {
            this.f59907a = i;
            this.f59908b = new C23704c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f59908b[i2] = new C23704c(threadFactory);
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.a$c */
    public static final class C23704c extends C24953c {
        public C23704c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f59899d = availableProcessors;
        C23704c cVar = new C23704c(new RxThreadFactory("RxComputationShutdown"));
        f59900e = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f59898c = rxThreadFactory;
        C23703b bVar = new C23703b(0, rxThreadFactory);
        f59897b = bVar;
        for (C23704c dispose : bVar.f59908b) {
            dispose.dispose();
        }
    }

    public C23701a() {
        int i;
        boolean z;
        RxThreadFactory rxThreadFactory = f59898c;
        C23703b bVar = f59897b;
        AtomicReference<C23703b> atomicReference = new AtomicReference<>(bVar);
        this.f59901a = atomicReference;
        C23703b bVar2 = new C23703b(f59899d, rxThreadFactory);
        while (true) {
            if (!atomicReference.compareAndSet(bVar, bVar2)) {
                if (atomicReference.get() != bVar) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            for (C23704c dispose : bVar2.f59908b) {
                dispose.dispose();
            }
        }
    }

    /* renamed from: a */
    public final C23712e.C23714b mo58928a() {
        C23704c cVar;
        C23703b bVar = this.f59901a.get();
        int i = bVar.f59907a;
        if (i == 0) {
            cVar = f59900e;
        } else {
            C23704c[] cVarArr = bVar.f59908b;
            long j = bVar.f59909c;
            bVar.f59909c = 1 + j;
            cVar = cVarArr[(int) (j % ((long) i))];
        }
        return new C23702a(cVar);
    }

    /* renamed from: c */
    public final C24224b mo58929c(Runnable runnable, TimeUnit timeUnit) {
        C23704c cVar;
        C23703b bVar = this.f59901a.get();
        int i = bVar.f59907a;
        if (i == 0) {
            cVar = f59900e;
        } else {
            C23704c[] cVarArr = bVar.f59908b;
            long j = bVar.f59909c;
            bVar.f59909c = 1 + j;
            cVar = cVarArr[(int) (j % ((long) i))];
        }
        cVar.getClass();
        C25088a.m62858c(runnable);
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(runnable);
        try {
            scheduledDirectTask.mo58921a(cVar.f63075b.submit(scheduledDirectTask));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            C25088a.m62857b(e);
            return EmptyDisposable.INSTANCE;
        }
    }
}
