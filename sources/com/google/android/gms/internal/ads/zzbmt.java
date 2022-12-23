package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbmt extends zzaqw implements zzbmu {
    public zzbmt() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            zzaqx.zzc(parcel);
            zzf(readString);
        } else if (i != 2) {
            return false;
        } else {
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
