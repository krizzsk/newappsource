package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzcbp {
    public static final zzcbd zza(Context context, String str, zzbtz zzbtz) {
        zzcbd zzcbb;
        try {
            IBinder zze = ((zzcbh) zzcfm.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzcbo.zza)).zze(ObjectWrapper.wrap(context), str, zzbtz, 221310000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzcbd) {
                zzcbb = (zzcbd) queryLocalInterface;
            } else {
                zzcbb = new zzcbb(zze);
            }
            return zzcbb;
        } catch (RemoteException | zzcfl e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
