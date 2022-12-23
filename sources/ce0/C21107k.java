package ce0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ce0.k */
public final class C21107k implements ThreadFactory {

    /* renamed from: b */
    public final String f52951b;

    /* renamed from: c */
    public ThreadFactory f52952c = Executors.defaultThreadFactory();

    /* renamed from: d */
    public AtomicInteger f52953d = new AtomicInteger(0);

    public C21107k(String str) {
        this.f52951b = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f52952c.newThread(runnable);
        newThread.setName(this.f52951b + "-th-" + this.f52953d.incrementAndGet());
        return newThread;
    }
}
