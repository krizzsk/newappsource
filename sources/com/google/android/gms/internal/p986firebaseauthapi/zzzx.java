package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzx */
public final class zzzx implements zzwp {
    private static final String zza = "zzzx";
    private String zzb;

    public final /* bridge */ /* synthetic */ zzwp zza(String str) throws zzui {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.zzb = Strings.emptyToNull(optJSONObject.optString("sessionInfo"));
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
