package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyz */
public final class zzyz implements zzwp {
    private static final String zza = "zzyz";
    private List zzb;

    public final /* bridge */ /* synthetic */ zzwp zza(String str) throws zzui {
        zzb(str);
        return this;
    }

    public final zzyz zzb(String str) throws zzui {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.zzb.add(optJSONArray.getString(i));
                }
            }
            return this;
        } catch (JSONException e) {
            throw zzaam.zza(e, zza, str);
        }
    }

    public final List zzc() {
        return this.zzb;
    }
}
