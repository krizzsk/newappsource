package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;

/* renamed from: j$.util.stream.o1 */
final class C26205o1 extends C26215q1 implements C26161f2 {

    /* renamed from: h */
    private final long[] f64978h;

    C26205o1(Spliterator spliterator, C26239v0 v0Var, long[] jArr) {
        super(jArr.length, spliterator, v0Var);
        this.f64978h = jArr;
    }

    C26205o1(C26205o1 o1Var, Spliterator spliterator, long j, long j2) {
        super(o1Var, spliterator, j, j2, o1Var.f64978h.length);
        this.f64978h = o1Var.f64978h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C26215q1 mo84580a(Spliterator spliterator, long j, long j2) {
        return new C26205o1(this, spliterator, j, j2);
    }

    public final void accept(long j) {
        int i = this.f64997f;
        if (i < this.f64998g) {
            long[] jArr = this.f64978h;
            this.f64997f = i + 1;
            jArr[i] = j;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f64997f));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84344k((Long) obj);
    }

    /* renamed from: g */
    public final C25966e0 mo83884g(C25966e0 e0Var) {
        e0Var.getClass();
        return new C25960b0(this, e0Var);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo84344k(Long l) {
        C26239v0.m65671q0(this, l);
    }
}
