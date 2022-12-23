package com.facebook.login;

import android.util.Base64;
import com.facebook.FacebookException;
import java.security.MessageDigest;
import kotlin.text.Regex;
import mf0.C24362h;
import uh0.C25072a;

/* renamed from: com.facebook.login.p */
public final class C2488p {
    /* renamed from: a */
    public static final String m6522a(String str, CodeChallengeMethod codeChallengeMethod) throws FacebookException {
        C24362h.m61211f(str, "codeVerifier");
        C24362h.m61211f(codeChallengeMethod, "codeChallengeMethod");
        if (!m6523b(str)) {
            throw new FacebookException("Invalid Code Verifier.");
        } else if (codeChallengeMethod == CodeChallengeMethod.PLAIN) {
            return str;
        } else {
            try {
                byte[] bytes = str.getBytes(C25072a.f63273b);
                C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                instance.update(bytes, 0, bytes.length);
                String encodeToString = Base64.encodeToString(instance.digest(), 11);
                C24362h.m61210e(encodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
                return encodeToString;
            } catch (Exception e) {
                throw new FacebookException((Throwable) e);
            }
        }
    }

    /* renamed from: b */
    public static final boolean m6523b(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").mo60283b(str);
    }
}
