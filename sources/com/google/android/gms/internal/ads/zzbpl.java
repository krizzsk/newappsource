package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbpl extends zzaqw implements zzbpm {
    public static zzbpm zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        if (queryLocalInterface instanceof zzbpm) {
            return (zzbpm) queryLocalInterface;
        }
        return new zzbpk(iBinder);
    }
}
