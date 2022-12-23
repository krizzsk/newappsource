package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcc */
public final class zzcc {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    public static final String zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated
    public static final zzod zzc;
    @Deprecated
    public static final zzod zzd;
    @Deprecated
    public static final zzod zze;

    static {
        new zzcj();
        new zzcs();
        new zzcv();
        new zzcp();
        new zzdb();
        new zzdf();
        new zzcy();
        new zzdi();
        zzod zzb2 = zzod.zzb();
        zzc = zzb2;
        zzd = zzb2;
        zze = zzb2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzbz.zzo(new zzcg());
        zzhv.zza();
        zzbz.zzn(new zzcj(), true);
        zzbz.zzn(new zzcs(), true);
        if (!zzdw.zzb()) {
            zzbz.zzn(new zzcp(), true);
            zzcv.zzg(true);
            zzbz.zzn(new zzcy(), true);
            zzbz.zzn(new zzdb(), true);
            zzbz.zzn(new zzdf(), true);
            zzbz.zzn(new zzdi(), true);
        }
    }
}
