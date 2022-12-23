package p988j$.util;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.Y */
final class C25876Y implements Spliterator.OfInt {

    /* renamed from: a */
    private final int[] f64510a;

    /* renamed from: b */
    private int f64511b;

    /* renamed from: c */
    private final int f64512c;

    /* renamed from: d */
    private final int f64513d;

    public C25876Y(int[] iArr, int i, int i2, int i3) {
        this.f64510a = iArr;
        this.f64511b = i;
        this.f64512c = i2;
        this.f64513d = i3 | 64 | Spliterator.SUBSIZED;
    }

    public final int characteristics() {
        return this.f64513d;
    }

    public final long estimateSize() {
        return (long) (this.f64512c - this.f64511b);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64890e(this, consumer);
    }

    public final void forEachRemaining(IntConsumer intConsumer) {
        int i;
        intConsumer.getClass();
        int[] iArr = this.f64510a;
        int length = iArr.length;
        int i2 = this.f64512c;
        if (length >= i2 && (i = this.f64511b) >= 0) {
            this.f64511b = i2;
            if (i < i2) {
                do {
                    intConsumer.accept(iArr[i]);
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

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64893i(this, consumer);
    }

    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i = this.f64511b;
        if (i < 0 || i >= this.f64512c) {
            return false;
        }
        int[] iArr = this.f64510a;
        this.f64511b = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    public final Spliterator.OfInt trySplit() {
        int i = this.f64511b;
        int i2 = (this.f64512c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        int[] iArr = this.f64510a;
        this.f64511b = i2;
        return new C25876Y(iArr, i, i2, this.f64513d);
    }
}
