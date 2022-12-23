package p988j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.M2 */
class C26081M2 extends C26097Q2 implements IntConsumer {
    C26081M2() {
    }

    C26081M2(int i) {
        super(i);
    }

    public void accept(int i) {
        mo84363v();
        int i2 = this.f64905b;
        this.f64905b = i2 + 1;
        ((int[]) this.f64804e)[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            mo84360h((IntConsumer) consumer);
        } else if (!C26061H3.f64754a) {
            spliterator().forEachRemaining(consumer);
        } else {
            C26061H3.m65025a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        }
    }

    public final Iterator iterator() {
        return Spliterators.m64707g(spliterator());
    }

    public final Object newArray(int i) {
        return new int[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo84328q(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo84329r(Object obj) {
        return ((int[]) obj).length;
    }

    public final String toString() {
        int[] iArr = (int[]) mo84357b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f64906c), Arrays.toString(iArr)});
        }
        return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f64906c), Arrays.toString(Arrays.copyOf(iArr, 200))});
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Object[] mo84331u() {
        return new int[8][];
    }

    /* renamed from: w */
    public Spliterator.OfInt spliterator() {
        return new C26077L2(this, 0, this.f64906c, 0, this.f64905b);
    }
}
