package p988j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: j$.util.stream.H2 */
final class C26060H2 extends C26241v2 {

    /* renamed from: d */
    private Object[] f64752d;

    /* renamed from: e */
    private int f64753e;

    C26060H2(C26166g2 g2Var, Comparator comparator) {
        super(g2Var, comparator);
    }

    public final void accept(Object obj) {
        Object[] objArr = this.f64752d;
        int i = this.f64753e;
        this.f64753e = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        if (j < 2147483639) {
            this.f64752d = new Object[((int) j)];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final void end() {
        int i = 0;
        Arrays.sort(this.f64752d, 0, this.f64753e, this.f65044b);
        this.f64895a.mo84147d((long) this.f64753e);
        if (!this.f65045c) {
            while (i < this.f64753e) {
                this.f64895a.accept(this.f64752d[i]);
                i++;
            }
        } else {
            while (i < this.f64753e && !this.f64895a.mo84149f()) {
                this.f64895a.accept(this.f64752d[i]);
                i++;
            }
        }
        this.f64895a.end();
        this.f64752d = null;
    }
}
