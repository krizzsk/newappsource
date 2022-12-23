package com.google.android.gms.internal.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.state.TimeIntervals;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TimeIntervalsImplCreator")
@SafeParcelable.Reserved({1})
public final class zzar extends AbstractSafeParcelable implements TimeIntervals {
    public static final Parcelable.Creator<zzar> CREATOR = new zzas();
    @SafeParcelable.Field(getter = "getTimeIntervals", mo65739id = 2)
    private final int[] zza;

    @SafeParcelable.Constructor
    public zzar(@SafeParcelable.Param(mo65742id = 2) int[] iArr) {
        this.zza = iArr;
    }

    public final int[] getTimeIntervals() {
        return this.zza;
    }

    public final boolean hasTimeInterval(int i) {
        int[] iArr = this.zza;
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TimeIntervals=");
        if (this.zza == null) {
            k.append("unknown");
        } else {
            k.append("[");
            int[] iArr = this.zza;
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    k.append(", ");
                }
                k.append(i2);
                i++;
                z = false;
            }
            k.append("]");
        }
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntArray(parcel, 2, this.zza, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
