package p988j$.util.stream;

import java.util.Arrays;

/* renamed from: j$.util.stream.y2 */
final class C26256y2 extends C26236u2 {

    /* renamed from: c */
    private C26089O2 f65064c;

    C26256y2(C26166g2 g2Var) {
        super(g2Var);
    }

    public final void accept(long j) {
        this.f65064c.accept(j);
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        C26089O2 o2;
        if (j < 2147483639) {
            if (j > 0) {
                int i = (int) j;
            } else {
                o2 = new C26089O2();
            }
            this.f65064c = o2;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final void end() {
        long[] jArr = (long[]) this.f65064c.mo84357b();
        Arrays.sort(jArr);
        this.f64882a.mo84147d((long) jArr.length);
        int i = 0;
        if (!this.f65031b) {
            int length = jArr.length;
            while (i < length) {
                this.f64882a.accept(jArr[i]);
                i++;
            }
        } else {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (this.f64882a.mo84149f()) {
                    break;
                }
                this.f64882a.accept(j);
                i++;
            }
        }
        this.f64882a.end();
    }
}
