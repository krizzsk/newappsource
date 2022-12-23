package com.google.android.gms.wallet;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.wallet.zzac;

public abstract class zzaq extends BaseImplementation.ApiMethodImpl {
    public zzaq(GoogleApiClient googleApiClient) {
        super((Api<?>) Wallet.API, googleApiClient);
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }

    /* renamed from: zza */
    public abstract void doExecute(zzac zzac) throws RemoteException;
}
