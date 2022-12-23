package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "VerifyCustomTokenResponseCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaae */
public final class zzaae extends AbstractSafeParcelable implements zzwp<zzaae> {
    public static final Parcelable.Creator<zzaae> CREATOR = new zzaaf();
    private static final String zza = "zzaae";
    @SafeParcelable.Field(getter = "getIdToken", mo65739id = 2)
    private String zzb;
    @SafeParcelable.Field(getter = "getRefreshToken", mo65739id = 3)
    private String zzc;
    @SafeParcelable.Field(getter = "getExpiresIn", mo65739id = 4)
    private long zzd;
    @SafeParcelable.Field(getter = "isNewUser", mo65739id = 5)
    private boolean zze;

    static {
        Class<zzaae> cls = zzaae.class;
    }

    public zzaae() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final /* bridge */ /* synthetic */ zzwp zza(String str) throws zzui {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("idToken", (String) null));
            this.zzc = Strings.emptyToNull(jSONObject.optString("refreshToken", (String) null));
            this.zzd = jSONObject.optLong("expiresIn", 0);
            this.zze = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzaam.zza(e, zza, str);
        }
    }

    public final long zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final boolean zze() {
        return this.zze;
    }

    @SafeParcelable.Constructor
    public zzaae(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) long j, @SafeParcelable.Param(mo65742id = 5) boolean z) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j;
        this.zze = z;
    }
}
