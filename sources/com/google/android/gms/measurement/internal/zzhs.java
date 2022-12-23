package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzhs implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzid zzb;

    public zzhs(zzid zzid, AtomicReference atomicReference) {
        this.zzb = zzid;
        this.zza = atomicReference;
    }

    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(this.zzb.zzs.zzf().zzo(this.zzb.zzs.zzh().zzl(), zzeb.zzK));
                this.zza.notify();
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
