package com.google.android.gms.measurement.internal;

final class zzjo implements Runnable {
    public final /* synthetic */ zzee zza;
    public final /* synthetic */ zzjr zzb;

    public zzjo(zzjr zzjr, zzee zzee) {
        this.zzb = zzjr;
        this.zza = zzee;
    }

    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzs.zzay().zzc().zza("Connected to remote service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
