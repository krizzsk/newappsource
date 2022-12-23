package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfv */
public abstract class zzfv {
    private final zzpx zza;
    private final Class zzb;

    public /* synthetic */ zzfv(zzpx zzpx, Class cls, zzfu zzfu) {
        this.zza = zzpx;
        this.zzb = cls;
    }

    public static zzfv zzb(zzft zzft, zzpx zzpx, Class cls) {
        return new zzfs(zzpx, cls, zzft);
    }

    public abstract zzaw zza(zzgx zzgx, zzca zzca) throws GeneralSecurityException;

    public final zzpx zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
