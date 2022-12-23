package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzcap extends zzaqw implements zzcaq {
    public static zzcaq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        if (queryLocalInterface instanceof zzcaq) {
            return (zzcaq) queryLocalInterface;
        }
        return new zzcao(iBinder);
    }
}
