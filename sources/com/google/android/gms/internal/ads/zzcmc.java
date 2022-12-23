package com.google.android.gms.internal.ads;

import java.util.Map;

public final /* synthetic */ class zzcmc implements Runnable {
    public final /* synthetic */ zzcme zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcmc(zzcme zzcme, Map map) {
        this.zza = zzcme;
        this.zzb = map;
    }

    public final void run() {
        this.zza.zzr(this.zzb);
    }
}
