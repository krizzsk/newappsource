package p824tp;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p435de.C16596f;

/* renamed from: tp.c */
public final class C19724c implements Application.ActivityLifecycleCallbacks {
    /* renamed from: a */
    public static String m47190a(Activity activity) {
        return activity.getClass().getSimpleName() + "[" + System.identityHashCode(activity) + "]";
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C16596f a = C16596f.m42113a();
        a.mo49363b(m47190a(activity) + " onActivityCreated(), savedState=" + bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        C16596f a = C16596f.m42113a();
        a.mo49363b(m47190a(activity) + " onActivityDestroyed()");
    }

    public final void onActivityPaused(Activity activity) {
        C16596f a = C16596f.m42113a();
        a.mo49363b(m47190a(activity) + " onActivityPaused()");
    }

    public final void onActivityResumed(Activity activity) {
        C16596f a = C16596f.m42113a();
        a.mo49363b(m47190a(activity) + " onActivityResumed()");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C16596f a = C16596f.m42113a();
        a.mo49363b(m47190a(activity) + " onActivitySaveInstanceState(), outState=" + bundle);
    }

    public final void onActivityStarted(Activity activity) {
        C16596f a = C16596f.m42113a();
        a.mo49363b(m47190a(activity) + " onActivityStarted()");
    }

    public final void onActivityStopped(Activity activity) {
        C16596f a = C16596f.m42113a();
        a.mo49363b(m47190a(activity) + " onActivityStopped()");
    }
}
