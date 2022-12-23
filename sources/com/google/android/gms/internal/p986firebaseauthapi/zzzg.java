package com.google.android.gms.internal.p986firebaseauthapi;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ProviderUserInfoCreator")
@SafeParcelable.Reserved({1})
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzg */
public final class zzzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzzg> CREATOR = new zzzh();
    @SafeParcelable.Field(getter = "getFederatedId", mo65739id = 2)
    private String zza;
    @SafeParcelable.Field(getter = "getDisplayName", mo65739id = 3)
    private String zzb;
    @SafeParcelable.Field(getter = "getPhotoUrl", mo65739id = 4)
    private String zzc;
    @SafeParcelable.Field(getter = "getProviderId", mo65739id = 5)
    private String zzd;
    @SafeParcelable.Field(getter = "getRawUserInfo", mo65739id = 6)
    private String zze;
    @SafeParcelable.Field(getter = "getPhoneNumber", mo65739id = 7)
    private String zzf;
    @SafeParcelable.Field(getter = "getEmail", mo65739id = 8)
    private String zzg;

    public zzzg() {
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
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Uri zza() {
        if (!TextUtils.isEmpty(this.zzc)) {
            return Uri.parse(this.zzc);
        }
        return null;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zza;
    }

    public final String zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zze;
    }

    public final void zzh(String str) {
        this.zze = str;
    }

    @SafeParcelable.Constructor
    public zzzg(@SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) String str3, @SafeParcelable.Param(mo65742id = 5) String str4, @SafeParcelable.Param(mo65742id = 6) String str5, @SafeParcelable.Param(mo65742id = 7) String str6, @SafeParcelable.Param(mo65742id = 8) String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
    }
}
