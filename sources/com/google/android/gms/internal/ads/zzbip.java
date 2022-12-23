package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract class zzbip extends zzaqw implements zzbiq {
    public zzbip() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        } else if (i == 2) {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
        } else if (i == 3) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaqx.zzc(parcel);
            zzd(asInterface);
            parcel2.writeNoException();
        } else if (i == 4) {
            zze();
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            zzf();
            parcel2.writeNoException();
        }
        return true;
    }
}
