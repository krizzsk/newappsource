package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzcal extends zzaqv {
    public zzcal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcak zzcak, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzcak);
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(2, zza);
    }
}
