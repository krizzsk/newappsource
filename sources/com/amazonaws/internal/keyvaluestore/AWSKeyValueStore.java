package com.amazonaws.internal.keyvaluestore;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import p001a0.C0016g;
import p358af.C13437d;

public class AWSKeyValueStore {
    private static final int AWS_KEY_VALUE_STORE_VERSION = 1;
    private static final String CHARSET_NAME = "UTF-8";
    private static final String CIPHER_AES_GCM_NOPADDING = "AES/GCM/NoPadding";
    private static final int CIPHER_AES_GCM_NOPADDING_IV_LENGTH_IN_BYTES = 12;
    private static final int CIPHER_AES_GCM_NOPADDING_TAG_LENGTH_LENGTH_IN_BITS = 128;
    public static final String SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX = ".encrypted";
    public static final String SHARED_PREFERENCES_ENCRYPTION_KEY_NAMESPACE_SUFFIX = ".encryptionkey";
    public static final String SHARED_PREFERENCES_IV_SUFFIX = ".iv";
    public static final String SHARED_PREFERENCES_STORE_VERSION_SUFFIX = ".keyvaluestoreversion";
    public static Map<String, HashMap<String, String>> cacheFactory = new HashMap();
    private static final Log logger = LogFactory.getLog((Class<?>) AWSKeyValueStore.class);
    private Map<String, String> cache;
    public Context context;
    private boolean isPersistenceEnabled;
    public KeyProvider keyProvider;
    private SecureRandom secureRandom = new SecureRandom();
    public SharedPreferences sharedPreferencesForData;
    public SharedPreferences sharedPreferencesForEncryptionMaterials;
    private final String sharedPreferencesName;

    public AWSKeyValueStore(Context context2, String str, boolean z) {
        this.cache = getCacheForKey(str);
        this.sharedPreferencesName = str;
        this.context = context2;
        setPersistenceEnabled(z);
    }

