package p988j$.util.stream;

import p988j$.util.C25864L;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.c1 */
final class C26145c1 extends C26081M2 implements C26028B0, C26249x0 {
    C26145c1() {
    }

    /* renamed from: a */
    public final C26038D0 mo84198a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public final void accept(int i) {
        super.accept(i);
    }

    public final /* synthetic */ void accept(long j) {
        C26239v0.m65674t0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84323e((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: b */
    public final Object mo84357b() {
        return (int[]) super.mo84357b();
    }

    public final C26028B0 build() {
        return this;
    }

    /* renamed from: build  reason: collision with other method in class */
    public final C26043E0 m65766build() {
        return this;
    }

    /* renamed from: c */
    public final void mo84358c(int i, Object obj) {
        super.mo84358c(i, (int[]) obj);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        clear();
        mo84362t(j);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo84323e(Integer num) {
        C26239v0.m65669o0(this, num);
    }

    public final void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    /* renamed from: h */
    public final void mo84360h(Object obj) {
        super.mo84360h((IntConsumer) obj);
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
        return C26239v0.m65642C0(this, j, j2);
    }

    public final C25864L spliterator() {
        return super.spliterator();
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m65767spliterator() {
        return super.spliterator();
    }

    /* renamed from: w */
    public final Spliterator.OfInt mo84341w() {
        return super.spliterator();
    }

    /* renamed from: x */
    public final /* synthetic */ void mo84243j(Integer[] numArr, int i) {
        C26239v0.m65677w0(this, numArr, i);
    }
}
