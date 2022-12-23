package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DriverLicenseParcelCreator")
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzbh();
    @SafeParcelable.Field(getter = "getDocumentType", mo65739id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getFirstName", mo65739id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getMiddleName", mo65739id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getLastName", mo65739id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getGender", mo65739id = 5)
    private final String zze;
    @SafeParcelable.Field(getter = "getAddressStreet", mo65739id = 6)
    private final String zzf;
    @SafeParcelable.Field(getter = "getAddressCity", mo65739id = 7)
    private final String zzg;
    @SafeParcelable.Field(getter = "getAddressState", mo65739id = 8)
    private final String zzh;
    @SafeParcelable.Field(getter = "getAddressZip", mo65739id = 9)
    private final String zzi;
    @SafeParcelable.Field(getter = "getLicenseNumber", mo65739id = 10)
    private final String zzj;
    @SafeParcelable.Field(getter = "getIssueDate", mo65739id = 11)
    private final String zzk;
    @SafeParcelable.Field(getter = "getExpiryDate", mo65739id = 12)
    private final String zzl;
    @SafeParcelable.Field(getter = "getBirthDate", mo65739id = 13)
    private final String zzm;
    @SafeParcelable.Field(getter = "getIssuingCountry", mo65739id = 14)
    private final String zzn;

    @SafeParcelable.Constructor
    public zzas(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) String str2, @SafeParcelable.Param(mo65742id = 3) String str3, @SafeParcelable.Param(mo65742id = 4) String str4, @SafeParcelable.Param(mo65742id = 5) String str5, @SafeParcelable.Param(mo65742id = 6) String str6, @SafeParcelable.Param(mo65742id = 7) String str7, @SafeParcelable.Param(mo65742id = 8) String str8, @SafeParcelable.Param(mo65742id = 9) String str9, @SafeParcelable.Param(mo65742id = 10) String str10, @SafeParcelable.Param(mo65742id = 11) String str11, @SafeParcelable.Param(mo65742id = 12) String str12, @SafeParcelable.Param(mo65742id = 13) String str13, @SafeParcelable.Param(mo65742id = 14) String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = str13;
        this.zzn = str14;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeString(parcel, 11, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzn, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
