package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzcbl extends zzaqv {
    public zzcbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcba zzcba, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzcba);
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(2, zza);
    }
}
