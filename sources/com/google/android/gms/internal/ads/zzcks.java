package com.google.android.gms.internal.ads;

import java.util.Map;

public final /* synthetic */ class zzcks implements Runnable {
    public final /* synthetic */ zzchr zza;
    public final /* synthetic */ Map zzb;

    public /* synthetic */ zzcks(zzchr zzchr, Map map) {
        this.zza = zzchr;
        this.zzb = map;
    }

    public final void run() {
        zzchr zzchr = this.zza;
        Map map = this.zzb;
        int i = zzckv.zzc;
        zzchr.zzd("onGcacheInfoEvent", map);
    }
}
