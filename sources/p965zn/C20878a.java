package p965zn;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p605ki.C18051e;

/* renamed from: zn.a */
public final class C20878a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    public final C20879a f52612b;

    /* renamed from: c */
    public long f52613c = System.currentTimeMillis();

    /* renamed from: zn.a$a */
    public interface C20879a {
        /* renamed from: a */
        void mo50525a();
    }

    public C20878a(C18051e eVar) {
        this.f52612b = eVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        this.f52613c = System.currentTimeMillis();
    }

    public final void onActivityResumed(Activity activity) {
        if (System.currentTimeMillis() >= this.f52613c + 3000) {
            this.f52612b.mo50525a();
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
