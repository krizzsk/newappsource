package com.google.android.gms.internal.p986firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzv */
public final class zzzv implements zzwp {
    private static final String zza = "zzzv";
    private String zzb;

    public final /* bridge */ /* synthetic */ zzwp zza(String str) throws zzui {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzag.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzaam.zza(e, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
