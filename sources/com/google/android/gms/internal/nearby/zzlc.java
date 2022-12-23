package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.zzs;

@SafeParcelable.Class(creator = "OnEndpointDistanceChangedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzlc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlc> CREATOR = new zzld();
    @SafeParcelable.Field(getter = "getEndpointId", mo65739id = 1)
    private String zza;
    @SafeParcelable.Field(getter = "getDistance", mo65739id = 2)
    private int zzb;
    @SafeParcelable.Field(getter = "getUwbRangingData", mo65739id = 3)
    private zzs zzc;

    private zzlc() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzlc) {
            zzlc zzlc = (zzlc) obj;
            if (!Objects.equal(this.zza, zzlc.zza) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzlc.zzb)) || !Objects.equal(this.zzc, zzlc.zzc)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, Integer.valueOf(this.zzb), this.zzc);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzs zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza;
    }

    @SafeParcelable.Constructor
    public zzlc(@SafeParcelable.Param(mo65742id = 1) String str, @SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) zzs zzs) {
        this.zza = str;
        this.zzb = i;
        this.zzc = zzs;
    }
}
