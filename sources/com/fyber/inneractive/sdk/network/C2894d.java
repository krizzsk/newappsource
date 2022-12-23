package com.fyber.inneractive.sdk.network;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.fyber.inneractive.sdk.network.C2891c;

/* renamed from: com.fyber.inneractive.sdk.network.d */
public class C2894d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ C2891c f9893a;

    public C2894d(C2891c cVar) {
        this.f9893a = cVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        C2891c cVar = this.f9893a;
        Handler handler = cVar.f9879d;
        if (handler != null) {
            handler.post(new C2891c.C2892a(20150330, 3500));
        }
    }

    public void onActivityResumed(Activity activity) {
        Handler handler = this.f9893a.f9879d;
        if (handler != null) {
            handler.removeMessages(20150330);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
