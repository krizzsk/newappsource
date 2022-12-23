package com.google.android.gms.measurement.internal;

final class zzjm implements Runnable {
    public final /* synthetic */ zzee zza;
    public final /* synthetic */ zzjr zzb;

    public zzjm(zzjr zzjr, zzee zzee) {
        this.zzb = zzjr;
        this.zza = zzee;
    }

    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzs.zzay().zzj().zza("Connected to service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
