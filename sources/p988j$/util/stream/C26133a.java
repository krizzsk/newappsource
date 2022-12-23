package p988j$.util.stream;

import java.util.List;
import p988j$.util.Spliterator;
import p988j$.util.function.C25972h0;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.a */
public final /* synthetic */ class C26133a implements Supplier, C25972h0, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f64875a;

    /* renamed from: b */
    public final /* synthetic */ Object f64876b;

    public /* synthetic */ C26133a(int i, Object obj) {
        this.f64875a = i;
        this.f64876b = obj;
    }

    public final void accept(Object obj) {
        switch (this.f64875a) {
            case 3:
                ((C26166g2) this.f64876b).accept(obj);
                return;
            default:
                ((List) this.f64876b).add(obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f64875a) {
            case 3:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final Object apply(long j) {
        int i = C26071K0.f64771k;
        return C26239v0.m65648I0(j, (IntFunction) this.f64876b);
    }

    public final Object get() {
        switch (this.f64875a) {
            case 0:
                return (Spliterator) this.f64876b;
            default:
                return ((C26143c) this.f64876b).mo84471q1();
        }
    }
}
