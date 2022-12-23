package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class zzdo extends zzb implements zzdp {
    public zzdo() {
        super("com.google.android.gms.nearby.exposurenotification.internal.ILongCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        long readLong = parcel.readLong();
        zzc.zzc(parcel);
        zzb((Status) zzc.zza(parcel, Status.CREATOR), readLong);
        return true;
    }
}
