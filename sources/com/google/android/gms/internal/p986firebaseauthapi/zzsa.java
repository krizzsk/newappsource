package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;

@SafeParcelable.Class(creator = "StartMfaPhoneNumberSignInAidlRequestCreator")
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsa */
public final class zzsa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsa> CREATOR = new zzsb();
    @SafeParcelable.Field(getter = "getPhoneMultiFactorInfo", mo65739id = 1)
    private final PhoneMultiFactorInfo zza;
    @SafeParcelable.Field(getter = "getPendingCredential", mo65739id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getLocaleHeader", mo65739id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getTimeoutInSeconds", mo65739id = 4)
    private final long zzd;
    @SafeParcelable.Field(getter = "getForceNewSmsVerificationSession", mo65739id = 5)
    private final boolean zze;
    @SafeParcelable.Field(getter = "getRequireSmsVerification", mo65739id = 6)
    private final boolean zzf;
    @SafeParcelable.Field(getter = "getSafetyNetToken", mo65739id = 7)
    private final String zzg;
    @SafeParcelable.Field(getter = "getRecaptchaToken", mo65739id = 8)
    private final String zzh;
    @SafeParcelable.Field(getter = "getIsGooglePlayServicesAvailable", mo65739id = 9)
    private final boolean zzi;

    @SafeParcelable.Constructor
    public zzsa(@SafeParcelable.Param(mo65742id = 1) PhoneMultiFactorInfo phoneMultiFactorInfo, @SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) long j, @SafeParcelable.Param(mo65742id = 5) boolean z, @SafeParcelable.Param(mo65742id = 6) boolean z2, @SafeParcelable.Param(mo65742id = 7) String str3, @SafeParcelable.Param(mo65742id = 8) String str4, @SafeParcelable.Param(mo65742id = 9) boolean z3) {
        this.zza = phoneMultiFactorInfo;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = j;
        this.zze = z;
        this.zzf = z2;
        this.zzg = str3;
        this.zzh = str4;
        this.zzi = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        return this.zzd;
    }

    public final PhoneMultiFactorInfo zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzh;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzi;
    }
}
