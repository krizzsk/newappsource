package com.google.android.gms.internal.p985authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zbj */
final class zbj extends zbm {
    public zbj(zbl zbl, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    public final void zba(Context context, zbt zbt) throws RemoteException {
        zbt.zbf(new zbk(this));
    }
}
