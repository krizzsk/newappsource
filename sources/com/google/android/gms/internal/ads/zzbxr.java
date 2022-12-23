package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

public final class zzbxr extends RemoteCreator {
    public zzbxr() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbxx) {
            return (zzbxx) queryLocalInterface;
        }
        return new zzbxv(iBinder);
    }

    public final zzbxu zza(Activity activity) {
        zzbxu zzbxs;
        try {
            IBinder zze = ((zzbxx) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzbxu) {
                zzbxs = (zzbxu) queryLocalInterface;
            } else {
                zzbxs = new zzbxs(zze);
            }
            return zzbxs;
        } catch (RemoteException e) {
            zzcfi.zzk("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzcfi.zzk("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
