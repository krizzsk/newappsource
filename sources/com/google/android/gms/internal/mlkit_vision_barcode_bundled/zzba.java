package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BarcodeParcelCreator")
public final class zzba extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();
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
    private final zzat zzg;
    @SafeParcelable.Field(getter = "getPhoneParcel", mo65739id = 8)
    private final zzaw zzh;
    @SafeParcelable.Field(getter = "getSmsParcel", mo65739id = 9)
    private final zzax zzi;
    @SafeParcelable.Field(getter = "getWiFiParcel", mo65739id = 10)
    private final zzaz zzj;
    @SafeParcelable.Field(getter = "getUrlBookmarkParcel", mo65739id = 11)
    private final zzay zzk;
    @SafeParcelable.Field(getter = "getGeoPointParcel", mo65739id = 12)
    private final zzau zzl;
    @SafeParcelable.Field(getter = "getCalendarEventParcel", mo65739id = 13)
    private final zzaq zzm;
    @SafeParcelable.Field(getter = "getContactInfoParcel", mo65739id = 14)
    private final zzar zzn;
    @SafeParcelable.Field(getter = "getDriverLicenseParcel", mo65739id = 15)
    private final zzas zzo;

    @SafeParcelable.Constructor
    public zzba(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) String str, @SafeParcelable.Param(mo65742id = 3) String str2, @SafeParcelable.Param(mo65742id = 4) byte[] bArr, @SafeParcelable.Param(mo65742id = 5) Point[] pointArr, @SafeParcelable.Param(mo65742id = 6) int i2, @SafeParcelable.Param(mo65742id = 7) zzat zzat, @SafeParcelable.Param(mo65742id = 8) zzaw zzaw, @SafeParcelable.Param(mo65742id = 9) zzax zzax, @SafeParcelable.Param(mo65742id = 10) zzaz zzaz, @SafeParcelable.Param(mo65742id = 11) zzay zzay, @SafeParcelable.Param(mo65742id = 12) zzau zzau, @SafeParcelable.Param(mo65742id = 13) zzaq zzaq, @SafeParcelable.Param(mo65742id = 14) zzar zzar, @SafeParcelable.Param(mo65742id = 15) zzas zzas) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bArr;
        this.zze = pointArr;
        this.zzf = i2;
        this.zzg = zzat;
        this.zzh = zzaw;
        this.zzi = zzax;
        this.zzj = zzaz;
        this.zzk = zzay;
        this.zzl = zzau;
        this.zzm = zzaq;
        this.zzn = zzar;
        this.zzo = zzas;
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
}
