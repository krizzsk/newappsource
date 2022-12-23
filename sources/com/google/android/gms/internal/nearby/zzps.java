package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RangingCapabilitiesParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzps extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzps> CREATOR = new zzpt();
    @SafeParcelable.Field(getter = "getSupportsDistance", mo65739id = 1)
    private boolean zza;
    @SafeParcelable.Field(getter = "getSupportsAzimuthalAngle", mo65739id = 2)
    private boolean zzb;
    @SafeParcelable.Field(getter = "getSupportsElevationAngle", mo65739id = 3)
    private boolean zzc;
    @SafeParcelable.Field(getter = "getStatusCode", mo65739id = 4)
    private int zzd;
    @SafeParcelable.Field(getter = "getMinRangingInterval", mo65739id = 5)
    private int zze;

    private zzps() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzps) {
            zzps zzps = (zzps) obj;
            if (!Objects.equal(Boolean.valueOf(this.zza), Boolean.valueOf(zzps.zza)) || !Objects.equal(Boolean.valueOf(this.zzb), Boolean.valueOf(zzps.zzb)) || !Objects.equal(Boolean.valueOf(this.zzc), Boolean.valueOf(zzps.zzc)) || !Objects.equal(Integer.valueOf(this.zzd), Integer.valueOf(zzps.zzd)) || !Objects.equal(Integer.valueOf(this.zze), Integer.valueOf(zzps.zze))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Boolean.valueOf(this.zzb), Boolean.valueOf(this.zzc), Integer.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zze;
    }

    public final boolean zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    public zzps(@SafeParcelable.Param(mo65742id = 1) boolean z, @SafeParcelable.Param(mo65742id = 2) boolean z2, @SafeParcelable.Param(mo65742id = 3) boolean z3, @SafeParcelable.Param(mo65742id = 4) int i, @SafeParcelable.Param(mo65742id = 5) int i2) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
        this.zzd = i;
        this.zze = i2;
    }
}
