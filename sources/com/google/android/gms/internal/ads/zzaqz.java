package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzaqz extends zzaqw implements zzara {
    public static zzara zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        if (queryLocalInterface instanceof zzara) {
            return (zzara) queryLocalInterface;
        }
        return new zzaqy(iBinder);
    }
}
