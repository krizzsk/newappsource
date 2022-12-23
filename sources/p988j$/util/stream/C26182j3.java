package p988j$.util.stream;

import p988j$.util.C25861I;
import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.j3 */
final class C26182j3 extends C26120W2 implements C25861I {
    C26182j3(C26239v0 v0Var, Spliterator spliterator, boolean z) {
        super(v0Var, spliterator, z);
    }

    C26182j3(C26239v0 v0Var, C26133a aVar, boolean z) {
        super(v0Var, aVar, z);
    }

    /* renamed from: a */
    public final void forEachRemaining(C25966e0 e0Var) {
        if (this.f64865h != null || this.f64866i) {
            do {
            } while (tryAdvance(e0Var));
            return;
        }
        e0Var.getClass();
        mo84453f();
        this.f64859b.mo84464g1(this.f64861d, new C26177i3(e0Var, 1));
        this.f64866i = true;
    }

    /* renamed from: c */
    public final boolean tryAdvance(C25966e0 e0Var) {
        e0Var.getClass();
        boolean d = mo84452d();
        if (d) {
            C26089O2 o2 = (C26089O2) this.f64865h;
            long j = this.f64864g;
            int s = o2.mo84361s(j);
            e0Var.accept((o2.f64906c == 0 && s == 0) ? ((long[]) o2.f64804e)[(int) j] : ((long[][]) o2.f64805f)[s][(int) (j - o2.f64907d[s])]);
        }
        return d;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64891f(this, consumer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo84143g() {
        C26089O2 o2 = new C26089O2();
        this.f64865h = o2;
        this.f64862e = this.f64859b.mo84465h1(new C26177i3(o2, 0));
        this.f64863f = new C26133a(6, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C26120W2 mo84144i(Spliterator spliterator) {
        return new C26182j3(this.f64859b, spliterator, this.f64858a);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64894j(this, consumer);
    }

    public final C25861I trySplit() {
        return (C25861I) super.trySplit();
    }
}
