package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbmm extends zzaqv implements zzbmo {
    public zzbmm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void zze(zzbmx zzbmx) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbmx);
        zzbl(1, zza);
    }
}
