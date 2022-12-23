package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.C0995b0;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.lifecycle.z */
public final class C1047z implements C1033p {

    /* renamed from: j */
    public static final C1047z f3987j = new C1047z();

    /* renamed from: b */
    public int f3988b = 0;

    /* renamed from: c */
    public int f3989c = 0;

    /* renamed from: d */
    public boolean f3990d = true;

    /* renamed from: e */
    public boolean f3991e = true;

    /* renamed from: f */
    public Handler f3992f;

    /* renamed from: g */
    public final C1035q f3993g = new C1035q(this);

    /* renamed from: h */
    public C1048a f3994h = new C1048a();

    /* renamed from: i */
    public C1049b f3995i = new C1049b();

    /* renamed from: androidx.lifecycle.z$a */
    public class C1048a implements Runnable {
        public C1048a() {
        }

        public final void run() {
            C1047z zVar = C1047z.this;
            if (zVar.f3989c == 0) {
                zVar.f3990d = true;
                zVar.f3993g.mo4319f(Lifecycle.Event.ON_PAUSE);
            }
            C1047z zVar2 = C1047z.this;
            if (zVar2.f3988b == 0 && zVar2.f3990d) {
                zVar2.f3993g.mo4319f(Lifecycle.Event.ON_STOP);
                zVar2.f3991e = true;
            }
        }
    }

    /* renamed from: androidx.lifecycle.z$b */
    public class C1049b implements C0995b0.C0996a {
        public C1049b() {
        }
    }

    /* renamed from: androidx.lifecycle.z$c */
    public static class C1050c {
        /* renamed from: a */
        public static void m2923a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* renamed from: a */
    public final void mo4337a() {
        int i = this.f3989c + 1;
        this.f3989c = i;
        if (i != 1) {
            return;
        }
        if (this.f3990d) {
            this.f3993g.mo4319f(Lifecycle.Event.ON_RESUME);
            this.f3990d = false;
            return;
        }
        this.f3992f.removeCallbacks(this.f3994h);
    }

    public final Lifecycle getLifecycle() {
        return this.f3993g;
    }
}
