package n50;

import android.util.Base64;
import c00.C13720d;
import c00.C13722f;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import p435de.C16596f;
import p875vs.C20228e;
import p977zz.C20964s0;

/* renamed from: n50.a */
public final class C18522a {
    /* renamed from: a */
    public static List<Integer> m45409a(String str) {
        if (C20964s0.m49090h(str)) {
            return Collections.emptyList();
        }
        return C13720d.m34273c(Arrays.asList(str.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR)), (C13722f) null, new C20228e(19));
    }

    /* renamed from: b */
    public static String m45410b(int i) {
        switch (i) {
            case 1:
                return "CREDIT_CARD";
            case 2:
                return "IDEAL";
            case 3:
                return "BANCONTACT";
            case 4:
                return "GIROPAY";
            case 5:
                return "SOFORT";
            case 6:
                return "PAYPAL";
            case 7:
                return "SEPA";
            default:
                throw new IllegalStateException(C16759e.m42349e("Unsupported Buckaroo server payment method type=", i));
        }
    }

    /* renamed from: c */
    public static String m45411c(String str) throws IOException {
        try {
            Cipher instance = Cipher.getInstance("RSA/None/OAEPWithSHA-1AndMGF1Padding");
            instance.init(1, (RSAPublicKey) KeyFactory.getInstance(KeyProvider18.KEY_ALGORITHM_RSA).generatePublic(new RSAPublicKeySpec(new BigInteger(Base64.decode("AODXS2u1iKvsoHE6OLRhbvHnO6kcLWdYyxIyp7V37OeoGlrWmEsXPnq+5Yxttq27+NU+a2mH3c7z6ld2HExQji6XSSCZM076K2PiA0dPZDerhyhrrUo3ZA6WKyhR3lP8dFuz9BlFtknNeAexvy/AtnjEqpAwDLQDcrzgh3ZP9nIWDoGKiLmXyJ02jRMx22G+ovg+bCnrtQ9eRtrhBWPoJLi5rQ6t8T1MyvxvoWhuCrCC+SSm7fpFd/w4m7tzlKYjAzdWKaHKmlEebKBZioiYtTx7YEGdGsnV8b3hyEYbRPuRYC+8N9O4DqmzCeKt31wwGUMygcJTWJ8IAGhVtT0s5Pc=", 0)), new BigInteger(Base64.decode("AQAB", 0)))));
            byte[] doFinal = instance.doFinal(str.getBytes(C20964s0.f52719b));
            return "001" + Base64.encodeToString(doFinal, 0);
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(e);
            throw new IOException("Unable to encrypt data!", e);
        }
    }
}
