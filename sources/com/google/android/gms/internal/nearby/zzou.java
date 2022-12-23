package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzou extends zzb implements zzov {
    public zzou() {
        super("com.google.android.gms.nearby.uwb.internal.IRangingCapabilitiesResultListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzc.zzc(parcel);
        zzd((zzps) zzc.zza(parcel, zzps.CREATOR));
        return true;
    }
}
