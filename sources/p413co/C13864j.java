package p413co;

import ce0.C21100e;
import com.masabi.justride.sdk.crypto.CryptoException;
import com.masabi.justride.sdk.platform.storage.FileStorageException;
import java.io.File;
import java.nio.charset.Charset;
import mf0.C24362h;
import p677nj.C18570m;
import p868vl.C20157d;
import uh0.C25072a;

/* renamed from: co.j */
public final class C13864j {

    /* renamed from: a */
    public final int f34105a = 2;

    /* renamed from: b */
    public final String f34106b;

    /* renamed from: c */
    public final C20157d f34107c;

    /* renamed from: d */
    public final C13874t f34108d;

    /* renamed from: e */
    public final C18570m f34109e;

    public C13864j(String str, C20157d dVar, C13874t tVar, C18570m mVar) {
        C24362h.m61211f(str, "pathToJustrideDirectory");
        C24362h.m61211f(dVar, "prependBrandFunction");
        C24362h.m61211f(mVar, "stringObfuscator");
        this.f34106b = str;
        this.f34107c = dVar;
        this.f34108d = tVar;
        this.f34109e = mVar;
    }

    /* renamed from: a */
    public final void mo40813a() throws CryptoException, FileStorageException, SecurityException {
        if (!this.f34108d.mo40822b(this.f34105a)) {
            String str = this.f34106b;
            String a = this.f34107c.mo52405a(C21100e.m49337e0());
            C24362h.m61210e(a, "prependBrandFunction.apply(filename)");
            String a2 = this.f34109e.mo50969a(a);
            C24362h.m61210e(a2, "stringObfuscator.obfuscate(filename)");
            File file = new File(str, a2);
            Charset charset = C25072a.f63272a;
            String a3 = this.f34109e.mo50969a(new String("com.masabi.justride.sdk.EncryptedFileStorageMasterKey".getBytes(), charset));
            C24362h.m61210e(a3, "stringObfuscator.obfuscate(filename)");
            File file2 = new File(file, a3);
            String a4 = this.f34109e.mo50969a(new String("com.masabi.justride.sdk.mk".getBytes(), charset));
            C24362h.m61210e(a4, "stringObfuscator.obfuscate(filename)");
            File file3 = new File(file, a4);
            if (file2.exists() && !file3.exists()) {
                file2.renameTo(file3);
            }
            this.f34108d.mo40823c(this.f34105a);
        }
    }
}
