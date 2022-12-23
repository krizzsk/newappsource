package p988j$.util.stream;

import java.util.Arrays;
import p988j$.util.C25864L;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.a1 */
class C26135a1 implements C26028B0 {

    /* renamed from: a */
    final int[] f64877a;

    /* renamed from: b */
    int f64878b;

    C26135a1(long j) {
        if (j < 2147483639) {
            this.f64877a = new int[((int) j)];
            this.f64878b = 0;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    C26135a1(int[] iArr) {
        this.f64877a = iArr;
        this.f64878b = iArr.length;
    }

    /* renamed from: a */
    public final C26038D0 mo84198a(int i) {
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: b */
    public final Object mo84199b() {
        int[] iArr = this.f64877a;
        int length = iArr.length;
        int i = this.f64878b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    /* renamed from: c */
    public final void mo84200c(int i, Object obj) {
        System.arraycopy(this.f64877a, 0, (int[]) obj, i, this.f64878b);
    }

    public final long count() {
        return (long) this.f64878b;
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        C26239v0.m65680z0(this, consumer);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo84243j(Integer[] numArr, int i) {
        C26239v0.m65677w0(this, numArr, i);
    }

    /* renamed from: h */
    public final void mo84201h(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.f64878b; i++) {
            intConsumer.accept(this.f64877a[i]);
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
        return C26239v0.m65642C0(this, j, j2);
    }

    public final C25864L spliterator() {
        return Spliterators.spliterator(this.f64877a, 0, this.f64878b, 1040);
    }

    /* renamed from: spliterator  reason: collision with other method in class */
    public final Spliterator m65765spliterator() {
        return Spliterators.spliterator(this.f64877a, 0, this.f64878b, 1040);
    }

    public String toString() {
        return String.format("IntArrayNode[%d][%s]", new Object[]{Integer.valueOf(this.f64877a.length - this.f64878b), Arrays.toString(this.f64877a)});
    }
}
