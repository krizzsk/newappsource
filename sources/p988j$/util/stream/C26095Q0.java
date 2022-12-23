package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.Q0 */
final class C26095Q0 extends C26053G0 {
    C26095Q0(C26043E0 e0, C26043E0 e02) {
        super(e0, e02);
    }

    public final void forEach(Consumer consumer) {
        this.f64735a.forEach(consumer);
        this.f64736b.forEach(consumer);
    }

    /* renamed from: j */
    public final void mo84243j(Object[] objArr, int i) {
        objArr.getClass();
        this.f64735a.mo84243j(objArr, i);
        this.f64736b.mo84243j(objArr, i + ((int) this.f64735a.count()));
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
    public final C26043E0 mo84246p(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long count = this.f64735a.count();
        if (j >= count) {
            return this.f64736b.mo84246p(j - count, j2 - count, intFunction);
        }
        if (j2 <= count) {
            return this.f64735a.mo84246p(j, j2, intFunction);
        }
        IntFunction intFunction2 = intFunction;
        return C26239v0.m65653N0(1, this.f64735a.mo84246p(j, count, intFunction2), this.f64736b.mo84246p(0, j2 - count, intFunction2));
    }

    public final Spliterator spliterator() {
        return new C26170h1(this);
    }

    public final String toString() {
        if (count() < 32) {
            return String.format("ConcNode[%s.%s]", new Object[]{this.f64735a, this.f64736b});
        }
        return String.format("ConcNode[size=%d]", new Object[]{Long.valueOf(count())});
    }
}
