package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PowerStateImplCreator")
@SafeParcelable.Reserved({1})
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzw();
    @SafeParcelable.Field(getter = "getPowerConnectionState", mo65739id = 2)
    private final int zza;
    @SafeParcelable.Field(getter = "getBatteryPercentage", mo65739id = 3)
    private final double zzb;

    @SafeParcelable.Constructor
    public zzv(@SafeParcelable.Param(mo65742id = 2) int i, @SafeParcelable.Param(mo65742id = 3) double d) {
        this.zza = i;
        this.zzb = d;
    }

    public final String toString() {
        String num = Integer.toString(this.zza);
        double d = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 69);
        C16530d.m42019l(sb, "PowerConnectionState = ", num, " Battery Percentage = ");
        sb.append(d);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.writeDouble(parcel, 3, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
