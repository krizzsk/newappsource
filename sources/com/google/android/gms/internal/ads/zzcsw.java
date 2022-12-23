package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;

public final class zzcsw implements zzcso {
    private final zzdza zza;

    public zzcsw(zzdza zzdza) {
        this.zza = zzdza;
    }

    public final void zza(Map map) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhH)).booleanValue()) {
            String str = (String) map.get("policy_violations");
            if (!TextUtils.isEmpty(str)) {
                this.zza.zzk(str);
            }
        }
    }
}
