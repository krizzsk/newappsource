package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzdzq implements Callable {
    public final /* synthetic */ zzaoc zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzdzq(zzaoc zzaoc, Context context) {
        this.zza = zzaoc;
        this.zzb = context;
    }

    public final Object call() {
        zzaoc zzaoc = this.zza;
        return zzaoc.zzc().zzg(this.zzb);
    }
}
