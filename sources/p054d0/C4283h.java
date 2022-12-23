package p054d0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p066e0.C4440l;

/* renamed from: d0.h */
public final class C4283h implements Executor {

    /* renamed from: d */
    public static final C4284a f15205d = new C4284a();

    /* renamed from: b */
    public final Object f15206b = new Object();

    /* renamed from: c */
    public ThreadPoolExecutor f15207c;

    /* renamed from: d0.h$a */
    public class C4284a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f15208b = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", new Object[]{Integer.valueOf(this.f15208b.getAndIncrement())}));
            return thread;
        }
    }

    public C4283h() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f15205d);
        threadPoolExecutor.setRejectedExecutionHandler(new C4281g());
        this.f15207c = threadPoolExecutor;
    }

    /* renamed from: a */
    public final void mo19801a(C4440l lVar) {
        ThreadPoolExecutor threadPoolExecutor;
        lVar.getClass();
        synchronized (this.f15206b) {
            try {
                if (this.f15207c.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f15205d);
                    threadPoolExecutor2.setRejectedExecutionHandler(new C4281g());
                    this.f15207c = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f15207c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        int max = Math.max(1, lVar.getAvailableCameraIds().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f15206b) {
            this.f15207c.execute(runnable);
        }
    }
}
