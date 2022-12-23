package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzea */
public final class zzea {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
    @Deprecated
    public static final zzod zzb = zzod.zzb();
    @Deprecated
    public static final zzod zzc = zzod.zzb();

    static {
        new zzdz();
        try {
            zzbz.zzo(new zzec());
            if (!zzdw.zzb()) {
                zzbz.zzn(new zzdz(), true);
            }
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
