package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "NetworkStateImplCreator")
@SafeParcelable.Reserved({1})
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();
    @SafeParcelable.Field(getter = "getConnectionState", mo65739id = 2)
    private final int zza;
    @SafeParcelable.Field(getter = "getMeterState", mo65739id = 3)
    private final int zzb;

    @SafeParcelable.Constructor
    public zzt(@SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public final String toString() {
        String num = Integer.toString(this.zza);
        String num2 = Integer.toString(this.zzb);
        return C13715c.m34246l(new StringBuilder(String.valueOf(num).length() + 41 + String.valueOf(num2).length()), "ConnectionState = ", num, " NetworkMeteredState = ", num2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
