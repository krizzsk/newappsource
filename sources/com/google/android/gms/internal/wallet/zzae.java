package com.google.android.gms.internal.wallet;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.CreateWalletObjectsRequest;
import com.google.android.gms.wallet.zzas;

final class zzae extends zzas {
    public final /* synthetic */ CreateWalletObjectsRequest zza;
    public final /* synthetic */ int zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzae(zzaf zzaf, GoogleApiClient googleApiClient, CreateWalletObjectsRequest createWalletObjectsRequest, int i) {
        super(googleApiClient);
        this.zza = createWalletObjectsRequest;
        this.zzb = i;
    }

    /* renamed from: zza */
    public final void doExecute(zzac zzac) {
        zzac.zzp(this.zza, this.zzb);
        setResult(Status.RESULT_SUCCESS);
    }
}
