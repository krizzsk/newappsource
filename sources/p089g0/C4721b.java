package p089g0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p102h0.C5028j;
import p358af.C13437d;

/* renamed from: g0.b */
public final class C4721b extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: b */
    public final Handler f16014b;

    /* renamed from: g0.b$a */
    public class C4722a extends ThreadLocal<ScheduledExecutorService> {
        public final Object initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return C14226d.m35358z0();
            }
            if (Looper.myLooper() != null) {
                return new C4721b(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* renamed from: g0.b$b */
    public class C4723b implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ Runnable f16015b;

        public C4723b(Runnable runnable) {
            this.f16015b = runnable;
        }

        public final Object call() throws Exception {
            this.f16015b.run();
            return null;
        }
    }

    /* renamed from: g0.b$c */
    public static class C4724c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: b */
        public final AtomicReference<CallbackToFutureAdapter.C0673a<V>> f16016b = new AtomicReference<>((Object) null);

        /* renamed from: c */
        public final long f16017c;

        /* renamed from: d */
        public final Callable<V> f16018d;

        /* renamed from: e */
        public final CallbackToFutureAdapter.C0675c f16019e;

        /* renamed from: g0.b$c$a */
        public class C4725a implements CallbackToFutureAdapter.C0674b<V> {

            /* renamed from: b */
            public final /* synthetic */ Handler f16020b;

            /* renamed from: c */
            public final /* synthetic */ Callable f16021c;

            /* renamed from: g0.b$c$a$a */
            public class C4726a implements Runnable {
                public C4726a() {
                }

                public final void run() {
                    if (C4724c.this.f16016b.getAndSet((Object) null) != null) {
                        C4725a aVar = C4725a.this;
                        aVar.f16020b.removeCallbacks(C4724c.this);
                    }
                }
            }

            public C4725a(Handler handler, Callable callable) {
                this.f16020b = handler;
                this.f16021c = callable;
            }

            public final Object attachCompleter(CallbackToFutureAdapter.C0673a<V> aVar) throws RejectedExecutionException {
                aVar.mo2696a(new C4726a(), C14226d.m35352s0());
                C4724c.this.f16016b.set(aVar);
                return "HandlerScheduledFuture-" + this.f16021c.toString();
            }
        }

        public C4724c(Handler handler, long j, Callable<V> callable) {
            this.f16017c = j;
            this.f16018d = callable;
            this.f16019e = CallbackToFutureAdapter.m1884a(new C4725a(handler, callable));
        }

        public final boolean cancel(boolean z) {
            return this.f16019e.cancel(z);
        }

        public final int compareTo(Object obj) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), ((Delayed) obj).getDelay(timeUnit));
        }

        public final V get() throws ExecutionException, InterruptedException {
            return this.f16019e.get();
        }

        public final long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f16017c - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public final boolean isCancelled() {
            return this.f16019e.isCancelled();
        }

        public final boolean isDone() {
            return this.f16019e.isDone();
        }

        public final boolean isPeriodic() {
            return false;
        }

        public final void run() {
            CallbackToFutureAdapter.C0673a andSet = this.f16016b.getAndSet((Object) null);
            if (andSet != null) {
                try {
                    andSet.mo2697b(this.f16018d.call());
                } catch (Exception e) {
                    andSet.mo2698c(e);
                }
            }
        }

        public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f16019e.f2322c.get(j, timeUnit);
        }
    }

    static {
        new C4722a();
    }

    public C4721b(Handler handler) {
        this.f16014b = handler;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(C13437d.m33705j(C4721b.class, new StringBuilder(), " cannot be shut down. Use Looper.quitSafely()."));
    }

    public final void execute(Runnable runnable) {
        if (!this.f16014b.post(runnable)) {
            throw new RejectedExecutionException(this.f16014b + " is shutting down");
        }
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new C4723b(runnable), j, timeUnit);
    }

    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(C13437d.m33705j(C4721b.class, new StringBuilder(), " does not yet support fixed-rate scheduling."));
    }

    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(C13437d.m33705j(C4721b.class, new StringBuilder(), " does not yet support fixed-delay scheduling."));
    }

    public final void shutdown() {
        throw new UnsupportedOperationException(C13437d.m33705j(C4721b.class, new StringBuilder(), " cannot be shut down. Use Looper.quitSafely()."));
    }

    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(C13437d.m33705j(C4721b.class, new StringBuilder(), " cannot be shut down. Use Looper.quitSafely()."));
    }

    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit) + SystemClock.uptimeMillis();
        C4724c cVar = new C4724c(this.f16014b, convert, callable);
        if (this.f16014b.postAtTime(cVar, convert)) {
            return cVar;
        }
        return new C5028j.C5030b(new RejectedExecutionException(this.f16014b + " is shutting down"));
    }
}
