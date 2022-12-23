package com.usebutton.sdk.internal.secure;

import android.util.Base64;
import com.usebutton.sdk.internal.util.ButtonLog;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

final class SecureCrypto {
    private static final String AES_CBC_PKCS7PADDING = "AES/CBC/PKCS7Padding";
    private static final String IV_SEPARATOR = "]";
    private static final String TAG = "SecureCrypto";
    private static final String UTF_8 = "UTF-8";

    public final String decrypt(SecretKey secretKey, String str) throws BadPaddingException, IllegalBlockSizeException {
        try {
            String[] split = str.split(IV_SEPARATOR);
            String str2 = split[0];
            String str3 = split[1];
            Cipher instance = Cipher.getInstance(AES_CBC_PKCS7PADDING);
            instance.init(2, secretKey, new IvParameterSpec(Base64.decode(str2, 0)));
            return new String(instance.doFinal(Base64.decode(str3, 0)), UTF_8);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            String str4 = TAG;
            StringBuilder k = C13555b.m33972k("Unable to decrypt data due to exception: ");
            k.append(e.getMessage());
            ButtonLog.warn(str4, k.toString());
            return null;
        }
    }

    public final String encrypt(SecretKey secretKey, String str) {
        try {
            Cipher instance = Cipher.getInstance(AES_CBC_PKCS7PADDING);
            instance.init(1, secretKey);
            String encodeToString = Base64.encodeToString(instance.getIV(), 0);
            String encodeToString2 = Base64.encodeToString(instance.doFinal(str.getBytes(UTF_8)), 0);
            return encodeToString + IV_SEPARATOR + encodeToString2;
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            String str2 = TAG;
            StringBuilder k = C13555b.m33972k("Unable to encrypt data due to exception: ");
            k.append(e.getMessage());
            ButtonLog.warn(str2, k.toString());
            return null;
        }
    }
}
