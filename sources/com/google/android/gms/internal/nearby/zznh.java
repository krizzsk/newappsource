package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p001a0.C0017h;

@SafeParcelable.Class(creator = "NearbyDeviceCreator")
public final class zznh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznh> CREATOR = new zzni();
    public static final zznh zza = new zznh(1, "", (String) null);
    @SafeParcelable.VersionField(mo65748id = 1000)
    public final int zzb;
    @SafeParcelable.Field(getter = "getHandle", mo65739id = 3)
    private final String zzc;
    @SafeParcelable.Field(getter = "getBluetoothAddress", mo65739id = 6)
    private final String zzd;

    @SafeParcelable.Constructor
    public zznh(@SafeParcelable.Param(mo65742id = 1000) int i, @SafeParcelable.Param(mo65742id = 3) String str, @SafeParcelable.Param(mo65742id = 6) String str2) {
        this.zzb = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
        this.zzc = str == null ? "" : str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zznh)) {
            return false;
        }
        zznh zznh = (zznh) obj;
        if (!Objects.equal(this.zzc, zznh.zzc) || !Objects.equal(this.zzd, zznh.zzd)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzc, this.zzd);
    }

    public final String toString() {
        return C0017h.m56M("NearbyDevice{handle=", this.zzc, ", bluetoothAddress=", this.zzd, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
