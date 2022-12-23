package com.google.android.gms.tagmanager;

final class zzcb implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzcc zzc;
    public final /* synthetic */ zzcc zzd;

    public zzcb(zzcc zzcc, zzcc zzcc2, long j, String str, byte[] bArr) {
        this.zzc = zzcc;
        this.zzd = zzcc2;
        this.zza = j;
        this.zzb = str;
    }

    public final void run() {
        if (this.zzc.zze == null) {
            zzff zzg = zzff.zzg();
            zzg.zzl(this.zzc.zzf, this.zzd);
            this.zzc.zze = zzg.zzf();
        }
        this.zzc.zze.zzb(this.zza, this.zzb);
    }
}
