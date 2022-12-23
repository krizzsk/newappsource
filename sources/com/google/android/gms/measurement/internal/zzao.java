package com.google.android.gms.measurement.internal;

final class zzao implements Runnable {
    public final /* synthetic */ zzgt zza;
    public final /* synthetic */ zzap zzb;

    public zzao(zzap zzap, zzgt zzgt) {
        this.zzb = zzap;
        this.zza = zzgt;
    }

    public final void run() {
        this.zza.zzaw();
        if (zzab.zza()) {
            this.zza.zzaz().zzp(this);
            return;
        }
        boolean zze = this.zzb.zze();
        this.zzb.zzd = 0;
        if (zze) {
            this.zzb.zzc();
        }
    }
}
