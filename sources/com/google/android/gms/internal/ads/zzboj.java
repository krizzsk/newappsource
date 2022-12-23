package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzboj implements zzbol {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        if (map.keySet().contains("start")) {
            zzcli.zzau(true);
        }
        if (map.keySet().contains("stop")) {
            zzcli.zzau(false);
        }
    }
}
