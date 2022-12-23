package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzjf implements Runnable {
    public final /* synthetic */ zzjg zza;
    public final /* synthetic */ zzfre zzb;
    public final /* synthetic */ zzsb zzc;

    public /* synthetic */ zzjf(zzjg zzjg, zzfre zzfre, zzsb zzsb) {
        this.zza = zzjg;
        this.zzb = zzfre;
        this.zzc = zzsb;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}
