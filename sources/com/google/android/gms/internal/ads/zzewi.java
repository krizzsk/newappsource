package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

public final /* synthetic */ class zzewi implements Runnable {
    public final /* synthetic */ zzewj zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzewi(zzewj zzewj, zze zze) {
        this.zza = zzewj;
        this.zzb = zze;
    }

    public final void run() {
        zzewj zzewj = this.zza;
        zzewj.zze.zzd.zza(this.zzb);
    }
}
