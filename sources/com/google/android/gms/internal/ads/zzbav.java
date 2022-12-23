package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class zzbav implements zzbay {
    public final /* synthetic */ Activity zza;

    public zzbav(zzbaz zzbaz, Activity activity) {
        this.zza = activity;
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.zza);
    }
}
