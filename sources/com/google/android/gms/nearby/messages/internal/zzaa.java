package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.nearby.zzb;

public abstract class zzaa extends zzb implements zzab {
    public zzaa() {
        super("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzd();
        return true;
    }
}
