package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzxi implements Runnable {
    public final /* synthetic */ zzxq zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzxi(zzxq zzxq, Exception exc) {
        this.zza = zzxq;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
