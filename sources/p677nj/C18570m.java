package p677nj;

import com.masabi.justride.sdk.crypto.CryptoException;
import java.nio.charset.StandardCharsets;
import p583jk.C17876i;
import p677nj.C18563g;
import p918xn.C20542a;

/* renamed from: nj.m */
public final class C18570m {

    /* renamed from: a */
    public final C20542a f47266a;

    /* renamed from: b */
    public final C18563g.C18564a f47267b;

    /* renamed from: c */
    public final C17876i f47268c;

    /* renamed from: d */
    public C18563g f47269d;

    public C18570m(C20542a aVar, C18563g.C18564a aVar2, C17876i iVar) {
        this.f47266a = aVar;
        this.f47267b = aVar2;
        this.f47268c = iVar;
    }

    /* renamed from: a */
    public final String mo50969a(String str) throws CryptoException {
        byte[] digest;
        byte[] bytes = C25541a.m63881k(str, this.f47266a.mo52741a()).getBytes(StandardCharsets.UTF_8);
        if (this.f47269d == null) {
            this.f47267b.getClass();
            this.f47269d = new C18563g();
        }
        C18563g gVar = this.f47269d;
        synchronized (gVar.f47250a) {
            digest = gVar.f47250a.digest(bytes);
        }
        this.f47268c.getClass();
        StringBuilder sb = new StringBuilder(digest.length * 2);
        for (byte b : digest) {
            sb.append(Integer.toHexString((b & 255) + 256).substring(1));
        }
        return sb.toString();
    }
}
