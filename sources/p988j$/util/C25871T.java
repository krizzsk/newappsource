package p988j$.util;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.T */
final class C25871T implements C25856D {

    /* renamed from: a */
    private final double[] f64506a;

    /* renamed from: b */
    private int f64507b;

    /* renamed from: c */
    private final int f64508c;

    /* renamed from: d */
    private final int f64509d;

    public C25871T(double[] dArr, int i, int i2, int i3) {
        this.f64506a = dArr;
        this.f64507b = i;
        this.f64508c = i2;
        this.f64509d = i3 | 64 | Spliterator.SUBSIZED;
    }

    /* renamed from: b */
    public final void forEachRemaining(C25981m mVar) {
        int i;
        mVar.getClass();
        double[] dArr = this.f64506a;
        int length = dArr.length;
        int i2 = this.f64508c;
        if (length >= i2 && (i = this.f64507b) >= 0) {
            this.f64507b = i2;
            if (i < i2) {
                do {
                    mVar.accept(dArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    public final int characteristics() {
        return this.f64509d;
    }

    public final long estimateSize() {
        return (long) (this.f64508c - this.f64507b);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64889d(this, consumer);
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

    /* renamed from: h */
    public final boolean tryAdvance(C25981m mVar) {
        mVar.getClass();
        int i = this.f64507b;
        if (i < 0 || i >= this.f64508c) {
            return false;
        }
        double[] dArr = this.f64506a;
        this.f64507b = i + 1;
        mVar.accept(dArr[i]);
        return true;
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64892g(this, consumer);
    }

    public final C25856D trySplit() {
        int i = this.f64507b;
        int i2 = (this.f64508c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        double[] dArr = this.f64506a;
        this.f64507b = i2;
        return new C25871T(dArr, i, i2, this.f64509d);
    }
}
