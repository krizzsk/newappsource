package p988j$.util.stream;

import java.util.ArrayDeque;
import java.util.Comparator;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.i1 */
abstract class C26175i1 implements Spliterator {

    /* renamed from: a */
    C26043E0 f64928a;

    /* renamed from: b */
    int f64929b;

    /* renamed from: c */
    Spliterator f64930c;

    /* renamed from: d */
    Spliterator f64931d;

    /* renamed from: e */
    ArrayDeque f64932e;

    C26175i1(C26043E0 e0) {
        this.f64928a = e0;
    }

    /* renamed from: d */
    protected static C26043E0 m65438d(ArrayDeque arrayDeque) {
        while (true) {
            C26043E0 e0 = (C26043E0) arrayDeque.pollFirst();
            if (e0 != null) {
                if (e0.mo84244n() != 0) {
                    int n = e0.mo84244n();
                    while (true) {
                        n--;
                        if (n < 0) {
                            break;
                        }
                        arrayDeque.addFirst(e0.mo84198a(n));
                    }
                } else if (e0.count() > 0) {
                    return e0;
                }
            } else {
                return null;
            }
        }
    }

    public final int characteristics() {
        return 64;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final ArrayDeque mo84502e() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int n = this.f64928a.mo84244n();
        while (true) {
            n--;
            if (n < this.f64929b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f64928a.mo84198a(n));
        }
    }

    public final long estimateSize() {
        long j = 0;
        if (this.f64928a == null) {
            return 0;
        }
        Spliterator spliterator = this.f64930c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.f64929b; i < this.f64928a.mo84244n(); i++) {
            j += this.f64928a.mo84198a(i).count();
        }
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo84503f() {
        if (this.f64928a == null) {
            return false;
        }
        if (this.f64931d != null) {
            return true;
        }
        Spliterator spliterator = this.f64930c;
        if (spliterator == null) {
            ArrayDeque e = mo84502e();
            this.f64932e = e;
            C26043E0 d = m65438d(e);
            if (d != null) {
                spliterator = d.spliterator();
            } else {
                this.f64928a = null;
                return false;
            }
        }
        this.f64931d = spliterator;
        return true;
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

    public final Spliterator trySplit() {
        C26043E0 e0 = this.f64928a;
        if (e0 == null || this.f64931d != null) {
            return null;
        }
        Spliterator spliterator = this.f64930c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f64929b < e0.mo84244n() - 1) {
            C26043E0 e02 = this.f64928a;
            int i = this.f64929b;
            this.f64929b = i + 1;
            return e02.mo84198a(i).spliterator();
        }
        C26043E0 a = this.f64928a.mo84198a(this.f64929b);
        this.f64928a = a;
        if (a.mo84244n() == 0) {
            Spliterator spliterator2 = this.f64928a.spliterator();
            this.f64930c = spliterator2;
            return spliterator2.trySplit();
        }
        C26043E0 e03 = this.f64928a;
        this.f64929b = 0 + 1;
        return e03.mo84198a(0).spliterator();
    }
}
