package p988j$.util.stream;

import p988j$.util.C25856D;
import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.f3 */
final class C26162f3 extends C26120W2 implements C25856D {
    C26162f3(C26239v0 v0Var, Spliterator spliterator, boolean z) {
        super(v0Var, spliterator, z);
    }

    C26162f3(C26239v0 v0Var, C26133a aVar, boolean z) {
        super(v0Var, aVar, z);
    }

    /* renamed from: b */
    public final void forEachRemaining(C25981m mVar) {
        if (this.f64865h != null || this.f64866i) {
            do {
            } while (tryAdvance(mVar));
            return;
        }
        mVar.getClass();
        mo84453f();
        this.f64859b.mo84464g1(this.f64861d, new C26157e3(mVar, 1));
        this.f64866i = true;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64889d(this, consumer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo84143g() {
        C26073K2 k2 = new C26073K2();
        this.f64865h = k2;
        this.f64862e = this.f64859b.mo84465h1(new C26157e3(k2, 0));
        this.f64863f = new C26133a(4, this);
    }

    /* renamed from: h */
    public final boolean tryAdvance(C25981m mVar) {
        mVar.getClass();
        boolean d = mo84452d();
        if (d) {
            C26073K2 k2 = (C26073K2) this.f64865h;
            long j = this.f64864g;
            int s = k2.mo84361s(j);
            mVar.accept((k2.f64906c == 0 && s == 0) ? ((double[]) k2.f64804e)[(int) j] : ((double[][]) k2.f64805f)[s][(int) (j - k2.f64907d[s])]);
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C26120W2 mo84144i(Spliterator spliterator) {
        return new C26162f3(this.f64859b, spliterator, this.f64858a);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64892g(this, consumer);
    }

    public final C25856D trySplit() {
        return (C25856D) super.trySplit();
    }
}
