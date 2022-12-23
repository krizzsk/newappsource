package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgl */
public final class zzgl {
    private static final zzgl zza = new zzgl();
    private static final zzgk zzb = new zzgk((zzgj) null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzgl zza() {
        return zza;
    }

    public final zzig zzb() {
        zzig zzig = (zzig) this.zzc.get();
        return zzig == null ? zzb : zzig;
    }
}
