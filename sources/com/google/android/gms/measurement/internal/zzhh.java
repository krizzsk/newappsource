package com.google.android.gms.measurement.internal;

final class zzhh implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzid zzb;

    public zzhh(zzid zzid, long j) {
        this.zzb = zzid;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzs.zzm().zzf.zzb(this.zza);
        this.zzb.zzs.zzay().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}
