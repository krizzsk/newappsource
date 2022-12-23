package com.google.android.gms.internal.p986firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaai */
public final class zzaai implements zzwo {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzaai() {
    }

    public static zzaai zzb(String str, String str2, boolean z) {
        zzaai zzaai = new zzaai();
        zzaai.zzb = Preconditions.checkNotEmpty(str);
        zzaai.zzc = Preconditions.checkNotEmpty(str2);
        zzaai.zzf = z;
        return zzaai;
    }

    public static zzaai zzc(String str, String str2, boolean z) {
        zzaai zzaai = new zzaai();
        zzaai.zza = Preconditions.checkNotEmpty(str);
        zzaai.zzd = Preconditions.checkNotEmpty(str2);
        zzaai.zzf = z;
        return zzaai;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zzd(String str) {
        this.zze = str;
    }
}
