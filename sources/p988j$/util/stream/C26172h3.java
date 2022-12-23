package p988j$.util.stream;

import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.h3 */
final class C26172h3 extends C26120W2 implements Spliterator.OfInt {
    C26172h3(C26239v0 v0Var, Spliterator spliterator, boolean z) {
        super(v0Var, spliterator, z);
    }

    C26172h3(C26239v0 v0Var, C26133a aVar, boolean z) {
        super(v0Var, aVar, z);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64890e(this, consumer);
    }

    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f64865h != null || this.f64866i) {
            do {
            } while (tryAdvance(intConsumer));
            return;
        }
        intConsumer.getClass();
        mo84453f();
        this.f64859b.mo84464g1(this.f64861d, new C26167g3(intConsumer, 1));
        this.f64866i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo84143g() {
        C26081M2 m2 = new C26081M2();
        this.f64865h = m2;
        this.f64862e = this.f64859b.mo84465h1(new C26167g3(m2, 0));
        this.f64863f = new C26133a(5, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C26120W2 mo84144i(Spliterator spliterator) {
        return new C26172h3(this.f64859b, spliterator, this.f64858a);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64893i(this, consumer);
    }

    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        boolean d = mo84452d();
        if (d) {
            C26081M2 m2 = (C26081M2) this.f64865h;
            long j = this.f64864g;
            int s = m2.mo84361s(j);
            intConsumer.accept((m2.f64906c == 0 && s == 0) ? ((int[]) m2.f64804e)[(int) j] : ((int[][]) m2.f64805f)[s][(int) (j - m2.f64907d[s])]);
        }
        return d;
    }

    public final Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }
}
