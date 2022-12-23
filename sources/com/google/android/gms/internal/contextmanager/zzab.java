package com.google.android.gms.internal.contextmanager;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;

final class zzab extends zzch {
    public final /* synthetic */ ArrayList zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzab(GoogleApiClient googleApiClient, int i, ArrayList arrayList) {
        super(googleApiClient);
        this.zza = arrayList;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzcj) anyClient).zzp(this, new zzao(10003, this.zza));
    }
}
