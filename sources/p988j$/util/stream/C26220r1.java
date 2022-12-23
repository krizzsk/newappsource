package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.r1 */
final class C26220r1 extends C26100R2 implements C26043E0, C26259z0 {
    C26220r1() {
    }

    /* renamed from: a */
    public final C26043E0 mo84198a(int i) {
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

    public final /* synthetic */ void accept(long j) {
        C26239v0.m65674t0();
        throw null;
    }

    public final void accept(Object obj) {
        super.accept(obj);
    }

    public final C26043E0 build() {
        return this;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        clear();
        mo84367q(j);
    }

    public final void end() {
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    public final void forEach(Consumer consumer) {
        super.forEach(consumer);
    }

    /* renamed from: j */
    public final void mo84243j(Object[] objArr, int i) {
        long j = (long) i;
        long count = count() + j;
        if (count > ((long) objArr.length) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f64906c == 0) {
            System.arraycopy(this.f64809e, 0, objArr, i, this.f64905b);
        } else {
            for (int i2 = 0; i2 < this.f64906c; i2++) {
                Object[] objArr2 = this.f64810f[i2];
                System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
                i += this.f64810f[i2].length;
            }
            int i3 = this.f64905b;
            if (i3 > 0) {
                System.arraycopy(this.f64809e, 0, objArr, i, i3);
            }
        }
    }

    /* renamed from: n */
    public final /* synthetic */ int mo84244n() {
        return 0;
    }

    /* renamed from: o */
    public final Object[] mo84245o(IntFunction intFunction) {
        long count = count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            mo84243j(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: p */
    public final /* synthetic */ C26043E0 mo84246p(long j, long j2, IntFunction intFunction) {
        return C26239v0.m65644E0(this, j, j2, intFunction);
    }

    public final Spliterator spliterator() {
        return super.spliterator();
    }
}
