package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class zzdl extends zzb implements zzdm {
    public zzdl() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IIntCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        zzc.zzc(parcel);
        zzb((Status) zzc.zza(parcel, Status.CREATOR), readInt);
        return true;
    }
}
