package com.google.android.gms.internal.contextmanager;

import android.os.RemoteException;
import com.google.android.gms.awareness.fence.FenceUpdateRequest;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzbb extends zzci {
    public final /* synthetic */ FenceUpdateRequest zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbb(zzbd zzbd, GoogleApiClient googleApiClient, FenceUpdateRequest fenceUpdateRequest) {
        super(googleApiClient);
        this.zza = fenceUpdateRequest;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzcj) anyClient).zzr(this, (zzbs) this.zza);
    }
}
