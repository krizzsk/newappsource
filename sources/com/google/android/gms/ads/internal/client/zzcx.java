package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqx;

public abstract class zzcx extends zzaqw implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzaqx.zzc(parcel);
        zze((zze) zzaqx.zza(parcel, zze.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
