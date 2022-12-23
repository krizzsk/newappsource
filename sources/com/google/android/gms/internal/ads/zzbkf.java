package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbkf {
    public static final AtomicBoolean zza = new AtomicBoolean();
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();

    public static zzbkd zza() {
        return (zzbkd) zzb.get();
    }

    public static zzbke zzb() {
        return (zzbke) zzc.get();
    }

    public static void zzc(zzbkd zzbkd) {
        zzb.set(zzbkd);
    }
}