    private String decrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) {
        try {
            byte[] decode = Base64.decode(str);
            Cipher instance = Cipher.getInstance(CIPHER_AES_GCM_NOPADDING);
            instance.init(2, key, algorithmParameterSpec);
            return new String(instance.doFinal(decode), CHARSET_NAME);
        } catch (Exception e) {
            logger.error("Error in decrypting data. ", e);
            return null;
        }
    }

    private String encrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) {
        try {
            Cipher instance = Cipher.getInstance(CIPHER_AES_GCM_NOPADDING);
            instance.init(1, key, algorithmParameterSpec);
            return Base64.encodeAsString(instance.doFinal(str.getBytes(CHARSET_NAME)));
        } catch (Exception e) {
            logger.error("Error in encrypting data. ", e);
            return null;
        }
    }

    private byte[] generateInitializationVector() {
        byte[] bArr = new byte[12];
        this.secureRandom.nextBytes(bArr);
        return bArr;
    }

    private AlgorithmParameterSpec getAlgorithmParameterSpecForIV(byte[] bArr) {
        if (Build.VERSION.SDK_INT >= 23) {
            return new GCMParameterSpec(128, bArr);
        }
        return new IvParameterSpec(bArr);
    }

    private static Map<String, String> getCacheForKey(String str) {
        if (cacheFactory.containsKey(str)) {
            return cacheFactory.get(str);
        }
        HashMap hashMap = new HashMap();
        cacheFactory.put(str, hashMap);
        return hashMap;
    }

    private String getDataKeyUsedInPersistentStore(String str) {
        if (str == null) {
            return null;
        }
        return C25541a.m63881k(str, SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX);
    }

    private String getEncryptionKeyAlias() {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0016g.m31o(new StringBuilder(), this.sharedPreferencesName, KeyProvider23.AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_AES_SUFFIX);
        }
        return C0016g.m31o(new StringBuilder(), this.sharedPreferencesName, KeyProvider18.AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_RSA_SUFFIX);
    }

    private AlgorithmParameterSpec getInitializationVector(String str) throws Exception {
        String k = C25541a.m63881k(str, SHARED_PREFERENCES_IV_SUFFIX);
        if (this.sharedPreferencesForData.contains(k)) {
            String string = this.sharedPreferencesForData.getString(k, (String) null);
            if (string != null) {
                byte[] decode = Base64.decode(string);
                if (decode != null && decode.length != 0) {
                    return getAlgorithmParameterSpecForIV(decode);
                }
                throw new Exception(C13437d.m33706k("Cannot base64 decode the initialization vector for ", str, " read from SharedPreferences."));
            }
            throw new Exception(C13437d.m33706k("Cannot read the initialization vector for ", str, " from SharedPreferences."));
        }
        throw new Exception(C13437d.m33706k("Initialization vector for ", str, " is missing from the SharedPreferences."));
    }

    private void initKeyProviderBasedOnAPILevel() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.keyProvider = new KeyProvider23();
        } else {
            this.keyProvider = new KeyProvider18(this.context, this.sharedPreferencesForEncryptionMaterials);
        }
    }

    private void onMigrateFromNoEncryption() {
        Map<String, ?> all = this.sharedPreferencesForData.getAll();
        for (String next : all.keySet()) {
            if (!next.endsWith(SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX) && !next.endsWith(SHARED_PREFERENCES_IV_SUFFIX) && !next.endsWith(SHARED_PREFERENCES_STORE_VERSION_SUFFIX)) {
                if (all.get(next) instanceof Long) {
                    put(next, String.valueOf(Long.valueOf(this.sharedPreferencesForData.getLong(next, 0))));
                } else if (all.get(next) instanceof String) {
                    put(next, this.sharedPreferencesForData.getString(next, (String) null));
                } else if (all.get(next) instanceof Float) {
                    put(next, String.valueOf(Float.valueOf(this.sharedPreferencesForData.getFloat(next, BitmapDescriptorFactory.HUE_RED))));
                } else if (all.get(next) instanceof Boolean) {
                    put(next, String.valueOf(Boolean.valueOf(this.sharedPreferencesForData.getBoolean(next, false))));
                } else if (all.get(next) instanceof Integer) {
                    put(next, String.valueOf(Integer.valueOf(this.sharedPreferencesForData.getInt(next, 0))));
                } else if (all.get(next) instanceof Set) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((Set) all.get(next)).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        if (it.hasNext()) {
                            sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                        }
                    }
                    put(next, sb.toString());
                }
                this.sharedPreferencesForData.edit().remove(next).apply();
            }
        }
    }

    private synchronized Key retrieveEncryptionKey(String str) {
        try {
        } catch (KeyNotFoundException e) {
            Log log = logger;
            log.error(e);
            log.info("Deleting the encryption key identified by the keyAlias: " + str);
            this.keyProvider.deleteKey(str);
            return null;
        }
        return this.keyProvider.retrieveKey(str);
    }

    public synchronized void clear() {
        this.cache.clear();
        if (this.isPersistenceEnabled) {
            this.sharedPreferencesForData.edit().clear().apply();
        }
    }

    public synchronized boolean contains(String str) {
        if (!this.isPersistenceEnabled) {
            return this.cache.containsKey(str);
        } else if (this.cache.containsKey(str)) {
            return true;
        } else {
            return this.sharedPreferencesForData.contains(getDataKeyUsedInPersistentStore(str));
        }
    }

    public synchronized Key generateEncryptionKey(String str) {
        try {
        } catch (KeyNotGeneratedException e) {
            logger.error("Encryption Key cannot be generated successfully.", e);
            return null;
        }
        return this.keyProvider.generateKey(str);
    }

    public synchronized String get(String str) {
        if (str == null) {
            return null;
        }
        if (!this.cache.containsKey(str)) {
            if (this.isPersistenceEnabled) {
                String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(str);
                Key retrieveEncryptionKey = retrieveEncryptionKey(getEncryptionKeyAlias());
                if (retrieveEncryptionKey == null) {
                    Log log = logger;
                    log.error("Error in retrieving the decryption key used to decrypt the data from the persistent store. Returning null for the requested dataKey = " + str);
                    return null;
                } else if (!this.sharedPreferencesForData.contains(dataKeyUsedInPersistentStore)) {
                    return null;
                } else {
                    try {
                        SharedPreferences sharedPreferences = this.sharedPreferencesForData;
                        if (Integer.parseInt(sharedPreferences.getString(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, (String) null)) != 1) {
                            Log log2 = logger;
                            log2.error("The version of the data read from SharedPreferences for " + str + " does not match the version of the store.");
                            return null;
                        }
                        String decrypt = decrypt(retrieveEncryptionKey, getInitializationVector(dataKeyUsedInPersistentStore), this.sharedPreferencesForData.getString(dataKeyUsedInPersistentStore, (String) null));
                        this.cache.put(str, decrypt);
                        return decrypt;
                    } catch (Exception e) {
                        Log log3 = logger;
                        log3.error("Error in retrieving value for dataKey = " + str, e);
                        remove(str);
                        return null;
                    }
                }
            }
        }
        return this.cache.get(str);
    }

    public synchronized void put(String str, String str2) {
        if (str == null) {
            logger.error("dataKey is null.");
            return;
        }
        this.cache.put(str, str2);
        if (this.isPersistenceEnabled) {
            if (str2 == null) {
                logger.debug("Value is null. Removing the data, IV and version from SharedPreferences");
                this.cache.remove(str);
                remove(str);
                return;
            }
            String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(str);
            String encryptionKeyAlias = getEncryptionKeyAlias();
            Key retrieveEncryptionKey = retrieveEncryptionKey(encryptionKeyAlias);
            if (retrieveEncryptionKey == null) {
                Log log = logger;
                log.warn("No encryption key found for encryptionKeyAlias: " + encryptionKeyAlias);
                Key generateEncryptionKey = generateEncryptionKey(encryptionKeyAlias);
                if (generateEncryptionKey == null) {
                    log.error("Error in generating the encryption key for encryptionKeyAlias: " + encryptionKeyAlias + " used to encrypt the data before storing. Skipping persisting the data in the persistent store.");
                    return;
                }
                retrieveEncryptionKey = generateEncryptionKey;
            }
            try {
                byte[] generateInitializationVector = generateInitializationVector();
                if (generateInitializationVector != null) {
                    String encrypt = encrypt(retrieveEncryptionKey, getAlgorithmParameterSpecForIV(generateInitializationVector), str2);
                    String encodeAsString = Base64.encodeAsString(generateInitializationVector);
                    if (encodeAsString != null) {
                        SharedPreferences.Editor putString = this.sharedPreferencesForData.edit().putString(dataKeyUsedInPersistentStore, encrypt);
                        SharedPreferences.Editor putString2 = putString.putString(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_IV_SUFFIX, encodeAsString);
                        putString2.putString(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, String.valueOf(1)).apply();
                    } else {
                        throw new Exception("Error in Base64 encoding the IV for dataKey = " + str);
                    }
                } else {
                    throw new Exception("The generated IV for dataKey = " + str + " is null.");
                }
            } catch (Exception e) {
                Log log2 = logger;
                log2.error("Error in storing value for dataKey = " + str + ". This data has not been stored in the persistent store.", e);
            }
        } else {
            return;
        }
        return;
    }

    public synchronized void remove(String str) {
        this.cache.remove(str);
        if (this.isPersistenceEnabled) {
            String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(str);
            SharedPreferences.Editor remove = this.sharedPreferencesForData.edit().remove(dataKeyUsedInPersistentStore);
            SharedPreferences.Editor remove2 = remove.remove(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_IV_SUFFIX);
            remove2.remove(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX).apply();
        }
    }

    public synchronized void setPersistenceEnabled(boolean z) {
        try {
            boolean z2 = this.isPersistenceEnabled;
            this.isPersistenceEnabled = z;
            if (z && !z2) {
                this.sharedPreferencesForData = this.context.getSharedPreferences(this.sharedPreferencesName, 0);
                Context context2 = this.context;
                this.sharedPreferencesForEncryptionMaterials = context2.getSharedPreferences(this.sharedPreferencesName + SHARED_PREFERENCES_ENCRYPTION_KEY_NAMESPACE_SUFFIX, 0);
                initKeyProviderBasedOnAPILevel();
                Log log = logger;
                log.info("Detected Android API Level = " + Build.VERSION.SDK_INT);
                log.info("Creating the AWSKeyValueStore with key for sharedPreferencesForData = " + this.sharedPreferencesName);
                onMigrateFromNoEncryption();
            } else if (!z) {
                logger.info("Persistence is disabled. Data will be accessed from memory.");
            }
            if (!z && z2) {
                this.sharedPreferencesForData.edit().clear().apply();
            }
        } catch (Exception e) {
            Log log2 = logger;
            log2.error("Error in enabling persistence for " + this.sharedPreferencesName, e);
        }
        return;
    }
}
