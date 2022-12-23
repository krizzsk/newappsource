package p988j$.util.stream;

import java.util.Arrays;
import p988j$.lang.Iterable;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.Q2 */
abstract class C26097Q2 extends C26153e implements Iterable, Iterable {

    /* renamed from: e */
    Object f64804e = newArray(16);

    /* renamed from: f */
    Object[] f64805f;

    C26097Q2() {
    }

    C26097Q2(int i) {
        super(i);
    }

    /* renamed from: b */
    public Object mo84357b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            mo84358c(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: c */
    public void mo84358c(int i, Object obj) {
        long j = (long) i;
        long count = count() + j;
        if (count > ((long) mo84329r(obj)) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f64906c == 0) {
            System.arraycopy(this.f64804e, 0, obj, i, this.f64905b);
        } else {
            for (int i2 = 0; i2 < this.f64906c; i2++) {
                Object obj2 = this.f64805f[i2];
                System.arraycopy(obj2, 0, obj, i, mo84329r(obj2));
                i += mo84329r(this.f64805f[i2]);
            }
            int i3 = this.f64905b;
            if (i3 > 0) {
                System.arraycopy(this.f64804e, 0, obj, i, i3);
            }
        }
    }

    public final void clear() {
        Object[] objArr = this.f64805f;
        if (objArr != null) {
            this.f64804e = objArr[0];
            this.f64805f = null;
            this.f64907d = null;
        }
        this.f64905b = 0;
        this.f64906c = 0;
    }

    /* renamed from: h */
    public void mo84360h(Object obj) {
        for (int i = 0; i < this.f64906c; i++) {
            Object obj2 = this.f64805f[i];
            mo84328q(obj2, 0, mo84329r(obj2), obj);
        }
        mo84328q(this.f64804e, 0, this.f64905b, obj);
    }

    public abstract Object newArray(int i);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo84328q(Object obj, int i, int i2, Object obj2);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract int mo84329r(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final int mo84361s(long j) {
        if (this.f64906c == 0) {
            if (j < ((long) this.f64905b)) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else if (j < count()) {
            for (int i = 0; i <= this.f64906c; i++) {
                if (j < this.f64907d[i] + ((long) mo84329r(this.f64805f[i]))) {
                    return i;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
    }

    public abstract Spliterator spliterator();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo84362t(long j) {
        int i = this.f64906c;
        long r = i == 0 ? (long) mo84329r(this.f64804e) : ((long) mo84329r(this.f64805f[i])) + this.f64907d[i];
        if (j > r) {
            if (this.f64805f == null) {
                Object[] u = mo84331u();
                this.f64805f = u;
                this.f64907d = new long[8];
                u[0] = this.f64804e;
            }
            int i2 = this.f64906c;
            while (true) {
                i2++;
                if (j > r) {
                    Object[] objArr = this.f64805f;
                    if (i2 >= objArr.length) {
                        int length = objArr.length * 2;
                        this.f64805f = Arrays.copyOf(objArr, length);
                        this.f64907d = Arrays.copyOf(this.f64907d, length);
                    }
                    int min = 1 << ((i2 == 0 || i2 == 1) ? this.f64904a : Math.min((this.f64904a + i2) - 1, 30));
                    this.f64805f[i2] = newArray(min);
                    long[] jArr = this.f64907d;
                    int i3 = i2 - 1;
                    jArr[i2] = jArr[i3] + ((long) mo84329r(this.f64805f[i3]));
                    r += (long) min;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract Object[] mo84331u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo84363v() {
        long j;
        if (this.f64905b == mo84329r(this.f64804e)) {
            if (this.f64805f == null) {
                Object[] u = mo84331u();
                this.f64805f = u;
                this.f64907d = new long[8];
                u[0] = this.f64804e;
            }
            int i = this.f64906c;
            int i2 = i + 1;
            Object[] objArr = this.f64805f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    j = (long) mo84329r(this.f64804e);
                } else {
                    j = ((long) mo84329r(objArr[i])) + this.f64907d[i];
                }
                mo84362t(j + 1);
            }
            this.f64905b = 0;
            int i3 = this.f64906c + 1;
            this.f64906c = i3;
            this.f64804e = this.f64805f[i3];
        }
    }
}
