package p988j$.util.stream;

import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.P0 */
abstract class C26091P0 extends C26053G0 implements C26038D0 {
    C26091P0(C26038D0 d0, C26038D0 d02) {
        super(d0, d02);
    }

    /* renamed from: b */
    public final Object mo84199b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            mo84200c(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: c */
    public final void mo84200c(int i, Object obj) {
        ((C26038D0) this.f64735a).mo84200c(i, obj);
        ((C26038D0) this.f64736b).mo84200c(i + ((int) ((C26038D0) this.f64735a).count()), obj);
    }

    /* renamed from: h */
    public final void mo84201h(Object obj) {
        ((C26038D0) this.f64735a).mo84201h(obj);
        ((C26038D0) this.f64736b).mo84201h(obj);
    }

    /* renamed from: o */
    public final /* synthetic */ Object[] mo84245o(IntFunction intFunction) {
        return C26239v0.m65675u0(this, intFunction);
    }

    public final String toString() {
        if (count() < 32) {
            return String.format("%s[%s.%s]", new Object[]{getClass().getName(), this.f64735a, this.f64736b});
        }
        return String.format("%s[size=%d]", new Object[]{getClass().getName(), Long.valueOf(count())});
    }
}
