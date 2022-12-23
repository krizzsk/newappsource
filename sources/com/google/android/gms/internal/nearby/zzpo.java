package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "OnRangingResultParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzpo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpo> CREATOR = new zzpp();
    @SafeParcelable.Field(getter = "getDevice", mo65739id = 1)
    private zzrv zza;
    @SafeParcelable.Field(getter = "getPosition", mo65739id = 2)
    private zzqa zzb;

    private zzpo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzpo) {
            zzpo zzpo = (zzpo) obj;
            if (!Objects.equal(this.zza, zzpo.zza) || !Objects.equal(this.zzb, zzpo.zzb)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzqa zza() {
        return this.zzb;
    }

    public final zzrv zzb() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzpo(@SafeParcelable.Param(mo65742id = 1) zzrv zzrv, @SafeParcelable.Param(mo65742id = 2) zzqa zzqa) {
        this.zza = zzrv;
        this.zzb = zzqa;
    }
}
