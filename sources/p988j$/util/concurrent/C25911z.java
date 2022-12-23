package p988j$.util.concurrent;

import java.util.Comparator;
import p988j$.util.C25856D;
import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.z */
final class C25911z implements C25856D {

    /* renamed from: a */
    long f64587a;

    /* renamed from: b */
    final long f64588b;

    /* renamed from: c */
    final double f64589c;

    /* renamed from: d */
    final double f64590d;

    C25911z(long j, long j2, double d, double d2) {
        this.f64587a = j;
        this.f64588b = j2;
        this.f64589c = d;
        this.f64590d = d2;
    }

    /* renamed from: b */
    public final void forEachRemaining(C25981m mVar) {
        mVar.getClass();
        long j = this.f64587a;
        long j2 = this.f64588b;
        if (j < j2) {
            this.f64587a = j2;
            double d = this.f64589c;
            double d2 = this.f64590d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                mVar.accept(current.mo83917c(d, d2));
                j++;
            } while (j < j2);
        }
    }

    public final int characteristics() {
        return 17728;
    }

    /* renamed from: d */
    public final C25911z trySplit() {
        long j = this.f64587a;
        long j2 = (this.f64588b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f64587a = j2;
        return new C25911z(j, j2, this.f64589c, this.f64590d);
    }

    public final long estimateSize() {
        return this.f64588b - this.f64587a;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64889d(this, consumer);
    }

    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    /* renamed from: h */
    public final boolean tryAdvance(C25981m mVar) {
        mVar.getClass();
        long j = this.f64587a;
        if (j >= this.f64588b) {
            return false;
        }
        mVar.accept(ThreadLocalRandom.current().mo83917c(this.f64589c, this.f64590d));
        this.f64587a = j + 1;
        return true;
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64892g(this, consumer);
    }
}
