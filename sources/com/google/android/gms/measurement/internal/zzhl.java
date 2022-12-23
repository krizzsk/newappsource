package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzhl implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzid zzb;

    public zzhl(zzid zzid, long j) {
        this.zzb = zzid;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzL(this.zza, true);
        this.zzb.zzs.zzt().zzu(new AtomicReference());
    }
}
