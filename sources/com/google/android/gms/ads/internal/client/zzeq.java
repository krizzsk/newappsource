package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcfi;

final class zzeq implements Runnable {
    public final /* synthetic */ zzer zza;

    public zzeq(zzer zzer) {
        this.zza = zzer;
    }

    public final void run() {
        zzer zzer = this.zza;
        if (zzer.zza != null) {
            try {
                zzer.zza.zze(1);
            } catch (RemoteException e) {
                zzcfi.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
