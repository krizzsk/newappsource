package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.SubscribeOptions;

public final /* synthetic */ class zzaj implements zzbc {
    public final /* synthetic */ zzbh zza;
    public final /* synthetic */ PendingIntent zzb;
    public final /* synthetic */ zzbg zzc;
    public final /* synthetic */ SubscribeOptions zzd;

    public /* synthetic */ zzaj(zzbh zzbh, PendingIntent pendingIntent, zzbg zzbg, SubscribeOptions subscribeOptions) {
        this.zza = zzbh;
        this.zzb = pendingIntent;
        this.zzc = zzbg;
        this.zzd = subscribeOptions;
    }

    public final void zza(zzai zzai, ListenerHolder listenerHolder) {
        this.zza.zzf(this.zzb, this.zzc, this.zzd, zzai, listenerHolder);
    }
}
