package p531he;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: he.a0 */
public final class C17388a0 {
    /* renamed from: a */
    public static ExecutorService m43434a(String str) {
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new C17423y(str, new AtomicLong(1)), new ThreadPoolExecutor.DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread(new C17425z(str, unconfigurableExecutorService, TimeUnit.SECONDS), C25541a.m63881k("Crashlytics Shutdown Hook for ", str)));
        return unconfigurableExecutorService;
    }
}
