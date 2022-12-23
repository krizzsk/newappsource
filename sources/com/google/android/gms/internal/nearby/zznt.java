package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PresenceActionCreator")
public final class zznt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznt> CREATOR = new zznu();
    @SafeParcelable.Field(getter = "getActionIdentifier", mo65739id = 1)
    private final int zza;

    @SafeParcelable.Constructor
    public zznt(@SafeParcelable.Param(mo65742id = 1) int i) {
        this.zza = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznt) || this.zza != ((zznt) obj).zza) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza));
    }

    public final String toString() {
        return C16530d.m42014g(C13555b.m33972k("PresenceAction[action="), this.zza, ']');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
