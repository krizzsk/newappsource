package p988j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.F2 */
final class C26050F2 extends C26231t2 {

    /* renamed from: c */
    private int[] f64732c;

    /* renamed from: d */
    private int f64733d;

    C26050F2(C26166g2 g2Var) {
        super(g2Var);
    }

    public final void accept(int i) {
        int[] iArr = this.f64732c;
        int i2 = this.f64733d;
        this.f64733d = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        if (j < 2147483639) {
            this.f64732c = new int[((int) j)];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final void end() {
        int i = 0;
        Arrays.sort(this.f64732c, 0, this.f64733d);
        this.f64879a.mo84147d((long) this.f64733d);
        if (!this.f65024b) {
            while (i < this.f64733d) {
                this.f64879a.accept(this.f64732c[i]);
                i++;
            }
        } else {
            while (i < this.f64733d && !this.f64879a.mo84149f()) {
                this.f64879a.accept(this.f64732c[i]);
                i++;
            }
        }
        this.f64879a.end();
        this.f64732c = null;
    }
}
