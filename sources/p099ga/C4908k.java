package p099ga;

import p277ub.C6791m;
import p277ub.C6807u;
import p277ub.C6808v;

/* renamed from: ga.k */
public final class C4908k implements C6791m {

    /* renamed from: b */
    public final C6807u f16568b;

    /* renamed from: c */
    public final C4909a f16569c;

    /* renamed from: d */
    public C4949x0 f16570d;

    /* renamed from: e */
    public C6791m f16571e;

    /* renamed from: f */
    public boolean f16572f = true;

    /* renamed from: g */
    public boolean f16573g;

    /* renamed from: ga.k$a */
    public interface C4909a {
    }

    public C4908k(C4909a aVar, C6808v vVar) {
        this.f16569c = aVar;
        this.f16568b = new C6807u(vVar);
    }

    /* renamed from: a */
    public final void mo15928a(C4932s0 s0Var) {
        C6791m mVar = this.f16571e;
        if (mVar != null) {
            mVar.mo15928a(s0Var);
            s0Var = this.f16571e.mo15930b();
        }
        this.f16568b.mo15928a(s0Var);
    }

    /* renamed from: b */
    public final C4932s0 mo15930b() {
        C6791m mVar = this.f16571e;
        if (mVar != null) {
            return mVar.mo15930b();
        }
        return this.f16568b.f21061f;
    }

    /* renamed from: n */
    public final long mo15939n() {
        if (this.f16572f) {
            return this.f16568b.mo15939n();
        }
        C6791m mVar = this.f16571e;
        mVar.getClass();
        return mVar.mo15939n();
    }
}
