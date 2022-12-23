package com.google.android.gms.internal.gtm;

import android.content.ComponentName;

final class zzca implements Runnable {
    public final /* synthetic */ ComponentName zza;
    public final /* synthetic */ zzcb zzb;

    public zzca(zzcb zzcb, ComponentName componentName) {
        this.zzb = zzcb;
        this.zza = componentName;
    }

    public final void run() {
        zzcc.zzb(this.zzb.zza, this.zza);
    }
}
