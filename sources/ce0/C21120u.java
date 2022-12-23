package ce0;

import com.vungle.warren.persistence.C23192a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import td0.C24935e;

/* renamed from: ce0.u */
public final class C21120u extends ThreadPoolExecutor {
    public C21120u(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, C21107k kVar) {
        super(i, i2, j, timeUnit, blockingQueue, kVar);
        allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public final void mo53324a(Runnable runnable, Runnable runnable2) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError unused) {
            runnable2.run();
        }
    }

    /* renamed from: b */
    public final Future mo53325b(C23192a.C23202j jVar, C23192a.C23204k kVar) {
        try {
            return super.submit(jVar);
        } catch (OutOfMemoryError unused) {
            kVar.run();
            return new C24935e((Future) null);
        }
    }

    public final void execute(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError unused) {
        }
    }

    public final Future<?> submit(Runnable runnable) {
        try {
            return super.submit(runnable);
        } catch (OutOfMemoryError unused) {
            return new C24935e((Future) null);
        }
    }

    public final <T> Future<T> submit(Runnable runnable, T t) {
        try {
            return super.submit(runnable, t);
        } catch (OutOfMemoryError unused) {
            return new C24935e((Future) null);
        }
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        try {
            return super.submit(callable);
        } catch (OutOfMemoryError unused) {
            return new C24935e((Future) null);
        }
    }
}
