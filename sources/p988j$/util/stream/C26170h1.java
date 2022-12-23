package p988j$.util.stream;

import java.util.ArrayDeque;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.h1 */
final class C26170h1 extends C26175i1 {
    C26170h1(C26043E0 e0) {
        super(e0);
    }

    public final void forEachRemaining(Consumer consumer) {
        if (this.f64928a != null) {
            if (this.f64931d == null) {
                Spliterator spliterator = this.f64930c;
                if (spliterator == null) {
                    ArrayDeque e = mo84502e();
                    while (true) {
                        C26043E0 d = C26175i1.m65438d(e);
                        if (d != null) {
                            d.forEach(consumer);
                        } else {
                            this.f64928a = null;
                            return;
                        }
                    }
                } else {
                    spliterator.forEachRemaining(consumer);
                }
            } else {
                do {
                } while (tryAdvance(consumer));
            }
        }
    }

    public final boolean tryAdvance(Consumer consumer) {
        C26043E0 d;
        if (!mo84503f()) {
            return false;
        }
        boolean tryAdvance = this.f64931d.tryAdvance(consumer);
        if (!tryAdvance) {
            if (this.f64930c != null || (d = C26175i1.m65438d(this.f64932e)) == null) {
                this.f64928a = null;
            } else {
                Spliterator spliterator = d.spliterator();
                this.f64931d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
        }
        return tryAdvance;
    }
}
