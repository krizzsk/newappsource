package p988j$.util.stream;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.I2 */
final class C26065I2 implements Spliterator {

    /* renamed from: a */
    int f64758a;

    /* renamed from: b */
    final int f64759b;

    /* renamed from: c */
    int f64760c;

    /* renamed from: d */
    final int f64761d;

    /* renamed from: e */
    Object[] f64762e;

    /* renamed from: f */
    final /* synthetic */ C26100R2 f64763f;

    static {
        Class<C26100R2> cls = C26100R2.class;
    }

    C26065I2(C26100R2 r2, int i, int i2, int i3, int i4) {
        this.f64763f = r2;
        this.f64758a = i;
        this.f64759b = i2;
        this.f64760c = i3;
        this.f64761d = i4;
        Object[][] objArr = r2.f64810f;
        this.f64762e = objArr == null ? r2.f64809e : objArr[i];
    }

    public final int characteristics() {
        return 16464;
    }

    public final long estimateSize() {
        int i = this.f64758a;
        int i2 = this.f64759b;
        if (i == i2) {
            return ((long) this.f64761d) - ((long) this.f64760c);
        }
        long[] jArr = this.f64763f.f64907d;
        return ((jArr[i2] + ((long) this.f64761d)) - jArr[i]) - ((long) this.f64760c);
    }

    public final void forEachRemaining(Consumer consumer) {
        int i;
        consumer.getClass();
        int i2 = this.f64758a;
        int i3 = this.f64759b;
        if (i2 < i3 || (i2 == i3 && this.f64760c < this.f64761d)) {
            int i4 = this.f64760c;
            while (true) {
                i = this.f64759b;
                if (i2 >= i) {
                    break;
                }
                Object[] objArr = this.f64763f.f64810f[i2];
                while (i4 < objArr.length) {
                    consumer.accept(objArr[i4]);
                    i4++;
                }
                i4 = 0;
                i2++;
            }
            Object[] objArr2 = this.f64758a == i ? this.f64762e : this.f64763f.f64810f[i];
            int i5 = this.f64761d;
            while (i4 < i5) {
                consumer.accept(objArr2[i4]);
                i4++;
            }
            this.f64758a = this.f64759b;
            this.f64760c = this.f64761d;
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
        int i = this.f64758a;
        int i2 = this.f64759b;
        if (i >= i2 && (i != i2 || this.f64760c >= this.f64761d)) {
            return false;
        }
        Object[] objArr = this.f64762e;
        int i3 = this.f64760c;
        this.f64760c = i3 + 1;
        consumer.accept(objArr[i3]);
        if (this.f64760c == this.f64762e.length) {
            this.f64760c = 0;
            int i4 = this.f64758a + 1;
            this.f64758a = i4;
            Object[][] objArr2 = this.f64763f.f64810f;
            if (objArr2 != null && i4 <= this.f64759b) {
                this.f64762e = objArr2[i4];
            }
        }
        return true;
    }

    public final Spliterator trySplit() {
        int i = this.f64758a;
        int i2 = this.f64759b;
        if (i < i2) {
            C26100R2 r2 = this.f64763f;
            int i3 = i2 - 1;
            C26065I2 i22 = new C26065I2(r2, i, i3, this.f64760c, r2.f64810f[i3].length);
            int i4 = this.f64759b;
            this.f64758a = i4;
            this.f64760c = 0;
            this.f64762e = this.f64763f.f64810f[i4];
            return i22;
        } else if (i != i2) {
            return null;
        } else {
            int i5 = this.f64761d;
            int i6 = this.f64760c;
            int i7 = (i5 - i6) / 2;
            if (i7 == 0) {
                return null;
            }
            Spliterator l = Spliterators.m64712l(this.f64762e, i6, i6 + i7);
            this.f64760c += i7;
            return l;
        }
    }
}
