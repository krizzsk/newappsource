package p824tp;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: tp.e */
public final class C19727e implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public volatile Activity f50163b = null;

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
        this.f50163b = activity;
    }

    public final void onActivityStopped(Activity activity) {
        if (this.f50163b == activity) {
            this.f50163b = null;
        }
    }
}
