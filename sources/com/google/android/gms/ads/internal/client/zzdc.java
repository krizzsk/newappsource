package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;

public final class zzdc extends zzaqv implements zzde {
    public zzdc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public final void zze(zzs zzs) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzs);
        zzbl(1, zza);
    }
}
