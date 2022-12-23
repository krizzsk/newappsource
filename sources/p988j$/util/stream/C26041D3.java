package p988j$.util.stream;

import java.util.Comparator;
import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.D3 */
final class C26041D3 implements Spliterator.OfInt {

    /* renamed from: a */
    private int f64718a;

    /* renamed from: b */
    private final int f64719b;

    /* renamed from: c */
    private int f64720c;

    C26041D3(int i, int i2) {
        this(i, i2, 0);
    }

    private C26041D3(int i, int i2, int i3) {
        this.f64718a = i;
        this.f64719b = i2;
        this.f64720c = 0;
    }

    public final int characteristics() {
        return 17749;
    }

    public final long estimateSize() {
        return (((long) this.f64719b) - ((long) this.f64718a)) + ((long) this.f64720c);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64890e(this, consumer);
    }

    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.f64718a;
        int i2 = this.f64719b;
        int i3 = this.f64720c;
        this.f64718a = i2;
        this.f64720c = 0;
        while (i < i2) {
            intConsumer.accept(i);
            i++;
        }
        if (i3 > 0) {
            intConsumer.accept(i);
        }
    }

    public final Comparator getComparator() {
        return null;
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64893i(this, consumer);
    }

    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.f64718a;
        if (i < this.f64719b) {
            this.f64718a = i + 1;
        } else if (this.f64720c <= 0) {
            return false;
        } else {
            this.f64720c = 0;
        }
        intConsumer.accept(i);
        return true;
    }

    public final Spliterator.OfInt trySplit() {
        long estimateSize = estimateSize();
        if (estimateSize <= 1) {
            return null;
        }
        int i = this.f64718a;
        int i2 = ((int) (estimateSize / ((long) (estimateSize < 16777216 ? 2 : 8)))) + i;
        this.f64718a = i2;
        return new C26041D3(i, i2, 0);
    }
}
