package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzckc implements Runnable {
    public final /* synthetic */ zzchr zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ long zzc;

    public /* synthetic */ zzckc(zzchr zzchr, boolean z, long j) {
        this.zza = zzchr;
        this.zzb = z;
        this.zzc = j;
    }

    public final void run() {
        this.zza.zzx(this.zzb, this.zzc);
    }
}
