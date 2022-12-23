package p988j$.util.stream;

import p988j$.util.C25856D;
import p988j$.util.C25864L;
import p988j$.util.Spliterator;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.T0 */
final class C26106T0 extends C26073K2 implements C26023A0, C26244w0 {
    C26106T0() {
    }

    /* renamed from: a */
    public final C26038D0 mo84198a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final void accept(double d) {
        super.accept(d);
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

    /* renamed from: b */
    public final Object mo84357b() {
        return (double[]) super.mo84357b();
    }

    public final C26023A0 build() {
        return this;
    }

    /* renamed from: build  reason: collision with other method in class */
    public final C26043E0 m65760build() {
        return this;
    }

    /* renamed from: c */
    public final void mo84358c(int i, Object obj) {
        super.mo84358c(i, (double[]) obj);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        clear();
        mo84362t(j);
    }

    public final void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    /* renamed from: h */
    public final void mo84360h(Object obj) {
        super.mo84360h((C25981m) obj);
    }

    /* renamed from: m */
    public final /* synthetic */ void mo84151m(Double d) {
        C26239v0.m65667m0(this, d);
    }

    /* renamed from: n */
    public final /* synthetic */ int mo84244n() {
        return 0;
    }

    /* renamed from: o */
    public final /* synthetic */ Object[] mo84245o(IntFunction intFunction) {
        return C26239v0.m65675u0(this, intFunction);
    }

    /* renamed from: p */
    public final /* synthetic */ C26043E0 mo84246p(long j, long j2, IntFunction intFunction) {
        return C26239v0.m65641B0(this, j, j2);
    }

    public final C25864L spliterator() {
        return super.spliterator();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m65761spliterator() {
        return super.spliterator();
    }

    /* renamed from: w */
    public final C25856D mo84332w() {
        return super.spliterator();
    }

    /* renamed from: x */
    public final /* synthetic */ void mo84243j(Double[] dArr, int i) {
        C26239v0.m65676v0(this, dArr, i);
    }
}
