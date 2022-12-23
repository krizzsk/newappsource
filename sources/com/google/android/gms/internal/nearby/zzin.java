package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.Strategy;

final class zzin extends zzjf {
    public final /* synthetic */ String zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ ListenerHolder zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzin(zzji zzji, GoogleApiClient googleApiClient, String str, long j, ListenerHolder listenerHolder) {
        super(googleApiClient, (zzje) null);
        this.zza = str;
        this.zzb = j;
        this.zzc = listenerHolder;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        String str = this.zza;
        long j = this.zzb;
        ListenerHolder listenerHolder = this.zzc;
        AdvertisingOptions.Builder builder = new AdvertisingOptions.Builder();
        builder.setStrategy(Strategy.P2P_CLUSTER);
        AdvertisingOptions build = builder.build();
        zzmq zzmq = new zzmq();
        zzmq.zzg(new zzgx(this));
        zzmq.zze(str);
        zzmq.zzh("__LEGACY_SERVICE_ID__");
        zzmq.zzc(j);
        zzmq.zza(new zzfz(listenerHolder));
        zzmq.zzf(build);
        ((zzkd) ((zzgy) anyClient).getService()).zzk(zzmq.zzi());
    }
}
