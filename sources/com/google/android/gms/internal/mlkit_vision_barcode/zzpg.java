package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
public final class zzpg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpg> CREATOR = new zzph();
    @SafeParcelable.Field(getter = "getImageFormat", mo65739id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getWidth", mo65739id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getHeight", mo65739id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getRotation", mo65739id = 4)
    private final int zzd;
    @SafeParcelable.Field(getter = "getTimestampMs", mo65739id = 5)
    private final long zze;

    @SafeParcelable.Constructor
    public zzpg(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) int i3, @SafeParcelable.Param(mo65742id = 4) int i4, @SafeParcelable.Param(mo65742id = 5) long j) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
