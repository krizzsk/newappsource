package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzoq extends zzb implements zzor {
    public zzoq() {
        super("com.google.android.gms.nearby.uwb.internal.IBooleanResultListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zzg = zzc.zzg(parcel);
        zzc.zzc(parcel);
        zzd(zzg);
        return true;
    }
}
