package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzye */
public final class zzye implements zzwo {
    private final String zza;
    private final String zzb = "http://localhost";
    private final String zzc;

    public zzye(String str, String str2) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzc = str2;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("identifier", this.zza);
        jSONObject.put("continueUri", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
