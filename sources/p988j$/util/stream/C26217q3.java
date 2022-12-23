package p988j$.util.stream;

import java.util.Comparator;
import p988j$.util.C25864L;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.q3 */
abstract class C26217q3 extends C26227s3 implements C25864L {
    C26217q3(C25864L l, long j, long j2) {
        super(l, j, j2, 0, Math.min(l.estimateSize(), j2));
    }

    C26217q3(C25864L l, long j, long j2, long j3, long j4) {
        super(l, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract Object mo84579e();

    public final void forEachRemaining(Object obj) {
        obj.getClass();
        long j = this.f65015a;
        long j2 = this.f65019e;
        if (j < j2) {
            long j3 = this.f65018d;
            if (j3 < j2) {
                if (j3 < j || ((C25864L) this.f65017c).estimateSize() + j3 > this.f65016b) {
                    while (this.f65015a > this.f65018d) {
                        ((C25864L) this.f65017c).tryAdvance(mo84579e());
                        this.f65018d++;
                    }
                    while (this.f65018d < this.f65019e) {
                        ((C25864L) this.f65017c).tryAdvance(obj);
                        this.f65018d++;
                    }
                    return;
                }
                ((C25864L) this.f65017c).forEachRemaining(obj);
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

    public final boolean tryAdvance(Object obj) {
        long j;
        obj.getClass();
        if (this.f65015a >= this.f65019e) {
            return false;
        }
        while (true) {
            long j2 = this.f65015a;
            j = this.f65018d;
            if (j2 <= j) {
                break;
            }
            ((C25864L) this.f65017c).tryAdvance(mo84579e());
            this.f65018d++;
        }
        if (j >= this.f65019e) {
            return false;
        }
        this.f65018d = j + 1;
        return ((C25864L) this.f65017c).tryAdvance(obj);
    }
}
