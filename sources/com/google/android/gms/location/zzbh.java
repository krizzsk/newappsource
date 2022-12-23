package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzc;

public abstract class zzbh extends zzb implements zzbi {
    public zzbh() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static zzbi zzb(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof zzbi) {
            return (zzbi) queryLocalInterface;
        }
        return new zzbg(iBinder);
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze((LocationResult) zzc.zza(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzd((LocationAvailability) zzc.zza(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
