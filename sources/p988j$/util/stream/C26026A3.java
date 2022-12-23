package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.A3 */
final class C26026A3 extends C26120W2 {
    C26026A3(C26239v0 v0Var, Spliterator spliterator, boolean z) {
        super(v0Var, spliterator, z);
    }

    C26026A3(C26239v0 v0Var, C26133a aVar, boolean z) {
        super(v0Var, aVar, z);
    }

    public final void forEachRemaining(Consumer consumer) {
        if (this.f64865h != null || this.f64866i) {
            do {
            } while (tryAdvance(consumer));
            return;
        }
        consumer.getClass();
        mo84453f();
        this.f64859b.mo84464g1(this.f64861d, new C26262z3(consumer, 1));
        this.f64866i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo84143g() {
        C26100R2 r2 = new C26100R2();
        this.f64865h = r2;
        this.f64862e = this.f64859b.mo84465h1(new C26262z3(r2, 0));
        this.f64863f = new C26133a(7, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C26120W2 mo84144i(Spliterator spliterator) {
        return new C26026A3(this.f64859b, spliterator, this.f64858a);
    }

    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean d = mo84452d();
        if (d) {
            C26100R2 r2 = (C26100R2) this.f64865h;
            long j = this.f64864g;
            if (r2.f64906c == 0) {
                if (j < ((long) r2.f64905b)) {
                    obj = r2.f64809e[(int) j];
                } else {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
            } else if (j < r2.count()) {
                int i = 0;
                while (i <= r2.f64906c) {
                    long j2 = r2.f64907d[i];
                    Object[] objArr = r2.f64810f[i];
                    if (j < ((long) objArr.length) + j2) {
                        obj = objArr[(int) (j - j2)];
                    } else {
                        i++;
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            consumer.accept(obj);
        }
        return d;
    }
}
