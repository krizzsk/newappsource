package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

final class zzip extends zzjh {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ byte[] zzc;
    public final /* synthetic */ ListenerHolder zzd;
    public final /* synthetic */ ListenerHolder zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzip(zzji zzji, GoogleApiClient googleApiClient, String str, String str2, byte[] bArr, ListenerHolder listenerHolder, ListenerHolder listenerHolder2) {
        super(googleApiClient, (zzjg) null);
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = listenerHolder;
        this.zze = listenerHolder2;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzgy zzgy = (zzgy) anyClient;
        String str = this.zza;
        String str2 = this.zzb;
        byte[] bArr = this.zzc;
        ListenerHolder listenerHolder = this.zzd;
        ListenerHolder listenerHolder2 = this.zze;
        zzmi zzmi = new zzmi();
        zzmi.zzi(new zzgv(this));
        zzmi.zzf(str);
        zzmi.zzh(str2);
        zzmi.zze(bArr);
        zzmi.zza(new zzgn(zzgy.getContext(), listenerHolder2));
        zzmi.zzc(new zzgb(listenerHolder));
        ((zzkd) zzgy.getService()).zzi(zzmi.zzj());
    }
}
