package com.google.android.gms.internal.mlkit_common;

import java.util.concurrent.Callable;

public final /* synthetic */ class zzl implements Callable {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzl(String str) {
        this.zza = str;
    }

    public final Object call() {
        return zzm.zze(zzm.zzb.invoke(zzm.zzg, new Object[]{this.zza}));
    }
}
