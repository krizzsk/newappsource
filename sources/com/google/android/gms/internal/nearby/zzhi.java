package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzhi implements RemoteCall {
    public final /* synthetic */ zzih zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ ListenerHolder zzc;
    public final /* synthetic */ DiscoveryOptions zzd;

    public /* synthetic */ zzhi(zzih zzih, String str, ListenerHolder listenerHolder, DiscoveryOptions discoveryOptions) {
        this.zza = zzih;
        this.zzb = str;
        this.zzc = listenerHolder;
        this.zzd = discoveryOptions;
    }

    public final void accept(Object obj, Object obj2) {
        zzih zzih = this.zza;
        ((zzgy) obj).zzB(new zzif(zzih, (TaskCompletionSource) obj2), this.zzb, this.zzc, this.zzd);
    }
}
