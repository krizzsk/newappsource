package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbxw extends zzaqw implements zzbxx {
    public static zzbxx zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbxx) {
            return (zzbxx) queryLocalInterface;
        }
        return new zzbxv(iBinder);
    }
}
