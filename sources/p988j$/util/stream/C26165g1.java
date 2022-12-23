package p988j$.util.stream;

import java.util.ArrayDeque;
import p988j$.util.C25864L;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.g1 */
abstract class C26165g1 extends C26175i1 implements C25864L {
    C26165g1(C26038D0 d0) {
        super(d0);
    }

    public final void forEachRemaining(Object obj) {
        if (this.f64928a != null) {
            if (this.f64931d == null) {
                Spliterator spliterator = this.f64930c;
                if (spliterator == null) {
                    ArrayDeque e = mo84502e();
                    while (true) {
                        C26038D0 d0 = (C26038D0) C26175i1.m65438d(e);
                        if (d0 != null) {
                            d0.mo84201h(obj);
                        } else {
                            this.f64928a = null;
                            return;
                        }
                    }
                } else {
                    ((C25864L) spliterator).forEachRemaining(obj);
                }
            } else {
                do {
                } while (tryAdvance(obj));
            }
        }
    }

    public final boolean tryAdvance(Object obj) {
        C26038D0 d0;
        if (!mo84503f()) {
            return false;
        }
        boolean tryAdvance = ((C25864L) this.f64931d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f64930c != null || (d0 = (C26038D0) C26175i1.m65438d(this.f64932e)) == null) {
                this.f64928a = null;
            } else {
                C25864L spliterator = d0.spliterator();
                this.f64931d = spliterator;
                return spliterator.tryAdvance(obj);
            }
        }
        return tryAdvance;
    }
}
