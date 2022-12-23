package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

final class zzgm extends zzgp {
    public final /* synthetic */ zzla zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgm(zzgn zzgn, zzla zzla) {
        super((zzgo) null);
        this.zza = zzla;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((Connections.MessageListener) obj).onDisconnected(this.zza.zza());
    }
}
