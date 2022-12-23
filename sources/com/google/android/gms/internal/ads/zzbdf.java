package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;

final class zzbdf implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    public final /* synthetic */ zzbcx zza;
    public final /* synthetic */ zzcga zzb;
    public final /* synthetic */ zzbdh zzc;

    public zzbdf(zzbdh zzbdh, zzbcx zzbcx, zzcga zzcga) {
        this.zzc = zzbdh;
        this.zza = zzbcx;
        this.zzb = zzcga;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            zzbdh zzbdh = this.zzc;
            if (!zzbdh.zzb) {
                zzbdh.zzb = true;
                zzbcw zza2 = this.zzc.zza;
                if (zza2 != null) {
                    zzfvj zza3 = zzcfv.zza.zza(new zzbdc(this, zza2, this.zza, this.zzb));
                    zzcga zzcga = this.zzb;
                    zzcga.zzc(new zzbdd(zzcga, zza3), zzcfv.zzf);
                }
            }
        }
    }

    public final void onConnectionSuspended(int i) {
    }
}
