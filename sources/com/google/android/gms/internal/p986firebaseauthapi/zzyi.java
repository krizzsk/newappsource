package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.auth.EmailAuthCredential;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p357ae.C13414a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyi */
public final class zzyi implements zzwo {
    private static final String zza = "zzyi";
    private static final Logger zzb = new Logger(zza, new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;

    public zzyi(EmailAuthCredential emailAuthCredential, String str) {
        this.zzc = Preconditions.checkNotEmpty(emailAuthCredential.f36375b);
        this.zzd = Preconditions.checkNotEmpty(emailAuthCredential.f36377d);
        this.zze = str;
    }

    public final String zza() throws JSONException {
        C13414a aVar;
        String str;
        String str2 = this.zzd;
        Map map = C13414a.f33281c;
        Preconditions.checkNotEmpty(str2);
        String str3 = null;
        try {
            aVar = new C13414a(str2);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        if (aVar != null) {
            str = aVar.f33282a;
        } else {
            str = null;
        }
        if (aVar != null) {
            str3 = aVar.f33283b;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzc);
        if (str != null) {
            jSONObject.put("oobCode", str);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        return jSONObject.toString();
    }
}
