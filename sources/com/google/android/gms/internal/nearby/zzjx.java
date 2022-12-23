package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzjx extends zzb implements zzjy {
    public zzjx() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        zzc.zzc(parcel);
        zzb((zzkw) zzc.zza(parcel, zzkw.CREATOR));
        return true;
    }
}
