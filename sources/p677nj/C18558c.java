package p677nj;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import com.masabi.justride.sdk.crypto.CryptoException;
import com.masabi.justride.sdk.crypto.EncryptionMode;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* renamed from: nj.c */
public final class C18558c {

    /* renamed from: a */
    public final KeyGenerator f47241a;

    /* renamed from: b */
    public final int f47242b;

    /* renamed from: nj.c$a */
    public static class C18559a {
        /* renamed from: a */
        public static C18558c m45474a() throws CryptoException {
            if (C18565h.f47251a == EncryptionMode.CBC) {
                return new C18558c(RecyclerView.C1119a0.FLAG_IGNORE);
            }
            return new C18558c(96);
        }
    }

    public C18558c(int i) throws CryptoException {
        this.f47242b = i;
        try {
            KeyGenerator instance = KeyGenerator.getInstance(KeyProvider18.KEY_ALGORITHM_AES);
            this.f47241a = instance;
            instance.init(i);
        } catch (NoSuchAlgorithmException e) {
            throw new CryptoException("Failed instantiating AES key generator", e);
        }
    }

    /* renamed from: a */
    public final SecretKey mo50961a() {
        return this.f47241a.generateKey();
    }
}
