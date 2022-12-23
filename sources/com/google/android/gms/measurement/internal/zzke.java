package com.google.android.gms.measurement.internal;

final class zzke {
    public final /* synthetic */ zzki zza;
    private zzkd zzb;

    public zzke(zzki zzki) {
        this.zza = zzki;
    }

    public final void zza(long j) {
        this.zzb = new zzkd(this, this.zza.zzs.zzav().currentTimeMillis(), j);
        this.zza.zzd.postDelayed(this.zzb, 2000);
    }

    public final void zzb() {
        this.zza.zzg();
        zzkd zzkd = this.zzb;
        if (zzkd != null) {
            this.zza.zzd.removeCallbacks(zzkd);
        }
        this.zza.zzs.zzm().zzl.zza(false);
    }
}
