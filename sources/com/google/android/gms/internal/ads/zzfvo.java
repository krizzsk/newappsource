package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftr;

final class zzfvo extends zzftr.zzi implements Runnable {
    private final Runnable zza;

    public zzfvo(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zze(th);
            zzfpi.zzb(th);
            throw new RuntimeException(th);
        }
    }

    public final String zza() {
        String valueOf = String.valueOf(this.zza);
        return C13715c.m34245k(new StringBuilder(valueOf.length() + 7), "task=[", valueOf, "]");
    }
}
