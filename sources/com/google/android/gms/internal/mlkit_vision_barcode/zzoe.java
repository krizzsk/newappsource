package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ContactInfoParcelCreator")
public final class zzoe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoe> CREATOR = new zzot();
    @SafeParcelable.Field(getter = "getName", mo65739id = 1)
    private final zzoi zza;
    @SafeParcelable.Field(getter = "getOrganization", mo65739id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getTitle", mo65739id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getPhones", mo65739id = 4)
    private final zzoj[] zzd;
    @SafeParcelable.Field(getter = "getEmails", mo65739id = 5)
    private final zzog[] zze;
    @SafeParcelable.Field(getter = "getUrls", mo65739id = 6)
    private final String[] zzf;
    @SafeParcelable.Field(getter = "getAddresses", mo65739id = 7)
    private final zzob[] zzg;

    @SafeParcelable.Constructor
    public zzoe(@SafeParcelable.Param(mo65742id = 1) zzoi zzoi, @SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) zzoj[] zzojArr, @SafeParcelable.Param(mo65742id = 5) zzog[] zzogArr, @SafeParcelable.Param(mo65742id = 6) String[] strArr, @SafeParcelable.Param(mo65742id = 7) zzob[] zzobArr) {
        this.zza = zzoi;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzojArr;
        this.zze = zzogArr;
        this.zzf = strArr;
        this.zzg = zzobArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzoi zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zzob[] zzd() {
        return this.zzg;
    }

    public final zzog[] zze() {
        return this.zze;
    }

    public final zzoj[] zzf() {
        return this.zzd;
    }

    public final String[] zzg() {
        return this.zzf;
    }
}
