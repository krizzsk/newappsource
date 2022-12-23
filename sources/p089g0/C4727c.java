package p089g0;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: g0.c */
public final class C4727c implements Executor {

    /* renamed from: c */
    public static volatile C4727c f16024c;

    /* renamed from: b */
    public final ExecutorService f16025b = Executors.newSingleThreadExecutor(new C4728a());

    /* renamed from: g0.c$a */
    public class C4728a implements ThreadFactory {
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    public final void execute(Runnable runnable) {
        this.f16025b.execute(runnable);
    }
}
