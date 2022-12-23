package p988j$.util.concurrent;

import java.util.Comparator;
import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.concurrent.A */
final class C25884A implements Spliterator.OfInt {

    /* renamed from: a */
    long f64529a;

    /* renamed from: b */
    final long f64530b;

    /* renamed from: c */
    final int f64531c;

    /* renamed from: d */
    final int f64532d;

    C25884A(long j, long j2, int i, int i2) {
        this.f64529a = j;
        this.f64530b = j2;
        this.f64531c = i;
        this.f64532d = i2;
    }

    public final int characteristics() {
        return 17728;
    }

    /* renamed from: d */
    public final C25884A trySplit() {
        long j = this.f64529a;
        long j2 = (this.f64530b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f64529a = j2;
        return new C25884A(j, j2, this.f64531c, this.f64532d);
    }

    public final long estimateSize() {
        return this.f64530b - this.f64529a;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64890e(this, consumer);
    }

    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f64529a;
        long j2 = this.f64530b;
        if (j < j2) {
            this.f64529a = j2;
            int i = this.f64531c;
            int i2 = this.f64532d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                intConsumer.accept(current.mo83918d(i, i2));
                j++;
            } while (j < j2);
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

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64893i(this, consumer);
    }

    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f64529a;
        if (j >= this.f64530b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().mo83918d(this.f64531c, this.f64532d));
        this.f64529a = j + 1;
        return true;
    }
}
