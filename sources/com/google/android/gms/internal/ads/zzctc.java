package com.google.android.gms.internal.ads;

import org.json.JSONObject;

final class zzctc implements zzcsp {
    private final zzccp zza;

    public zzctc(zzccp zzccp) {
        this.zza = zzccp;
    }

    public final void zza(JSONObject jSONObject) {
        int i;
        long optLong = jSONObject.optLong("timestamp");
        if (jSONObject.optBoolean("npa_reset")) {
            i = -1;
        } else {
            i = jSONObject.optBoolean("npa");
        }
        this.zza.zzb(i, optLong);
    }
}
