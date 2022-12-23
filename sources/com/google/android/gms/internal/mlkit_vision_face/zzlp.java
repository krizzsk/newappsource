package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LandmarkParcelCreator")
public final class zzlp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlp> CREATOR = new zzlq();
    @SafeParcelable.Field(getter = "getType", mo65739id = 1)
    private final int zza;
    @SafeParcelable.Field(getter = "getPosition", mo65739id = 2)
    private final PointF zzb;

    @SafeParcelable.Constructor
    public zzlp(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) PointF pointF) {
        this.zza = i;
        this.zzb = pointF;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zza;
    }

    public final PointF zzb() {
        return this.zzb;
    }
}
