package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import com.google.android.gms.internal.gtm.zzb;
import java.util.Map;

final class zzfx extends zzbu {
    private static final String zza = zza.UPPERCASE_STRING.toString();
    private static final String zzb = zzb.ARG0.toString();

    public zzfx() {
        super(zza, zzb);
    }

    public final zzak zza(Map<String, zzak> map) {
        return zzfv.zzc(zzfv.zzn(zzfv.zzl(map.get(zzb))).toUpperCase());
    }

    public final boolean zzb() {
        return true;
    }
}
