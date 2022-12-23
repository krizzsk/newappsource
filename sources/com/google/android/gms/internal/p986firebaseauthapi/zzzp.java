package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzp */
public final class zzzp implements zzwp {
    private static final String zza = "zzzp";
    private String zzb;

    public final /* bridge */ /* synthetic */ zzwp zza(String str) throws zzui {
        try {
            this.zzb = Strings.emptyToNull(new JSONObject(str).optString("sessionInfo", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzaam.zza(e, zza, str);
        }
    }

    public final String zzb() {
        return this.zzb;
    }
}
