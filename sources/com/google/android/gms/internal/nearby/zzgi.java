package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

final class zzgi extends zzgp {
    public final /* synthetic */ zzlg zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzgi(zzgj zzgj, zzlg zzlg) {
        super((zzgo) null);
        this.zza = zzlg;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((Connections.EndpointDiscoveryListener) obj).onEndpointLost(this.zza.zza());
    }
}
