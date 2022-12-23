package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzew */
final class zzew implements zzav {
    private final zzmp zza;
    private final zzex zzb;
    private final zzet zzc;
    private final zzes zzd;

    private zzew(zzmp zzmp, zzex zzex, zzes zzes, zzet zzet, byte[] bArr) {
        this.zza = zzmp;
        this.zzb = zzex;
        this.zzd = zzes;
        this.zzc = zzet;
    }

    public static zzew zza(zzmp zzmp) throws GeneralSecurityException {
        if (!zzmp.zzg().zzs()) {
            zzmj zzb2 = zzmp.zzb();
            return new zzew(zzmp, zzez.zzb(zzb2), zzez.zzc(zzb2), zzez.zza(zzb2), (byte[]) null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }
}
