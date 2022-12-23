package p988j$.util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p988j$.lang.Iterable;
import p988j$.time.C25783b;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.R2 */
class C26100R2 extends C26153e implements Consumer, Iterable, Iterable {

    /* renamed from: e */
    protected Object[] f64809e = new Object[(1 << 4)];

    /* renamed from: f */
    protected Object[][] f64810f;

    C26100R2() {
    }

    public void accept(Object obj) {
        long j;
        int i = this.f64905b;
        Object[] objArr = this.f64809e;
        if (i == objArr.length) {
            if (this.f64810f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f64810f = objArr2;
                this.f64907d = new long[8];
                objArr2[0] = objArr;
            }
            int i2 = this.f64906c;
            int i3 = i2 + 1;
            Object[][] objArr3 = this.f64810f;
            if (i3 >= objArr3.length || objArr3[i3] == null) {
                if (i2 == 0) {
                    j = (long) objArr.length;
                } else {
                    j = ((long) objArr3[i2].length) + this.f64907d[i2];
                }
                mo84367q(j + 1);
            }
            this.f64905b = 0;
            int i4 = this.f64906c + 1;
            this.f64906c = i4;
            this.f64809e = this.f64810f[i4];
        }
        Object[] objArr4 = this.f64809e;
        int i5 = this.f64905b;
        this.f64905b = i5 + 1;
        objArr4[i5] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void clear() {
        Object[][] objArr = this.f64810f;
        if (objArr != null) {
            this.f64809e = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.f64809e;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.f64810f = null;
            this.f64907d = null;
        } else {
            for (int i2 = 0; i2 < this.f64905b; i2++) {
                this.f64809e[i2] = null;
            }
        }
        this.f64905b = 0;
        this.f64906c = 0;
    }

    public void forEach(Consumer consumer) {
        for (int i = 0; i < this.f64906c; i++) {
            for (Object accept : this.f64810f[i]) {
                consumer.accept(accept);
            }
        }
        for (int i2 = 0; i2 < this.f64905b; i2++) {
            consumer.accept(this.f64809e[i2]);
        }
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final Iterator iterator() {
        return Spliterators.m64709i(spliterator());
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo84367q(long j) {
        int i = this.f64906c;
        long length = i == 0 ? (long) this.f64809e.length : ((long) this.f64810f[i].length) + this.f64907d[i];
        if (j > length) {
            if (this.f64810f == null) {
                Object[][] objArr = new Object[8][];
                this.f64810f = objArr;
                this.f64907d = new long[8];
                objArr[0] = this.f64809e;
            }
            while (true) {
                i++;
                if (j > length) {
                    Object[][] objArr2 = this.f64810f;
                    if (i >= objArr2.length) {
                        int length2 = objArr2.length * 2;
                        this.f64810f = (Object[][]) Arrays.copyOf(objArr2, length2);
                        this.f64907d = Arrays.copyOf(this.f64907d, length2);
                    }
                    int min = 1 << ((i == 0 || i == 1) ? this.f64904a : Math.min((this.f64904a + i) - 1, 30));
                    Object[][] objArr3 = this.f64810f;
                    objArr3[i] = new Object[min];
                    long[] jArr = this.f64907d;
                    int i2 = i - 1;
                    jArr[i] = jArr[i2] + ((long) objArr3[i2].length);
                    length += (long) min;
                } else {
                    return;
                }
            }
        }
    }

    public Spliterator spliterator() {
        return new C26065I2(this, 0, this.f64906c, 0, this.f64905b);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        forEach((Consumer) new C26133a(8, arrayList));
        StringBuilder a = C25783b.m64414a("SpinedBuffer:");
        a.append(arrayList.toString());
        return a.toString();
    }
}
