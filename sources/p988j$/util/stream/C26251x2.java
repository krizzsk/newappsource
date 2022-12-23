package p988j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.x2 */
final class C26251x2 extends C26231t2 {

    /* renamed from: c */
    private C26081M2 f65059c;

    C26251x2(C26166g2 g2Var) {
        super(g2Var);
    }

    public final void accept(int i) {
        this.f65059c.accept(i);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        C26081M2 m2;
        if (j < 2147483639) {
            if (j > 0) {
                int i = (int) j;
            } else {
                m2 = new C26081M2();
            }
            this.f65059c = m2;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final void end() {
        int[] iArr = (int[]) this.f65059c.mo84357b();
        Arrays.sort(iArr);
        this.f64879a.mo84147d((long) iArr.length);
        int i = 0;
        if (!this.f65024b) {
            int length = iArr.length;
            while (i < length) {
                this.f64879a.accept(iArr[i]);
                i++;
            }
        } else {
            int length2 = iArr.length;
            while (i < length2) {
                int i2 = iArr[i];
                if (this.f64879a.mo84149f()) {
                    break;
                }
                this.f64879a.accept(i2);
                i++;
            }
        }
        this.f64879a.end();
    }
}
