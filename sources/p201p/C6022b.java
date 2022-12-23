package p201p;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import ci0.C21211f;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: p.b */
public final class C6022b extends C21211f {

    /* renamed from: b */
    public final Object f19242b = new Object();

    /* renamed from: c */
    public final ExecutorService f19243c = Executors.newFixedThreadPool(4, new C6023a());

    /* renamed from: d */
    public volatile Handler f19244d;

    /* renamed from: p.b$a */
    public class C6023a implements ThreadFactory {

        /* renamed from: b */
        public final AtomicInteger f19245b = new AtomicInteger(0);

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f19245b.getAndIncrement())}));
            return thread;
        }
    }

    /* renamed from: w */
    public static Handler m14514w(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
