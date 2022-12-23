package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import java.util.Map;

final class zze extends zzbu {
    private static final String zza = zza.ADVERTISER_ID.toString();
    private final zzd zzb;

    @VisibleForTesting
    public zze(zzd zzd) {
        super(zza, new String[0]);
        this.zzb = zzd;
        zzd.zzc();
    }

    public final zzak zza(Map<String, zzak> map) {
        String zzc = this.zzb.zzc();
        if (zzc == null) {
            return zzfv.zzb();
        }
        return zzfv.zzc(zzc);
    }

    public final boolean zzb() {
        return false;
    }
}
