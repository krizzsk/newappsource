package p677nj;

import androidx.recyclerview.widget.RecyclerView;
import com.masabi.justride.sdk.crypto.CryptoException;
import com.masabi.justride.sdk.crypto.EncryptionMode;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: nj.b */
public final class C18556b {

    /* renamed from: a */
    public final Cipher f47239a;

    /* renamed from: b */
    public final SecretKey f47240b;

    /* renamed from: nj.b$a */
    public static class C18557a {
    }

    public C18556b(SecretKey secretKey) throws CryptoException {
        String str;
        this.f47240b = secretKey;
        if (C18565h.f47251a == EncryptionMode.CBC) {
            str = "AES/CBC/PKCS7PADDING";
        } else {
            str = "AES/GCM/NoPadding";
        }
        try {
            this.f47239a = Cipher.getInstance(str);
        } catch (GeneralSecurityException e) {
            throw new CryptoException("Failed setting up Cipher instances for encryption and decryption", e);
        }
    }

    /* renamed from: a */
    public final byte[] mo50960a(byte[] bArr, byte[] bArr2) throws CryptoException {
        AlgorithmParameterSpec algorithmParameterSpec;
        byte[] doFinal;
        try {
            if (C18565h.f47251a == EncryptionMode.CBC) {
                algorithmParameterSpec = new IvParameterSpec(bArr2);
            } else {
                algorithmParameterSpec = new GCMParameterSpec(RecyclerView.C1119a0.FLAG_IGNORE, bArr2);
            }
            synchronized (this.f47239a) {
                this.f47239a.init(1, this.f47240b, algorithmParameterSpec);
                doFinal = this.f47239a.doFinal(bArr);
            }
            return doFinal;
        } catch (GeneralSecurityException e) {
            throw new CryptoException("Failed encryption", e);
        }
    }
}
