package td0;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: td0.e */
public final class C24935e<T> implements Future<T> {

    /* renamed from: b */
    public final Future<T> f63024b;

    static {
        Class<C24935e> cls = C24935e.class;
    }

    public C24935e(Future<T> future) {
        this.f63024b = future;
    }

    public final boolean cancel(boolean z) {
        return this.f63024b.cancel(z);
    }

    public final T get() {
        try {
            return this.f63024b.get();
        } catch (InterruptedException unused) {
            Thread.currentThread().getName();
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException unused2) {
            return null;
        }
    }

    public final boolean isCancelled() {
        return this.f63024b.isCancelled();
    }

    public final boolean isDone() {
        return this.f63024b.isDone();
    }

    public final T get(long j, TimeUnit timeUnit) {
        try {
            return this.f63024b.get(j, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().getName();
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException unused2) {
            return null;
        } catch (TimeoutException unused3) {
            Thread.currentThread().getName();
            return null;
        }
    }
}
