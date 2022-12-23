package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RangingMeasurementParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzpu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpu> CREATOR = new zzpv();
    @SafeParcelable.Field(getter = "getConfidence", mo65739id = 1)
    private int zza;
    @SafeParcelable.Field(getter = "getValue", mo65739id = 2)
    private float zzb;

    private zzpu() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzpu) {
            zzpu zzpu = (zzpu) obj;
            if (!Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzpu.zza)) || !Objects.equal(Float.valueOf(this.zzb), Float.valueOf(zzpu.zzb))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Float.valueOf(this.zzb));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeFloat(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final float zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzpu(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) float f) {
        this.zza = i;
        this.zzb = f;
    }
}
