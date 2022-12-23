package p988j$.util.stream;

import androidx.recyclerview.widget.RecyclerView;
import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;

/* renamed from: j$.util.stream.X2 */
final class C26124X2 extends C26137a3 implements C25981m {

    /* renamed from: c */
    final double[] f64869c = new double[RecyclerView.C1119a0.FLAG_IGNORE];

    C26124X2() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo84455a(Object obj, long j) {
        C25981m mVar = (C25981m) obj;
        for (int i = 0; ((long) i) < j; i++) {
            mVar.accept(this.f64869c[i]);
        }
    }

    public final void accept(double d) {
        double[] dArr = this.f64869c;
        int i = this.f64880b;
        this.f64880b = i + 1;
        dArr[i] = d;
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        mVar.getClass();
        return new C25975j(this, mVar);
    }
}
