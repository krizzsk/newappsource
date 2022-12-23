package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

final class zzgh extends zzgp {
    public final /* synthetic */ zzle zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgh(zzgj zzgj, zzle zzle) {
        super((zzgo) null);
        this.zza = zzle;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((Connections.EndpointDiscoveryListener) obj).onEndpointFound(this.zza.zzb(), this.zza.zzd(), this.zza.zzc());
    }
}
