package p677nj;

import androidx.recyclerview.widget.RecyclerView;
import com.masabi.justride.sdk.crypto.CryptoException;
import com.masabi.justride.sdk.crypto.EncryptionMode;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: nj.a */
public final class C18554a {

    /* renamed from: a */
    public final Cipher f47237a;

    /* renamed from: b */
    public final SecretKey f47238b;

    /* renamed from: nj.a$a */
    public static class C18555a {
    }

    public C18554a(SecretKey secretKey) throws CryptoException {
        String str;
        this.f47238b = secretKey;
        if (C18565h.f47251a == EncryptionMode.CBC) {
            str = "AES/CBC/PKCS7PADDING";
        } else {
            str = "AES/GCM/NoPadding";
        }
        try {
            this.f47237a = Cipher.getInstance(str);
        } catch (Exception e) {
            throw new CryptoException("Failed setting up Cipher instances for encryption and decryption", e);
        }
    }

    /* renamed from: a */
    public final byte[] mo50959a(byte[] bArr, byte[] bArr2) throws CryptoException {
        AlgorithmParameterSpec algorithmParameterSpec;
        byte[] doFinal;
        try {
            if (C18565h.f47251a == EncryptionMode.CBC) {
                algorithmParameterSpec = new IvParameterSpec(bArr2);
            } else {
                algorithmParameterSpec = new GCMParameterSpec(RecyclerView.C1119a0.FLAG_IGNORE, bArr2);
            }
            synchronized (this.f47237a) {
                this.f47237a.init(2, this.f47238b, algorithmParameterSpec);
                doFinal = this.f47237a.doFinal(bArr);
            }
            return doFinal;
        } catch (Exception e) {
            throw new CryptoException("Failed decryption", e);
        }
    }
}
