package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "OnRangingSuspendedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzpq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpq> CREATOR = new zzpr();
    @SafeParcelable.Field(getter = "getDevice", mo65739id = 1)
    private zzrv zza;
    @SafeParcelable.Field(getter = "getReason", mo65739id = 2)
    private int zzb;

    private zzpq() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzpq) {
            zzpq zzpq = (zzpq) obj;
            if (!Objects.equal(this.zza, zzpq.zza) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzpq.zzb))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzrv zzb() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzpq(@SafeParcelable.Param(mo65742id = 1) zzrv zzrv, @SafeParcelable.Param(mo65742id = 2) int i) {
        this.zza = zzrv;
        this.zzb = i;
    }
}
