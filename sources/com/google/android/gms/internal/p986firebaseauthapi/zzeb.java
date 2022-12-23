package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeb */
final class zzeb implements zzat {
    private final zzbu zza;
    private final zzif zzb;
    private final zzif zzc;

    public zzeb(zzbu zzbu) {
        zzif zzif;
        this.zza = zzbu;
        if (zzbu.zzf()) {
            zzig zzb2 = zzgl.zza().zzb();
            zzil zza2 = zzgi.zza(zzbu);
            this.zzb = zzb2.zza(zza2, "daead", "encrypt");
            zzif = zzb2.zza(zza2, "daead", "decrypt");
        } else {
            zzif = zzgi.zza;
            this.zzb = zzif;
        }
        this.zzc = zzif;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzbq zzbq : this.zza.zze(copyOf)) {
                try {
                    byte[] zza2 = ((zzat) zzbq.zze()).zza(copyOfRange, bArr2);
                    zzbq.zza();
                    int length2 = copyOfRange.length;
                    return zza2;
                } catch (GeneralSecurityException e) {
                    zzec.zza.logp(Level.INFO, "com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead", "decryptDeterministically", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (zzbq zzbq2 : this.zza.zze(zzas.zza)) {
            try {
                byte[] zza3 = ((zzat) zzbq2.zze()).zza(bArr, bArr2);
                zzbq2.zza();
                return zza3;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
