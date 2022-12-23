package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzjb implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ zzjs zzc;

    public zzjb(zzjs zzjs, zzq zzq, Bundle bundle) {
        this.zzc = zzjs;
        this.zza = zzq;
        this.zzb = bundle;
    }

    public final void run() {
        zzjs zzjs = this.zzc;
        zzee zzh = zzjs.zzb;
        if (zzh == null) {
            C16530d.m42018k(zzjs.zzs, "Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzh.zzr(this.zzb, this.zza);
        } catch (RemoteException e) {
            this.zzc.zzs.zzay().zzd().zzb("Failed to send default event parameters to service", e);
        }
    }
}
