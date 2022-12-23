package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CalendarDateTimeParcelCreator")
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new zzbe();
    @SafeParcelable.Field(getter = "getYear", mo65739id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getMonth", mo65739id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getDay", mo65739id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getHours", mo65739id = 4)
    private final int zzd;
    @SafeParcelable.Field(getter = "getMinutes", mo65739id = 5)
    private final int zze;
    @SafeParcelable.Field(getter = "getSeconds", mo65739id = 6)
    private final int zzf;
    @SafeParcelable.Field(getter = "isUtc", mo65739id = 7)
    private final boolean zzg;
    @SafeParcelable.Field(getter = "getRawValue", mo65739id = 8)
    private final String zzh;

    @SafeParcelable.Constructor
    public zzap(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) int i3, @SafeParcelable.Param(mo65742id = 4) int i4, @SafeParcelable.Param(mo65742id = 5) int i5, @SafeParcelable.Param(mo65742id = 6) int i6, @SafeParcelable.Param(mo65742id = 7) boolean z, @SafeParcelable.Param(mo65742id = 8) String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = z;
        this.zzh = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
