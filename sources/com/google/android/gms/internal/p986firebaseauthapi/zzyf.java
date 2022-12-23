package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "CreateAuthUriResponseCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyf */
public final class zzyf extends AbstractSafeParcelable implements zzwp<zzyf> {
    public static final Parcelable.Creator<zzyf> CREATOR = new zzyg();
    private static final String zza = "zzyf";
    @SafeParcelable.Field(getter = "getAuthUri", mo65739id = 2)
    private String zzb;
    @SafeParcelable.Field(getter = "isRegistered", mo65739id = 3)
    private boolean zzc;
    @SafeParcelable.Field(getter = "getProviderId", mo65739id = 4)
    private String zzd;
    @SafeParcelable.Field(getter = "isForExistingProvider", mo65739id = 5)
    private boolean zze;
    @SafeParcelable.Field(getter = "getStringList", mo65739id = 6)
    private zzzy zzf;
    @SafeParcelable.Field(getter = "getSignInMethods", mo65739id = 7)
    private List zzg;

    static {
        Class<zzyf> cls = zzyf.class;
    }

    public zzyf() {
        this.zzf = new zzzy((List) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeStringList(parcel, 7, this.zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final /* bridge */ /* synthetic */ zzwp zza(String str) throws zzui {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = jSONObject.optString("authUri", (String) null);
            this.zzc = jSONObject.optBoolean("registered", false);
            this.zzd = jSONObject.optString("providerId", (String) null);
            this.zze = jSONObject.optBoolean("forExistingProvider", false);
            if (!jSONObject.has("allProviders")) {
                this.zzf = new zzzy((List) null);
            } else {
                this.zzf = new zzzy(1, zzaam.zzb(jSONObject.optJSONArray("allProviders")));
            }
            this.zzg = zzaam.zzb(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzaam.zza(e, zza, str);
        }
    }

    public final List zzb() {
        return this.zzg;
    }

    @SafeParcelable.Constructor
    public zzyf(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) boolean z, @SafeParcelable.Param(mo65742id = 4) String str2, @SafeParcelable.Param(mo65742id = 5) boolean z2, @SafeParcelable.Param(mo65742id = 6) zzzy zzzy, @SafeParcelable.Param(mo65742id = 7) List list) {
        zzzy zzzy2;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = z2;
        if (zzzy == null) {
            zzzy2 = new zzzy((List) null);
        } else {
            zzzy2 = zzzy.zza(zzzy);
        }
        this.zzf = zzzy2;
        this.zzg = list;
    }
}
