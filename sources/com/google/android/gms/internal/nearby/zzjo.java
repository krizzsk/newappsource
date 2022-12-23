package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzjo extends zzb implements zzjp {
    public zzjo() {
        super("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.zzc(parcel);
            zzb((zzku) zzc.zza(parcel, zzku.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            zzlo zzlo = (zzlo) zzc.zza(parcel, zzlo.CREATOR);
            zzc.zzc(parcel);
            return true;
        }
    }
}
