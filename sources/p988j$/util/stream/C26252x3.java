package p988j$.util.stream;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.x3 */
final class C26252x3 extends C26257y3 implements Spliterator, Consumer {

    /* renamed from: e */
    Object f65060e;

    C26252x3(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2);
    }

    C26252x3(Spliterator spliterator, C26252x3 x3Var) {
        super(spliterator, x3Var);
    }

    public final void accept(Object obj) {
        this.f65060e = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        C26142b3 b3Var = null;
        while (true) {
            int o = mo84607o();
            if (o == 1) {
                return;
            }
            if (o == 2) {
                if (b3Var == null) {
                    b3Var = new C26142b3();
                } else {
                    b3Var.f64896a = 0;
                }
                long j = 0;
                while (this.f65065a.tryAdvance(b3Var)) {
                    j++;
                    if (j >= 128) {
                        break;
                    }
                }
                if (j != 0) {
                    long j2 = mo84606j(j);
                    for (int i = 0; ((long) i) < j2; i++) {
                        consumer.accept(b3Var.f64883b[i]);
                    }
                } else {
                    return;
                }
            } else {
                this.f65065a.forEachRemaining(consumer);
                return;
            }
        }
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

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Spliterator mo84592n(Spliterator spliterator) {
        return new C26252x3(spliterator, this);
    }

    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        while (mo84607o() != 1 && this.f65065a.tryAdvance(this)) {
            if (mo84606j(1) == 1) {
                consumer.accept(this.f65060e);
                this.f65060e = null;
                return true;
            }
        }
        return false;
    }
}
