package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class zzgn implements Callable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzgq zzb;

    public zzgn(zzgq zzgq, String str) {
        this.zzb = zzgq;
        this.zza = str;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        this.zzb.zza.zzA();
        return this.zzb.zza.zzi().zzu(this.zza);
    }
}
