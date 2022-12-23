package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhv */
public final class zzhv {
    @Deprecated
    public static final zzod zza;
    @Deprecated
    public static final zzod zzb;
    @Deprecated
    public static final zzod zzc;

    static {
        new zzhu();
        zzod zzb2 = zzod.zzb();
        zza = zzb2;
        zzb = zzb2;
        zzc = zzb2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzbz.zzo(new zzia());
        zzbz.zzn(new zzhu(), true);
        if (!zzdw.zzb()) {
            zzbz.zzn(new zzhk(), true);
            zzhr.zza();
        }
    }
}
