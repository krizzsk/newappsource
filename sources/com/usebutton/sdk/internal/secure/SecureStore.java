package com.usebutton.sdk.internal.secure;

import android.content.Context;
import com.usebutton.sdk.internal.util.ButtonLog;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import p001a0.C0017h;

public class SecureStore {
    private static final String TAG = "SecureStore";
    private final SecureCrypto secureCrypto = new SecureCrypto();
    private final SecureKeyStore secureKeyStore;
    private final SecureSharedPrefs secureSharedPrefs;

    public SecureStore(Context context) {
        this.secureKeyStore = new SecureKeyStore(context);
        this.secureSharedPrefs = new SecureSharedPrefs(context);
    }

    private SecretKey getSecretKey(String str) {
        if (this.secureKeyStore.hasKey(str)) {
            return this.secureKeyStore.getKey(str);
        }
        return this.secureKeyStore.generateKey(str);
    }

    public void clear() {
        this.secureKeyStore.deleteAllKeys();
        this.secureSharedPrefs.clear();
    }

    public boolean has(String str) {
        return this.secureSharedPrefs.hasString(str);
    }

    public String retrieve(String str) {
        if (!this.secureSharedPrefs.hasString(str)) {
            String str2 = TAG;
            ButtonLog.warn(str2, "No value found for key: \"" + str + "\"");
            return null;
        }
        String string = this.secureSharedPrefs.getString(str);
        try {
            return this.secureCrypto.decrypt(getSecretKey(str), string);
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            String str3 = TAG;
            StringBuilder k = C13555b.m33972k("Unable to decrypt data because of exception: ");
            k.append(e.getMessage());
            ButtonLog.warn(str3, k.toString());
            this.secureSharedPrefs.deleteString(str);
            return null;
        }
    }

    public void save(String str, String str2) {
        if (str.isEmpty() || str2.isEmpty()) {
            ButtonLog.warn(TAG, C0017h.m56M("Can not save empty key or data... Key:\"", str, "\" Data: \"", str2, "\""));
            return;
        }
        this.secureSharedPrefs.saveString(str, this.secureCrypto.encrypt(getSecretKey(str), str2));
    }
}
