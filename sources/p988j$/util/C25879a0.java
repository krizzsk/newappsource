package p988j$.util;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.a0 */
final class C25879a0 implements C25861I {

    /* renamed from: a */
    private final long[] f64521a;

    /* renamed from: b */
    private int f64522b;

    /* renamed from: c */
    private final int f64523c;

    /* renamed from: d */
    private final int f64524d;

    public C25879a0(long[] jArr, int i, int i2, int i3) {
        this.f64521a = jArr;
        this.f64522b = i;
        this.f64523c = i2;
        this.f64524d = i3 | 64 | Spliterator.SUBSIZED;
    }

    /* renamed from: a */
    public final void forEachRemaining(C25966e0 e0Var) {
        int i;
        e0Var.getClass();
        long[] jArr = this.f64521a;
        int length = jArr.length;
        int i2 = this.f64523c;
        if (length >= i2 && (i = this.f64522b) >= 0) {
            this.f64522b = i2;
            if (i < i2) {
                do {
                    e0Var.accept(jArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    /* renamed from: c */
    public final boolean tryAdvance(C25966e0 e0Var) {
        e0Var.getClass();
        int i = this.f64522b;
        if (i < 0 || i >= this.f64523c) {
            return false;
        }
        long[] jArr = this.f64521a;
        this.f64522b = i + 1;
        e0Var.accept(jArr[i]);
        return true;
    }

    public final int characteristics() {
        return this.f64524d;
    }

    public final long estimateSize() {
        return (long) (this.f64523c - this.f64522b);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64891f(this, consumer);
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
        return C26016n.m64894j(this, consumer);
    }

    public final C25861I trySplit() {
        int i = this.f64522b;
        int i2 = (this.f64523c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        long[] jArr = this.f64521a;
        this.f64522b = i2;
        return new C25879a0(jArr, i, i2, this.f64524d);
    }
}
