package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzceb extends zzaqw implements zzcec {
    public static zzcec zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        if (queryLocalInterface instanceof zzcec) {
            return (zzcec) queryLocalInterface;
        }
        return new zzcea(iBinder);
    }
}
