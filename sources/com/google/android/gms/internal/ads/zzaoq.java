package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class zzaoq implements zzaor {
    public final /* synthetic */ Activity zza;

    public zzaoq(zzaos zzaos, Activity activity) {
        this.zza = activity;
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.zza);
    }
}
