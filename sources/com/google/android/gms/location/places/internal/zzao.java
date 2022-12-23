package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BusinessHoursIntervalCreator")
@SafeParcelable.Reserved({1000})
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new zzg();
    @SafeParcelable.Field(mo65739id = 1)
    private final int zzcs;
    @SafeParcelable.Field(mo65739id = 2)
    private final int zzct;

    @SafeParcelable.Constructor
    public zzao(@SafeParcelable.Param(mo65742id = 1) int i, @SafeParcelable.Param(mo65742id = 2) int i2) {
        this.zzcs = i;
        this.zzct = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzcs);
        SafeParcelWriter.writeInt(parcel, 2, this.zzct);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
