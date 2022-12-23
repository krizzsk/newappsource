package p988j$.util.stream;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.W2 */
abstract class C26120W2 implements Spliterator {

    /* renamed from: a */
    final boolean f64858a;

    /* renamed from: b */
    final C26239v0 f64859b;

    /* renamed from: c */
    private Supplier f64860c;

    /* renamed from: d */
    Spliterator f64861d;

    /* renamed from: e */
    C26166g2 f64862e;

    /* renamed from: f */
    C26133a f64863f;

    /* renamed from: g */
    long f64864g;

    /* renamed from: h */
    C26153e f64865h;

    /* renamed from: i */
    boolean f64866i;

    C26120W2(C26239v0 v0Var, Spliterator spliterator, boolean z) {
        this.f64859b = v0Var;
        this.f64860c = null;
        this.f64861d = spliterator;
        this.f64858a = z;
    }

    C26120W2(C26239v0 v0Var, C26133a aVar, boolean z) {
        this.f64859b = v0Var;
        this.f64860c = aVar;
        this.f64861d = null;
        this.f64858a = z;
    }

    /* renamed from: e */
    private boolean m65259e() {
        boolean z;
        while (this.f64865h.count() == 0) {
            if (!this.f64862e.mo84149f()) {
                C26133a aVar = this.f64863f;
                switch (aVar.f64875a) {
                    case 4:
                        C26162f3 f3Var = (C26162f3) aVar.f64876b;
                        z = f3Var.f64861d.tryAdvance(f3Var.f64862e);
                        break;
                    case 5:
                        C26172h3 h3Var = (C26172h3) aVar.f64876b;
                        z = h3Var.f64861d.tryAdvance(h3Var.f64862e);
                        break;
                    case 6:
                        C26182j3 j3Var = (C26182j3) aVar.f64876b;
                        z = j3Var.f64861d.tryAdvance(j3Var.f64862e);
                        break;
                    default:
                        C26026A3 a3 = (C26026A3) aVar.f64876b;
                        z = a3.f64861d.tryAdvance(a3.f64862e);
                        break;
                }
                if (z) {
                    continue;
                }
            }
            if (this.f64866i) {
                return false;
            }
            this.f64862e.end();
            this.f64866i = true;
        }
        return true;
    }

    public final int characteristics() {
        mo84453f();
        int g = C26116V2.m65249g(this.f64859b.mo84463X0()) & C26116V2.f64834f;
        return (g & 64) != 0 ? (g & -16449) | (this.f64861d.characteristics() & 16448) : g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo84452d() {
        C26153e eVar = this.f64865h;
        boolean z = false;
        if (eVar != null) {
            long j = this.f64864g + 1;
            this.f64864g = j;
            if (j < eVar.count()) {
                z = true;
            }
            if (z) {
                return z;
            }
            this.f64864g = 0;
            this.f64865h.clear();
            return m65259e();
        } else if (this.f64866i) {
            return false;
        } else {
            mo84453f();
            mo84143g();
            this.f64864g = 0;
            this.f64862e.mo84147d(this.f64861d.getExactSizeIfKnown());
            return m65259e();
        }
    }

    public final long estimateSize() {
        mo84453f();
        return this.f64861d.estimateSize();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo84453f() {
        if (this.f64861d == null) {
            this.f64861d = (Spliterator) this.f64860c.get();
            this.f64860c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo84143g();

    public final Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final long getExactSizeIfKnown() {
        mo84453f();
        if (C26116V2.SIZED.mo84449d(this.f64859b.mo84463X0())) {
            return this.f64861d.getExactSizeIfKnown();
        }
        return -1;
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract C26120W2 mo84144i(Spliterator spliterator);

    public final String toString() {
        return String.format("%s[%s]", new Object[]{getClass().getName(), this.f64861d});
    }

    public Spliterator trySplit() {
        if (!this.f64858a || this.f64866i) {
            return null;
        }
        mo84453f();
        Spliterator trySplit = this.f64861d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return mo84144i(trySplit);
    }
}
