package com.google.android.gms.internal.ads;

final class zzaaz implements zzzv {
    public final /* synthetic */ zzzv zza;
    public final /* synthetic */ zzaba zzb;

    public zzaaz(zzaba zzaba, zzzv zzzv) {
        this.zzb = zzaba;
        this.zza = zzzv;
    }

    public final long zze() {
        return this.zza.zze();
    }

    public final zzzt zzg(long j) {
        zzzt zzg = this.zza.zzg(j);
        zzzw zzzw = zzg.zza;
        zzzw zzzw2 = new zzzw(zzzw.zzb, this.zzb.zzb + zzzw.zzc);
        zzzw zzzw3 = zzg.zzb;
        return new zzzt(zzzw2, new zzzw(zzzw3.zzb, this.zzb.zzb + zzzw3.zzc));
    }

    public final boolean zzh() {
        return this.zza.zzh();
    }
}
