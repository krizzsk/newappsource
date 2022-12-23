package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

final class zzfy extends zzgp {
    public final /* synthetic */ zzku zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfy(zzfz zzfz, zzku zzku) {
        super((zzgo) null);
        this.zza = zzku;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((Connections.ConnectionRequestListener) obj).onConnectionRequest(this.zza.zza(), this.zza.zzb(), this.zza.zzc());
    }
}
