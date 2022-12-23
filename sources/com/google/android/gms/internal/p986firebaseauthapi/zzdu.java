package com.google.android.gms.internal.p986firebaseauthapi;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdu */
public final class zzdu implements zzap {
    private static final ThreadLocal zza = new zzdt();
    private final SecretKey zzb;

    public zzdu(byte[] bArr) throws GeneralSecurityException {
        zzpu.zzb(bArr.length);
        this.zzb = new SecretKeySpec(bArr, KeyProvider18.KEY_ALGORITHM_AES);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (bArr.length >= 28) {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(RecyclerView.C1119a0.FLAG_IGNORE, bArr, 0, 12);
            } catch (ClassNotFoundException unused) {
                if (zzpt.zza()) {
                    algorithmParameterSpec = new IvParameterSpec(bArr, 0, 12);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal threadLocal = zza;
            ((Cipher) threadLocal.get()).init(2, this.zzb, algorithmParameterSpec);
            return ((Cipher) threadLocal.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
