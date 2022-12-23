package com.google.android.gms.internal.ads;

final class zzaey implements zzzv {
    public final /* synthetic */ zzaez zza;

    public /* synthetic */ zzaey(zzaez zzaez, zzaex zzaex) {
        this.zza = zzaez;
    }

    public final long zze() {
        zzaez zzaez = this.zza;
        return zzaez.zzd.zzf(zzaez.zzf);
    }

    public final zzzt zzg(long j) {
        zzaez zzaez = this.zza;
        long zzg = zzaez.zzd.zzg(j);
        zzzw zzzw = new zzzw(j, zzeg.zzr((zzaez.zzb + (((zzaez.zzc - zzaez.zzb) * zzg) / zzaez.zzf)) - 30000, zzaez.zzb, zzaez.zzc - 1));
        return new zzzt(zzzw, zzzw);
    }

    public final boolean zzh() {
        return true;
    }
}
