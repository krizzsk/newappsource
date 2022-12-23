package p413co;

import com.masabi.justride.sdk.crypto.CryptoException;
import com.masabi.justride.sdk.platform.storage.FileStorageException;
import java.io.File;
import java.nio.charset.Charset;
import mf0.C24362h;
import p389bl.C13641g;
import p413co.C13862i;
import p677nj.C18570m;
import p868vl.C20157d;
import uh0.C25072a;

/* renamed from: co.t */
public final class C13874t {

    /* renamed from: a */
    public final String f34123a;

    /* renamed from: b */
    public final C13862i.C13863a f34124b;

    /* renamed from: c */
    public final C20157d f34125c;

    /* renamed from: d */
    public final C18570m f34126d;

    public C13874t(String str, C13862i.C13863a aVar, C20157d dVar, C18570m mVar) {
        C24362h.m61211f(str, "pathToJustrideDirectory");
        C24362h.m61211f(dVar, "prependBrandFunction");
        C24362h.m61211f(mVar, "stringObfuscator");
        this.f34123a = str;
        this.f34124b = aVar;
        this.f34125c = dVar;
        this.f34126d = mVar;
    }

    /* renamed from: a */
    public final C13862i mo40821a() throws CryptoException {
        String a = this.f34126d.mo50969a(this.f34125c.mo52405a(C13641g.m34128q()));
        C24362h.m61210e(a, "stringObfuscator.obfuscate(brandedFilename)");
        return this.f34124b.mo40812a(new File(this.f34123a, a));
    }

    /* renamed from: b */
    public final boolean mo40822b(int i) throws FileStorageException {
        int i2;
        try {
            byte[] b = mo40821a().mo40810b();
            if (b != null) {
                i2 = Integer.parseInt(new String(b, C25072a.f63272a));
            } else {
                i2 = 0;
            }
            if (i2 >= i) {
                return true;
            }
            return false;
        } catch (Exception e) {
            throw new FileStorageException("Could not read the storage version.", e);
        }
    }

    /* renamed from: c */
    public final void mo40823c(int i) throws FileStorageException {
        int i2;
        try {
            byte[] b = mo40821a().mo40810b();
            if (b != null) {
                i2 = Integer.parseInt(new String(b, C25072a.f63272a));
            } else {
                i2 = 0;
            }
            if (i2 < i) {
                C13862i a = mo40821a();
                String valueOf = String.valueOf(i);
                Charset charset = C25072a.f63272a;
                if (valueOf != null) {
                    byte[] bytes = valueOf.getBytes(charset);
                    C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
                    a.mo40811c(bytes);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new FileStorageException("Trying to downgrade storage version from " + i2 + " to " + i + '.');
        } catch (Exception e) {
            throw new FileStorageException("Could not write the storage version.", e);
        }
    }
}
