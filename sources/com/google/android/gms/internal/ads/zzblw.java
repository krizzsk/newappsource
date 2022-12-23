package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzblw extends zzaqv implements zzbly {
    public zzblw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void zze(zzblp zzblp) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzblp);
        zzbl(1, zza);
    }
}
