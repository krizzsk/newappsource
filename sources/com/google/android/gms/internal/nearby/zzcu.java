package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

public abstract class zzcu extends zzb implements zzcv {
    public zzcu() {
        super("com.google.android.gms.nearby.exposurenotification.internal.IDiagnosisKeyFileSupplier");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            boolean zzc = zzc();
            parcel2.writeNoException();
            zzc.zzd(parcel2, zzc);
        } else if (i == 2) {
            ParcelFileDescriptor zzb = zzb();
            parcel2.writeNoException();
            zzc.zzf(parcel2, zzb);
        } else if (i != 3) {
            return false;
        } else {
            parcel2.writeNoException();
            zzc.zzd(parcel2, true);
        }
        return true;
    }
}
