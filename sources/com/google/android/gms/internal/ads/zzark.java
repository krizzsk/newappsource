package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class zzark extends Handler {
    public final /* synthetic */ zzarl zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzark(zzarl zzarl, Looper looper) {
        super(looper);
        this.zza = zzarl;
    }

    public final void handleMessage(Message message) {
        this.zza.zzt(message);
    }
}
