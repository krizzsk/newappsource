package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;

final class zzaw extends zzbe {
    public final /* synthetic */ ListenerHolder zza;
    public final /* synthetic */ zzbh zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaw(zzbh zzbh, ListenerHolder listenerHolder, ListenerHolder listenerHolder2) {
        super(listenerHolder);
        this.zzb = zzbh;
        this.zza = listenerHolder2;
    }

    public final void zzd() {
        ListenerHolder.ListenerKey listenerKey = this.zza.getListenerKey();
        if (listenerKey != null) {
            this.zzb.doUnregisterEventListener(listenerKey);
        }
        super.zzd();
    }
}
