package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzdq implements Runnable {
    public final /* synthetic */ zzdw zza;
    public final /* synthetic */ zzvx zzb;

    public /* synthetic */ zzdq(zzdw zzdw, zzvx zzvx, byte[] bArr) {
        this.zza = zzdw;
        this.zzb = zzvx;
    }

    public final void run() {
        zzdw zzdw = this.zza;
        zzvx zzvx = this.zzb;
        zzvx.zza.zzk(zzdw.zza());
    }
}
