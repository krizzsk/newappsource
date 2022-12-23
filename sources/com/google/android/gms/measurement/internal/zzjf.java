package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzjf implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ zzjs zzb;

    public zzjf(zzjs zzjs, zzq zzq) {
        this.zzb = zzjs;
        this.zza = zzq;
    }

    public final void run() {
        zzjs zzjs = this.zzb;
        zzee zzh = zzjs.zzb;
        if (zzh == null) {
            C16530d.m42018k(zzjs.zzs, "Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzh.zzs(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send measurementEnabled to the service", e);
        }
    }
}
