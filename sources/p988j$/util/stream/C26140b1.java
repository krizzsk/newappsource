package p988j$.util.stream;

import java.util.Arrays;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.b1 */
final class C26140b1 extends C26135a1 implements C26249x0 {
    C26140b1(long j) {
        super(j);
    }

    public final /* synthetic */ void accept(double d) {
        C26239v0.m65666l0();
        throw null;
    }

    public final void accept(int i) {
        int i2 = this.f64878b;
        int[] iArr = this.f64877a;
        if (i2 < iArr.length) {
            this.f64878b = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(this.f64877a.length)}));
    }

    public final /* synthetic */ void accept(long j) {
        C26239v0.m65674t0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84323e((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    public final C26028B0 build() {
        if (this.f64878b >= this.f64877a.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f64878b), Integer.valueOf(this.f64877a.length)}));
    }

    /* renamed from: d */
    public final void mo84147d(long j) {
        if (j == ((long) this.f64877a.length)) {
            this.f64878b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(this.f64877a.length)}));
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void mo84323e(Integer num) {
        C26239v0.m65669o0(this, num);
    }

    public final void end() {
        if (this.f64878b < this.f64877a.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f64878b), Integer.valueOf(this.f64877a.length)}));
        }
    }

    /* renamed from: f */
    public final /* synthetic */ boolean mo84149f() {
        return false;
    }

    public final String toString() {
        return String.format("IntFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(this.f64877a.length - this.f64878b), Arrays.toString(this.f64877a)});
    }
}
