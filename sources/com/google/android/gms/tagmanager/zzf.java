package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzak;
import java.util.Map;

final class zzf extends zzbu {
    private static final String zza = zza.ADVERTISING_TRACKING_ENABLED.toString();
    private final zzd zzb;

    @VisibleForTesting
    public zzf(zzd zzd) {
        super(zza, new String[0]);
        this.zzb = zzd;
    }

    public final zzak zza(Map<String, zzak> map) {
        return zzfv.zzc(Boolean.valueOf(!this.zzb.zzf()));
    }

    public final boolean zzb() {
        return false;
    }
}
