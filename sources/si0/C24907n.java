package si0;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import mf0.C24362h;
import p001a0.C0016g;

/* renamed from: si0.n */
public final class C24907n implements C24887a0 {

    /* renamed from: b */
    public final C24917w f62956b;

    /* renamed from: c */
    public final Deflater f62957c;

    /* renamed from: d */
    public final C24903j f62958d;

    /* renamed from: e */
    public boolean f62959e;

    /* renamed from: f */
    public final CRC32 f62960f = new CRC32();

    public C24907n(C24898f fVar) {
        C24917w wVar = new C24917w(fVar);
        this.f62956b = wVar;
        Deflater deflater = new Deflater(-1, true);
        this.f62957c = deflater;
        this.f62958d = new C24903j(wVar, deflater);
        C24898f fVar2 = wVar.f62984b;
        fVar2.mo61401Z(8075);
        fVar2.mo61395V(8);
        fVar2.mo61395V(0);
        fVar2.mo61400Y(0);
        fVar2.mo61395V(0);
        fVar2.mo61395V(0);
    }

    /* renamed from: E */
    public final C24895d0 mo60537E() {
        return this.f62956b.mo60537E();
    }

    /* renamed from: P */
    public final void mo58998P(C24898f fVar, long j) throws IOException {
        boolean z;
        C24362h.m61211f(fVar, "source");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j).toString());
        } else if (i != 0) {
            C24920y yVar = fVar.f62946b;
            C24362h.m61208c(yVar);
            long j2 = j;
            while (j2 > 0) {
                int min = (int) Math.min(j2, (long) (yVar.f62993c - yVar.f62992b));
                this.f62960f.update(yVar.f62991a, yVar.f62992b, min);
                j2 -= (long) min;
                yVar = yVar.f62996f;
                C24362h.m61208c(yVar);
            }
            this.f62958d.mo58998P(fVar, j);
        }
    }

    public final void close() throws IOException {
        if (!this.f62959e) {
            Throwable th = null;
            try {
                C24903j jVar = this.f62958d;
                jVar.f62952d.finish();
                jVar.mo61451a(false);
                this.f62956b.mo61459f((int) this.f62960f.getValue());
                this.f62956b.mo61459f((int) this.f62957c.getBytesRead());
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f62957c.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f62956b.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f62959e = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() throws IOException {
        this.f62958d.flush();
    }
}
