package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzse implements Runnable {
    public final /* synthetic */ zzsk zza;
    public final /* synthetic */ zzsl zzb;
    public final /* synthetic */ zzrx zzc;

    public /* synthetic */ zzse(zzsk zzsk, zzsl zzsl, zzrx zzrx) {
        this.zza = zzsk;
        this.zzb = zzsl;
        this.zzc = zzrx;
    }

    public final void run() {
        zzsk zzsk = this.zza;
        this.zzb.zzaf(zzsk.zza, zzsk.zzb, this.zzc);
    }
}
