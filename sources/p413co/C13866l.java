package p413co;

import com.masabi.justride.sdk.crypto.CryptoException;
import com.masabi.justride.sdk.platform.storage.FileStorageException;
import java.io.File;
import p677nj.C18570m;

/* renamed from: co.l */
public final class C13866l {

    /* renamed from: a */
    public final C13873s f34116a;

    /* renamed from: b */
    public final C18570m f34117b;

    /* renamed from: c */
    public final String f34118c;

    public C13866l(C13873s sVar, C18570m mVar, String str) {
        this.f34116a = sVar;
        this.f34117b = mVar;
        this.f34118c = str;
    }

    /* renamed from: a */
    public final String mo40816a(String str, String str2) throws FileStorageException {
        try {
            try {
                return new File(new File(this.f34118c, this.f34117b.mo50969a(str)), this.f34117b.mo50969a(str2)).getPath();
            } catch (CryptoException e) {
                throw new FileStorageException(String.format("Obfuscation failed for file %s", new Object[]{str2}), e);
            }
        } catch (CryptoException e2) {
            throw new FileStorageException(String.format("Obfuscation failed for folder %s", new Object[]{str}), e2);
        }
    }
}
