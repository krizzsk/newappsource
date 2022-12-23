package p110h8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.facebook.appevents.C2337i;
import mf0.C24362h;
import p009a8.C0115o;
import p304x.C7067k;

/* renamed from: h8.b */
public final class C5138b implements Application.ActivityLifecycleCallbacks {
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C24362h.m61211f(activity, "activity");
    }

    public final void onActivityDestroyed(Activity activity) {
        C24362h.m61211f(activity, "activity");
    }

    public final void onActivityPaused(Activity activity) {
        C24362h.m61211f(activity, "activity");
    }

    public final void onActivityResumed(Activity activity) {
        C24362h.m61211f(activity, "activity");
        try {
            C0115o.m212c().execute(new C2337i(1));
        } catch (Exception unused) {
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C24362h.m61211f(activity, "activity");
        C24362h.m61211f(bundle, "outState");
    }

    public final void onActivityStarted(Activity activity) {
        C24362h.m61211f(activity, "activity");
    }

    public final void onActivityStopped(Activity activity) {
        C24362h.m61211f(activity, "activity");
        try {
            if (C24362h.m61206a(C5139c.f17151d, Boolean.TRUE) && C24362h.m61206a(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                C0115o.m212c().execute(new C7067k(2));
            }
        } catch (Exception unused) {
        }
    }
}
