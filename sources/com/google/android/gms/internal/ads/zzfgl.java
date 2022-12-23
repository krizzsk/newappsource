package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzfgl {
    private final Executor zza;
    private final zzcfn zzb;

    public zzfgl(Executor executor, zzcfn zzcfn) {
        this.zza = executor;
        this.zzb = zzcfn;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(String str) {
        this.zza.execute(new zzfgk(this, str));
    }
}
