package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzcfi;

public final class zzel extends RemoteCreator {
    public zzel() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof zzcn) {
            return (zzcn) queryLocalInterface;
        }
        return new zzcn(iBinder);
    }

    public final zzcm zza(Context context) {
        zzcm zzck;
        try {
            IBinder zze = ((zzcn) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), 221310000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzcm) {
                zzck = (zzcm) queryLocalInterface;
            } else {
                zzck = new zzck(zze);
            }
            return zzck;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcfi.zzk("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
