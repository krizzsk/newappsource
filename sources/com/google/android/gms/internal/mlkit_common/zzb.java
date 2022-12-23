package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import java.util.concurrent.Callable;
import p090g1.C4732a;

public final /* synthetic */ class zzb implements Callable {
    public final /* synthetic */ Context zza;

    public /* synthetic */ zzb(Context context) {
        this.zza = context;
    }

    public final Object call() {
        Context context = this.zza;
        int i = zzh.zza;
        return C4732a.getExternalFilesDirs(context, (String) null);
    }
}
