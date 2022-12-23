package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Map;

final class zzboc implements zzbol {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        if (zzcli.zzL() != null) {
            zzcli.zzL().zza();
        }
        zzl zzN = zzcli.zzN();
        if (zzN != null) {
            zzN.zzb();
            return;
        }
        zzl zzO = zzcli.zzO();
        if (zzO != null) {
            zzO.zzb();
        } else {
            zzcfi.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
