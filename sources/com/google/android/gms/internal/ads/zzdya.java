package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final /* synthetic */ class zzdya implements Callable {
    public final /* synthetic */ zzdyi zza;
    public final /* synthetic */ zzfhg zzb;

    public /* synthetic */ zzdya(zzdyi zzdyi, zzfhg zzfhg) {
        this.zza = zzdyi;
        this.zzb = zzfhg;
    }

    public final Object call() {
        this.zza.zzf(this.zzb);
        return null;
    }
}
