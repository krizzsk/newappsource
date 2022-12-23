package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzt;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzfl implements Callable {
    public final /* synthetic */ zzfp zza;

    public /* synthetic */ zzfl(zzfp zzfp) {
        this.zza = zzfp;
    }

    public final Object call() {
        return new zzt(this.zza.zze);
    }
}
