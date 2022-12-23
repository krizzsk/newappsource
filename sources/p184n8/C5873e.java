package p184n8;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import mf0.C24362h;
import p135j8.C5398d;
import p262t8.C6606a;
import p304x.C7099r1;

/* renamed from: n8.e */
public final class C5873e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e */
    public static final HashMap f18873e = new HashMap();

    /* renamed from: b */
    public final WeakReference<Activity> f18874b;

    /* renamed from: c */
    public final Handler f18875c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public final AtomicBoolean f18876d = new AtomicBoolean(false);

    /* renamed from: n8.e$a */
    public static final class C5874a {
        /* renamed from: a */
        public static void m14327a(Activity activity) {
            C24362h.m61211f(activity, "activity");
            int hashCode = activity.hashCode();
            HashMap hashMap = C5873e.f18873e;
            HashMap hashMap2 = null;
            if (!C6606a.m15601b(C5873e.class)) {
                try {
                    hashMap2 = C5873e.f18873e;
                } catch (Throwable th) {
                    C6606a.m15600a(C5873e.class, th);
                }
            }
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = hashMap2.get(valueOf);
            if (obj == null) {
                obj = new C5873e(activity);
                hashMap2.put(valueOf, obj);
            }
            C5873e eVar = (C5873e) obj;
            if (!C6606a.m15601b(C5873e.class)) {
                try {
                    if (!C6606a.m15601b(eVar)) {
                        if (!eVar.f18876d.getAndSet(true)) {
                            int i = C5398d.f17731a;
                            View b = C5398d.m13501b(eVar.f18874b.get());
                            if (b != null) {
                                ViewTreeObserver viewTreeObserver = b.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.addOnGlobalLayoutListener(eVar);
                                    eVar.mo21749a();
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    C6606a.m15600a(C5873e.class, th2);
                }
            }
        }

        /* renamed from: b */
        public static void m14328b(Activity activity) {
            C24362h.m61211f(activity, "activity");
            int hashCode = activity.hashCode();
            HashMap hashMap = C5873e.f18873e;
            HashMap hashMap2 = null;
            if (!C6606a.m15601b(C5873e.class)) {
                try {
                    hashMap2 = C5873e.f18873e;
                } catch (Throwable th) {
                    C6606a.m15600a(C5873e.class, th);
                }
            }
            C5873e eVar = (C5873e) hashMap2.remove(Integer.valueOf(hashCode));
            if (eVar != null && !C6606a.m15601b(C5873e.class)) {
                try {
                    if (!C6606a.m15601b(eVar)) {
                        if (eVar.f18876d.getAndSet(false)) {
                            int i = C5398d.f17731a;
                            View b = C5398d.m13501b(eVar.f18874b.get());
                            if (b != null) {
                                ViewTreeObserver viewTreeObserver = b.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnGlobalLayoutListener(eVar);
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    C6606a.m15600a(C5873e.class, th2);
                }
            }
        }
    }

    public C5873e(Activity activity) {
        this.f18874b = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public final void mo21749a() {
        if (!C6606a.m15601b(this)) {
            try {
                C7099r1 r1Var = new C7099r1(this, 6);
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    r1Var.run();
                } else {
                    this.f18875c.post(r1Var);
                }
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }

    public final void onGlobalLayout() {
        if (!C6606a.m15601b(this)) {
            try {
                mo21749a();
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
