package p834tz;

import ce0.C21100e;
import java.io.IOException;
import p810sz.C19589j;
import p810sz.C19615p;
import p977zz.C20944i0;

/* renamed from: tz.b */
public final class C19803b<F, S> implements C19589j<C20944i0<F, S>> {

    /* renamed from: u */
    public final C19589j<? extends F> f50331u;

    /* renamed from: v */
    public final C19589j<? extends S> f50332v;

    public C19803b(C19589j<F> jVar, C19589j<S> jVar2) {
        C21100e.m49373x(jVar, "firstReader");
        this.f50331u = jVar;
        C21100e.m49373x(jVar2, "secondReader");
        this.f50332v = jVar2;
    }

    public final Object read(C19615p pVar) throws IOException {
        return new C20944i0(pVar.mo51962q(this.f50331u), pVar.mo51962q(this.f50332v));
    }
}
