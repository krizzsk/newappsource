package p988j$.util.stream;

import java.util.Arrays;
import p988j$.util.C25864L;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.j1 */
class C26180j1 implements C26033C0 {

    /* renamed from: a */
    final long[] f64939a;

    /* renamed from: b */
    int f64940b;

    C26180j1(long j) {
        if (j < 2147483639) {
            this.f64939a = new long[((int) j)];
            this.f64940b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C26180j1(long[] jArr) {
        this.f64939a = jArr;
        this.f64940b = jArr.length;
    }

    /* renamed from: a */
    public final C26038D0 mo84198a(int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final Object mo84199b() {
        long[] jArr = this.f64939a;
        int length = jArr.length;
        int i = this.f64940b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    /* renamed from: c */
    public final void mo84200c(int i, Object obj) {
        System.arraycopy(this.f64939a, 0, (long[]) obj, i, this.f64940b);
    }

    public final long count() {
        return (long) this.f64940b;
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C26239v0.m65640A0(this, consumer);
    }

    /* renamed from: h */
    public final void mo84201h(Object obj) {
        C25966e0 e0Var = (C25966e0) obj;
        for (int i = 0; i < this.f64940b; i++) {
            e0Var.accept(this.f64939a[i]);
        }
    }

    /* renamed from: l */
    public final /* synthetic */ void mo84243j(Long[] lArr, int i) {
        C26239v0.m65678x0(this, lArr, i);
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
        return Spliterators.m64711k(this.f64939a, 0, this.f64940b);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m65768spliterator() {
        return Spliterators.m64711k(this.f64939a, 0, this.f64940b);
    }

    public String toString() {
        return String.format("LongArrayNode[%d][%s]", new Object[]{Integer.valueOf(this.f64939a.length - this.f64940b), Arrays.toString(this.f64939a)});
    }
}
