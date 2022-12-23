package com.google.android.gms.internal.ads;

final class zzche implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzchf zzb;

    public zzche(zzchf zzchf, boolean z) {
        this.zzb = zzchf;
        this.zza = z;
    }

    public final void run() {
        this.zzb.zzJ("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
