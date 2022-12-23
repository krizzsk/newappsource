package hi0;

import ii0.C23610d;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import si0.C24901h;

/* renamed from: hi0.b0 */
public abstract class C23521b0 {
    /* renamed from: c */
    public static C23574z m57646c(C23562t tVar, byte[] bArr) {
        int length = bArr.length;
        long length2 = (long) bArr.length;
        long j = (long) 0;
        long j2 = (long) length;
        byte[] bArr2 = C23610d.f59684a;
        if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
            return new C23574z(length, tVar, bArr);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: d */
    public static C23574z m57647d(String str, C23562t tVar) {
        Charset charset = StandardCharsets.UTF_8;
        if (tVar != null && (charset = tVar.mo58710a((Charset) null)) == null) {
            charset = StandardCharsets.UTF_8;
            tVar = C23562t.m57743c(tVar + "; charset=utf-8");
        }
        return m57646c(tVar, str.getBytes(charset));
    }

    /* renamed from: a */
    public long mo53612a() throws IOException {
        return -1;
    }

    /* renamed from: b */
    public abstract C23562t mo53613b();

    /* renamed from: e */
    public abstract void mo53614e(C24901h hVar) throws IOException;
}
