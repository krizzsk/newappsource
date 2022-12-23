package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.util.Map;

@VisibleForTesting
final class zzay extends zzbu {
    private static final String zza = zza.CUSTOM_VAR.toString();
    private static final String zzb = zzb.NAME.toString();
    private static final String zzc = zzb.DEFAULT_VALUE.toString();
    private final DataLayer zzd;

    public zzay(DataLayer dataLayer) {
        super(zza, zzb);
        this.zzd = dataLayer;
    }

    public final zzak zza(Map<String, zzak> map) {
        Object obj = this.zzd.get(zzfv.zzn(zzfv.zzl(map.get(zzb))));
        if (obj != null) {
            return zzfv.zzc(obj);
        }
        zzak zzak = map.get(zzc);
        if (zzak != null) {
            return zzak;
        }
        return zzfv.zzb();
    }

    public final boolean zzb() {
        return false;
    }
}
