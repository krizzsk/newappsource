package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BarcodeCreator")
@SafeParcelable.Reserved({1})
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field(mo65739id = 2)
    public int zza;
    @SafeParcelable.Field(mo65739id = 3)
    public String zzb;
    @SafeParcelable.Field(mo65739id = 4)
    public String zzc;
    @SafeParcelable.Field(mo65739id = 5)
    public int zzd;
    @SafeParcelable.Field(mo65739id = 6)
    public Point[] zze;
    @SafeParcelable.Field(mo65739id = 7)
    public zzj zzf;
    @SafeParcelable.Field(mo65739id = 8)
    public zzm zzg;
    @SafeParcelable.Field(mo65739id = 9)
    public zzn zzh;
    @SafeParcelable.Field(mo65739id = 10)
    public zzp zzi;
    @SafeParcelable.Field(mo65739id = 11)
    public zzo zzj;
    @SafeParcelable.Field(mo65739id = 12)
    public zzk zzk;
    @SafeParcelable.Field(mo65739id = 13)
    public zzg zzl;
    @SafeParcelable.Field(mo65739id = 14)
    public zzh zzm;
    @SafeParcelable.Field(mo65739id = 15)
    public zzi zzn;
    @SafeParcelable.Field(mo65739id = 16)
    public byte[] zzo;
    @SafeParcelable.Field(mo65739id = 17)
    public boolean zzp;
    @SafeParcelable.Field(mo65739id = 18)
    public double zzq;

    public zzq() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.zzl, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.zzn, i, false);
        SafeParcelWriter.writeByteArray(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.writeDouble(parcel, 18, this.zzq);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) String str, @SafeParcelable.Param(mo65742id = 4) String str2, @SafeParcelable.Param(mo65742id = 5) int i2, @SafeParcelable.Param(mo65742id = 6) Point[] pointArr, @SafeParcelable.Param(mo65742id = 7) zzj zzj2, @SafeParcelable.Param(mo65742id = 8) zzm zzm2, @SafeParcelable.Param(mo65742id = 9) zzn zzn2, @SafeParcelable.Param(mo65742id = 10) zzp zzp2, @SafeParcelable.Param(mo65742id = 11) zzo zzo2, @SafeParcelable.Param(mo65742id = 12) zzk zzk2, @SafeParcelable.Param(mo65742id = 13) zzg zzg2, @SafeParcelable.Param(mo65742id = 14) zzh zzh2, @SafeParcelable.Param(mo65742id = 15) zzi zzi2, @SafeParcelable.Param(mo65742id = 16) byte[] bArr, @SafeParcelable.Param(mo65742id = 17) boolean z, @SafeParcelable.Param(mo65742id = 18) double d) {
        this.zza = i;
        this.zzb = str;
        this.zzo = bArr;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = pointArr;
        this.zzp = z;
        this.zzq = d;
        this.zzf = zzj2;
        this.zzg = zzm2;
        this.zzh = zzn2;
        this.zzi = zzp2;
        this.zzj = zzo2;
        this.zzk = zzk2;
        this.zzl = zzg2;
        this.zzm = zzh2;
        this.zzn = zzi2;
    }
}
