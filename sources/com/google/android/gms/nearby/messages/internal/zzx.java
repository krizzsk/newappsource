package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.nearby.zzb;
import com.google.android.gms.internal.nearby.zzc;

public abstract class zzx extends zzb implements zzy {
    public zzx() {
        super("com.google.android.gms.nearby.messages.internal.IStatusCallback");
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
