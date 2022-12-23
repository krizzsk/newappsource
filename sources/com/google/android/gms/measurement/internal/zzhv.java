package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzhv implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzid zzb;

    public zzhv(zzid zzid, AtomicReference atomicReference) {
        this.zzb = zzid;
        this.zza = atomicReference;
    }

    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(Double.valueOf(this.zzb.zzs.zzf().zza(this.zzb.zzs.zzh().zzl(), zzeb.zzN)));
                this.zza.notify();
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
