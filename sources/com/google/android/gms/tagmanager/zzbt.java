package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import java.util.Map;

@VisibleForTesting
final class zzbt extends zzbu {
    private static final String zza = zza.EVENT.toString();
    private final zzeu zzb;

    public zzbt(zzeu zzeu) {
        super(zza, new String[0]);
        this.zzb = zzeu;
    }

    public final zzak zza(Map<String, zzak> map) {
        String zzb2 = this.zzb.zzb();
        if (zzb2 == null) {
            return zzfv.zzb();
        }
        return zzfv.zzc(zzb2);
    }

    public final boolean zzb() {
        return false;
    }
}
