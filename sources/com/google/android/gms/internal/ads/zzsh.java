package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzsh implements Runnable {
    public final /* synthetic */ zzsk zza;
    public final /* synthetic */ zzsl zzb;
    public final /* synthetic */ zzrs zzc;
    public final /* synthetic */ zzrx zzd;

    public /* synthetic */ zzsh(zzsk zzsk, zzsl zzsl, zzrs zzrs, zzrx zzrx) {
        this.zza = zzsk;
        this.zzb = zzsl;
        this.zzc = zzrs;
        this.zzd = zzrx;
    }

    public final void run() {
        zzsk zzsk = this.zza;
        this.zzb.zzaj(zzsk.zza, zzsk.zzb, this.zzc, this.zzd);
    }
}
