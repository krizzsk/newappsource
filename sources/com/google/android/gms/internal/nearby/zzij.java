package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.connection.Payload;
import java.util.List;

final class zzij extends zzjh {
    public final /* synthetic */ List zza;
    public final /* synthetic */ Payload zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzij(zzji zzji, GoogleApiClient googleApiClient, List list, Payload payload) {
        super(googleApiClient, (zzjg) null);
        this.zza = list;
        this.zzb = payload;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgy) anyClient).zzy(this, (String[]) this.zza.toArray(new String[0]), this.zzb, false);
    }
}
