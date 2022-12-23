package p977zz;

import java.io.IOException;
import p810sz.C19584i;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19615p;
import p810sz.C19616q;

/* renamed from: zz.h0 */
public final class C20942h0 implements C19584i<C20944i0<Object, Object>> {

    /* renamed from: u */
    public final /* synthetic */ C19600l f52688u;

    /* renamed from: v */
    public final /* synthetic */ C19600l f52689v;

    /* renamed from: w */
    public final /* synthetic */ C19589j f52690w;

    /* renamed from: x */
    public final /* synthetic */ C19589j f52691x;

    public C20942h0(C19589j jVar, C19584i iVar, C19600l lVar, C19584i iVar2) {
        this.f52688u = lVar;
        this.f52689v = iVar2;
        this.f52690w = jVar;
        this.f52691x = iVar;
    }

    public final Object read(C19615p pVar) throws IOException {
        return new C20944i0(pVar.mo51962q(this.f52690w), pVar.mo51962q(this.f52691x));
    }

    public final void write(Object obj, C19616q qVar) throws IOException {
        C20944i0 i0Var = (C20944i0) obj;
        qVar.mo51967q(i0Var.f52692a, this.f52688u);
        qVar.mo51967q(i0Var.f52693b, this.f52689v);
    }
}
