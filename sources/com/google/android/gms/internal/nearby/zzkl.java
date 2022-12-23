package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzkl extends zzb implements zzkm {
    public zzkl() {
        super("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        zzc.zzc(parcel);
        zzb((zzlm) zzc.zza(parcel, zzlm.CREATOR));
        return true;
    }
}
