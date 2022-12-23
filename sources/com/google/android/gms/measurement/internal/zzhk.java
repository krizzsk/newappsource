package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzhk implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzid zzc;

    public zzhk(zzid zzid, AtomicReference atomicReference, boolean z) {
        this.zzc = zzid;
        this.zza = atomicReference;
        this.zzb = z;
    }

    public final void run() {
        this.zzc.zzs.zzt().zzx(this.zza, this.zzb);
    }
}
