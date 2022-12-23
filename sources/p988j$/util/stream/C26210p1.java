package p988j$.util.stream;

import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.p1 */
final class C26210p1 extends C26215q1 {

    /* renamed from: h */
    private final Object[] f64988h;

    C26210p1(Spliterator spliterator, C26239v0 v0Var, Object[] objArr) {
        super(objArr.length, spliterator, v0Var);
        this.f64988h = objArr;
    }

    C26210p1(C26210p1 p1Var, Spliterator spliterator, long j, long j2) {
        super(p1Var, spliterator, j, j2, p1Var.f64988h.length);
        this.f64988h = p1Var.f64988h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C26215q1 mo84580a(Spliterator spliterator, long j, long j2) {
        return new C26210p1(this, spliterator, j, j2);
    }

    public final void accept(Object obj) {
        int i = this.f64997f;
        if (i < this.f64998g) {
            Object[] objArr = this.f64988h;
            this.f64997f = i + 1;
            objArr[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f64997f));
    }
}
