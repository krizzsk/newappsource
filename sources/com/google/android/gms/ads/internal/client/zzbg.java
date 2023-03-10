package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;

public final class zzbg extends zzaqv implements zzbi {
    public zzbg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    public final void zzb(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zze);
        zzbl(2, zza);
    }

    public final void zzc() throws RemoteException {
        zzbl(1, zza());
    }
}
