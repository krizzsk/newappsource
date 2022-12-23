package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zzak;
import java.util.Map;

abstract class zzfl extends zzdy {
    public zzfl(String str) {
        super(str);
    }

    public abstract boolean zzc(String str, String str2, Map<String, zzak> map);

    public final boolean zzd(zzak zzak, zzak zzak2, Map<String, zzak> map) {
        String zzn = zzfv.zzn(zzfv.zzl(zzak));
        String zzn2 = zzfv.zzn(zzfv.zzl(zzak2));
        if (zzn == zzfv.zzm() || zzn2 == zzfv.zzm()) {
            return false;
        }
        return zzc(zzn, zzn2, map);
    }
}
