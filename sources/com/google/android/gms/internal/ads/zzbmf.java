package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbmf extends zzaqv implements zzbmh {
    public zzbmf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void zze(zzblu zzblu) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzblu);
        zzbl(1, zza);
    }
}
