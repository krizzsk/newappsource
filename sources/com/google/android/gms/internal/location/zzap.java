package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

public abstract class zzap extends zzb implements zzaq {
    public zzap() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb((LocationSettingsResult) zzc.zza(parcel, LocationSettingsResult.CREATOR));
        return true;
    }
}
