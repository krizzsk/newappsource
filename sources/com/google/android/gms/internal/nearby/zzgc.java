package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;

final class zzgc extends zzgp {
    public final /* synthetic */ zzlc zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgc(zzgg zzgg, zzlc zzlc) {
        super((zzgo) null);
        this.zza = zzlc;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        EndpointDiscoveryCallback endpointDiscoveryCallback = (EndpointDiscoveryCallback) obj;
        this.zza.zzc();
        this.zza.zza();
        this.zza.zzb();
    }
}
