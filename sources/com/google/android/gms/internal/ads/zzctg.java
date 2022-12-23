package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.Map;

public final class zzctg implements zzcso {
    private final zzdza zza;

    public zzctg(zzdza zzdza) {
        this.zza = zzdza;
    }

    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzl(str.equals(InneractiveMediationDefs.SHOW_HOUSE_AD_YES));
        }
    }
}
