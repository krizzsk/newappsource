package si0;

import java.io.IOException;
import mf0.C24362h;

/* renamed from: si0.l */
public abstract class C24905l implements C24893c0 {

    /* renamed from: b */
    public final C24893c0 f62954b;

    public C24905l(C24893c0 c0Var) {
        C24362h.m61211f(c0Var, "delegate");
        this.f62954b = c0Var;
    }

    /* renamed from: E */
    public final C24895d0 mo58974E() {
        return this.f62954b.mo58974E();
    }

    public void close() throws IOException {
        this.f62954b.close();
    }

    /* renamed from: m */
    public long mo53601m(C24898f fVar, long j) throws IOException {
        C24362h.m61211f(fVar, "sink");
        return this.f62954b.mo53601m(fVar, j);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f62954b + ')';
    }
}
