package com.google.android.gms.internal.p986firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzej */
final class zzej implements zzau {
    private final zzbu zza;
    private final zzif zzb;

    public zzej(zzbu zzbu) {
        zzif zzif;
        this.zza = zzbu;
        if (zzbu.zzf()) {
            zzif = zzgl.zza().zzb().zza(zzgi.zza(zzbu), "hybrid_decrypt", "decrypt");
        } else {
            zzif = zzgi.zza;
        }
        this.zzb = zzif;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (zzbq zzbq : this.zza.zze(copyOfRange)) {
                try {
                    byte[] zza2 = ((zzau) zzbq.zze()).zza(copyOfRange2, (byte[]) null);
                    zzbq.zza();
                    int length2 = copyOfRange2.length;
                    return zza2;
                } catch (GeneralSecurityException e) {
                    zzek.zza.logp(Level.INFO, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e.toString())));
                }
            }
        }
        for (zzbq zzbq2 : this.zza.zze(zzas.zza)) {
            try {
                byte[] zza3 = ((zzau) zzbq2.zze()).zza(bArr, (byte[]) null);
                zzbq2.zza();
                return zza3;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
