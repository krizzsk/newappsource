package p746qh;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import java.util.Collections;
import p389bl.C13637c;
import p864vh.C20134b;

/* renamed from: qh.b */
public final class C19121b implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e */
    public static C19121b f48610e = new C19121b();

    /* renamed from: b */
    public boolean f48611b;

    /* renamed from: c */
    public boolean f48612c;

    /* renamed from: d */
    public C19122a f48613d;

    /* renamed from: qh.b$a */
    public interface C19122a {
    }

    /* renamed from: a */
    public final void mo51558a(boolean z) {
        if (this.f48612c != z) {
            this.f48612c = z;
            if (this.f48611b) {
                mo51559b();
                if (this.f48613d == null) {
                    return;
                }
                if (!z) {
                    C20134b.f51093h.getClass();
                    C20134b.m47732a();
                    return;
                }
                C20134b.f51093h.getClass();
                Handler handler = C20134b.f51095j;
                if (handler != null) {
                    handler.removeCallbacks(C20134b.f51097l);
                    C20134b.f51095j = null;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo51559b() {
        boolean z;
        String str;
        boolean z2 = !this.f48612c;
        for (T t : Collections.unmodifiableCollection(C19120a.f48607c.f48608a)) {
            AdSessionStatePublisher adSessionStatePublisher = t.f47714e;
            if (adSessionStatePublisher.f36928a.get() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (z2) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                C13637c.m34066c(adSessionStatePublisher.mo44193h(), "setState", str);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        mo51558a(false);
    }

    public final void onActivityStopped(Activity activity) {
        boolean z;
        boolean z2;
        View view;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z3 = false;
        if (runningAppProcessInfo.importance != 100) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = true;
        for (T t : Collections.unmodifiableCollection(C19120a.f48607c.f48609b)) {
            if (!t.f47715f || t.f47716g) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && (view = (View) t.f47713d.get()) != null && view.hasWindowFocus()) {
                z4 = false;
            }
        }
        if (z && z4) {
            z3 = true;
        }
        mo51558a(z3);
    }
}
