package p677nj;

import android.annotation.TargetApi;
import android.security.keystore.KeyProtection$Builder;
import com.google.android.gms.stats.CodePackage;
import com.masabi.justride.sdk.crypto.EncryptionMode;
import java.security.KeyStore;
import java.security.KeyStoreException;
import javax.crypto.SecretKey;
import p868vl.C20157d;

/* renamed from: nj.j */
public final class C18567j {

    /* renamed from: a */
    public final KeyStore f47253a;

    /* renamed from: b */
    public final C20157d f47254b;

    public C18567j(KeyStore keyStore, C20157d dVar) {
        this.f47253a = keyStore;
        this.f47254b = dVar;
    }

    @TargetApi(23)
    /* renamed from: a */
    public final void mo50962a(SecretKey secretKey, String str) throws KeyStoreException {
        String str2;
        String str3;
        String a = this.f47254b.mo52405a(str);
        KeyStore.SecretKeyEntry secretKeyEntry = new KeyStore.SecretKeyEntry(secretKey);
        if (C18565h.f47251a == EncryptionMode.CBC) {
            str2 = "CBC";
            str3 = "PKCS7Padding";
        } else {
            str2 = CodePackage.GCM;
            str3 = "NoPadding";
        }
        this.f47253a.setEntry(a, secretKeyEntry, new KeyProtection$Builder(3).setBlockModes(str2).setEncryptionPaddings(str3).setRandomizedEncryptionRequired(false).setUserAuthenticationRequired(false).build());
    }
}
