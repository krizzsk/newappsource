package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzak;
import java.util.Map;

abstract class zzdr extends zzdy {
    public zzdr(String str) {
        super(str);
    }

    public abstract boolean zzc(zzfu zzfu, zzfu zzfu2, Map<String, zzak> map);

    public final boolean zzd(zzak zzak, zzak zzak2, Map<String, zzak> map) {
        zzfu zze = zzfv.zze(zzfv.zzl(zzak));
        zzfu zze2 = zzfv.zze(zzfv.zzl(zzak2));
        if (zze == zzfv.zzd() || zze2 == zzfv.zzd()) {
            return false;
        }
        return zzc(zze, zze2, map);
    }
}
