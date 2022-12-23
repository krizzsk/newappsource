package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzjr extends zzb implements zzjs {
    public zzjr() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.zzc(parcel);
            zzd((zzli) zzc.zza(parcel, zzli.CREATOR));
            return true;
        } else if (i == 3) {
            zzc.zzc(parcel);
            zzc((zzla) zzc.zza(parcel, zzla.CREATOR));
            return true;
        } else if (i != 4) {
            return false;
        } else {
            zzlk zzlk = (zzlk) zzc.zza(parcel, zzlk.CREATOR);
            zzc.zzc(parcel);
            return true;
        }
    }
}
