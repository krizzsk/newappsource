package p988j$.util;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.S */
final class C25870S implements Spliterator {

    /* renamed from: a */
    private final Object[] f64497a;

    /* renamed from: b */
    private int f64498b;

    /* renamed from: c */
    private final int f64499c;

    /* renamed from: d */
    private final int f64500d;

    public C25870S(Object[] objArr, int i, int i2, int i3) {
        this.f64497a = objArr;
        this.f64498b = i;
        this.f64499c = i2;
        this.f64500d = i3 | 64 | Spliterator.SUBSIZED;
    }

    public final int characteristics() {
        return this.f64500d;
    }

    public final long estimateSize() {
        return (long) (this.f64499c - this.f64498b);
    }

    public final void forEachRemaining(Consumer consumer) {
        int i;
        consumer.getClass();
        Object[] objArr = this.f64497a;
        int length = objArr.length;
        int i2 = this.f64499c;
        if (length >= i2 && (i = this.f64498b) >= 0) {
            this.f64498b = i2;
            if (i < i2) {
                do {
                    consumer.accept(objArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    public final Comparator getComparator() {
        if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i = this.f64498b;
        if (i < 0 || i >= this.f64499c) {
            return false;
        }
        Object[] objArr = this.f64497a;
        this.f64498b = i + 1;
        consumer.accept(objArr[i]);
        return true;
    }

    public final Spliterator trySplit() {
        int i = this.f64498b;
        int i2 = (this.f64499c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        Object[] objArr = this.f64497a;
        this.f64498b = i2;
        return new C25870S(objArr, i, i2, this.f64500d);
    }
}
