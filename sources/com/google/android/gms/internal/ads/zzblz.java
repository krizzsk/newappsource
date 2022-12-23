package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzblz extends zzaqv implements zzbmb {
    public zzblz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void zze(zzblr zzblr) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzblr);
        zzbl(1, zza);
    }
}
