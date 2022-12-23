package p988j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.V */
final class C26113V extends CountedCompleter {

    /* renamed from: a */
    private Spliterator f64830a;

    /* renamed from: b */
    private final C26166g2 f64831b;

    /* renamed from: c */
    private final C26239v0 f64832c;

    /* renamed from: d */
    private long f64833d;

    C26113V(C26113V v, Spliterator spliterator) {
        super(v);
        this.f64830a = spliterator;
        this.f64831b = v.f64831b;
        this.f64833d = v.f64833d;
        this.f64832c = v.f64832c;
    }

    C26113V(C26239v0 v0Var, Spliterator spliterator, C26166g2 g2Var) {
        super((CountedCompleter) null);
        this.f64831b = g2Var;
        this.f64832c = v0Var;
        this.f64830a = spliterator;
        this.f64833d = 0;
    }

    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f64830a;
        long estimateSize = spliterator.estimateSize();
        long j = this.f64833d;
        if (j == 0) {
            j = C26158f.m65405f(estimateSize);
            this.f64833d = j;
        }
        boolean d = C26116V2.SHORT_CIRCUIT.mo84449d(this.f64832c.mo84463X0());
        boolean z = false;
        C26166g2 g2Var = this.f64831b;
        C26113V v = this;
        while (true) {
            if (d && g2Var.mo84149f()) {
                break;
            } else if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                v.f64832c.mo84460O0(spliterator, g2Var);
            } else {
                C26113V v2 = new C26113V(v, trySplit);
                v.addToPendingCount(1);
                if (z) {
                    spliterator = trySplit;
                } else {
                    C26113V v3 = v;
                    v = v2;
                    v2 = v3;
                }
                z = !z;
                v.fork();
                v = v2;
                estimateSize = spliterator.estimateSize();
            }
        }
        v.f64832c.mo84460O0(spliterator, g2Var);
        v.f64830a = null;
        v.propagateCompletion();
    }
}
