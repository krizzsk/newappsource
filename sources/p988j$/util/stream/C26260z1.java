package p988j$.util.stream;

import p988j$.util.function.C25973i;
import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.z1 */
final class C26260z1 implements C26092P1, C26151d2 {

    /* renamed from: a */
    private double f65069a;

    /* renamed from: b */
    final /* synthetic */ double f65070b;

    /* renamed from: c */
    final /* synthetic */ C25973i f65071c;

    C26260z1(double d, C25973i iVar) {
        this.f65070b = d;
        this.f65071c = iVar;
    }

    public final void accept(double d) {
        this.f65069a = this.f65071c.applyAsDouble(this.f65069a, d);
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
        this.f65069a = this.f65070b;
    }

    public final /* synthetic */ void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    public final Object get() {
        return Double.valueOf(this.f65069a);
    }

    /* renamed from: i */
    public final void mo84150i(C26092P1 p1) {
        accept(((C26260z1) p1).f65069a);
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
