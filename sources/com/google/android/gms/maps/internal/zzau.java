package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzw;

public abstract class zzau extends zzb implements zzav {
    public zzau() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzd(zzw.zzb(parcel.readStrongBinder()));
        } else if (i == 2) {
            zzb(zzw.zzb(parcel.readStrongBinder()));
        } else if (i != 3) {
            return false;
        } else {
            zzc(zzw.zzb(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
