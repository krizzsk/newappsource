package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "SendVerificationCodeRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzn */
public final class zzzn extends AbstractSafeParcelable implements zzwo {
    public static final Parcelable.Creator<zzzn> CREATOR = new zzzo();
    @SafeParcelable.Field(getter = "getPhoneNumber", mo65739id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getTimeoutInSeconds", mo65739id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getForceNewSmsVerificationSession", mo65739id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(getter = "getLanguageHeader", mo65739id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getTenantId", mo65739id = 5)
    private final String zze;
    @SafeParcelable.Field(getter = "getRecaptchaToken", mo65739id = 6)
    private final String zzf;
    @SafeParcelable.Field(getter = "getIsGooglePlayServicesAvailable", mo65739id = 7)
    private final boolean zzg;
    @SafeParcelable.Field(getter = "getSafetyNetToken", mo65739id = 8)
    private final String zzh;
    private zzyc zzi;

    @SafeParcelable.Constructor
    public zzzn(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) long j, @SafeParcelable.Param(mo65742id = 3) boolean z, @SafeParcelable.Param(mo65742id = 4) String str2, @SafeParcelable.Param(mo65742id = 5) String str3, @SafeParcelable.Param(mo65742id = 6) String str4, @SafeParcelable.Param(mo65742id = 7) boolean z2, @SafeParcelable.Param(mo65742id = 8) String str5) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = j;
        this.zzc = z;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = z2;
        this.zzh = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("phoneNumber", this.zza);
        String str = this.zze;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            jSONObject.put("recaptchaToken", str2);
        }
        zzyc zzyc = this.zzi;
        if (zzyc != null) {
            jSONObject.put("autoRetrievalInfo", zzyc.zza());
        }
        String str3 = this.zzh;
        if (str3 != null) {
            jSONObject.put("safetyNetToken", str3);
        }
        return jSONObject.toString();
    }

    public final long zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zza;
    }

    public final void zze(zzyc zzyc) {
        this.zzi = zzyc;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        return this.zzg;
    }
}
