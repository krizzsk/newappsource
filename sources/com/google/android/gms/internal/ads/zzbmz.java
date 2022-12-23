package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

public final class zzbmz extends RemoteCreator {
    @VisibleForTesting
    public zzbmz() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzblh) {
            return (zzblh) queryLocalInterface;
        }
        return new zzblf(iBinder);
    }

    public final zzble zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        zzble zzblc;
        try {
            IBinder zze = ((zzblh) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(frameLayout), ObjectWrapper.wrap(frameLayout2), 221310000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof zzble) {
                zzblc = (zzble) queryLocalInterface;
            } else {
                zzblc = new zzblc(zze);
            }
            return zzblc;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcfi.zzk("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
