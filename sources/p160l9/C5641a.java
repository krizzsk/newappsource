package p160l9;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: l9.a */
public final class C5641a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: c */
    public static final AtomicBoolean f18391c = new AtomicBoolean();

    /* renamed from: d */
    public static final C5641a f18392d = new C5641a();

    /* renamed from: b */
    public volatile WeakReference<Activity> f18393b = null;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityPostStopped(Activity activity) {
        WeakReference<Activity> weakReference = this.f18393b;
        if (weakReference != null && weakReference.get() == activity) {
            this.f18393b = null;
        }
    }

    public final void onActivityPreStarted(Activity activity) {
        this.f18393b = new WeakReference<>(activity);
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
