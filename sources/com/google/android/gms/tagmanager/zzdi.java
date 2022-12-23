package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.util.Map;

final class zzdi extends zzbu {
    private static final String zza = zza.LOWERCASE_STRING.toString();
    private static final String zzb = zzb.ARG0.toString();

    public zzdi() {
        super(zza, zzb);
    }

    public final zzak zza(Map<String, zzak> map) {
        return zzfv.zzc(zzfv.zzn(zzfv.zzl(map.get(zzb))).toLowerCase());
    }

    public final boolean zzb() {
        return true;
    }
}
