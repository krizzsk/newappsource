package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

final class zzbcr implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzbct zza;

    public zzbcr(zzbct zzbct) {
        this.zza = zzbct;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zza.zzb) {
            try {
                zzbct zzbct = this.zza;
                if (zzbct.zzc != null) {
                    zzbct.zze = zzbct.zzc.zzq();
                }
            } catch (DeadObjectException e) {
                zzcfi.zzh("Unable to obtain a cache service instance.", e);
                zzbct.zzh(this.zza);
            }
            this.zza.zzb.notifyAll();
        }
    }

    public final void onConnectionSuspended(int i) {
        synchronized (this.zza.zzb) {
            this.zza.zze = null;
            this.zza.zzb.notifyAll();
        }
    }
}
