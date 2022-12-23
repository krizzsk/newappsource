package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbts {
    private static zzbts zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public static zzbts zza() {
        if (zza == null) {
            zza = new zzbts();
        }
        return zza;
    }

    public final Thread zzb(Context context, String str) {
        if (!this.zzb.compareAndSet(false, true)) {
            return null;
        }
        Thread thread = new Thread(new zzbtr(this, context, str));
        thread.start();
        return thread;
    }
}
