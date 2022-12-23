package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzfys {
    private static final ThreadLocal zza = new zzfyr();
    private final SecretKey zzb;
    private final boolean zzc;

    public zzfys(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (zzfzc.zza(2)) {
            zzgik.zza(bArr.length);
            this.zzb = new SecretKeySpec(bArr, KeyProvider18.KEY_ALGORITHM_AES);
            this.zzc = z;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    private static AlgorithmParameterSpec zzc(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        if (!zzgij.zzb() || zzgij.zza() > 19) {
            return new GCMParameterSpec(RecyclerView.C1119a0.FLAG_IGNORE, bArr, 0, 12);
        }
        return new IvParameterSpec(bArr, 0, 12);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i;
        int i2 = 12;
        if (bArr.length == 12) {
            boolean z = this.zzc;
            if (true != z) {
                i = 16;
            } else {
                i = 28;
            }
            int length = bArr2.length;
            if (length < i) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (!z || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                AlgorithmParameterSpec zzc2 = zzc(bArr, 0, 12);
                ThreadLocal threadLocal = zza;
                ((Cipher) threadLocal.get()).init(2, this.zzb, zzc2);
                if (!(bArr3 == null || bArr3.length == 0)) {
                    ((Cipher) threadLocal.get()).updateAAD(bArr3);
                }
                boolean z2 = this.zzc;
                if (true != z2) {
                    i2 = 0;
                }
                if (z2) {
                    length -= 12;
                }
                return ((Cipher) threadLocal.get()).doFinal(bArr2, i2, length);
            } else {
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
        } else {
            throw new GeneralSecurityException("iv is wrong size");
        }
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i;
        int i2;
        if (bArr.length == 12) {
            int length = bArr2.length;
            if (length <= 2147483619) {
                boolean z = this.zzc;
                if (z) {
                    i = length + 28;
                } else {
                    i = length + 16;
                }
                byte[] bArr4 = new byte[i];
                if (z) {
                    System.arraycopy(bArr, 0, bArr4, 0, 12);
                }
                AlgorithmParameterSpec zzc2 = zzc(bArr, 0, 12);
                ThreadLocal threadLocal = zza;
                ((Cipher) threadLocal.get()).init(1, this.zzb, zzc2);
                if (true != this.zzc) {
                    i2 = 0;
                } else {
                    i2 = 12;
                }
                int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, length, bArr4, i2);
                if (doFinal == length + 16) {
                    return bArr4;
                }
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
