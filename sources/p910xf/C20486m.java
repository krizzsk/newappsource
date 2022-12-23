package p910xf;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: xf.m */
public final class C20486m {

    /* renamed from: a */
    public static LinkedBlockingQueue f51869a = new LinkedBlockingQueue();

    /* renamed from: b */
    public static LinkedBlockingQueue f51870b = new LinkedBlockingQueue();

    /* renamed from: c */
    public static LinkedBlockingQueue f51871c = new LinkedBlockingQueue();

    /* renamed from: d */
    public static LinkedBlockingQueue f51872d = new LinkedBlockingQueue();

    /* renamed from: e */
    public static final ThreadPoolExecutor f51873e;

    /* renamed from: xf.m$a */
    public static class C20487a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f51874b = new AtomicInteger(1);

        /* renamed from: c */
        public final String f51875c;

        public C20487a(String str) {
            this.f51875c = str;
        }

        public final Thread newThread(Runnable runnable) {
            StringBuilder k = C13555b.m33972k("FirebaseStorage-");
            k.append(this.f51875c);
            k.append(this.f51874b.getAndIncrement());
            Thread thread = new Thread(runnable, k.toString());
            thread.setDaemon(false);
            thread.setPriority(9);
            return thread;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5, timeUnit, f51869a, new C20487a("Command-"));
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(2, 2, 5, timeUnit, f51870b, new C20487a("Upload-"));
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(3, 3, 5, timeUnit, f51871c, new C20487a("Download-"));
        ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 5, timeUnit, f51872d, new C20487a("Callbacks-"));
        f51873e = threadPoolExecutor4;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        threadPoolExecutor4.allowCoreThreadTimeOut(true);
    }
}
