package p988j$.util.concurrent;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.k */
final class C25896k extends C25902q implements Spliterator {

    /* renamed from: i */
    public final /* synthetic */ int f64552i;

    /* renamed from: j */
    long f64553j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25896k(C25898m[] mVarArr, int i, int i2, int i3, long j, int i4) {
        super(mVarArr, i, i2, i3);
        this.f64552i = i4;
        this.f64553j = j;
    }

    public final int characteristics() {
        switch (this.f64552i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    public final long estimateSize() {
        switch (this.f64552i) {
            case 0:
                return this.f64553j;
            default:
                return this.f64553j;
        }
    }

    public final void forEachRemaining(Consumer consumer) {
        switch (this.f64552i) {
            case 0:
                consumer.getClass();
                while (true) {
                    C25898m d = mo83979d();
                    if (d != null) {
                        consumer.accept(d.f64558b);
                    } else {
                        return;
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    C25898m d2 = mo83979d();
                    if (d2 != null) {
                        consumer.accept(d2.f64559c);
                    } else {
                        return;
                    }
                }
        }
    }

    public final /* synthetic */ Comparator getComparator() {
        switch (this.f64552i) {
            case 0:
                return Spliterator.CC.$default$getComparator(this);
            default:
                return Spliterator.CC.$default$getComparator(this);
        }
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f64552i) {
            case 0:
                return Spliterator.CC.$default$getExactSizeIfKnown(this);
            default:
                return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.f64552i) {
            case 0:
                return Spliterator.CC.$default$hasCharacteristics(this, i);
            default:
                return Spliterator.CC.$default$hasCharacteristics(this, i);
        }
    }

    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f64552i) {
            case 0:
                consumer.getClass();
                C25898m d = mo83979d();
                if (d == null) {
                    return false;
                }
                consumer.accept(d.f64558b);
                return true;
            default:
                consumer.getClass();
                C25898m d2 = mo83979d();
                if (d2 == null) {
                    return false;
                }
                consumer.accept(d2.f64559c);
                return true;
        }
    }

    public final Spliterator trySplit() {
        switch (this.f64552i) {
            case 0:
                int i = this.f64570f;
                int i2 = this.f64571g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                C25898m[] mVarArr = this.f64565a;
                int i4 = this.f64572h;
                this.f64571g = i3;
                long j = this.f64553j >>> 1;
                this.f64553j = j;
                return new C25896k(mVarArr, i4, i3, i2, j, 0);
            default:
                int i5 = this.f64570f;
                int i6 = this.f64571g;
                int i7 = (i5 + i6) >>> 1;
                if (i7 <= i5) {
                    return null;
                }
                C25898m[] mVarArr2 = this.f64565a;
                int i8 = this.f64572h;
                this.f64571g = i7;
                long j2 = this.f64553j >>> 1;
                this.f64553j = j2;
                return new C25896k(mVarArr2, i8, i7, i6, j2, 1);
        }
    }
}
