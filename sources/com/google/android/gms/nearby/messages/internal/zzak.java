package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.Message;

public final /* synthetic */ class zzak implements zzbc {
    public final /* synthetic */ Message zza;

    public /* synthetic */ zzak(Message message) {
        this.zza = message;
    }

    public final void zza(zzai zzai, ListenerHolder listenerHolder) {
        Message message = this.zza;
        int i = zzbh.zza;
        zzai.zzy(listenerHolder, zzae.zza(message));
    }
}
