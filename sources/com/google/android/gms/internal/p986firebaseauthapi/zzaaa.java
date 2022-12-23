package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p382be.C13617y;

@SafeParcelable.Class(creator = "VerifyAssertionRequestCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaa */
public final class zzaaa extends AbstractSafeParcelable implements zzwo {
    public static final Parcelable.Creator<zzaaa> CREATOR = new zzaab();
    @SafeParcelable.Field(getter = "getRequestUri", mo65739id = 2)
    private String zza;
    @SafeParcelable.Field(getter = "getCurrentIdToken", mo65739id = 3)
    private String zzb;
    @SafeParcelable.Field(getter = "getIdToken", mo65739id = 4)
    private String zzc;
    @SafeParcelable.Field(getter = "getAccessToken", mo65739id = 5)
    private String zzd;
    @SafeParcelable.Field(getter = "getProviderId", mo65739id = 6)
    private String zze;
    @SafeParcelable.Field(getter = "getEmail", mo65739id = 7)
    private String zzf;
    @SafeParcelable.Field(getter = "getPostBody", mo65739id = 8)
    private String zzg;
    @SafeParcelable.Field(getter = "getOauthTokenSecret", mo65739id = 9)
    private String zzh;
    @SafeParcelable.Field(getter = "getReturnSecureToken", mo65739id = 10)
    private boolean zzi;
    @SafeParcelable.Field(getter = "getAutoCreate", mo65739id = 11)
    private boolean zzj;
    @SafeParcelable.Field(getter = "getAuthCode", mo65739id = 12)
    private String zzk;
    @SafeParcelable.Field(getter = "getSessionId", mo65739id = 13)
    private String zzl;
    @SafeParcelable.Field(getter = "getIdpResponseUrl", mo65739id = 14)
    private String zzm;
    @SafeParcelable.Field(getter = "getTenantId", mo65739id = 15)
    private String zzn;
    @SafeParcelable.Field(getter = "getReturnIdpCredential", mo65739id = 16)
    private boolean zzo;
    @SafeParcelable.Field(getter = "getPendingToken", mo65739id = 17)
    private String zzp;

    public zzaaa() {
        this.zzi = true;
        this.zzj = true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.writeString(parcel, 17, this.zzp, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.zzj);
        jSONObject.put("returnSecureToken", this.zzi);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        String str2 = this.zzg;
        if (str2 != null) {
            jSONObject.put("postBody", str2);
        }
        String str3 = this.zzn;
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zzp;
        if (str4 != null) {
            jSONObject.put("pendingToken", str4);
        }
        if (!TextUtils.isEmpty(this.zzl)) {
            jSONObject.put("sessionId", this.zzl);
        }
        if (!TextUtils.isEmpty(this.zzm)) {
            jSONObject.put("requestUri", this.zzm);
        } else {
            String str5 = this.zza;
            if (str5 != null) {
                jSONObject.put("requestUri", str5);
            }
        }
        jSONObject.put("returnIdpCredential", this.zzo);
        return jSONObject.toString();
    }

    public final zzaaa zzb(boolean z) {
        this.zzj = false;
        return this;
    }

    public final zzaaa zzc(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
        return this;
    }

    public final zzaaa zzd(boolean z) {
        this.zzo = true;
        return this;
    }

    public final zzaaa zze(boolean z) {
        this.zzi = true;
        return this;
    }

    public final zzaaa zzf(String str) {
        this.zzn = str;
        return this;
    }

    public zzaaa(C13617y yVar, String str) {
        Preconditions.checkNotNull(yVar);
        this.zzl = Preconditions.checkNotEmpty(yVar.f33585a);
        this.zzm = Preconditions.checkNotEmpty(str);
        String checkNotEmpty = Preconditions.checkNotEmpty(yVar.f33587c);
        this.zze = checkNotEmpty;
        this.zzi = true;
        this.zzg = "providerId=".concat(String.valueOf(checkNotEmpty));
    }

    public zzaaa(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.zza = "http://localhost";
        this.zzc = str;
        this.zzd = str2;
        this.zzh = str5;
        this.zzk = str6;
        this.zzn = str7;
        this.zzp = str8;
        this.zzi = true;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.zzd) || !TextUtils.isEmpty(this.zzk)) {
            this.zze = Preconditions.checkNotEmpty(str3);
            this.zzf = null;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.zzc)) {
                sb.append("id_token=");
                sb.append(this.zzc);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.zzd)) {
                sb.append("access_token=");
                sb.append(this.zzd);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.zzf)) {
                sb.append("identifier=");
                sb.append(this.zzf);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.zzh)) {
                sb.append("oauth_token_secret=");
                sb.append(this.zzh);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.zzk)) {
                sb.append("code=");
                sb.append(this.zzk);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(str9)) {
                C16530d.m42019l(sb, "nonce=", str9, "&");
            }
            sb.append("providerId=");
            sb.append(this.zze);
            this.zzg = sb.toString();
            this.zzj = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    @SafeParcelable.Constructor
    public zzaaa(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) String str3, @SafeParcelable.Param(mo65742id = 5) String str4, @SafeParcelable.Param(mo65742id = 6) String str5, @SafeParcelable.Param(mo65742id = 7) String str6, @SafeParcelable.Param(mo65742id = 8) String str7, @SafeParcelable.Param(mo65742id = 9) String str8, @SafeParcelable.Param(mo65742id = 10) boolean z, @SafeParcelable.Param(mo65742id = 11) boolean z2, @SafeParcelable.Param(mo65742id = 12) String str9, @SafeParcelable.Param(mo65742id = 13) String str10, @SafeParcelable.Param(mo65742id = 14) String str11, @SafeParcelable.Param(mo65742id = 15) String str12, @SafeParcelable.Param(mo65742id = 16) boolean z3, @SafeParcelable.Param(mo65742id = 17) String str13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = z;
        this.zzj = z2;
        this.zzk = str9;
        this.zzl = str10;
        this.zzm = str11;
        this.zzn = str12;
        this.zzo = z3;
        this.zzp = str13;
    }
}
