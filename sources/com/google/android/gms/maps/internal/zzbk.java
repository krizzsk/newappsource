package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;

public abstract class zzbk extends zzb implements zzbl {
    public zzbk() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaChangeListener");
    }

    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzb((StreetViewPanoramaLocation) zzc.zza(parcel, StreetViewPanoramaLocation.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
