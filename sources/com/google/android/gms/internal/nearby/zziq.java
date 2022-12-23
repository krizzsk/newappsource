package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

final class zziq extends zzjh {
    public final /* synthetic */ String zza;
    public final /* synthetic */ byte[] zzb;
    public final /* synthetic */ ListenerHolder zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zziq(zzji zzji, GoogleApiClient googleApiClient, String str, byte[] bArr, ListenerHolder listenerHolder) {
        super(googleApiClient, (zzjg) null);
        this.zza = str;
        this.zzb = bArr;
        this.zzc = listenerHolder;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzgy zzgy = (zzgy) anyClient;
        String str = this.zza;
        byte[] bArr = this.zzb;
        ListenerHolder listenerHolder = this.zzc;
        zzfh zzfh = new zzfh();
        zzfh.zze(new zzgv(this));
        zzfh.zzd(str);
        zzfh.zzb(bArr);
        zzfh.zza(new zzgn(zzgy.getContext(), listenerHolder));
        ((zzkd) zzgy.getService()).zzd(zzfh.zzf());
    }
}
