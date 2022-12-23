package com.google.android.gms.measurement.internal;

final class zzgp implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzgq zze;

    public zzgp(zzgq zzgq, String str, String str2, String str3, long j) {
        this.zze = zzgq;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
    }

    public final void run() {
        String str = this.zza;
        if (str == null) {
            this.zze.zza.zzR(this.zzb, (zzik) null);
            return;
        }
        this.zze.zza.zzR(this.zzb, new zzik(this.zzc, str, this.zzd));
    }
}
