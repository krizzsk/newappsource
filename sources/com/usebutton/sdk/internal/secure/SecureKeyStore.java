package com.usebutton.sdk.internal.secure;

import android.content.Context;
import android.os.Build;
import com.usebutton.sdk.internal.util.ButtonLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Enumeration;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

final class SecureKeyStore {
    private static final String ALGORITHM_AES = "AES";
    private static final String KEYSTORE_NAME = "btn_secure.btn";
    private static final String TAG = "SecureKeyStore";
    private KeyStore cacheKeyStore;
    private final Context context;
    private final File fileKeyStore;

    public SecureKeyStore(Context context2) {
        this.context = context2;
        this.fileKeyStore = new File(context2.getFilesDir(), KEYSTORE_NAME);
    }

    private char[] generateKeyEntryPassword(String str) {
        return generateMD5(new StringBuilder(this.context.getPackageName() + str + Build.MODEL).reverse().toString());
    }

    private char[] generateKeyStorePassword() {
        return generateMD5(new StringBuilder(Build.MANUFACTURER + this.context.getPackageName()).reverse().toString());
    }

    private KeyStore getKeyStore() {
        try {
            if (this.cacheKeyStore == null) {
                this.cacheKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
                if (!this.fileKeyStore.exists()) {
                    this.cacheKeyStore.load((KeyStore.LoadStoreParameter) null);
                } else {
                    FileInputStream fileInputStream = new FileInputStream(this.fileKeyStore);
                    this.cacheKeyStore.load(fileInputStream, generateKeyStorePassword());
                    fileInputStream.close();
                }
            }
            return this.cacheKeyStore;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            String str = TAG;
            StringBuilder k = C13555b.m33972k("Unable to obtain KeyStore: ");
            k.append(e.getMessage());
            ButtonLog.warn(str, k.toString());
            return null;
        }
    }

    private boolean isKeyEntry(String str, KeyStore keyStore) {
        if (keyStore == null) {
            return false;
        }
        try {
            if (keyStore.isKeyEntry(str)) {
                return true;
            }
            return false;
        } catch (KeyStoreException e) {
            String str2 = TAG;
            StringBuilder l = C13555b.m33973l("Unable to check if key is entry, by alias \"", str, "\" because of exception: ");
            l.append(e.getMessage());
            ButtonLog.warn(str2, l.toString());
            return false;
        }
    }

    public final void deleteAllKeys() {
        try {
            KeyStore keyStore = getKeyStore();
            if (keyStore != null) {
                Enumeration<String> aliases = keyStore.aliases();
                while (aliases.hasMoreElements()) {
                    deleteKey(aliases.nextElement());
                }
            }
        } catch (KeyStoreException e) {
            e.printStackTrace();
        }
    }

    public final void deleteKey(String str) {
        try {
            KeyStore keyStore = getKeyStore();
            if (keyStore == null) {
                return;
            }
            if (isKeyEntry(str, keyStore)) {
                keyStore.deleteEntry(str);
                keyStore.store(new FileOutputStream(this.fileKeyStore), generateKeyStorePassword());
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            String str2 = TAG;
            StringBuilder l = C13555b.m33973l("Unable to delete key by alias: \"", str, "\" because of exception: ");
            l.append(e.getMessage());
            ButtonLog.warn(str2, l.toString());
        }
    }

    public final SecretKey generateKey(String str) {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(256);
            SecretKey generateKey = instance.generateKey();
            KeyStore.SecretKeyEntry secretKeyEntry = new KeyStore.SecretKeyEntry(generateKey);
            KeyStore keyStore = getKeyStore();
            if (keyStore == null) {
                return null;
            }
            keyStore.setEntry(str, secretKeyEntry, new KeyStore.PasswordProtection(generateKeyEntryPassword(str)));
            keyStore.store(new FileOutputStream(this.fileKeyStore), generateKeyStorePassword());
            return generateKey;
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            String str2 = TAG;
            StringBuilder k = C13555b.m33972k("Could not generate symmetric key: ");
            k.append(e.getMessage());
            ButtonLog.warn(str2, k.toString());
            return null;
        }
    }

    public final char[] generateMD5(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("md5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(digest[i])}));
            }
            return sb.toString().toLowerCase().toCharArray();
        } catch (NoSuchAlgorithmException e) {
            String str2 = TAG;
            StringBuilder k = C13555b.m33972k("Unable to generate password because of exception: ");
            k.append(e.getMessage());
            ButtonLog.warn(str2, k.toString());
            return null;
        }
    }

    public final SecretKey getKey(String str) {
        Key key;
        try {
            KeyStore keyStore = getKeyStore();
            if (keyStore != null) {
                key = keyStore.getKey(str, generateKeyEntryPassword(str));
            } else {
                key = null;
            }
            return (SecretKey) key;
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException e) {
            String str2 = TAG;
            StringBuilder l = C13555b.m33973l("Could not get key ", str, " from the KeyStore: ");
            l.append(e.getMessage());
            ButtonLog.warn(str2, l.toString());
            return null;
        }
    }

    public final boolean hasKey(String str) {
        return isKeyEntry(str, getKeyStore());
    }
}
