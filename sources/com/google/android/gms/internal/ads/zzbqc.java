package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

final class zzbqc implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzcga zza;
    public final /* synthetic */ zzbqe zzb;

    public zzbqc(zzbqe zzbqe, zzcga zzcga) {
        this.zzb = zzbqe;
        this.zza = zzcga;
    }

    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzd(this.zzb.zza.zzp());
        } catch (DeadObjectException e) {
            this.zza.zze(e);
        }
    }

    public final void onConnectionSuspended(int i) {
        this.zza.zze(new RuntimeException(C16759e.m42349e("onConnectionSuspended: ", i)));
    }
}
