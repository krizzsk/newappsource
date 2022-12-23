package p988j$.util.concurrent;

import java.util.Comparator;
import p988j$.util.C25861I;
import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.B */
final class C25885B implements C25861I {

    /* renamed from: a */
    long f64533a;

    /* renamed from: b */
    final long f64534b;

    /* renamed from: c */
    final long f64535c;

    /* renamed from: d */
    final long f64536d;

    C25885B(long j, long j2, long j3, long j4) {
        this.f64533a = j;
        this.f64534b = j2;
        this.f64535c = j3;
        this.f64536d = j4;
    }

    /* renamed from: a */
    public final void forEachRemaining(C25966e0 e0Var) {
        e0Var.getClass();
        long j = this.f64533a;
        long j2 = this.f64534b;
        if (j < j2) {
            this.f64533a = j2;
            long j3 = this.f64535c;
            long j4 = this.f64536d;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                e0Var.accept(current.mo83923e(j3, j4));
                j++;
            } while (j < j2);
        }
    }

    /* renamed from: c */
    public final boolean tryAdvance(C25966e0 e0Var) {
        e0Var.getClass();
        long j = this.f64533a;
        if (j >= this.f64534b) {
            return false;
        }
        e0Var.accept(ThreadLocalRandom.current().mo83923e(this.f64535c, this.f64536d));
        this.f64533a = j + 1;
        return true;
    }

    public final int characteristics() {
        return 17728;
    }

    /* renamed from: d */
    public final C25885B trySplit() {
        long j = this.f64533a;
        long j2 = (this.f64534b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f64533a = j2;
        return new C25885B(j, j2, this.f64535c, this.f64536d);
    }

    public final long estimateSize() {
        return this.f64534b - this.f64533a;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64891f(this, consumer);
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
        return C26016n.m64894j(this, consumer);
    }
}
