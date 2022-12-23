package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class zzko implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ zzkp zza;
    private final WeakReference zzb;

    public zzko(zzkp zzkp, WeakReference weakReference) {
        this.zza = zzkp;
        this.zzb = weakReference;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        if (activity == this.zzb.get()) {
            this.zza.zze = true;
            this.zza.zzg();
        }
    }

    public final void onActivityStopped(Activity activity) {
        if (activity == this.zzb.get()) {
            this.zza.zze = false;
            this.zza.zzg();
        }
    }
}
