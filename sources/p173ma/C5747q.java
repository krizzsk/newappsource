package p173ma;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import p042cb.C1843a;
import p277ub.C6803r;

/* renamed from: ma.q */
public final class C5747q {

    /* renamed from: a */
    public final C6803r f18619a = new C6803r(10);

    /* renamed from: a */
    public final Metadata mo21601a(C5732e eVar, C1843a.C1844a aVar) throws IOException {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                eVar.mo21583j(0, 10, this.f18619a.f21038a, false);
                this.f18619a.mo23007z(0);
                if (this.f18619a.mo22999r() != 4801587) {
                    break;
                }
                this.f18619a.mo22981A(3);
                int o = this.f18619a.mo22996o();
                int i2 = o + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f18619a.f21038a, 0, bArr, 0, 10);
                    eVar.mo21583j(10, o, bArr, false);
                    metadata = new C1843a(aVar).mo6662p(i2, bArr);
                } else {
                    eVar.mo21584k(o, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        eVar.f18593f = 0;
        eVar.mo21584k(i, false);
        return metadata;
    }
}
