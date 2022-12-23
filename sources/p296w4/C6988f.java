package p296w4;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: w4.f */
public final class C6988f {

    /* renamed from: a */
    public static final C6989a f21758a = new C6989a();

    /* renamed from: w4.f$a */
    public static class C6989a implements ThreadFactory {

        /* renamed from: b */
        public final ThreadFactory f21759b = Executors.defaultThreadFactory();

        /* renamed from: c */
        public final AtomicInteger f21760c = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            Thread newThread = this.f21759b.newThread(runnable);
            if (!newThread.isDaemon()) {
                newThread.setDaemon(true);
            }
            StringBuilder k = C13555b.m33972k("logback-");
            k.append(this.f21760c.getAndIncrement());
            newThread.setName(k.toString());
            return newThread;
        }
    }
}
