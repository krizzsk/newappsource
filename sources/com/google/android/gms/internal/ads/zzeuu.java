package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final /* synthetic */ class zzeuu implements Callable {
    public final /* synthetic */ zzfvj zza;
    public final /* synthetic */ zzfvj zzb;

    public /* synthetic */ zzeuu(zzfvj zzfvj, zzfvj zzfvj2) {
        this.zza = zzfvj;
        this.zzb = zzfvj2;
    }

    public final Object call() {
        return new zzeuw((String) this.zza.get(), (String) this.zzb.get());
    }
}
