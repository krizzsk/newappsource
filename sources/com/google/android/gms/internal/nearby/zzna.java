package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StopAllEndpointsParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzna extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzna> CREATOR = new zznb();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zzna);
    }

    public final int hashCode() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
    }
}
