package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzba */
final class zzba implements zzbc {
    public final /* synthetic */ zzgb zza;

    public zzba(zzgb zzgb) {
        this.zza = zzgb;
    }

    public final zzax zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzaz(this.zza, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzax zzb() {
        zzgb zzgb = this.zza;
        return new zzaz(zzgb, zzgb.zzj());
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return null;
    }

    public final Set zze() {
        return this.zza.zzm();
    }
}
