package com.google.android.gms.internal.p986firebaseauthapi;

import android.os.Build;
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

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdl */
public final class zzdl {
    private static final ThreadLocal zza = new zzdk();
    private final SecretKey zzb;
    private final boolean zzc;

    public zzdl(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (zzdv.zza(2)) {
            zzpu.zzb(bArr.length);
            this.zzb = new SecretKeySpec(bArr, KeyProvider18.KEY_ALGORITHM_AES);
            this.zzc = z;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i;
        AlgorithmParameterSpec algorithmParameterSpec;
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
                if (!zzpt.zza() || Integer.valueOf(Build.VERSION.SDK_INT).intValue() > 19) {
                    algorithmParameterSpec = new GCMParameterSpec(RecyclerView.C1119a0.FLAG_IGNORE, bArr, 0, 12);
                } else {
                    algorithmParameterSpec = new IvParameterSpec(bArr, 0, 12);
                }
                ThreadLocal threadLocal = zza;
                ((Cipher) threadLocal.get()).init(2, this.zzb, algorithmParameterSpec);
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
}
