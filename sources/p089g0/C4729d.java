package p089g0;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g0.d */
public final class C4729d implements Executor {

    /* renamed from: c */
    public static volatile C4729d f16026c;

    /* renamed from: b */
    public final ExecutorService f16027b = Executors.newFixedThreadPool(2, new C4730a());

    /* renamed from: g0.d$a */
    public class C4730a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f16028b = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", new Object[]{Integer.valueOf(this.f16028b.getAndIncrement())}));
            return thread;
        }
    }

    public final void execute(Runnable runnable) {
        this.f16027b.execute(runnable);
    }
}
