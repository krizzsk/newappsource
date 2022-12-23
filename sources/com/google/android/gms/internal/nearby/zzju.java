package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzju extends zzb implements zzjv {
    public zzju() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc.zzc(parcel);
            zzc((zzks) zzc.zza(parcel, zzks.CREATOR));
            return true;
        } else if (i == 3) {
            zzc.zzc(parcel);
            zzd((zzky) zzc.zza(parcel, zzky.CREATOR));
            return true;
        } else if (i == 4) {
            zzc.zzc(parcel);
            zze((zzla) zzc.zza(parcel, zzla.CREATOR));
            return true;
        } else if (i != 5) {
            return false;
        } else {
            zzc.zzc(parcel);
            zzb((zzkq) zzc.zza(parcel, zzkq.CREATOR));
            return true;
        }
    }
}
