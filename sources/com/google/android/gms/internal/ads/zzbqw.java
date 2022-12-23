package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbqw extends zzaqw implements zzbqx {
    public zzbqw() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            zzaqx.zzc(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
