package p834tz;

import java.io.IOException;
import java.lang.Comparable;
import p810sz.C19584i;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19615p;
import p810sz.C19616q;
import p977zz.C20950l0;

/* renamed from: tz.d */
public final class C19805d<T extends Comparable<T>> implements C19584i<C20950l0<T>> {

    /* renamed from: u */
    public final C19589j<T> f50335u;

    /* renamed from: v */
    public final C19600l<T> f50336v;

    public C19805d(C19584i<T> iVar) {
        this.f50335u = iVar;
        this.f50336v = iVar;
    }

    public final Object read(C19615p pVar) throws IOException {
        return new C20950l0((Comparable) pVar.mo51962q(this.f50335u), (Comparable) pVar.mo51962q(this.f50335u));
    }

    public final void write(Object obj, C19616q qVar) throws IOException {
        C20950l0 l0Var = (C20950l0) obj;
        qVar.mo51967q(l0Var.f52695a, this.f50336v);
        qVar.mo51967q(l0Var.f52696b, this.f50336v);
    }
}
