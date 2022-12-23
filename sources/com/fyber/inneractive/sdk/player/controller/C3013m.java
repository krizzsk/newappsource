package com.fyber.inneractive.sdk.player.controller;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.fyber.inneractive.sdk.player.p050ui.C3457i;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.m */
public class C3013m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ C3009k f10313a;

    public C3013m(C3009k kVar) {
        this.f10313a = kVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (activity.equals(this.f10313a.f10290d.getContext())) {
            C3457i iVar = this.f10313a.f10290d;
            iVar.f12322h = true;
            if (iVar.f12330F != null) {
                IAlog.m9902a("Autoclick paused", new Object[0]);
                iVar.f12330F.mo15389a();
            }
            this.f10313a.f10290d.mo14676b();
        }
    }

    public void onActivityResumed(Activity activity) {
        if (activity.equals(this.f10313a.f10290d.getContext())) {
            C3457i iVar = this.f10313a.f10290d;
            iVar.f12322h = false;
            if (iVar.f12330F != null) {
                IAlog.m9902a("Autoclick resumed", new Object[0]);
                iVar.f12330F.mo15391b();
            }
            this.f10313a.f10290d.mo14676b();
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
