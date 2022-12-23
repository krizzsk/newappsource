package p988j$.util.stream;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.r3 */
final class C26222r3 extends C26227s3 implements Spliterator {
    C26222r3(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2, 0, Math.min(spliterator.estimateSize(), j2));
    }

    private C26222r3(Spliterator spliterator, long j, long j2, long j3, long j4) {
        super(spliterator, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Spliterator mo84578d(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C26222r3(spliterator, j, j2, j3, j4);
    }

    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        long j = this.f65015a;
        long j2 = this.f65019e;
        if (j < j2) {
            long j3 = this.f65018d;
            if (j3 < j2) {
                if (j3 < j || this.f65017c.estimateSize() + j3 > this.f65016b) {
                    while (this.f65015a > this.f65018d) {
                        this.f65017c.tryAdvance(new C26067J0(12));
                        this.f65018d++;
                    }
                    while (this.f65018d < this.f65019e) {
                        this.f65017c.tryAdvance(consumer);
                        this.f65018d++;
                    }
                    return;
                }
                this.f65017c.forEachRemaining(consumer);
                this.f65018d = this.f65019e;
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
        long j;
        consumer.getClass();
        if (this.f65015a >= this.f65019e) {
            return false;
        }
        while (true) {
            long j2 = this.f65015a;
            j = this.f65018d;
            if (j2 <= j) {
                break;
            }
            this.f65017c.tryAdvance(new C26067J0(13));
            this.f65018d++;
        }
        if (j >= this.f65019e) {
            return false;
        }
        this.f65018d = j + 1;
        return this.f65017c.tryAdvance(consumer);
    }
}
