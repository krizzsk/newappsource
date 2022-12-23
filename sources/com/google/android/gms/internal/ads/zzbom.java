package com.google.android.gms.internal.ads;

import com.appboy.models.InAppMessageBase;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

public final class zzbom implements zzbol {
    private final zzdza zza;

    public zzbom(zzdza zzdza) {
        Preconditions.checkNotNull(zzdza, "The Inspector Manager must not be null");
        this.zza = zzdza;
    }

    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey(InAppMessageBase.EXTRAS)) {
            long j = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.zza.zzh((String) map.get(InAppMessageBase.EXTRAS), j);
        }
    }
}
