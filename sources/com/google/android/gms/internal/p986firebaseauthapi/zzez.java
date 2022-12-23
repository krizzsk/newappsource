package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzez */
final class zzez {
    public static zzet zza(zzmj zzmj) throws GeneralSecurityException {
        if (zzmj.zzd() == 3) {
            return new zzeq(16);
        }
        if (zzmj.zzd() == 4) {
            return new zzeq(32);
        }
        if (zzmj.zzd() == 5) {
            return new zzer();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static zzex zzb(zzmj zzmj) throws GeneralSecurityException {
        if (zzmj.zzf() == 3) {
            return new zzfi(new zzes("HmacSha256"));
        }
        if (zzmj.zzf() == 4) {
            return zzfg.zzc(1);
        }
        if (zzmj.zzf() == 5) {
            return zzfg.zzc(2);
        }
        if (zzmj.zzf() == 6) {
            return zzfg.zzc(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static zzes zzc(zzmj zzmj) {
        if (zzmj.zze() == 3) {
            return new zzes("HmacSha256");
        }
        if (zzmj.zze() == 4) {
            return new zzes("HmacSha384");
        }
        if (zzmj.zze() == 5) {
            return new zzes("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
