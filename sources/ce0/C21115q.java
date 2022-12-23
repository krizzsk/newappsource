package ce0;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: ce0.q */
public final class C21115q implements C21103h {

    /* renamed from: a */
    public static int f52970a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    public static final C21120u f52971b;

    /* renamed from: c */
    public static final C21120u f52972c;

    /* renamed from: d */
    public static final C21120u f52973d;

    /* renamed from: e */
    public static final C21116a f52974e = new C21116a();

    /* renamed from: f */
    public static final C21120u f52975f;

    /* renamed from: g */
    public static final C21120u f52976g;

    /* renamed from: h */
    public static final C21120u f52977h;

    /* renamed from: i */
    public static final C21120u f52978i;

    /* renamed from: j */
    public static final C21120u f52979j;

    /* renamed from: k */
    public static final C21120u f52980k;

    /* renamed from: l */
    public static final C21120u f52981l;

    /* renamed from: ce0.q$a */
    public class C21116a extends AbstractExecutorService {

        /* renamed from: b */
        public final Handler f52982b = new Handler(Looper.getMainLooper());

        public final boolean awaitTermination(long j, TimeUnit timeUnit) {
            return false;
        }

        public final void execute(Runnable runnable) {
            this.f52982b.post(runnable);
        }

        public final boolean isShutdown() {
            return false;
        }

        public final boolean isTerminated() {
            return false;
        }

        public final void shutdown() {
        }

        public final List<Runnable> shutdownNow() {
            return null;
        }
    }

    static {
        int i = f52970a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f52973d = new C21120u(i, i, 1, timeUnit, new PriorityBlockingQueue(), new C21107k("vng_jr"));
        TimeUnit timeUnit2 = timeUnit;
        f52971b = new C21120u(1, 1, 5, timeUnit2, new LinkedBlockingQueue(), new C21107k("vng_io"));
        f52976g = new C21120u(1, 1, 5, timeUnit2, new LinkedBlockingQueue(), new C21107k("vng_logger"));
        f52972c = new C21120u(1, 1, 10, timeUnit2, new LinkedBlockingQueue(), new C21107k("vng_background"));
        f52975f = new C21120u(1, 1, 10, timeUnit2, new LinkedBlockingQueue(), new C21107k("vng_api"));
        f52977h = new C21120u(1, 20, 10, timeUnit2, new SynchronousQueue(), new C21107k("vng_task"));
        f52978i = new C21120u(1, 1, 10, timeUnit2, new LinkedBlockingQueue(), new C21107k("vng_ua"));
        f52979j = new C21120u(4, 4, 1, timeUnit2, new PriorityBlockingQueue(), new C21107k("vng_down"));
        f52980k = new C21120u(1, 1, 10, timeUnit2, new LinkedBlockingQueue(), new C21107k("vng_ol"));
        f52981l = new C21120u(1, 1, 5, timeUnit2, new LinkedBlockingQueue(), new C21107k("vng_session"));
    }

    /* renamed from: a */
    public final C21120u mo53296a() {
        return f52975f;
    }

    /* renamed from: b */
    public final C21120u mo53297b() {
        return f52977h;
    }

    /* renamed from: c */
    public final C21120u mo53298c() {
        return f52976g;
    }

    /* renamed from: d */
    public final C21120u mo53299d() {
        return f52971b;
    }

    /* renamed from: e */
    public final C21120u mo53300e() {
        return f52973d;
    }

    /* renamed from: f */
    public final C21116a mo53301f() {
        return f52974e;
    }

    /* renamed from: g */
    public final C21120u mo53302g() {
        return f52980k;
    }

    /* renamed from: h */
    public final C21120u mo53303h() {
        return f52978i;
    }

    /* renamed from: i */
    public final C21120u mo53304i() {
        return f52979j;
    }

    /* renamed from: j */
    public final C21120u mo53305j() {
        return f52972c;
    }
}
