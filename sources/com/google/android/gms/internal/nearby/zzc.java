package com.google.android.gms.internal.nearby;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class zzc {
    private static final ClassLoader zza = zzc.class.getClassLoader();

    private zzc() {
    }

    public static Parcelable zza(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static ArrayList zzb(Parcel parcel) {
        return parcel.readArrayList(zza);
    }

    public static void zzc(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(C16759e.m42349e("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }

    public static void zzd(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void zze(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void zzf(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    public static boolean zzg(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
