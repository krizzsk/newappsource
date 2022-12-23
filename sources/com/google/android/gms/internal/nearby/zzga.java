package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

final class zzga extends zzgp {
    public final /* synthetic */ zzkw zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzga(zzgb zzgb, zzkw zzkw) {
        super((zzgo) null);
        this.zza = zzkw;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((Connections.ConnectionResponseCallback) obj).onConnectionResponse(this.zza.zzb(), zzgy.zzF(this.zza.zza()), this.zza.zzc());
    }
}
