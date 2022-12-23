package p988j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.E2 */
final class C26045E2 extends C26226s2 {

    /* renamed from: c */
    private double[] f64725c;

    /* renamed from: d */
    private int f64726d;

    C26045E2(C26166g2 g2Var) {
        super(g2Var);
    }

    public final void accept(double d) {
        double[] dArr = this.f64725c;
        int i = this.f64726d;
        this.f64726d = i + 1;
        dArr[i] = d;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        if (j < 2147483639) {
            this.f64725c = new double[((int) j)];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final void end() {
        int i = 0;
        Arrays.sort(this.f64725c, 0, this.f64726d);
        this.f64873a.mo84147d((long) this.f64726d);
        if (!this.f65014b) {
            while (i < this.f64726d) {
                this.f64873a.accept(this.f64725c[i]);
                i++;
            }
        } else {
            while (i < this.f64726d && !this.f64873a.mo84149f()) {
                this.f64873a.accept(this.f64725c[i]);
                i++;
            }
        }
        this.f64873a.end();
        this.f64725c = null;
    }
}
