package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzpa extends zzb implements zzpb {
    public zzpa() {
        super("com.google.android.gms.nearby.uwb.internal.IResultListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        int readInt = parcel.readInt();
        zzc.zzc(parcel);
        zzd(readInt);
        return true;
    }
}
