package p988j$.util.stream;

import androidx.recyclerview.widget.RecyclerView;
import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;

/* renamed from: j$.util.stream.Z2 */
final class C26132Z2 extends C26137a3 implements C25966e0 {

    /* renamed from: c */
    final long[] f64874c = new long[RecyclerView.C1119a0.FLAG_IGNORE];

    C26132Z2() {
    }

    /* renamed from: a */
    public final void mo84455a(Object obj, long j) {
        C25966e0 e0Var = (C25966e0) obj;
        for (int i = 0; ((long) i) < j; i++) {
            e0Var.accept(this.f64874c[i]);
        }
    }

    public final void accept(long j) {
        long[] jArr = this.f64874c;
        int i = this.f64880b;
        this.f64880b = i + 1;
        jArr[i] = j;
    }

    /* renamed from: g */
    public final C25966e0 mo83884g(C25966e0 e0Var) {
        e0Var.getClass();
        return new C25960b0(this, e0Var);
    }
}
