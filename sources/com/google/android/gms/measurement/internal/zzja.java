package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class zzja implements Runnable {
    public final /* synthetic */ zzik zza;
    public final /* synthetic */ zzjs zzb;

    public zzja(zzjs zzjs, zzik zzik) {
        this.zzb = zzjs;
        this.zza = zzik;
    }

    public final void run() {
        zzjs zzjs = this.zzb;
        zzee zzh = zzjs.zzb;
        if (zzh == null) {
            C16530d.m42018k(zzjs.zzs, "Failed to send current screen to service");
            return;
        }
        try {
            zzik zzik = this.zza;
            if (zzik == null) {
                zzh.zzq(0, (String) null, (String) null, zzjs.zzs.zzau().getPackageName());
            } else {
                zzh.zzq(zzik.zzc, zzik.zza, zzik.zzb, zzjs.zzs.zzau().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send current screen to the service", e);
        }
    }
}
