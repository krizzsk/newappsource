package com.google.android.gms.internal.p986firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.auth.zze;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaac */
public final class zzaac implements zzwp {
    private static final String zza = "zzaac";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private boolean zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private List zzs;
    private String zzt;

    public final /* bridge */ /* synthetic */ zzwp zza(String str) throws zzui {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optBoolean("needConfirmation", false);
            jSONObject.optBoolean("needEmail", false);
            this.zzc = Strings.emptyToNull(jSONObject.optString("idToken", (String) null));
            this.zzd = Strings.emptyToNull(jSONObject.optString("refreshToken", (String) null));
            this.zze = jSONObject.optLong("expiresIn", 0);
            this.zzf = Strings.emptyToNull(jSONObject.optString("localId", (String) null));
            this.zzg = Strings.emptyToNull(jSONObject.optString("email", (String) null));
            this.zzh = Strings.emptyToNull(jSONObject.optString("displayName", (String) null));
            this.zzi = Strings.emptyToNull(jSONObject.optString("photoUrl", (String) null));
            this.zzj = Strings.emptyToNull(jSONObject.optString("providerId", (String) null));
            this.zzk = Strings.emptyToNull(jSONObject.optString("rawUserInfo", (String) null));
            this.zzl = jSONObject.optBoolean("isNewUser", false);
            this.zzm = jSONObject.optString("oauthAccessToken", (String) null);
            this.zzn = jSONObject.optString("oauthIdToken", (String) null);
            this.zzp = Strings.emptyToNull(jSONObject.optString("errorMessage", (String) null));
            this.zzq = Strings.emptyToNull(jSONObject.optString("pendingToken", (String) null));
            this.zzr = Strings.emptyToNull(jSONObject.optString("tenantId", (String) null));
            this.zzs = zzze.zzf(jSONObject.optJSONArray("mfaInfo"));
            this.zzt = Strings.emptyToNull(jSONObject.optString("mfaPendingCredential", (String) null));
            this.zzo = Strings.emptyToNull(jSONObject.optString("oauthTokenSecret", (String) null));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzaam.zza(e, zza, str);
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final zze zzc() {
        if (TextUtils.isEmpty(this.zzm) && TextUtils.isEmpty(this.zzn)) {
            return null;
        }
        String str = this.zzj;
        String str2 = this.zzn;
        String str3 = this.zzm;
        String str4 = this.zzq;
        String str5 = this.zzo;
        Preconditions.checkNotEmpty(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new zze(str, str2, str3, (zzaaa) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    public final String zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzp;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final String zzg() {
        return this.zzt;
    }

    public final String zzh() {
        return this.zzj;
    }

    public final String zzi() {
        return this.zzk;
    }

    public final String zzj() {
        return this.zzd;
    }

    public final String zzk() {
        return this.zzr;
    }

    public final List zzl() {
        return this.zzs;
    }

    public final boolean zzm() {
        return !TextUtils.isEmpty(this.zzt);
    }

    public final boolean zzn() {
        return this.zzb;
    }

    public final boolean zzo() {
        return this.zzl;
    }

    public final boolean zzp() {
        return this.zzb || !TextUtils.isEmpty(this.zzp);
    }
}
