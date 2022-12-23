package p834tz;

import java.io.IOException;
import p810sz.C19600l;
import p810sz.C19616q;
import p977zz.C20944i0;

/* renamed from: tz.c */
public final class C19804c<F, S> implements C19600l<C20944i0<F, S>> {

    /* renamed from: u */
    public final C19600l<? super F> f50333u;

    /* renamed from: v */
    public final C19600l<? super S> f50334v;

    public C19804c(C19600l<? super F> lVar, C19600l<? super S> lVar2) {
        this.f50333u = lVar;
        this.f50334v = lVar2;
    }

    public final void write(Object obj, C19616q qVar) throws IOException {
        C20944i0 i0Var = (C20944i0) obj;
        qVar.mo51967q(i0Var.f52692a, this.f50333u);
        qVar.mo51967q(i0Var.f52693b, this.f50334v);
    }
}
