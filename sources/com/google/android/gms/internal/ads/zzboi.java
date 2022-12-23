package com.google.android.gms.internal.ads;

import java.util.Map;

final class zzboi implements zzbol {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        if (map.keySet().contains("start")) {
            zzcli.zzP().zzk();
        } else if (map.keySet().contains("stop")) {
            zzcli.zzP().zzl();
        } else if (map.keySet().contains("cancel")) {
            zzcli.zzP().zzj();
        }
    }
}
