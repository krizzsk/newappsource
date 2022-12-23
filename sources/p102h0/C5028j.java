package p102h0;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p054d0.C4289j0;
import p695od.C18728c;

/* renamed from: h0.j */
public abstract class C5028j<V> implements C18728c<V> {

    /* renamed from: h0.j$a */
    public static class C5029a<V> extends C5028j<V> {

        /* renamed from: b */
        public final Throwable f16999b;

        public C5029a(Exception exc) {
            this.f16999b = exc;
        }

        public final V get() throws ExecutionException {
            throw new ExecutionException(this.f16999b);
        }

        public final String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f16999b + "]]";
        }
    }

    /* renamed from: h0.j$b */
    public static final class C5030b<V> extends C5029a<V> implements ScheduledFuture<V> {
        public C5030b(RejectedExecutionException rejectedExecutionException) {
            super(rejectedExecutionException);
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            Delayed delayed = (Delayed) obj;
            return -1;
        }

        public final long getDelay(TimeUnit timeUnit) {
            return 0;
        }
    }

    /* renamed from: h0.j$c */
    public static final class C5031c<V> extends C5028j<V> {

        /* renamed from: c */
        public static final C5031c f17000c = new C5031c((Object) null);

        /* renamed from: b */
        public final V f17001b;

        public C5031c(V v) {
            this.f17001b = v;
        }

        public final V get() {
            return this.f17001b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[status=SUCCESS, result=[");
            return C16530d.m42015h(sb, this.f17001b, "]]");
        }
    }

    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            runnable.toString();
            executor.toString();
            C4289j0.m11435b("ImmediateFuture");
        }
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public abstract V get() throws ExecutionException;

    public final V get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return get();
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
