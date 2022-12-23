package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;

final class zzge extends zzgp {
    public final /* synthetic */ zzlg zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzge(zzgg zzgg, zzlg zzlg) {
        super((zzgo) null);
        this.zza = zzlg;
    }

    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((EndpointDiscoveryCallback) obj).onEndpointLost(this.zza.zza());
    }
}
