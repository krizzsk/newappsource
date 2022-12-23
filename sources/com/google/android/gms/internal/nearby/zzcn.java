package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class zzcn extends zzb implements zzco {
    public zzcn() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IBooleanCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zzg = zzc.zzg(parcel);
        zzc.zzc(parcel);
        zzb((Status) zzc.zza(parcel, Status.CREATOR), zzg);
        return true;
    }
}
