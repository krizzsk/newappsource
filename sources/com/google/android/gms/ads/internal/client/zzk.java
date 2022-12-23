package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

public final class zzk extends RemoteCreator {
    private zzbyz zza;

    @VisibleForTesting
    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzbt) {
            return (zzbt) queryLocalInterface;
        }
        return new zzbt(iBinder);
    }

    public final zzbs zza(Context context, zzq zzq, String str, zzbtz zzbtz, int i) {
        zzbs zzbq;
        zzbs zzbq2;
        zzbhy.zzc(context);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzib)).booleanValue()) {
            try {
                IBinder zze = ((zzbt) zzcfm.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.zza)).zze(ObjectWrapper.wrap(context), zzq, str, zzbtz, 221310000, i);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof zzbs) {
                    zzbq2 = (zzbs) queryLocalInterface;
                } else {
                    zzbq2 = new zzbq(zze);
                }
                return zzbq2;
            } catch (RemoteException | zzcfl | NullPointerException e) {
                zzbyz zza2 = zzbyx.zza(context);
                this.zza = zza2;
                zza2.zzd(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzcfi.zzl("#007 Could not call remote method.", e);
                return null;
            }
        } else {
            try {
                IBinder zze2 = ((zzbt) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzq, str, zzbtz, 221310000, i);
                if (zze2 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface2 instanceof zzbs) {
                    zzbq = (zzbs) queryLocalInterface2;
                } else {
                    zzbq = new zzbq(zze2);
                }
                return zzbq;
            } catch (RemoteException | RemoteCreator.RemoteCreatorException e2) {
                zzcfi.zzf("Could not create remote AdManager.", e2);
                return null;
            }
        }
    }
}
