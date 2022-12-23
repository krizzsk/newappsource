package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class zzpt extends Handler {
    public final /* synthetic */ zzpv zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzpt(zzpv zzpv, Looper looper) {
        super(looper);
        this.zza = zzpv;
    }

    public final void handleMessage(Message message) {
        zzpv.zza(this.zza, message);
    }
}
