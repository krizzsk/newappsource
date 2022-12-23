package com.google.android.gms.internal.ads;

import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class zzgid implements zzgbe {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzgid(byte[] bArr) throws GeneralSecurityException {
        zzgik.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, KeyProvider18.KEY_ALGORITHM_AES);
        this.zza = secretKeySpec;
        Cipher zzb2 = zzb();
        zzb2.init(1, secretKeySpec);
        byte[] zzb3 = zzghe.zzb(zzb2.doFinal(new byte[16]));
        this.zzb = zzb3;
        this.zzc = zzghe.zzb(zzb3);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzfzc.zza(1)) {
            return (Cipher) zzghq.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArr2;
        if (i <= 16) {
            Cipher zzb2 = zzb();
            zzb2.init(1, this.zza);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            if (max * 16 == length) {
                bArr2 = zzghf.zze(bArr, (max - 1) * 16, this.zzb, 0, 16);
            } else {
                bArr2 = zzghf.zzd(zzghe.zza(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.zzc);
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = zzb2.doFinal(zzghf.zze(bArr3, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(zzb2.doFinal(zzghf.zzd(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
