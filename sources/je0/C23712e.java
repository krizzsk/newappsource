package je0;

import java.util.concurrent.TimeUnit;
import le0.C24224b;
import te0.C24953c;
import ve0.C25088a;

/* renamed from: je0.e */
public abstract class C23712e {

    /* renamed from: je0.e$a */
    public static final class C23713a implements C24224b, Runnable {

        /* renamed from: b */
        public final Runnable f59921b;

        /* renamed from: c */
        public final C23714b f59922c;

        /* renamed from: d */
        public Thread f59923d;

        public C23713a(Runnable runnable, C23714b bVar) {
            this.f59921b = runnable;
            this.f59922c = bVar;
        }

        public final void dispose() {
            if (this.f59923d == Thread.currentThread()) {
                C23714b bVar = this.f59922c;
                if (bVar instanceof C24953c) {
                    C24953c cVar = (C24953c) bVar;
                    if (!cVar.f63076c) {
                        cVar.f63076c = true;
                        cVar.f63075b.shutdown();
                        return;
                    }
                    return;
                }
            }
            this.f59922c.dispose();
        }

        public final void run() {
            this.f59923d = Thread.currentThread();
            try {
                this.f59921b.run();
            } finally {
                dispose();
                this.f59923d = null;
            }
        }
    }

    /* renamed from: je0.e$b */
    public static abstract class C23714b implements C24224b {
        /* renamed from: a */
        public abstract C24224b mo58930a(Runnable runnable, TimeUnit timeUnit);

        /* renamed from: b */
        public void mo58931b(Runnable runnable) {
            mo58930a(runnable, TimeUnit.NANOSECONDS);
        }
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());
    }

    /* renamed from: a */
    public abstract C23714b mo58928a();

    /* renamed from: b */
    public C24224b mo58947b(Runnable runnable) {
        return mo58929c(runnable, TimeUnit.NANOSECONDS);
    }

    /* renamed from: c */
    public C24224b mo58929c(Runnable runnable, TimeUnit timeUnit) {
        C23714b a = mo58928a();
        C25088a.m62858c(runnable);
        C23713a aVar = new C23713a(runnable, a);
        a.mo58930a(aVar, timeUnit);
        return aVar;
    }
}
