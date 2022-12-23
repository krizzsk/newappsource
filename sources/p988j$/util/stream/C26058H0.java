package p988j$.util.stream;

import java.util.Arrays;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.H0 */
class C26058H0 implements C26043E0 {

    /* renamed from: a */
    final Object[] f64747a;

    /* renamed from: b */
    int f64748b;

    C26058H0(long j, IntFunction intFunction) {
        if (j < 2147483639) {
            this.f64747a = (Object[]) intFunction.apply((int) j);
            this.f64748b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C26058H0(Object[] objArr) {
        this.f64747a = objArr;
        this.f64748b = objArr.length;
    }

    /* renamed from: a */
    public final C26043E0 mo84198a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return (long) this.f64748b;
    }

    public final void forEach(Consumer consumer) {
        for (int i = 0; i < this.f64748b; i++) {
            consumer.accept(this.f64747a[i]);
        }
    }

    /* renamed from: j */
    public final void mo84243j(Object[] objArr, int i) {
        System.arraycopy(this.f64747a, 0, objArr, i, this.f64748b);
    }

    /* renamed from: n */
    public final /* synthetic */ int mo84244n() {
        return 0;
    }

    /* renamed from: o */
    public final Object[] mo84245o(IntFunction intFunction) {
        Object[] objArr = this.f64747a;
        if (objArr.length == this.f64748b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    /* renamed from: p */
    public final /* synthetic */ C26043E0 mo84246p(long j, long j2, IntFunction intFunction) {
        return C26239v0.m65644E0(this, j, j2, intFunction);
    }

    public final Spliterator spliterator() {
        return Spliterators.m64712l(this.f64747a, 0, this.f64748b);
    }

    public String toString() {
        return String.format("ArrayNode[%d][%s]", new Object[]{Integer.valueOf(this.f64747a.length - this.f64748b), Arrays.toString(this.f64747a)});
    }
}
