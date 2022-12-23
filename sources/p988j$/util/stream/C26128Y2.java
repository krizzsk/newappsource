package p988j$.util.stream;

import androidx.recyclerview.widget.RecyclerView;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.Y2 */
final class C26128Y2 extends C26137a3 implements IntConsumer {

    /* renamed from: c */
    final int[] f64872c = new int[RecyclerView.C1119a0.FLAG_IGNORE];

    C26128Y2() {
    }

    /* renamed from: a */
    public final void mo84455a(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; ((long) i) < j; i++) {
            intConsumer.accept(this.f64872c[i]);
        }
    }

    public final void accept(int i) {
        int[] iArr = this.f64872c;
        int i2 = this.f64880b;
        this.f64880b = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
