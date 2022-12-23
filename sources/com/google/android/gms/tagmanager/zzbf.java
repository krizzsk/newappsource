package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.util.List;
import java.util.Map;

final class zzbf extends zzft {
    private static final String zza = zza.DATA_LAYER_WRITE.toString();
    private static final String zzb = zzb.VALUE.toString();
    private static final String zzc = zzb.CLEAR_PERSISTENT_DATA_LAYER_PREFIX.toString();
    private final DataLayer zzd;

    public zzbf(DataLayer dataLayer) {
        super(zza, zzb);
        this.zzd = dataLayer;
    }

    public final void zzc(Map<String, zzak> map) {
        String zzn;
        zzak zzak = map.get(zzb);
        if (zzak != null) {
            Object zzl = zzfv.zzl(zzak);
            if (zzl instanceof List) {
                for (Object next : (List) zzl) {
                    if (next instanceof Map) {
                        this.zzd.push((Map) next);
                    }
                }
            }
        }
        zzak zzak2 = map.get(zzc);
        if (zzak2 != null && (zzn = zzfv.zzn(zzfv.zzl(zzak2))) != zzfv.zzm()) {
            this.zzd.zzd(zzn);
        }
    }
}
