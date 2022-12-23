package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyk */
public final class zzyk implements zzwo {
    private final String zza = Preconditions.checkNotEmpty("phone");
    private String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;

    public zzyk(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zzb = Preconditions.checkNotEmpty(str2);
        this.zzc = str3;
        this.zze = str4;
        this.zzd = str7;
    }

    public static zzyk zzb(String str, String str2, String str3, String str4) {
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotEmpty(str2);
        return new zzyk("phone", str, str2, str3, (String) null, (String) null, str4);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zzb);
        this.zza.getClass();
        jSONObject.put("mfaProvider", 1);
        String str = this.zzd;
        if (str != null) {
            jSONObject.put("displayName", str);
        }
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.zzc;
        if (str2 != null) {
            jSONObject2.put("sessionInfo", str2);
        }
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject2.put("code", str3);
        }
        jSONObject.put("phoneVerificationInfo", jSONObject2);
        return jSONObject.toString();
    }

    public final zzyk zzc(String str) {
        this.zzb = str;
        return this;
    }
}
