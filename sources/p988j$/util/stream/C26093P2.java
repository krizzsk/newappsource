package p988j$.util.stream;

import java.util.Comparator;
import p988j$.util.C25864L;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.P2 */
abstract class C26093P2 implements C25864L {

    /* renamed from: a */
    int f64796a;

    /* renamed from: b */
    final int f64797b;

    /* renamed from: c */
    int f64798c;

    /* renamed from: d */
    final int f64799d;

    /* renamed from: e */
    Object f64800e;

    /* renamed from: f */
    final /* synthetic */ C26097Q2 f64801f;

    static {
        Class<C26100R2> cls = C26100R2.class;
    }

    C26093P2(C26097Q2 q2, int i, int i2, int i3, int i4) {
        this.f64801f = q2;
        this.f64796a = i;
        this.f64797b = i2;
        this.f64798c = i3;
        this.f64799d = i4;
        Object[] objArr = q2.f64805f;
        this.f64800e = objArr == null ? q2.f64804e : objArr[i];
    }

    public final int characteristics() {
        return 16464;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo84324d(int i, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C25864L mo84325e(Object obj, int i, int i2);

    public final long estimateSize() {
        int i = this.f64796a;
        int i2 = this.f64797b;
        if (i == i2) {
            return ((long) this.f64799d) - ((long) this.f64798c);
        }
        long[] jArr = this.f64801f.f64907d;
        return ((jArr[i2] + ((long) this.f64799d)) - jArr[i]) - ((long) this.f64798c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract C25864L mo84326f(int i, int i2, int i3, int i4);

    public final void forEachRemaining(Object obj) {
        int i;
        obj.getClass();
        int i2 = this.f64796a;
        int i3 = this.f64797b;
        if (i2 < i3 || (i2 == i3 && this.f64798c < this.f64799d)) {
            int i4 = this.f64798c;
            while (true) {
                i = this.f64797b;
                if (i2 >= i) {
                    break;
                }
                C26097Q2 q2 = this.f64801f;
                Object obj2 = q2.f64805f[i2];
                q2.mo84328q(obj2, i4, q2.mo84329r(obj2), obj);
                i4 = 0;
                i2++;
            }
            this.f64801f.mo84328q(this.f64796a == i ? this.f64800e : this.f64801f.f64805f[i], i4, this.f64799d, obj);
            this.f64796a = this.f64797b;
            this.f64798c = this.f64799d;
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
        obj.getClass();
        int i = this.f64796a;
        int i2 = this.f64797b;
        if (i >= i2 && (i != i2 || this.f64798c >= this.f64799d)) {
            return false;
        }
        Object obj2 = this.f64800e;
        int i3 = this.f64798c;
        this.f64798c = i3 + 1;
        mo84324d(i3, obj2, obj);
        if (this.f64798c == this.f64801f.mo84329r(this.f64800e)) {
            this.f64798c = 0;
            int i4 = this.f64796a + 1;
            this.f64796a = i4;
            Object[] objArr = this.f64801f.f64805f;
            if (objArr != null && i4 <= this.f64797b) {
                this.f64800e = objArr[i4];
            }
        }
        return true;
    }

    public final C25864L trySplit() {
        int i = this.f64796a;
        int i2 = this.f64797b;
        if (i < i2) {
            int i3 = this.f64798c;
            C26097Q2 q2 = this.f64801f;
            C25864L f = mo84326f(i, i2 - 1, i3, q2.mo84329r(q2.f64805f[i2 - 1]));
            int i4 = this.f64797b;
            this.f64796a = i4;
            this.f64798c = 0;
            this.f64800e = this.f64801f.f64805f[i4];
            return f;
        } else if (i != i2) {
            return null;
        } else {
            int i5 = this.f64799d;
            int i6 = this.f64798c;
            int i7 = (i5 - i6) / 2;
            if (i7 == 0) {
                return null;
            }
            C25864L e = mo84325e(this.f64800e, i6, i7);
            this.f64798c += i7;
            return e;
        }
    }
}
