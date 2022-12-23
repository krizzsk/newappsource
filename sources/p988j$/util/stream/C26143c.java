package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.c */
abstract class C26143c extends C26239v0 implements C26173i {

    /* renamed from: h */
    private final C26143c f64884h;

    /* renamed from: i */
    private final C26143c f64885i;

    /* renamed from: j */
    protected final int f64886j;

    /* renamed from: k */
    private C26143c f64887k;

    /* renamed from: l */
    private int f64888l;

    /* renamed from: m */
    private int f64889m;

    /* renamed from: n */
    private Spliterator f64890n;

    /* renamed from: o */
    private boolean f64891o;

    /* renamed from: p */
    private boolean f64892p;

    /* renamed from: q */
    private Runnable f64893q;

    /* renamed from: r */
    private boolean f64894r;

    static {
        Class<C26143c> cls = C26143c.class;
    }

    C26143c(Spliterator spliterator, int i, boolean z) {
        this.f64885i = null;
        this.f64890n = spliterator;
        this.f64884h = this;
        int i2 = C26116V2.f64835g & i;
        this.f64886j = i2;
        this.f64889m = (~(i2 << 1)) & C26116V2.f64840l;
        this.f64888l = 0;
        this.f64894r = z;
    }

    C26143c(C26143c cVar, int i) {
        if (!cVar.f64891o) {
            cVar.f64891o = true;
            cVar.f64887k = this;
            this.f64885i = cVar;
            this.f64886j = C26116V2.f64836h & i;
            this.f64889m = C26116V2.m65245a(i, cVar.f64889m);
            C26143c cVar2 = cVar.f64884h;
            this.f64884h = cVar2;
            if (mo84139t1()) {
                cVar2.f64892p = true;
            }
            this.f64888l = cVar.f64888l + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* renamed from: v1 */
    private Spliterator m65331v1(int i) {
        int i2;
        int i3;
        C26143c cVar = this.f64884h;
        Spliterator spliterator = cVar.f64890n;
        if (spliterator != null) {
            cVar.f64890n = null;
            if (cVar.f64894r && cVar.f64892p) {
                C26143c cVar2 = cVar.f64887k;
                int i4 = 1;
                while (cVar != this) {
                    int i5 = cVar2.f64886j;
                    if (cVar2.mo84139t1()) {
                        i4 = 0;
                        if (C26116V2.SHORT_CIRCUIT.mo84449d(i5)) {
                            i5 &= ~C26116V2.f64849u;
                        }
                        spliterator = cVar2.mo84472s1(cVar, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i3 = i5 & (~C26116V2.f64848t);
                            i2 = C26116V2.f64847s;
                        } else {
                            i3 = i5 & (~C26116V2.f64847s);
                            i2 = C26116V2.f64848t;
                        }
                        i5 = i3 | i2;
                    }
                    cVar2.f64888l = i4;
                    cVar2.f64889m = C26116V2.m65245a(i5, cVar.f64889m);
                    i4++;
                    C26143c cVar3 = cVar2;
                    cVar2 = cVar2.f64887k;
                    cVar = cVar3;
                }
            }
            if (i != 0) {
                this.f64889m = C26116V2.m65245a(i, this.f64889m);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public final void mo84460O0(Spliterator spliterator, C26166g2 g2Var) {
        g2Var.getClass();
        if (!C26116V2.SHORT_CIRCUIT.mo84449d(this.f64889m)) {
            g2Var.mo84147d(spliterator.getExactSizeIfKnown());
            spliterator.forEachRemaining(g2Var);
            g2Var.end();
            return;
        }
        mo84461P0(spliterator, g2Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public final void mo84461P0(Spliterator spliterator, C26166g2 g2Var) {
        C26143c cVar = this;
        while (cVar.f64888l > 0) {
            cVar = cVar.f64885i;
        }
        g2Var.mo84147d(spliterator.getExactSizeIfKnown());
        cVar.mo84173m1(spliterator, g2Var);
        g2Var.end();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S0 */
    public final long mo84462S0(Spliterator spliterator) {
        if (C26116V2.SIZED.mo84449d(this.f64889m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X0 */
    public final int mo84463X0() {
        return this.f64889m;
    }

    public final void close() {
        this.f64891o = true;
        this.f64890n = null;
        C26143c cVar = this.f64884h;
        Runnable runnable = cVar.f64893q;
        if (runnable != null) {
            cVar.f64893q = null;
            runnable.run();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public final C26166g2 mo84464g1(Spliterator spliterator, C26166g2 g2Var) {
        g2Var.getClass();
        mo84460O0(spliterator, mo84465h1(g2Var));
        return g2Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h1 */
    public final C26166g2 mo84465h1(C26166g2 g2Var) {
        g2Var.getClass();
        for (C26143c cVar = this; cVar.f64888l > 0; cVar = cVar.f64885i) {
            g2Var = cVar.mo84142u1(cVar.f64885i.f64889m, g2Var);
        }
        return g2Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public final C26043E0 mo84466i1(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.f64884h.f64894r) {
            return mo84171l1(this, spliterator, z, intFunction);
        }
        C26259z0 d1 = mo84162d1(mo84462S0(spliterator), intFunction);
        mo84464g1(spliterator, d1);
        return d1.build();
    }

    public final boolean isParallel() {
        return this.f64884h.f64894r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1 */
    public final Object mo84467j1(C26046E3 e3) {
        if (!this.f64891o) {
            this.f64891o = true;
            return this.f64884h.f64894r ? e3.mo84249w(this, m65331v1(e3.mo84247L())) : e3.mo84248j0(this, m65331v1(e3.mo84247L()));
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public final C26043E0 mo84468k1(IntFunction intFunction) {
        if (!this.f64891o) {
            this.f64891o = true;
            if (!this.f64884h.f64894r || this.f64885i == null || !mo84139t1()) {
                return mo84466i1(m65331v1(0), true, intFunction);
            }
            this.f64888l = 0;
            C26143c cVar = this.f64885i;
            return mo84141r1(cVar.m65331v1(0), intFunction, cVar);
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public abstract C26043E0 mo84171l1(C26239v0 v0Var, Spliterator spliterator, boolean z, IntFunction intFunction);

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public abstract void mo84173m1(Spliterator spliterator, C26166g2 g2Var);

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public abstract int mo84176n1();

    /* access modifiers changed from: package-private */
    /* renamed from: o1 */
    public final int mo84469o1() {
        C26143c cVar = this;
        while (cVar.f64888l > 0) {
            cVar = cVar.f64885i;
        }
        return cVar.mo84176n1();
    }

    public final C26173i onClose(Runnable runnable) {
        C26143c cVar = this.f64884h;
        Runnable runnable2 = cVar.f64893q;
        if (runnable2 != null) {
            runnable = new C26036C3(runnable2, runnable);
        }
        cVar.f64893q = runnable;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public final boolean mo84470p1() {
        return C26116V2.ORDERED.mo84449d(this.f64889m);
    }

    public final C26173i parallel() {
        this.f64884h.f64894r = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q1 */
    public final /* synthetic */ Spliterator mo84471q1() {
        return m65331v1(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public C26043E0 mo84141r1(Spliterator spliterator, IntFunction intFunction, C26143c cVar) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public Spliterator mo84472s1(C26143c cVar, Spliterator spliterator) {
        return mo84141r1(spliterator, new C26138b(0), cVar).spliterator();
    }

    public final C26173i sequential() {
        this.f64884h.f64894r = false;
        return this;
    }

    public Spliterator spliterator() {
        if (!this.f64891o) {
            this.f64891o = true;
            C26143c cVar = this.f64884h;
            if (this != cVar) {
                return mo84188x1(this, new C26133a(1, this), cVar.f64894r);
            }
            Spliterator spliterator = cVar.f64890n;
            if (spliterator != null) {
                cVar.f64890n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public abstract boolean mo84139t1();

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public abstract C26166g2 mo84142u1(int i, C26166g2 g2Var);

    /* access modifiers changed from: package-private */
    /* renamed from: w1 */
    public final Spliterator mo84473w1() {
        C26143c cVar = this.f64884h;
        if (this != cVar) {
            throw new IllegalStateException();
        } else if (!this.f64891o) {
            this.f64891o = true;
            Spliterator spliterator = cVar.f64890n;
            if (spliterator != null) {
                cVar.f64890n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        } else {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public abstract Spliterator mo84188x1(C26239v0 v0Var, C26133a aVar, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: y1 */
    public final Spliterator mo84474y1(Spliterator spliterator) {
        return this.f64888l == 0 ? spliterator : mo84188x1(this, new C26133a(0, spliterator), this.f64884h.f64894r);
    }
}
