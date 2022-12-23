package si0;

import java.io.OutputStream;
import mf0.C24362h;
import p584jl.C17885a;

/* renamed from: si0.u */
public final class C24915u implements C24887a0 {

    /* renamed from: b */
    public final OutputStream f62976b;

    /* renamed from: c */
    public final C24895d0 f62977c;

    public C24915u(OutputStream outputStream, C24895d0 d0Var) {
        C24362h.m61211f(outputStream, "out");
        this.f62976b = outputStream;
        this.f62977c = d0Var;
    }

    /* renamed from: E */
    public final C24895d0 mo60537E() {
        return this.f62977c;
    }

    /* renamed from: P */
    public final void mo58998P(C24898f fVar, long j) {
        C24362h.m61211f(fVar, "source");
        C17885a.m44460s(fVar.f62947c, 0, j);
        while (j > 0) {
            this.f62977c.mo61372f();
            C24920y yVar = fVar.f62946b;
            C24362h.m61208c(yVar);
            int min = (int) Math.min(j, (long) (yVar.f62993c - yVar.f62992b));
            this.f62976b.write(yVar.f62991a, yVar.f62992b, min);
            int i = yVar.f62992b + min;
            yVar.f62992b = i;
            long j2 = (long) min;
            j -= j2;
            fVar.f62947c -= j2;
            if (i == yVar.f62993c) {
                fVar.f62946b = yVar.mo61475a();
                C24921z.m62598a(yVar);
            }
        }
    }

    public final void close() {
        this.f62976b.close();
    }

    public final void flush() {
        this.f62976b.flush();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("sink(");
        k.append(this.f62976b);
        k.append(')');
        return k.toString();
    }
}
