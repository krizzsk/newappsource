package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class zzbax implements zzbay {
    public final /* synthetic */ Activity zza;

    public zzbax(zzbaz zzbaz, Activity activity) {
        this.zza = activity;
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.zza);
    }
}
