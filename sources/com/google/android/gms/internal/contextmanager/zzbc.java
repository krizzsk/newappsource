package com.google.android.gms.internal.contextmanager;

import android.os.RemoteException;
import com.google.android.gms.awareness.fence.FenceQueryRequest;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzbc extends zzcf {
    public final /* synthetic */ FenceQueryRequest zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbc(zzbd zzbd, GoogleApiClient googleApiClient, FenceQueryRequest fenceQueryRequest) {
        super(googleApiClient);
        this.zza = fenceQueryRequest;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzcj) anyClient).zzq(this, (zzbm) this.zza);
    }
}
