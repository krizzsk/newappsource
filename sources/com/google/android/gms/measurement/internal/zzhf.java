package com.google.android.gms.measurement.internal;

public final /* synthetic */ class zzhf implements Runnable {
    public final /* synthetic */ zzid zza;

    public /* synthetic */ zzhf(zzid zzid) {
        this.zza = zzid;
    }

    public final void run() {
        zzid zzid = this.zza;
        zzid.zzg();
        if (!zzid.zzs.zzm().zzm.zzb()) {
            long zza2 = zzid.zzs.zzm().zzn.zza();
            zzid.zzs.zzm().zzn.zzb(1 + zza2);
            zzid.zzs.zzf();
            if (zza2 >= 5) {
                C16759e.m42354j(zzid.zzs, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                zzid.zzs.zzm().zzm.zza(true);
                return;
            }
            zzid.zzs.zzE();
            return;
        }
        zzid.zzs.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
