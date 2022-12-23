package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class zzaoo implements zzaor {
    public final /* synthetic */ Activity zza;

    public zzaoo(zzaos zzaos, Activity activity) {
        this.zza = activity;
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.zza);
    }
}
