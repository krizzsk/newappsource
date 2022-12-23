package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.PublishOptions;

public final /* synthetic */ class zzau implements zzbc {
    public final /* synthetic */ zzbh zza;
    public final /* synthetic */ Message zzb;
    public final /* synthetic */ zzbe zzc;
    public final /* synthetic */ PublishOptions zzd;

    public /* synthetic */ zzau(zzbh zzbh, Message message, zzbe zzbe, PublishOptions publishOptions) {
        this.zza = zzbh;
        this.zzb = message;
        this.zzc = zzbe;
        this.zzd = publishOptions;
    }

    public final void zza(zzai zzai, ListenerHolder listenerHolder) {
        this.zza.zzb(this.zzb, this.zzc, this.zzd, zzai, listenerHolder);
    }
}
