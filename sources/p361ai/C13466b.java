package p361ai;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import java.util.Collections;
import p487fi.C17019b;
import p583jk.C17884p;

/* renamed from: ai.b */
public final class C13466b implements Application.ActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e */
    public static C13466b f33335e = new C13466b();

    /* renamed from: b */
    public boolean f33336b;

    /* renamed from: c */
    public boolean f33337c;

    /* renamed from: d */
    public C13467a f33338d;

    /* renamed from: ai.b$a */
    public interface C13467a {
    }

    /* renamed from: a */
    public final void mo40374a(boolean z) {
        if (this.f33337c != z) {
            this.f33337c = z;
            if (this.f33336b) {
                mo40375b();
                if (this.f33338d == null) {
                    return;
                }
                if (!z) {
                    C17019b.f44140g.getClass();
                    C17019b.m42874a();
                    return;
                }
                C17019b.f44140g.getClass();
                Handler handler = C17019b.f44142i;
                if (handler != null) {
                    handler.removeCallbacks(C17019b.f44144k);
                    C17019b.f44142i = null;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo40375b() {
        boolean z;
        String str;
        boolean z2 = !this.f33337c;
        for (T t : Collections.unmodifiableCollection(C13465a.f33332c.f33333a)) {
            AdSessionStatePublisher adSessionStatePublisher = t.f52594e;
            if (adSessionStatePublisher.f36941a.get() != null) {
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
                C17884p.m44358b(adSessionStatePublisher.mo44205g(), "setState", str);
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
        mo40374a(false);
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
        for (T t : Collections.unmodifiableCollection(C13465a.f33332c.f33334b)) {
            if (!t.f52595f || t.f52596g) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && (view = (View) t.f52593d.get()) != null && view.hasWindowFocus()) {
                z4 = false;
            }
        }
        if (z && z4) {
            z3 = true;
        }
        mo40374a(z3);
    }
}
