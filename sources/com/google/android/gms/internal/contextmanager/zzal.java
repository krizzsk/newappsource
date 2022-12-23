package com.google.android.gms.internal.contextmanager;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;

final class zzal extends zzch {
    public final /* synthetic */ int zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzal(GoogleApiClient googleApiClient, int i) {
        super(googleApiClient);
        this.zza = i;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzcj) anyClient).zzp(this, new zzao(this.zza, (ArrayList<zzo>) null));
    }
}
