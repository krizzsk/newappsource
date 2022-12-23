package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class zzaom implements zzaor {
    public final /* synthetic */ Activity zza;

    public zzaom(zzaos zzaos, Activity activity) {
        this.zza = activity;
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.zza);
    }
}
