package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final /* synthetic */ class zzegp implements Callable {
    public final /* synthetic */ zzegs zza;
    public final /* synthetic */ zzfbs zzb;
    public final /* synthetic */ zzfbg zzc;

    public /* synthetic */ zzegp(zzegs zzegs, zzfbs zzfbs, zzfbg zzfbg) {
        this.zza = zzegs;
        this.zzb = zzfbs;
        this.zzc = zzfbg;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc);
    }
}
