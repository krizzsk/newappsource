package p988j$.util.stream;

import java.util.Arrays;
import p988j$.util.C25864L;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.R0 */
class C26098R0 implements C26023A0 {

    /* renamed from: a */
    final double[] f64806a;

    /* renamed from: b */
    int f64807b;

    C26098R0(long j) {
        if (j < 2147483639) {
            this.f64806a = new double[((int) j)];
            this.f64807b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C26098R0(double[] dArr) {
        this.f64806a = dArr;
        this.f64807b = dArr.length;
    }

    /* renamed from: a */
    public final C26038D0 mo84198a(int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final Object mo84199b() {
        double[] dArr = this.f64806a;
        int length = dArr.length;
        int i = this.f64807b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    /* renamed from: c */
    public final void mo84200c(int i, Object obj) {
        System.arraycopy(this.f64806a, 0, (double[]) obj, i, this.f64807b);
    }

    public final long count() {
        return (long) this.f64807b;
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C26239v0.m65679y0(this, consumer);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo84243j(Double[] dArr, int i) {
        C26239v0.m65676v0(this, dArr, i);
    }

    /* renamed from: h */
    public final void mo84201h(Object obj) {
        C25981m mVar = (C25981m) obj;
        for (int i = 0; i < this.f64807b; i++) {
            mVar.accept(this.f64806a[i]);
        }
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
        return Spliterators.m64710j(this.f64806a, 0, this.f64807b);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m65759spliterator() {
        return Spliterators.m64710j(this.f64806a, 0, this.f64807b);
    }

    public String toString() {
        return String.format("DoubleArrayNode[%d][%s]", new Object[]{Integer.valueOf(this.f64806a.length - this.f64807b), Arrays.toString(this.f64806a)});
    }
}
