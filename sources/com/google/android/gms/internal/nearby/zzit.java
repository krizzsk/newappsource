package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.connection.Payload;

final class zzit extends zzjh {
    public final /* synthetic */ String zza;
    public final /* synthetic */ byte[] zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzit(zzji zzji, GoogleApiClient googleApiClient, String str, byte[] bArr) {
        super(googleApiClient, (zzjg) null);
        this.zza = str;
        this.zzb = bArr;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgy) anyClient).zzy(this, new String[]{this.zza}, Payload.fromBytes(this.zzb), true);
    }
}
