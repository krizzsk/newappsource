package com.google.android.gms.internal.ads;

final class zzbac implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzbag zzc;

    public zzbac(zzbag zzbag, int i, long j) {
        this.zzc = zzbag;
        this.zza = i;
        this.zzb = j;
    }

    public final void run() {
        this.zzc.zzb.zzl(this.zza, this.zzb);
    }
}
