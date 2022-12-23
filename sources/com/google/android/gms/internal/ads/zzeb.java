package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

final class zzeb implements zzdf {
    private Message zza;
    private zzec zzb;

    private zzeb() {
    }

    public /* synthetic */ zzeb(zzea zzea) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzec.zzk(this);
    }

    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        zzd();
    }

    public final zzeb zzb(Message message, zzec zzec) {
        this.zza = message;
        this.zzb = zzec;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }
}
