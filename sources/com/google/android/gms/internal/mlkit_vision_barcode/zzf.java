package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CalendarDateTimeCreator")
@SafeParcelable.Reserved({1})
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzs();
    @SafeParcelable.Field(mo65739id = 2)
    public int zza;
    @SafeParcelable.Field(mo65739id = 3)
    public int zzb;
    @SafeParcelable.Field(mo65739id = 4)
    public int zzc;
    @SafeParcelable.Field(mo65739id = 5)
    public int zzd;
    @SafeParcelable.Field(mo65739id = 6)
    public int zze;
    @SafeParcelable.Field(mo65739id = 7)
    public int zzf;
    @SafeParcelable.Field(mo65739id = 8)
    public boolean zzg;
    @SafeParcelable.Field(mo65739id = 9)
    public String zzh;

    public zzf() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) int i2, @SafeParcelable.Param(mo65742id = 4) int i3, @SafeParcelable.Param(mo65742id = 5) int i4, @SafeParcelable.Param(mo65742id = 6) int i5, @SafeParcelable.Param(mo65742id = 7) int i6, @SafeParcelable.Param(mo65742id = 8) boolean z, @SafeParcelable.Param(mo65742id = 9) String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = z;
        this.zzh = str;
    }
}
