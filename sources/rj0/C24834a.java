package rj0;

import java.io.InputStream;
import org.tukaani.p981xz.UnsupportedOptionsException;
import p057d3.C4339c;
import p137ja.C5413d;
import p370ar.C13506a;
import zj0.C25536a;
import zj0.C25537b;
import zj0.C25538c;
import zj0.C25539d;
import zj0.C25540e;

/* renamed from: rj0.a */
public final class C24834a extends C4339c implements C24839f {

    /* renamed from: d */
    public static final /* synthetic */ boolean f62776d = true;

    /* renamed from: e */
    public static /* synthetic */ Class f62777e = class$("org.tukaani.xz.BCJDecoder");

    /* renamed from: b */
    public final long f62778b;

    /* renamed from: c */
    public final int f62779c;

    static {
        if (f62777e == null) {
        }
    }

    public C24834a(long j, byte[] bArr) throws UnsupportedOptionsException {
        if (!f62776d) {
            if (!(j >= 4 && j <= 9)) {
                throw new AssertionError();
            }
        }
        this.f62778b = j;
        if (bArr.length == 0) {
            this.f62779c = 0;
        } else if (bArr.length == 4) {
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                i |= (bArr[i2] & 255) << (i2 * 8);
            }
            this.f62779c = i;
        } else {
            throw new UnsupportedOptionsException("Unsupported BCJ filter properties");
        }
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    /* renamed from: g */
    public final InputStream mo61292g(InputStream inputStream) {
        C25539d dVar;
        long j = this.f62778b;
        if (j == 4) {
            dVar = new C25540e(this.f62779c);
        } else if (j == 5) {
            dVar = new C13506a(this.f62779c);
        } else if (j == 6) {
            dVar = new C5413d(this.f62779c);
        } else if (j == 7) {
            dVar = new C25536a(this.f62779c);
        } else if (j == 8) {
            dVar = new C25537b(this.f62779c);
        } else if (j == 9) {
            dVar = new C25538c(this.f62779c);
        } else if (f62776d) {
            dVar = null;
        } else {
            throw new AssertionError();
        }
        return new C24843j(inputStream, dVar);
    }

    /* renamed from: j */
    public final int mo61293j() {
        boolean z = C24843j.f62798k;
        return 5;
    }
}
