package p323y7;

import android.content.Context;
import android.content.SharedPreferences;
import com.cubic.umo.exception.SecurePreferencesException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: y7.a */
public final class C7343a {

    /* renamed from: a */
    public final Cipher f22561a;

    /* renamed from: b */
    public final Cipher f22562b;

    /* renamed from: c */
    public final Cipher f22563c;

    /* renamed from: d */
    public final SharedPreferences f22564d;

    public C7343a(Context context) throws SecurePreferencesException {
        try {
            this.f22561a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f22562b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f22563c = Cipher.getInstance("AES/CBC/PKCS5Padding");
            mo23561a();
            this.f22564d = context.getSharedPreferences("SDKPrefs", 0);
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            throw new SecurePreferencesException(e);
        }
    }

    /* renamed from: a */
    public final void mo23561a() throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr = new byte[this.f22561a.getBlockSize()];
        System.arraycopy("yldsjfodasjifudelfjdsaofshaufihadsf".getBytes(), 0, bArr, 0, this.f22561a.getBlockSize());
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.reset();
        SecretKeySpec secretKeySpec = new SecretKeySpec(instance.digest("simplestorage".getBytes("UTF-8")), "AES/CBC/PKCS5Padding");
        this.f22561a.init(1, secretKeySpec, ivParameterSpec);
        this.f22562b.init(2, secretKeySpec, ivParameterSpec);
        this.f22563c.init(1, secretKeySpec);
    }
}
