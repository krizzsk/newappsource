package si0;

import java.io.IOException;
import java.io.InputStream;
import mf0.C24362h;
import p001a0.C0016g;

/* renamed from: si0.q */
public final class C24910q implements C24893c0 {

    /* renamed from: b */
    public final InputStream f62970b;

    /* renamed from: c */
    public final C24895d0 f62971c;

    public C24910q(InputStream inputStream, C24895d0 d0Var) {
        C24362h.m61211f(inputStream, "input");
        this.f62970b = inputStream;
        this.f62971c = d0Var;
    }

    /* renamed from: E */
    public final C24895d0 mo58974E() {
        return this.f62971c;
    }

    public final void close() {
        this.f62970b.close();
    }

    /* renamed from: m */
    public final long mo53601m(C24898f fVar, long j) {
        boolean z;
        C24362h.m61211f(fVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.f62971c.mo61372f();
                C24920y S = fVar.mo61391S(1);
                int read = this.f62970b.read(S.f62991a, S.f62993c, (int) Math.min(j, (long) (8192 - S.f62993c)));
                if (read != -1) {
                    S.f62993c += read;
                    long j2 = (long) read;
                    fVar.f62947c += j2;
                    return j2;
                } else if (S.f62992b != S.f62993c) {
                    return -1;
                } else {
                    fVar.f62946b = S.mo61475a();
                    C24921z.m62598a(S);
                    return -1;
                }
            } catch (AssertionError e) {
                if (C24911r.m62548d(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j).toString());
        }
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("source(");
        k.append(this.f62970b);
        k.append(')');
        return k.toString();
    }
}
