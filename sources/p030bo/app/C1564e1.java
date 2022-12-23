package p030bo.app;

import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bo.app.e1 */
public class C1564e1 implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f5635a = new AtomicInteger(1);

    /* renamed from: b */
    public final String f5636b;

    /* renamed from: c */
    public Thread.UncaughtExceptionHandler f5637c;

    public C1564e1() {
        Class<C1564e1> cls = C1564e1.class;
        this.f5636b = "e1";
    }

    /* renamed from: a */
    public void mo6028a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f5637c = uncaughtExceptionHandler;
    }

    public Thread newThread(Runnable runnable) {
        if (this.f5637c != null) {
            Thread thread = new Thread(runnable, this.f5636b + " #" + this.f5635a.getAndIncrement());
            thread.setUncaughtExceptionHandler(this.f5637c);
            return thread;
        }
        throw new IllegalStateException("No UncaughtExceptionHandler. You must call setUncaughtExceptionHandler before creating a new thread");
    }

    public C1564e1(String str) {
        this.f5636b = str;
    }
}
