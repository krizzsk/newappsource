package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.state.HeadphoneState;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "HeadphoneStateImplCreator")
@SafeParcelable.Reserved({1})
public final class zzr extends AbstractSafeParcelable implements HeadphoneState {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    @SafeParcelable.Field(getter = "getState", mo65739id = 2)
    private final int zza;

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(mo65742id = 2) int i) {
        this.zza = i;
    }

    public final int getState() {
        return this.zza;
    }

    public final String toString() {
        return Integer.toString(this.zza);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
