package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class zzbb implements Application.ActivityLifecycleCallbacks {
    private final Activity zza;
    private final zzbh zzb;

    public /* synthetic */ zzbb(Activity activity, zzbh zzbh, zzba zzba) {
        this.zza = activity;
        this.zzb = zzbh;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.zza) {
            String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()});
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
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
        if (activity == this.zza) {
            this.zzb.zzl(new zzap(1), 0);
        }
    }
}
