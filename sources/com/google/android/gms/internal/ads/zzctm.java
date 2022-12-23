package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzctm implements Runnable {
    public final /* synthetic */ zzctr zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzctm(zzctr zzctr, int i, int i2) {
        this.zza = zzctr;
        this.zzb = i;
        this.zzc = i2;
    }

    public final void run() {
        this.zza.zzh(this.zzb, this.zzc);
    }
}
