package p988j$.util.stream;

import p988j$.util.C25861I;
import p988j$.util.C25864L;
import p988j$.util.Spliterator;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.l1 */
final class C26190l1 extends C26089O2 implements C26033C0, C26254y0 {
    C26190l1() {
    }

    /* renamed from: a */
    public final C26038D0 mo84198a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C26239v0.m65673s0();
        throw null;
    }

    public final void accept(long j) {
        super.accept(j);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84344k((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: b */
    public final Object mo84357b() {
        return (long[]) super.mo84357b();
    }

    public final C26033C0 build() {
        return this;
    }

    /* renamed from: build  reason: collision with other method in class */
    public final C26043E0 m65769build() {
        return this;
    }

    /* renamed from: c */
    public final void mo84358c(int i, Object obj) {
        super.mo84358c(i, (long[]) obj);
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
        super.mo84360h((C25966e0) obj);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo84344k(Long l) {
        C26239v0.m65671q0(this, l);
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
        return C26239v0.m65643D0(this, j, j2);
    }

    public final C25864L spliterator() {
        return super.spliterator();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m65770spliterator() {
        return super.spliterator();
    }

    /* renamed from: w */
    public final C25861I mo84347w() {
        return super.spliterator();
    }

    /* renamed from: x */
    public final /* synthetic */ void mo84243j(Long[] lArr, int i) {
        C26239v0.m65678x0(this, lArr, i);
    }
}
