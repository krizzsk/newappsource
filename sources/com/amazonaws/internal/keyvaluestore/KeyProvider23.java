package com.amazonaws.internal.keyvaluestore;

import android.security.keystore.KeyGenParameterSpec$Builder;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.google.android.gms.stats.CodePackage;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

class KeyProvider23 implements KeyProvider {
    private static final String AES_KEY_ALGORITHM = "AES";
    private static final String ANDROID_KEY_STORE_NAME = "AndroidKeyStore";
    public static final String AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_AES_SUFFIX = ".aesKeyStoreAlias";
    private static final int CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS = 256;
    private static final Log logger = LogFactory.getLog((Class<?>) KeyProvider23.class);

    public synchronized void deleteKey(String str) {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            instance.deleteEntry(str);
        } catch (Exception e) {
            Log log = logger;
            log.error("Error in deleting the key for keyAlias: " + str + " from Android KeyStore.", e);
        }
        return;
    }

    public synchronized Key generateKey(String str) throws KeyNotGeneratedException {
        SecretKey generateKey;
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            if (!instance.containsAlias(str)) {
                KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                instance2.init(new KeyGenParameterSpec$Builder(str, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).setRandomizedEncryptionRequired(false).build());
                generateKey = instance2.generateKey();
                Log log = logger;
                log.info("Generated the encryption key identified by the keyAlias: " + str + " using " + "AndroidKeyStore");
            } else {
                throw new KeyNotGeneratedException("Key already exists for the keyAlias: " + str + " in " + "AndroidKeyStore");
            }
        } catch (Exception e) {
            throw new KeyNotGeneratedException("Cannot generate a key for alias: " + str + " in " + "AndroidKeyStore", e);
        }
        return generateKey;
    }

    public synchronized Key retrieveKey(String str) throws KeyNotFoundException {
        Key key;
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            if (instance.containsAlias(str)) {
                Log log = logger;
                log.debug("AndroidKeyStore contains keyAlias " + str);
                log.debug("Loading the encryption key from Android KeyStore.");
                key = instance.getKey(str, (char[]) null);
                if (key == null) {
                    throw new KeyNotFoundException("Key is null even though the keyAlias: " + str + " is present in " + "AndroidKeyStore");
                }
            } else {
                throw new KeyNotFoundException("AndroidKeyStore does not contain the keyAlias: " + str);
            }
        } catch (Exception e) {
            throw new KeyNotFoundException("Error occurred while accessing AndroidKeyStore to retrieve the key for keyAlias: " + str, e);
        }
        return key;
    }
}
