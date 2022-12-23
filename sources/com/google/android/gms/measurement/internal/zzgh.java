package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzgh implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ zzgq zzb;

    public zzgh(zzgq zzgq, zzq zzq) {
        this.zzb = zzgq;
        this.zza = zzq;
    }

    public final void run() {
        this.zzb.zza.zzA();
        zzkz zzc = this.zzb.zza;
        zzq zzq = this.zza;
        zzc.zzaz().zzg();
        zzc.zzB();
        Preconditions.checkNotEmpty(zzq.zza);
        zzc.zzd(zzq);
    }
}
