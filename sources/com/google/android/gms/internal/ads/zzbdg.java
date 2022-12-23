package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

final class zzbdg implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzcga zza;
    public final /* synthetic */ zzbdh zzb;

    public zzbdg(zzbdh zzbdh, zzcga zzcga) {
        this.zzb = zzbdh;
        this.zza = zzcga;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zze(new RuntimeException("Connection failed."));
        }
    }
}
