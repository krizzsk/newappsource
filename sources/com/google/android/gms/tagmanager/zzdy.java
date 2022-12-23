package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.util.Map;

@ShowFirstParty
@VisibleForTesting
public abstract class zzdy extends zzbu {
    private static final String zza = zzb.ARG0.toString();
    private static final String zzb = zzb.ARG1.toString();

    public zzdy(String str) {
        super(str, zza, zzb);
    }

    public final zzak zza(Map<String, zzak> map) {
        for (zzak zzak : map.values()) {
            if (zzak == zzfv.zzb()) {
                return zzfv.zzc(Boolean.FALSE);
            }
        }
        zzak zzak2 = map.get(zza);
        zzak zzak3 = map.get(zzb);
        boolean z = false;
        if (!(zzak2 == null || zzak3 == null)) {
            z = zzd(zzak2, zzak3, map);
        }
        return zzfv.zzc(Boolean.valueOf(z));
    }

    public final boolean zzb() {
        return true;
    }

    public abstract boolean zzd(zzak zzak, zzak zzak2, Map<String, zzak> map);
}
