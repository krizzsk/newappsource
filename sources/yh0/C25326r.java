package yh0;

import bf0.C21050d;
import bi0.C21079q;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p389bl.C13637c;
import p584jl.C17885a;
import wh0.C25154a0;
import wh0.C25189k;
import wh0.C25192l;

/* renamed from: yh0.r */
public class C25326r<E> extends C25324p {

    /* renamed from: e */
    public final E f63628e;

    /* renamed from: f */
    public final C25189k<C21050d> f63629f;

    public C25326r(Object obj, C25192l lVar) {
        this.f63628e = obj;
        this.f63629f = lVar;
    }

    /* renamed from: q */
    public final void mo60354q() {
        this.f63629f.mo61820d();
    }

    /* renamed from: r */
    public final E mo60355r() {
        return this.f63628e;
    }

    /* renamed from: s */
    public final void mo60356s(C25315g<?> gVar) {
        C25189k<C21050d> kVar = this.f63629f;
        Throwable th = gVar.f63625e;
        if (th == null) {
            th = new ClosedSendChannelException();
        }
        kVar.resumeWith(C17885a.m44400G(th));
    }

    /* renamed from: t */
    public final C21079q mo60357t() {
        if (this.f63629f.mo61819b(C21050d.f52856a, (Object) null) == null) {
            return null;
        }
        return C13637c.f33642i;
    }

    public final String toString() {
        return getClass().getSimpleName() + '@' + C25154a0.m63137b(this) + '(' + this.f63628e + ')';
    }
}
