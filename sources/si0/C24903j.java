package si0;

import java.io.IOException;
import java.util.zip.Deflater;
import mf0.C24362h;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p584jl.C17885a;

/* renamed from: si0.j */
public final class C24903j implements C24887a0 {

    /* renamed from: b */
    public boolean f62950b;

    /* renamed from: c */
    public final C24901h f62951c;

    /* renamed from: d */
    public final Deflater f62952d;

    public C24903j(C24917w wVar, Deflater deflater) {
        this.f62951c = wVar;
        this.f62952d = deflater;
    }

    /* renamed from: E */
    public final C24895d0 mo60537E() {
        return this.f62951c.mo60537E();
    }

    /* renamed from: P */
    public final void mo58998P(C24898f fVar, long j) throws IOException {
        C24362h.m61211f(fVar, "source");
        C17885a.m44460s(fVar.f62947c, 0, j);
        while (j > 0) {
            C24920y yVar = fVar.f62946b;
            C24362h.m61208c(yVar);
            int min = (int) Math.min(j, (long) (yVar.f62993c - yVar.f62992b));
            this.f62952d.setInput(yVar.f62991a, yVar.f62992b, min);
            mo61451a(false);
            long j2 = (long) min;
            fVar.f62947c -= j2;
            int i = yVar.f62992b + min;
            yVar.f62992b = i;
            if (i == yVar.f62993c) {
                fVar.f62946b = yVar.mo61475a();
                C24921z.m62598a(yVar);
            }
            j -= j2;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    public final void mo61451a(boolean z) {
        C24920y S;
        int i;
        C24898f buffer = this.f62951c.getBuffer();
        while (true) {
            S = buffer.mo61391S(1);
            if (z) {
                Deflater deflater = this.f62952d;
                byte[] bArr = S.f62991a;
                int i2 = S.f62993c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f62952d;
                byte[] bArr2 = S.f62991a;
                int i3 = S.f62993c;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                S.f62993c += i;
                buffer.f62947c += (long) i;
                this.f62951c.mo61382M();
            } else if (this.f62952d.needsInput()) {
                break;
            }
        }
        if (S.f62992b == S.f62993c) {
            buffer.f62946b = S.mo61475a();
            C24921z.m62598a(S);
        }
    }

    public final void close() throws IOException {
        if (!this.f62950b) {
            Throwable th = null;
            try {
                this.f62952d.finish();
                mo61451a(false);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f62952d.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f62951c.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f62950b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() throws IOException {
        mo61451a(true);
        this.f62951c.flush();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DeflaterSink(");
        k.append(this.f62951c);
        k.append(')');
        return k.toString();
    }
}
