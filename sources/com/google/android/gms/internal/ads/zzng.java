package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzng implements Runnable {
    public final /* synthetic */ zznk zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzng(zznk zznk, Exception exc) {
        this.zza = zznk;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzi(this.zzb);
    }
}
