package p988j$.util.concurrent;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.g */
final class C25892g extends C25902q implements Spliterator {

    /* renamed from: i */
    final ConcurrentHashMap f64548i;

    /* renamed from: j */
    long f64549j;

    C25892g(C25898m[] mVarArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(mVarArr, i, i2, i3);
        this.f64548i = concurrentHashMap;
        this.f64549j = j;
    }

    public final int characteristics() {
        return 4353;
    }

    public final long estimateSize() {
        return this.f64549j;
    }

    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            C25898m d = mo83979d();
            if (d != null) {
                consumer.accept(new C25897l(d.f64558b, d.f64559c, this.f64548i));
            } else {
                return;
            }
        }
    }

    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        C25898m d = mo83979d();
        if (d == null) {
            return false;
        }
        consumer.accept(new C25897l(d.f64558b, d.f64559c, this.f64548i));
        return true;
    }

    public final Spliterator trySplit() {
        int i = this.f64570f;
        int i2 = this.f64571g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        C25898m[] mVarArr = this.f64565a;
        int i4 = this.f64572h;
        this.f64571g = i3;
        long j = this.f64549j >>> 1;
        this.f64549j = j;
        return new C25892g(mVarArr, i4, i3, i2, j, this.f64548i);
    }
}
