package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzcfi;

public final class zzi extends RemoteCreator {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof zzbp) {
            return (zzbp) queryLocalInterface;
        }
        return new zzbp(iBinder);
    }

    public final zzbo zza(Context context, String str, zzbtz zzbtz) {
        zzbo zzbm;
        try {
            IBinder zze = ((zzbp) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), str, zzbtz, 221310000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbo) {
                zzbm = (zzbo) queryLocalInterface;
            } else {
                zzbm = new zzbm(zze);
            }
            return zzbm;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcfi.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
