package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzxg implements Runnable {
    public final /* synthetic */ zzxq zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzxg(zzxq zzxq, int i, long j) {
        this.zza = zzxq;
        this.zzb = i;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}
