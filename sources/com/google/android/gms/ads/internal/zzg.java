package com.google.android.gms.ads.internal;

public final /* synthetic */ class zzg implements Runnable {
    public final /* synthetic */ zzi zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzg(zzi zzi, boolean z) {
        this.zza = zzi;
        this.zzb = z;
    }

    public final void run() {
        this.zza.zzb(this.zzb);
    }
}
