package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzdmx implements Runnable {
    public final /* synthetic */ zzdnb zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzdmx(zzdnb zzdnb, boolean z) {
        this.zza = zzdnb;
        this.zzb = z;
    }

    public final void run() {
        this.zza.zzs(this.zzb);
    }
}
