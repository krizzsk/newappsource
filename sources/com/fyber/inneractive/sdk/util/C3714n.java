package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.util.n */
public class C3714n {

    /* renamed from: a */
    public static final Executor f12901a;

    /* renamed from: b */
    public static final Handler f12902b = new Handler(Looper.getMainLooper());

    /* renamed from: com.fyber.inneractive.sdk.util.n$a */
    public class C3715a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f12903a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            StringBuilder k = C13555b.m33972k("IAConcurrencyUtil#");
            k.append(this.f12903a.getAndIncrement());
            return new Thread(runnable, k.toString());
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.n$b */
    public class C3716b implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            IAlog.m9902a("rejectedExecution received for - %s", runnable);
        }
    }

    static {
        C3715a aVar = new C3715a();
        C3716b bVar = new C3716b();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(32), aVar, bVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f12901a = threadPoolExecutor;
    }

    /* renamed from: a */
    public static void m9976a(Runnable runnable) {
        ((ThreadPoolExecutor) f12901a).execute(runnable);
    }
}
