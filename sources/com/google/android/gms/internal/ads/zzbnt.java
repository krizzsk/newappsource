package com.google.android.gms.internal.ads;

import java.util.Map;

public final /* synthetic */ class zzbnt implements zzbol {
    public final /* synthetic */ zzdjf zza;

    public /* synthetic */ zzbnt(zzdjf zzdjf) {
        this.zza = zzdjf;
    }

    public final void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        zzbok.zzd(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            zzcfi.zzj("URL missing from click GMSG.");
        } else {
            zzfva.zzr(zzbok.zzb(zzcli, str), new zzbob(zzcli), zzcfv.zza);
        }
    }
}
