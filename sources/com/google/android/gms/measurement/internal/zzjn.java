package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class zzjn implements Runnable {
    public final /* synthetic */ ComponentName zza;
    public final /* synthetic */ zzjr zzb;

    public zzjn(zzjr zzjr, ComponentName componentName) {
        this.zzb = zzjr;
        this.zza = componentName;
    }

    public final void run() {
        zzjs.zzo(this.zzb.zza, this.zza);
    }
}
