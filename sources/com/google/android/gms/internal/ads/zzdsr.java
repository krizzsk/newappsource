package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzdsr implements Runnable {
    public final /* synthetic */ zzcli zza;

    public /* synthetic */ zzdsr(zzcli zzcli) {
        this.zza = zzcli;
    }

    public final void run() {
        this.zza.destroy();
    }
}
