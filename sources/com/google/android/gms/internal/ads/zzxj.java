package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzxj implements Runnable {
    public final /* synthetic */ zzxq zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzxj(zzxq zzxq, long j, int i) {
        this.zza = zzxq;
        this.zzb = j;
        this.zzc = i;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc);
    }
}
