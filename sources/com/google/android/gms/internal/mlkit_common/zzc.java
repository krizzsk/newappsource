package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import java.util.concurrent.Callable;
import p090g1.C4732a;

public final /* synthetic */ class zzc implements Callable {
    public final /* synthetic */ Context zza;

    public /* synthetic */ zzc(Context context) {
        this.zza = context;
    }

    public final Object call() {
        Context context = this.zza;
        int i = zzh.zza;
        return C4732a.getExternalCacheDirs(context);
    }
}
