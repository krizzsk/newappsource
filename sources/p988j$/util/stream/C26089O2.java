package p988j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p988j$.util.C25861I;
import p988j$.util.Spliterators;
import p988j$.util.function.C25960b0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.O2 */
class C26089O2 extends C26097Q2 implements C25966e0 {
    C26089O2() {
    }

    C26089O2(int i) {
        super(i);
    }

    public void accept(long j) {
        mo84363v();
        int i = this.f64905b;
        this.f64905b = i + 1;
        ((long[]) this.f64804e)[i] = j;
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof C25966e0) {
            mo84360h((C25966e0) consumer);
        } else if (!C26061H3.f64754a) {
            spliterator().forEachRemaining(consumer);
        } else {
            C26061H3.m65025a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        }
    }

    /* renamed from: g */
    public final C25966e0 mo83884g(C25966e0 e0Var) {
        e0Var.getClass();
        return new C25960b0(this, e0Var);
    }

    public final Iterator iterator() {
        return Spliterators.m64708h(spliterator());
    }

    public final Object newArray(int i) {
        return new long[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo84328q(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        C25966e0 e0Var = (C25966e0) obj2;
        while (i < i2) {
            e0Var.accept(jArr[i]);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo84329r(Object obj) {
        return ((long[]) obj).length;
    }

    public final String toString() {
        long[] jArr = (long[]) mo84357b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f64906c), Arrays.toString(jArr)});
        }
        return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f64906c), Arrays.toString(Arrays.copyOf(jArr, 200))});
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final Object[] mo84331u() {
        return new long[8][];
    }

    /* renamed from: w */
    public C25861I spliterator() {
        return new C26085N2(this, 0, this.f64906c, 0, this.f64905b);
    }
}
