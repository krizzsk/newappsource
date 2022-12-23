package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzei */
public final class zzei {
    @Deprecated
    public static final zzod zza = zzod.zzb();
    @Deprecated
    public static final zzod zzb = zzod.zzb();
    @Deprecated
    public static final zzod zzc = zzod.zzb();

    static {
        new zzeh();
        new zzef();
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzbz.zzo(new zzek());
        zzbz.zzo(new zzem());
        zzcc.zza();
        if (!zzdw.zzb()) {
            zzbz.zzm(new zzef(), new zzeh(), true);
            zzbz.zzm(new zzfc(), new zzfe(), true);
        }
    }
}
