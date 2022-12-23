package com.google.android.gms.internal.p986firebaseauthapi;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzd */
public final class zzzd {
    private String zza;
    private String zzb;
    private String zzc;
    private Long zzd;
    private Long zze;

    public static zzzd zza(String str) throws UnsupportedEncodingException {
        try {
            zzzd zzzd = new zzzd();
            JSONObject jSONObject = new JSONObject(str);
            zzzd.zza = jSONObject.optString("iss");
            zzzd.zzb = jSONObject.optString("aud");
            zzzd.zzc = jSONObject.optString("sub");
            zzzd.zzd = Long.valueOf(jSONObject.optLong("iat"));
            zzzd.zze = Long.valueOf(jSONObject.optLong("exp"));
            jSONObject.optBoolean("is_anonymous");
            return zzzd;
        } catch (JSONException e) {
            if (Log.isLoggable("JwtToken", 3)) {
                "Failed to read JwtToken from JSONObject. ".concat(e.toString());
            }
            throw new UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(e.toString()));
        }
    }

    public final Long zzb() {
        return this.zze;
    }

    public final Long zzc() {
        return this.zzd;
    }
}
