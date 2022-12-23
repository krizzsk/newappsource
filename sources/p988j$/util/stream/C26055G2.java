package p988j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.G2 */
final class C26055G2 extends C26236u2 {

    /* renamed from: c */
    private long[] f64741c;

    /* renamed from: d */
    private int f64742d;

    C26055G2(C26166g2 g2Var) {
        super(g2Var);
    }

    public final void accept(long j) {
        long[] jArr = this.f64741c;
        int i = this.f64742d;
        this.f64742d = i + 1;
        jArr[i] = j;
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        if (j < 2147483639) {
            this.f64741c = new long[((int) j)];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final void end() {
        int i = 0;
        Arrays.sort(this.f64741c, 0, this.f64742d);
        this.f64882a.mo84147d((long) this.f64742d);
        if (!this.f65031b) {
            while (i < this.f64742d) {
                this.f64882a.accept(this.f64741c[i]);
                i++;
            }
        } else {
            while (i < this.f64742d && !this.f64882a.mo84149f()) {
                this.f64882a.accept(this.f64741c[i]);
                i++;
            }
        }
        this.f64882a.end();
        this.f64741c = null;
    }
}
