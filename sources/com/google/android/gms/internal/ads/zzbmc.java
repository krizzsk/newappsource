package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbmc extends zzaqv implements zzbme {
    public zzbmc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void zze(zzblu zzblu, String str) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzblu);
        zza.writeString(str);
        zzbl(1, zza);
    }
}
