package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbki extends zzaqv {
    public zzbki(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbze zzbze) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbze);
        zzbl(1, zza);
    }
}
