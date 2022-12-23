package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ScreenStateImplCreator")
@SafeParcelable.Reserved({1})
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new zzy();
    @SafeParcelable.Field(getter = "getScreenState", mo65739id = 2)
    private final int zza;

    @SafeParcelable.Constructor
    public zzx(@SafeParcelable.Param(mo65742id = 2) int i) {
        this.zza = i;
    }

    public final String toString() {
        int i = this.zza;
        return i == 1 ? "ScreenState: SCREEN_OFF" : i == 2 ? "ScreenState: SCREEN_ON" : "ScreenState: UNKNOWN";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
