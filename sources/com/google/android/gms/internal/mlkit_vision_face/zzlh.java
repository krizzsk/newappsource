package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "FaceDetectorOptionsParcelCreator")
public final class zzlh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlh> CREATOR = new zzli();
    @SafeParcelable.Field(getter = "getPerformanceMode", mo65739id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getLandmarkMode", mo65739id = 2)
    private final int zzb;
    @SafeParcelable.Field(getter = "getClassificationMode", mo65739id = 3)
    private final int zzc;
    @SafeParcelable.Field(getter = "getContourMode", mo65739id = 4)
    private final int zzd;
    @SafeParcelable.Field(getter = "isTrackingEnabled", mo65739id = 5)
    private final boolean zze;
    @SafeParcelable.Field(getter = "getProportionalMinFaceSize", mo65739id = 6)
    private final float zzf;

    @SafeParcelable.Constructor
    public zzlh(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) int i3, @SafeParcelable.Param(mo65742id = 4) int i4, @SafeParcelable.Param(mo65742id = 5) boolean z, @SafeParcelable.Param(mo65742id = 6) float f) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = z;
        this.zzf = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
