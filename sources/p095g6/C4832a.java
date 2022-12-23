package p095g6;

import android.os.Process;
import android.os.StrictMode;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g6.a */
public final class C4832a implements ExecutorService {

    /* renamed from: c */
    public static final long f16250c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: d */
    public static volatile int f16251d;

    /* renamed from: b */
    public final ExecutorService f16252b;

    /* renamed from: g6.a$a */
    public static final class C4833a implements ThreadFactory {

        /* renamed from: g6.a$a$a */
        public class C4834a extends Thread {
            public C4834a(Runnable runnable) {
                super(runnable);
            }

            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public final Thread newThread(Runnable runnable) {
            return new C4834a(runnable);
        }
    }

    /* renamed from: g6.a$b */
    public static final class C4835b implements ThreadFactory {

        /* renamed from: b */
        public final ThreadFactory f16253b;

        /* renamed from: c */
        public final String f16254c;

        /* renamed from: d */
        public final C4837c f16255d;

        /* renamed from: e */
        public final boolean f16256e;

        /* renamed from: f */
        public final AtomicInteger f16257f = new AtomicInteger();

        /* renamed from: g6.a$b$a */
        public class C4836a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Runnable f16258b;

            public C4836a(Runnable runnable) {
                this.f16258b = runnable;
            }

            public final void run() {
                if (C4835b.this.f16256e) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f16258b.run();
                } catch (Throwable th) {
                    C4835b.this.f16255d.handle(th);
                }
            }
        }

        public C4835b(C4833a aVar, String str, C4837c cVar, boolean z) {
            this.f16253b = aVar;
            this.f16254c = str;
            this.f16255d = cVar;
            this.f16256e = z;
        }

        public final Thread newThread(Runnable runnable) {
            Thread newThread = this.f16253b.newThread(new C4836a(runnable));
            StringBuilder k = C13555b.m33972k("glide-");
            k.append(this.f16254c);
            k.append("-thread-");
            k.append(this.f16257f.getAndIncrement());
            newThread.setName(k.toString());
            return newThread;
        }
    }

    /* renamed from: g6.a$c */
    public interface C4837c {

        /* renamed from: e0 */
        public static final C4838a f16260e0 = new C4838a();

        /* renamed from: g6.a$c$a */
        public class C4838a implements C4837c {
            public final void handle(Throwable th) {
            }
        }

        void handle(Throwable th);
    }

    public C4832a(ExecutorService executorService) {
        this.f16252b = executorService;
    }

    /* renamed from: a */
    public static C4832a m12161a() {
        return new C4832a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f16250c, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C4835b(new C4833a(), "source-unlimited", C4837c.f16260e0, false)));
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f16252b.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f16252b.execute(runnable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f16252b.invokeAll(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f16252b.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f16252b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f16252b.isTerminated();
    }

    public final void shutdown() {
        this.f16252b.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f16252b.shutdownNow();
    }

    public final Future<?> submit(Runnable runnable) {
        return this.f16252b.submit(runnable);
    }

    public final String toString() {
        return this.f16252b.toString();
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f16252b.invokeAll(collection, j, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f16252b.invokeAny(collection, j, timeUnit);
    }

    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.f16252b.submit(runnable, t);
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f16252b.submit(callable);
    }
}
