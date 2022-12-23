package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class zzaol implements zzaor {
    public final /* synthetic */ Activity zza;

    public zzaol(zzaos zzaos, Activity activity) {
        this.zza = activity;
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.zza);
    }
}
