package p988j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.w2 */
final class C26246w2 extends C26226s2 {

    /* renamed from: c */
    private C26073K2 f65053c;

    C26246w2(C26166g2 g2Var) {
        super(g2Var);
    }

    public final void accept(double d) {
        this.f65053c.accept(d);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        C26073K2 k2;
        if (j < 2147483639) {
            if (j > 0) {
                int i = (int) j;
            } else {
                k2 = new C26073K2();
            }
            this.f65053c = k2;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final void end() {
        double[] dArr = (double[]) this.f65053c.mo84357b();
        Arrays.sort(dArr);
        this.f64873a.mo84147d((long) dArr.length);
        int i = 0;
        if (!this.f65014b) {
            int length = dArr.length;
            while (i < length) {
                this.f64873a.accept(dArr[i]);
                i++;
            }
        } else {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (this.f64873a.mo84149f()) {
                    break;
                }
                this.f64873a.accept(d);
                i++;
            }
        }
        this.f64873a.end();
    }
}
