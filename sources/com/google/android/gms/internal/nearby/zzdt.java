package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.exposurenotification.PackageConfiguration;

public abstract class zzdt extends zzb implements zzdu {
    public zzdt() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IPackageConfigurationCallback");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzc.zzc(parcel);
        zzb((Status) zzc.zza(parcel, Status.CREATOR), (PackageConfiguration) zzc.zza(parcel, PackageConfiguration.CREATOR));
        return true;
    }
}
