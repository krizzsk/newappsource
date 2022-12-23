package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import com.google.android.gms.nearby.connection.zzl;

final class zzgd extends zzgp {
    public final /* synthetic */ zzle zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgd(zzgg zzgg, zzle zzle) {
        super((zzgo) null);
        this.zza = zzle;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        EndpointDiscoveryCallback endpointDiscoveryCallback = (EndpointDiscoveryCallback) obj;
        if (zzgg.zzg(this.zza)) {
            zzl zzl = new zzl();
            zzl.zzd(this.zza.zzd());
            zzl.zza(this.zza.zza());
            endpointDiscoveryCallback.onEndpointFound("__UNRECOGNIZED_BLUETOOTH_DEVICE__", zzl.zze());
            return;
        }
        String zzb = this.zza.zzb();
        zzl zzl2 = new zzl();
        zzl2.zzd(this.zza.zzd());
        zzl2.zzc(this.zza.zzc());
        zzl2.zzb(this.zza.zze());
        endpointDiscoveryCallback.onEndpointFound(zzb, zzl2.zze());
    }
}
