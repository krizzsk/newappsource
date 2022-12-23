package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzxh implements Runnable {
    public final /* synthetic */ zzxq zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzxh(zzxq zzxq, Object obj, long j) {
        this.zza = zzxq;
        this.zzb = obj;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzm(this.zzb, this.zzc);
    }
}
