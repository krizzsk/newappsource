package si0;

import java.io.IOException;
import mf0.C24362h;

/* renamed from: si0.k */
public abstract class C24904k implements C24887a0 {

    /* renamed from: b */
    public final C24887a0 f62953b;

    public C24904k(C24887a0 a0Var) {
        C24362h.m61211f(a0Var, "delegate");
        this.f62953b = a0Var;
    }

    /* renamed from: E */
    public final C24895d0 mo60537E() {
        return this.f62953b.mo60537E();
    }

    /* renamed from: P */
    public void mo58998P(C24898f fVar, long j) throws IOException {
        C24362h.m61211f(fVar, "source");
        this.f62953b.mo58998P(fVar, j);
    }

    public void close() throws IOException {
        this.f62953b.close();
    }

    public void flush() throws IOException {
        this.f62953b.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f62953b + ')';
    }
}
