package com.google.android.gms.internal.p985authapi;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zbh */
final class zbh extends zbm {
    public final /* synthetic */ Credential zba;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zbh(zbl zbl, GoogleApiClient googleApiClient, Credential credential) {
        super(googleApiClient);
        this.zba = credential;
    }

    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    public final void zba(Context context, zbt zbt) throws RemoteException {
        zbt.zbe(new zbk(this), new zbu(this.zba));
    }
}
