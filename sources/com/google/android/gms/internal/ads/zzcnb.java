package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzcnb extends zzaqw implements zzcnc {
    public static zzcnc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        if (queryLocalInterface instanceof zzcnc) {
            return (zzcnc) queryLocalInterface;
        }
        return new zzcna(iBinder);
    }
}
