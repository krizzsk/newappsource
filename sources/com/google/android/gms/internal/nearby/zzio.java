package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;

final class zzio extends zzjh {
    public final /* synthetic */ String zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ ListenerHolder zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzio(zzji zzji, GoogleApiClient googleApiClient, String str, long j, ListenerHolder listenerHolder) {
        super(googleApiClient, (zzjg) null);
        this.zza = str;
        this.zzb = j;
        this.zzc = listenerHolder;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        String str = this.zza;
        long j = this.zzb;
        ListenerHolder listenerHolder = this.zzc;
        DiscoveryOptions.Builder builder = new DiscoveryOptions.Builder();
        builder.setStrategy(Strategy.P2P_CLUSTER);
        DiscoveryOptions build = builder.build();
        zzmu zzmu = new zzmu();
        zzmu.zzd(new zzgv(this));
        zzmu.zze(str);
        zzmu.zzb(j);
        zzmu.zza(new zzgj(listenerHolder));
        zzmu.zzc(build);
        ((zzkd) ((zzgy) anyClient).getService()).zzl(zzmu.zzf());
    }
}
