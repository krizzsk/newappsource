package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p001a0.C0016g;

@ShowFirstParty
@SafeParcelable.Class(creator = "UwbRangingDataCreator")
@SafeParcelable.Reserved({1000})
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field(getter = "getRawDistance", mo65739id = 1)
    private int zza;
    @SafeParcelable.Field(getter = "getRawAngleOfArrivalAzimuth", mo65739id = 2)
    private int zzb;
    @SafeParcelable.Field(getter = "getRawAngleOfArrivalPolar", mo65739id = 3)
    private int zzc;
    @SafeParcelable.Field(getter = "getIsValidAngleOfArrivalData", mo65739id = 4)
    private boolean zzd;

    private zzs() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            zzs zzs = (zzs) obj;
            if (!Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(zzs.zza)) || !Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzs.zzb)) || !Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(zzs.zzc)) || !Objects.equal(Boolean.valueOf(this.zzd), Boolean.valueOf(zzs.zzd))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Boolean.valueOf(this.zzd));
    }

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        boolean z = this.zzd;
        StringBuilder s = C0016g.m35s("UwbRangingData{rawDistance=", i, ", rawAngleOfArrivalAzimuth=", i2, ", rawAngleOfArrivalPolar=");
        s.append(i3);
        s.append(", isValidAngleOfArrivalData=");
        s.append(z);
        s.append("}");
        return s.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) int i3, @SafeParcelable.Param(mo65742id = 4) boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = z;
    }
}
