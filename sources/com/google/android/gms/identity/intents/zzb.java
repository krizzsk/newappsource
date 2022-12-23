package com.google.android.gms.identity.intents;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.identity.zze;

final class zzb extends zzc {
    public final /* synthetic */ UserAddressRequest zza;
    public final /* synthetic */ int zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzb(GoogleApiClient googleApiClient, UserAddressRequest userAddressRequest, int i) {
        super(googleApiClient);
        this.zza = userAddressRequest;
        this.zzb = i;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zze) anyClient).zzp(this.zza, this.zzb);
        setResult(Status.RESULT_SUCCESS);
    }
}
