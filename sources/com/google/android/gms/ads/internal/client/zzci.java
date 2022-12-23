package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzbtz;

public abstract class zzci extends zzaqw implements zzcj {
    public zzci() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcj asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        if (queryLocalInterface instanceof zzcj) {
            return (zzcj) queryLocalInterface;
        }
        return new zzch(iBinder);
    }

    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzei liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzaqx.zzf(parcel2, liteSdkVersion);
        } else if (i != 2) {
            return false;
        } else {
            zzbtz adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzaqx.zzg(parcel2, adapterCreator);
        }
        return true;
    }
}
