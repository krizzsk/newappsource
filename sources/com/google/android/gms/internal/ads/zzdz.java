package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public final class zzdz implements zzcx {
    public final long zza() {
        return SystemClock.elapsedRealtime();
    }

    public final zzdg zzb(Looper looper, Handler.Callback callback) {
        return new zzec(new Handler(looper, callback));
    }
}
