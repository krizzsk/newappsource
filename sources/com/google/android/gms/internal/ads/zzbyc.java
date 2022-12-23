package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class zzbyc extends zzaqw implements zzbyd {
    public static zzbyd zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        if (queryLocalInterface instanceof zzbyd) {
            return (zzbyd) queryLocalInterface;
        }
        return new zzbyb(iBinder);
    }
}
