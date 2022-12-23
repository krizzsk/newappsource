package p677nj;

import com.masabi.justride.sdk.crypto.CryptoException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: nj.g */
public final class C18563g {

    /* renamed from: a */
    public final MessageDigest f47250a;

    /* renamed from: nj.g$a */
    public static class C18564a {
    }

    public C18563g() throws CryptoException {
        try {
            this.f47250a = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new CryptoException("Failed creating SHA-256 instance", e);
        }
    }
}
