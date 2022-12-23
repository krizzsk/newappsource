package p846un;

import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;

/* renamed from: un.d */
public final class C19962d {
    /* renamed from: a */
    public static PublicKey m47453a(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeySpecException {
        return KeyFactory.getInstance(KeyProvider18.KEY_ALGORITHM_RSA).generatePublic(new RSAPublicKeySpec(new BigInteger(bArr), new BigInteger(bArr2)));
    }

    /* renamed from: b */
    public static boolean m47454b(PublicKey publicKey, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature instance = Signature.getInstance("SHA256WithRSA");
        instance.initVerify(publicKey);
        instance.update(bArr);
        return instance.verify(bArr2);
    }
}
