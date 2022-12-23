package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BarcodeParcelCreator")
public final class zzon extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzon> CREATOR = new zzoo();
    @SafeParcelable.Field(getter = "getFormat", mo65739id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getDisplayValue", mo65739id = 2)
    private final String zzb;
    @SafeParcelable.Field(getter = "getRawValue", mo65739id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getRawBytes", mo65739id = 4)
    private final byte[] zzd;
    @SafeParcelable.Field(getter = "getCornerPoints", mo65739id = 5)
    private final Point[] zze;
    @SafeParcelable.Field(getter = "getValueType", mo65739id = 6)
    private final int zzf;
    @SafeParcelable.Field(getter = "getEmailParcel", mo65739id = 7)
    private final zzog zzg;
    @SafeParcelable.Field(getter = "getPhoneParcel", mo65739id = 8)
    private final zzoj zzh;
    @SafeParcelable.Field(getter = "getSmsParcel", mo65739id = 9)
    private final zzok zzi;
    @SafeParcelable.Field(getter = "getWiFiParcel", mo65739id = 10)
    private final zzom zzj;
    @SafeParcelable.Field(getter = "getUrlBookmarkParcel", mo65739id = 11)
    private final zzol zzk;
    @SafeParcelable.Field(getter = "getGeoPointParcel", mo65739id = 12)
    private final zzoh zzl;
    @SafeParcelable.Field(getter = "getCalendarEventParcel", mo65739id = 13)
    private final zzod zzm;
    @SafeParcelable.Field(getter = "getContactInfoParcel", mo65739id = 14)
    private final zzoe zzn;
    @SafeParcelable.Field(getter = "getDriverLicenseParcel", mo65739id = 15)
    private final zzof zzo;

    @SafeParcelable.Constructor
    public zzon(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) byte[] bArr, @SafeParcelable.Param(mo65742id = 5) Point[] pointArr, @SafeParcelable.Param(mo65742id = 6) int i2, @SafeParcelable.Param(mo65742id = 7) zzog zzog, @SafeParcelable.Param(mo65742id = 8) zzoj zzoj, @SafeParcelable.Param(mo65742id = 9) zzok zzok, @SafeParcelable.Param(mo65742id = 10) zzom zzom, @SafeParcelable.Param(mo65742id = 11) zzol zzol, @SafeParcelable.Param(mo65742id = 12) zzoh zzoh, @SafeParcelable.Param(mo65742id = 13) zzod zzod, @SafeParcelable.Param(mo65742id = 14) zzoe zzoe, @SafeParcelable.Param(mo65742id = 15) zzof zzof) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i2;
        this.zzg = zzog;
        this.zzh = zzoj;
        this.zzi = zzok;
        this.zzj = zzom;
        this.zzk = zzol;
        this.zzl = zzoh;
        this.zzm = zzod;
        this.zzn = zzoe;
        this.zzo = zzof;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzl, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzm, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzn, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzo, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzf;
    }

    public final zzod zzc() {
        return this.zzm;
    }

    public final zzoe zzd() {
        return this.zzn;
    }

    public final zzof zze() {
        return this.zzo;
    }

    public final zzog zzf() {
        return this.zzg;
    }

    public final zzoh zzg() {
        return this.zzl;
    }

    public final zzoj zzh() {
        return this.zzh;
    }

    public final zzok zzi() {
        return this.zzi;
    }

    public final zzol zzj() {
        return this.zzk;
    }

    public final zzom zzk() {
        return this.zzj;
    }

    public final String zzl() {
        return this.zzb;
    }

    public final String zzm() {
        return this.zzc;
    }

    public final byte[] zzn() {
        return this.zzd;
    }

    public final Point[] zzo() {
        return this.zze;
    }
}
