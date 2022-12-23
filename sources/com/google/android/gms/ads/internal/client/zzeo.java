package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

final class zzeo extends zzbk {
    public final /* synthetic */ zzep zza;

    public /* synthetic */ zzeo(zzep zzep, zzen zzen) {
        this.zza = zzep;
    }

    public final String zze() throws RemoteException {
        return null;
    }

    public final String zzf() throws RemoteException {
        return null;
    }

    public final void zzg(zzl zzl) throws RemoteException {
        zzh(zzl, 1);
    }

    public final void zzh(zzl zzl, int i) throws RemoteException {
        zzcfi.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcfb.zza.post(new zzem(this));
    }

    public final boolean zzi() throws RemoteException {
        return false;
    }
}
