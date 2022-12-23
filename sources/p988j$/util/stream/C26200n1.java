package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.n1 */
final class C26200n1 extends C26215q1 implements C26156e2 {

    /* renamed from: h */
    private final int[] f64970h;

    C26200n1(Spliterator spliterator, C26239v0 v0Var, int[] iArr) {
        super(iArr.length, spliterator, v0Var);
        this.f64970h = iArr;
    }

    C26200n1(C26200n1 n1Var, Spliterator spliterator, long j, long j2) {
        super(n1Var, spliterator, j, j2, n1Var.f64970h.length);
        this.f64970h = n1Var.f64970h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C26215q1 mo84580a(Spliterator spliterator, long j, long j2) {
        return new C26200n1(this, spliterator, j, j2);
    }

    public final void accept(int i) {
        int i2 = this.f64997f;
        if (i2 < this.f64998g) {
            int[] iArr = this.f64970h;
            this.f64997f = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f64997f));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84323e((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo84323e(Integer num) {
        C26239v0.m65669o0(this, num);
    }
}
