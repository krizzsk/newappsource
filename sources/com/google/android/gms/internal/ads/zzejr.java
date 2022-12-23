package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class zzejr implements zzefa {
    private final zzekv zza;

    public zzejr(zzekv zzekv) {
        this.zza = zzekv;
    }

    public final zzefb zza(String str, JSONObject jSONObject) throws zzfcd {
        zzbvs zza2 = this.zza.zza(str);
        if (zza2 == null) {
            return null;
        }
        return new zzefb(zza2, new zzegu(), str);
    }
}
