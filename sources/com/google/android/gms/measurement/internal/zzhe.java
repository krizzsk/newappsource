package com.google.android.gms.measurement.internal;

public final /* synthetic */ class zzhe implements Runnable {
    public final /* synthetic */ zzid zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzhe(zzid zzid, String str) {
        this.zza = zzid;
        this.zzb = str;
    }

    public final void run() {
        zzid zzid = this.zza;
        if (zzid.zzs.zzh().zzp(this.zzb)) {
            zzid.zzs.zzh().zzo();
        }
    }
}
