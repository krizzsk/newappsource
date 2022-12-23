package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class zzaw implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ zzay zza;
    private final Activity zzb;

    public zzaw(zzay zzay, Activity activity) {
        this.zza = zzay;
        this.zzb = activity;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.zzb) {
            this.zza.zzd(new zzj(3, "Activity is destroyed."));
        }
    }

    public final void onActivityPaused(Activity activity) {
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
