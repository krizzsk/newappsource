package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzbya {
    public final boolean zza;
    public final String zzb;

    public zzbya(boolean z, String str) {
        this.zza = z;
        this.zzb = str;
    }

    public static zzbya zza(JSONObject jSONObject) {
        return new zzbya(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""));
    }
}
