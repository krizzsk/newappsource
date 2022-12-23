package p988j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p988j$.util.C25856D;
import p988j$.util.Spliterators;
import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.K2 */
class C26073K2 extends C26097Q2 implements C25981m {
    C26073K2() {
    }

    C26073K2(int i) {
        super(i);
    }

    public void accept(double d) {
        mo84363v();
        int i = this.f64905b;
        this.f64905b = i + 1;
        ((double[]) this.f64804e)[i] = d;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof C25981m) {
            mo84360h((C25981m) consumer);
        } else if (!C26061H3.f64754a) {
            spliterator().forEachRemaining(consumer);
        } else {
            C26061H3.m65025a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        }
    }

    public final Iterator iterator() {
        return Spliterators.m64706f(spliterator());
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        mVar.getClass();
        return new C25975j(this, mVar);
    }

    public final Object newArray(int i) {
        return new double[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo84328q(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        C25981m mVar = (C25981m) obj2;
        while (i < i2) {
            mVar.accept(dArr[i]);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo84329r(Object obj) {
        return ((double[]) obj).length;
    }

    public final String toString() {
        double[] dArr = (double[]) mo84357b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f64906c), Arrays.toString(dArr)});
        }
        return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f64906c), Arrays.toString(Arrays.copyOf(dArr, 200))});
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Object[] mo84331u() {
        return new double[8][];
    }

    /* renamed from: w */
    public C25856D spliterator() {
        return new C26069J2(this, 0, this.f64906c, 0, this.f64905b);
    }
}
