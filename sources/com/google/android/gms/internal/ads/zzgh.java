package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzgh implements Runnable {
    public final /* synthetic */ zzgi zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzgh(zzgi zzgi, int i) {
        this.zza = zzgi;
        this.zzb = i;
    }

    public final void run() {
        zzgi zzgi = this.zza;
        zzgk.zzc(zzgi.zza, this.zzb);
    }
}
