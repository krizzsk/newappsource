package p201p;

import android.os.Looper;
import ci0.C21211f;
import java.util.concurrent.Executor;

/* renamed from: p.a */
public final class C6019a extends C21211f {

    /* renamed from: c */
    public static volatile C6019a f19238c;

    /* renamed from: d */
    public static final C6020a f19239d = new C6020a();

    /* renamed from: e */
    public static final C6021b f19240e = new C6021b();

    /* renamed from: b */
    public C6022b f19241b = new C6022b();

    /* renamed from: p.a$a */
    public static class C6020a implements Executor {
        public final void execute(Runnable runnable) {
            C6019a.m14512w().mo22018x(runnable);
        }
    }

    /* renamed from: p.a$b */
    public static class C6021b implements Executor {
        public final void execute(Runnable runnable) {
            C6019a.m14512w().f19241b.f19243c.execute(runnable);
        }
    }

    /* renamed from: w */
    public static C6019a m14512w() {
        if (f19238c != null) {
            return f19238c;
        }
        synchronized (C6019a.class) {
            if (f19238c == null) {
                f19238c = new C6019a();
            }
        }
        return f19238c;
    }

    /* renamed from: x */
    public final void mo22018x(Runnable runnable) {
        C6022b bVar = this.f19241b;
        if (bVar.f19244d == null) {
            synchronized (bVar.f19242b) {
                if (bVar.f19244d == null) {
                    bVar.f19244d = C6022b.m14514w(Looper.getMainLooper());
                }
            }
        }
        bVar.f19244d.post(runnable);
    }
}
