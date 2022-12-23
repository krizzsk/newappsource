package p677nj;

import ce0.C21100e;
import com.masabi.justride.sdk.crypto.CryptoException;
import com.masabi.justride.sdk.crypto.EncryptionMode;
import com.masabi.justride.sdk.crypto.KeyStorageAES;
import com.masabi.justride.sdk.platform.storage.FileStorageException;
import javax.crypto.SecretKey;
import mf0.C24362h;
import p413co.C13859g;
import p441dk.C16672a;

/* renamed from: nj.k */
public final class C18568k {

    /* renamed from: a */
    public final KeyStorageAES f47255a;

    /* renamed from: b */
    public final C13859g f47256b;

    public C18568k(KeyStorageAES keyStorageAES, C13859g gVar) {
        this.f47255a = keyStorageAES;
        this.f47256b = gVar;
    }

    /* renamed from: a */
    public final SecretKey mo50963a() throws CryptoException {
        String str;
        EncryptionMode encryptionMode = C18565h.f47251a;
        EncryptionMode encryptionMode2 = EncryptionMode.CBC;
        if (encryptionMode == encryptionMode2) {
            str = C21100e.m49304E(new byte[]{99, 111, 109, 46, 109, 97, 115, 97, 98, 105, 46, 106, 117, 115, 116, 114, 105, 100, 101, 46, 115, 100, 107, 46, 109, 107});
        } else {
            str = C21100e.m49304E(new byte[]{99, 111, 109, 46, 109, 97, 115, 97, 98, 105, 46, 106, 117, 115, 116, 114, 105, 100, 101, 46, 115, 100, 107, 46, 109, 107, 50});
        }
        try {
            SecretKey a = this.f47255a.mo44328a(str);
            if (a == null && encryptionMode == encryptionMode2) {
                try {
                    a = this.f47255a.mo44329b(C21100e.m49304E(new byte[]{99, 111, 109, 46, 109, 97, 115, 97, 98, 105, 46, 106, 117, 115, 116, 114, 105, 100, 101, 46, 115, 100, 107, 46, 69, 110, 99, 114, 121, 112, 116, 101, 100, 70, 105, 108, 101, 83, 116, 111, 114, 97, 103, 101, 77, 97, 115, 116, 101, 114, 75, 101, 121}));
                    if (a != null) {
                        try {
                            this.f47255a.mo44331d(a, str);
                        } catch (CryptoException unused) {
                        }
                    }
                } catch (CryptoException e) {
                    throw new CryptoException(String.format("Failed reading key (%d)", new Object[]{C16672a.f43387I}), e);
                }
            }
            if (a != null) {
                return a;
            }
            String[] strArr = {C21100e.m49326U(), C21100e.m49327V(), C21100e.m49328W(), C21100e.m49331Z(), C21100e.m49332a0(), C21100e.m49333b0(), C21100e.m49334c0(), C21100e.m49347j0()};
            for (int i = 0; i < 8; i++) {
                try {
                    this.f47256b.mo40802a(strArr[i]);
                } catch (FileStorageException unused2) {
                }
            }
            try {
                KeyStorageAES keyStorageAES = this.f47255a;
                keyStorageAES.getClass();
                SecretKey a2 = ((C18558c) keyStorageAES.f37076a.getValue()).mo50961a();
                C24362h.m61210e(a2, "secretKey");
                keyStorageAES.mo44331d(a2, str);
                return a2;
            } catch (CryptoException e2) {
                throw new CryptoException(String.format("Failed creating key (%d)", new Object[]{C16672a.f43390L}), e2);
            }
        } catch (CryptoException e3) {
            throw new CryptoException(String.format("Failed reading key (%d)", new Object[]{C16672a.f43388J}), e3);
        }
    }
}
