package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzbnm implements zzbol {
    private final zzbnn zza;

    public zzbnm(zzbnn zzbnn) {
        this.zza = zzbnn;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            zzcfi.zzj("App event with no name parameter.");
        } else {
            this.zza.zzbD(str, (String) map.get("info"));
        }
    }
}
