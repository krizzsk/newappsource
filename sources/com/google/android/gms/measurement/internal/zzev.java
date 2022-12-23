package com.google.android.gms.measurement.internal;

final class zzev implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzew zzb;

    public zzev(zzew zzew, boolean z) {
        this.zzb = zzew;
        this.zza = z;
    }

    public final void run() {
        this.zzb.zzb.zzJ(this.zza);
    }
}
