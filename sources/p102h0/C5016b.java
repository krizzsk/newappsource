package p102h0;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p695od.C18728c;

/* renamed from: h0.b */
public final class C5016b<I, O> extends C5019d<O> implements Runnable {

    /* renamed from: d */
    public C5015a<? super I, ? extends O> f16980d;

    /* renamed from: e */
    public final LinkedBlockingQueue f16981e = new LinkedBlockingQueue(1);

    /* renamed from: f */
    public final CountDownLatch f16982f = new CountDownLatch(1);

    /* renamed from: g */
    public C18728c<? extends I> f16983g;

    /* renamed from: h */
    public volatile C18728c<? extends O> f16984h;

    /* renamed from: h0.b$a */
    public class C5017a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C18728c f16985b;

        public C5017a(C18728c cVar) {
            this.f16985b = cVar;
        }

        public final void run() {
            try {
                C5016b bVar = C5016b.this;
                Object d = C5023g.m12856d(this.f16985b);
                CallbackToFutureAdapter.C0673a<V> aVar = bVar.f16988c;
                if (aVar != null) {
                    aVar.mo2697b(d);
                }
            } catch (CancellationException unused) {
                C5016b.this.cancel(false);
                C5016b.this.f16984h = null;
                return;
            } catch (ExecutionException e) {
                C5016b.this.mo20733b(e.getCause());
            } catch (Throwable th) {
                C5016b.this.f16984h = null;
                throw th;
            }
            C5016b.this.f16984h = null;
        }
    }

    public C5016b(C5015a<? super I, ? extends O> aVar, C18728c<? extends I> cVar) {
        this.f16980d = aVar;
        cVar.getClass();
        this.f16983g = cVar;
    }

    /* renamed from: d */
    public static Object m12841d(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!super.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.f16981e.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        C18728c<? extends I> cVar = this.f16983g;
        if (cVar != null) {
            cVar.cancel(z);
        }
        C18728c<? extends O> cVar2 = this.f16984h;
        if (cVar2 != null) {
            cVar2.cancel(z);
        }
        return true;
    }

    public final O get() throws InterruptedException, ExecutionException {
        if (!isDone()) {
            C18728c<? extends I> cVar = this.f16983g;
            if (cVar != null) {
                cVar.get();
            }
            this.f16982f.await();
            C18728c<? extends O> cVar2 = this.f16984h;
            if (cVar2 != null) {
                cVar2.get();
            }
        }
        return super.get();
    }

    public final void run() {
        try {
            try {
                C18728c<? extends O> apply = this.f16980d.apply(C5023g.m12856d(this.f16983g));
                this.f16984h = apply;
                if (isCancelled()) {
                    apply.cancel(((Boolean) m12841d(this.f16981e)).booleanValue());
                    this.f16984h = null;
                    this.f16980d = null;
                    this.f16983g = null;
                    this.f16982f.countDown();
                    return;
                }
                apply.addListener(new C5017a(apply), C14226d.m35352s0());
                this.f16980d = null;
                this.f16983g = null;
                this.f16982f.countDown();
            } catch (UndeclaredThrowableException e) {
                mo20733b(e.getCause());
            } catch (Exception e2) {
                mo20733b(e2);
            } catch (Error e3) {
                mo20733b(e3);
            } catch (Throwable th) {
                this.f16980d = null;
                this.f16983g = null;
                this.f16982f.countDown();
                throw th;
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e4) {
            mo20733b(e4.getCause());
        }
    }

    public final O get(long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException, InterruptedException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            C18728c<? extends I> cVar = this.f16983g;
            if (cVar != null) {
                long nanoTime = System.nanoTime();
                cVar.get(j, timeUnit);
                j -= Math.max(0, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f16982f.await(j, timeUnit)) {
                j -= Math.max(0, System.nanoTime() - nanoTime2);
                C18728c<? extends O> cVar2 = this.f16984h;
                if (cVar2 != null) {
                    cVar2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j, timeUnit);
    }
}
