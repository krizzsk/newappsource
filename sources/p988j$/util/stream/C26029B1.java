package p988j$.util.stream;

import p988j$.util.C26012j;
import p988j$.util.function.C25973i;
import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.B1 */
final class C26029B1 implements C26092P1, C26151d2 {

    /* renamed from: a */
    private boolean f64701a;

    /* renamed from: b */
    private double f64702b;

    /* renamed from: c */
    final /* synthetic */ C25973i f64703c;

    C26029B1(C25973i iVar) {
        this.f64703c = iVar;
    }

    public final void accept(double d) {
        if (this.f64701a) {
            this.f64701a = false;
        } else {
            d = this.f64703c.applyAsDouble(this.f64702b, d);
        }
        this.f64702b = d;
    }

    public final /* synthetic */ void accept(int i) {
        C26239v0.m65673s0();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C26239v0.m65674t0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84151m((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        this.f64701a = true;
        this.f64702b = 0.0d;
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    public final Object get() {
        return this.f64701a ? C26012j.m64876a() : C26012j.m64877d(this.f64702b);
    }

    /* renamed from: i */
    public final void mo84150i(C26092P1 p1) {
        C26029B1 b1 = (C26029B1) p1;
        if (!b1.f64701a) {
            accept(b1.f64702b);
        }
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        mVar.getClass();
        return new C25975j(this, mVar);
    }

    /* renamed from: m */
    public final /* synthetic */ void mo84151m(Double d) {
        C26239v0.m65667m0(this, d);
    }
}
