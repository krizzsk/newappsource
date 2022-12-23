package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbb */
final class zzbb implements zzbc {
    public final /* synthetic */ zzgu zza;
    public final /* synthetic */ zzgb zzb;

    public zzbb(zzgu zzgu, zzgb zzgb) {
        this.zza = zzgu;
        this.zzb = zzgb;
    }

    public final zzax zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzbx(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzax zzb() {
        zzgu zzgu = this.zza;
        return new zzbx(zzgu, this.zzb, zzgu.zzj());
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return this.zzb.getClass();
    }

    public final Set zze() {
        return this.zza.zzm();
    }
}
