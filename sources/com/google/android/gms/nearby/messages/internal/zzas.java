package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.SubscribeOptions;

public final /* synthetic */ class zzas implements zzbc {
    public final /* synthetic */ zzbh zza;
    public final /* synthetic */ ListenerHolder zzb;
    public final /* synthetic */ zzbg zzc;
    public final /* synthetic */ SubscribeOptions zzd;

    public /* synthetic */ zzas(zzbh zzbh, ListenerHolder listenerHolder, zzbg zzbg, SubscribeOptions subscribeOptions) {
        this.zza = zzbh;
        this.zzb = listenerHolder;
        this.zzc = zzbg;
        this.zzd = subscribeOptions;
    }

    public final void zza(zzai zzai, ListenerHolder listenerHolder) {
        this.zza.zze(this.zzb, this.zzc, this.zzd, zzai, listenerHolder);
    }
}
