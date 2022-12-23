package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

final class zzfvy extends zzfuq implements RunnableFuture {
    private volatile zzfvi zza;

    public zzfvy(zzfug zzfug) {
        this.zza = new zzfvw(this, zzfug);
    }

    public static zzfvy zzf(Runnable runnable, Object obj) {
        return new zzfvy(Executors.callable(runnable, obj));
    }

    public final void run() {
        zzfvi zzfvi = this.zza;
        if (zzfvi != null) {
            zzfvi.run();
        }
        this.zza = null;
    }

    public final String zza() {
        zzfvi zzfvi = this.zza;
        if (zzfvi == null) {
            return super.zza();
        }
        String zzfvi2 = zzfvi.toString();
        return C13715c.m34245k(new StringBuilder(zzfvi2.length() + 7), "task=[", zzfvi2, "]");
    }

    public final void zzb() {
        zzfvi zzfvi;
        if (zzu() && (zzfvi = this.zza) != null) {
            zzfvi.zzh();
        }
        this.zza = null;
    }

    public zzfvy(Callable callable) {
        this.zza = new zzfvx(this, callable);
    }
}
