package te0;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import je0.C23712e;
import le0.C24224b;
import p565io.reactivex.disposables.C23696a;
import p565io.reactivex.internal.disposables.EmptyDisposable;
import ve0.C25088a;

/* renamed from: te0.e */
public final class C24956e extends C23712e {

    /* renamed from: a */
    public static final /* synthetic */ int f63081a = 0;

    /* renamed from: te0.e$a */
    public static final class C24957a implements Runnable {

        /* renamed from: b */
        public final Runnable f63082b;

        /* renamed from: c */
        public final C24959c f63083c;

        /* renamed from: d */
        public final long f63084d;

        public C24957a(Runnable runnable, C24959c cVar, long j) {
            this.f63082b = runnable;
            this.f63083c = cVar;
            this.f63084d = j;
        }

        public final void run() {
            if (!this.f63083c.f63092e) {
                C24959c cVar = this.f63083c;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                cVar.getClass();
                long convert = timeUnit.convert(System.currentTimeMillis(), timeUnit);
                long j = this.f63084d;
                if (j > convert) {
                    try {
                        Thread.sleep(j - convert);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C25088a.m62857b(e);
                        return;
                    }
                }
                if (!this.f63083c.f63092e) {
                    this.f63082b.run();
                }
            }
        }
    }

    /* renamed from: te0.e$b */
    public static final class C24958b implements Comparable<C24958b> {

        /* renamed from: b */
        public final Runnable f63085b;

        /* renamed from: c */
        public final long f63086c;

        /* renamed from: d */
        public final int f63087d;

        /* renamed from: e */
        public volatile boolean f63088e;

        public C24958b(Runnable runnable, Long l, int i) {
            this.f63085b = runnable;
            this.f63086c = l.longValue();
            this.f63087d = i;
        }

        public final int compareTo(Object obj) {
            int i;
            C24958b bVar = (C24958b) obj;
            int i2 = 0;
            int i3 = (this.f63086c > bVar.f63086c ? 1 : (this.f63086c == bVar.f63086c ? 0 : -1));
            if (i3 < 0) {
                i = -1;
            } else if (i3 > 0) {
                i = 1;
            } else {
                i = 0;
            }
            if (i != 0) {
                return i;
            }
            int i4 = this.f63087d;
            int i5 = bVar.f63087d;
            if (i4 < i5) {
                i2 = -1;
            } else if (i4 > i5) {
                i2 = 1;
            }
            return i2;
        }
    }

    /* renamed from: te0.e$c */
    public static final class C24959c extends C23712e.C23714b {

        /* renamed from: b */
        public final PriorityBlockingQueue<C24958b> f63089b = new PriorityBlockingQueue<>();

        /* renamed from: c */
        public final AtomicInteger f63090c = new AtomicInteger();

        /* renamed from: d */
        public final AtomicInteger f63091d = new AtomicInteger();

        /* renamed from: e */
        public volatile boolean f63092e;

        /* renamed from: te0.e$c$a */
        public final class C24960a implements Runnable {

            /* renamed from: b */
            public final C24958b f63093b;

            public C24960a(C24958b bVar) {
                this.f63093b = bVar;
            }

            public final void run() {
                this.f63093b.f63088e = true;
                C24959c.this.f63089b.remove(this.f63093b);
            }
        }

        /* renamed from: a */
        public final C24224b mo58930a(Runnable runnable, TimeUnit timeUnit) {
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long millis = timeUnit.toMillis(0) + timeUnit2.convert(System.currentTimeMillis(), timeUnit2);
            return mo61521c(millis, new C24957a(runnable, this, millis));
        }

        /* renamed from: b */
        public final void mo58931b(Runnable runnable) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            mo61521c(timeUnit.convert(System.currentTimeMillis(), timeUnit), runnable);
        }

        /* renamed from: c */
        public final C24224b mo61521c(long j, Runnable runnable) {
            if (this.f63092e) {
                return EmptyDisposable.INSTANCE;
            }
            C24958b bVar = new C24958b(runnable, Long.valueOf(j), this.f63091d.incrementAndGet());
            this.f63089b.add(bVar);
            if (this.f63090c.getAndIncrement() != 0) {
                return C23696a.m58184a(new C24960a(bVar));
            }
            int i = 1;
            while (!this.f63092e) {
                C24958b poll = this.f63089b.poll();
                if (poll == null) {
                    i = this.f63090c.addAndGet(-i);
                    if (i == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!poll.f63088e) {
                    poll.f63085b.run();
                }
            }
            this.f63089b.clear();
            return EmptyDisposable.INSTANCE;
        }

        public final void dispose() {
            this.f63092e = true;
        }
    }

    static {
        new C24956e();
    }

    /* renamed from: a */
    public final C23712e.C23714b mo58928a() {
        return new C24959c();
    }

    /* renamed from: b */
    public final C24224b mo58947b(Runnable runnable) {
        C25088a.m62858c(runnable);
        runnable.run();
        return EmptyDisposable.INSTANCE;
    }

    /* renamed from: c */
    public final C24224b mo58929c(Runnable runnable, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(0);
            C25088a.m62858c(runnable);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C25088a.m62857b(e);
        }
        return EmptyDisposable.INSTANCE;
    }
}
