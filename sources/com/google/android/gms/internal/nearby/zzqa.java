package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RangingPositionParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqa> CREATOR = new zzqb();
    @SafeParcelable.Field(getter = "getDistance", mo65739id = 1)
    private zzpu zza;
    @SafeParcelable.Field(getter = "getAzimuth", mo65739id = 2)
    private zzpu zzb;
    @SafeParcelable.Field(getter = "getElevation", mo65739id = 3)
    private zzpu zzc;
    @SafeParcelable.Field(getter = "getElapsedRealtimeNanos", mo65739id = 4)
    private long zzd;

    private zzqa() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzqa) {
            zzqa zzqa = (zzqa) obj;
            if (!Objects.equal(this.zza, zzqa.zza) || !Objects.equal(this.zzb, zzqa.zzb) || !Objects.equal(this.zzc, zzqa.zzc) || !Objects.equal(Long.valueOf(this.zzd), Long.valueOf(zzqa.zzd))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, Long.valueOf(this.zzd));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzpu zzb() {
        return this.zzb;
    }

    public final zzpu zzc() {
        return this.zza;
    }

    public final zzpu zzd() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    public zzqa(@SafeParcelable.Param(mo65742id = 1) zzpu zzpu, @SafeParcelable.Param(mo65742id = 2) zzpu zzpu2, @SafeParcelable.Param(mo65742id = 3) zzpu zzpu3, @SafeParcelable.Param(mo65742id = 4) long j) {
        this.zza = zzpu;
        this.zzb = zzpu2;
        this.zzc = zzpu3;
        this.zzd = j;
    }
}
