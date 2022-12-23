package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzpd extends zzb implements zzpe {
    public zzpd() {
        super("com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        zzc.zzc(parcel);
        zzd((zzqq) zzc.zza(parcel, zzqq.CREATOR));
        return true;
    }
}
