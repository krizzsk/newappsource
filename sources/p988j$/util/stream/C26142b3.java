package p988j$.util.stream;

import androidx.recyclerview.widget.RecyclerView;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.b3 */
final class C26142b3 extends C26147c3 implements Consumer {

    /* renamed from: b */
    final Object[] f64883b = new Object[RecyclerView.C1119a0.FLAG_IGNORE];

    C26142b3() {
    }

    public final void accept(Object obj) {
        Object[] objArr = this.f64883b;
        int i = this.f64896a;
        this.f64896a = i + 1;
        objArr[i] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
