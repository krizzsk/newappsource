package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.BleSignal;

@SafeParcelable.Class(creator = "BleSignalImplCreator")
public final class zza extends AbstractSafeParcelable implements BleSignal {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    @SafeParcelable.VersionField(mo65748id = 1)
    public final int zza;
    @SafeParcelable.Field(mo65739id = 2)
    public final int zzb;
    @SafeParcelable.Field(mo65739id = 3)
    public final int zzc;

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2, @SafeParcelable.Param(mo65742id = 3) int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = (i3 <= -169 || i3 >= 87) ? Integer.MIN_VALUE : i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSignal)) {
            return false;
        }
        BleSignal bleSignal = (BleSignal) obj;
        if (this.zzb == bleSignal.getRssi() && this.zzc == bleSignal.getTxPower()) {
            return true;
        }
        return false;
    }

    public final int getRssi() {
        return this.zzb;
    }

    public final int getTxPower() {
        return this.zzc;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        int i = this.zzb;
        int i2 = this.zzc;
        return "BleSignal{rssi=" + i + ", txPower=" + i2 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
