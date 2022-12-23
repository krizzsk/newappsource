package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

final class zziz extends zzjh {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ ListenerHolder zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zziz(zzji zzji, GoogleApiClient googleApiClient, String str, String str2, ListenerHolder listenerHolder) {
        super(googleApiClient, (zzjg) null);
        this.zza = str;
        this.zzb = str2;
        this.zzc = listenerHolder;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgy) anyClient).zzu(this, this.zza, this.zzb, this.zzc);
    }
}
