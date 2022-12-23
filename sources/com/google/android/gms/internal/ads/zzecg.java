package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final /* synthetic */ class zzecg implements Callable {
    public final /* synthetic */ zzfvj zza;
    public final /* synthetic */ zzfvj zzb;

    public /* synthetic */ zzecg(zzfvj zzfvj, zzfvj zzfvj2) {
        this.zza = zzfvj;
        this.zzb = zzfvj2;
    }

    public final Object call() {
        zzfvj zzfvj = this.zza;
        zzfvj zzfvj2 = this.zzb;
        return new zzecm((zzecq) zzfvj.get(), ((zzeck) zzfvj2.get()).zzb, ((zzeck) zzfvj2.get()).zza);
    }
}
