package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.ListenerHolder;

public final /* synthetic */ class zzal implements zzbc {
    public final /* synthetic */ PendingIntent zza;

    public /* synthetic */ zzal(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    public final void zza(zzai zzai, ListenerHolder listenerHolder) {
        PendingIntent pendingIntent = this.zza;
        int i = zzbh.zza;
        zzai.zzA(listenerHolder, pendingIntent);
    }
}
