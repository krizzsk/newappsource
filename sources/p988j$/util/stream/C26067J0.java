package p988j$.util.stream;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p988j$.util.C25914f;
import p988j$.util.C26009g;
import p988j$.util.C26010h;
import p988j$.util.C26012j;
import p988j$.util.C26014l;
import p988j$.util.Optional;
import p988j$.util.concurrent.C25906u;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.BiFunction;
import p988j$.util.function.C25948Q0;
import p988j$.util.function.C25967f;
import p988j$.util.function.C25972h0;
import p988j$.util.function.C25973i;
import p988j$.util.function.C25987p;
import p988j$.util.function.C26004x0;
import p988j$.util.function.Consumer;
import p988j$.util.function.Function;
import p988j$.util.function.IntFunction;
import p988j$.util.function.Predicate;
import p988j$.util.function.Supplier;

/* renamed from: j$.util.stream.J0 */
public final /* synthetic */ class C26067J0 implements C25967f, C25972h0, IntFunction, C25948Q0, Consumer, Supplier, BiConsumer, C25973i, C25987p, C26004x0, Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f64766a;

    public /* synthetic */ C26067J0(int i) {
        this.f64766a = i;
    }

    public final void accept(Object obj) {
    }

    public final void accept(Object obj, double d) {
        ((C25914f) obj).accept(d);
    }

    public final void accept(Object obj, Object obj2) {
        switch (this.f64766a) {
            case 17:
                ((List) obj).add(obj2);
                return;
            case 20:
                ((LinkedHashSet) obj).add(obj2);
                return;
            case 21:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            default:
                ((C25914f) obj).mo84006a((C25914f) obj2);
                return;
        }
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f64766a) {
            case 27:
                return Predicate.CC.$default$and(this, predicate);
            case 28:
                return Predicate.CC.$default$and(this, predicate);
            default:
                return Predicate.CC.$default$and(this, predicate);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f64766a) {
            case 17:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 20:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            case 21:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
            default:
                return BiConsumer.CC.$default$andThen(this, biConsumer);
        }
    }

    public final BiFunction andThen(Function function) {
        switch (this.f64766a) {
            case 0:
                function.getClass();
                return new C25906u(this, function);
            case 2:
                function.getClass();
                return new C25906u(this, function);
            case 4:
                function.getClass();
                return new C25906u(this, function);
            default:
                function.getClass();
                return new C25906u(this, function);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f64766a) {
            case 12:
                return Consumer.CC.$default$andThen(this, consumer);
            default:
                return Consumer.CC.$default$andThen(this, consumer);
        }
    }

    public final Object apply(double d) {
        return Double.valueOf(d);
    }

    public final Object apply(int i) {
        switch (this.f64766a) {
            case 6:
                int i2 = C26127Y1.f64871s;
                return new Object[i];
            case 8:
                return new Object[i];
            case 9:
                int i3 = C26186k2.f64946v;
                return new Integer[i];
            case 10:
                int i4 = C26196m2.f64961v;
                return new Long[i];
            default:
                int i5 = C26206o2.f64979v;
                return new Double[i];
        }
    }

    public final Object apply(long j) {
        switch (this.f64766a) {
            case 1:
                return C26239v0.m65660Y0(j);
            default:
                return C26239v0.m65661Z0(j);
        }
    }

    public final Object apply(Object obj, Object obj2) {
        switch (this.f64766a) {
            case 0:
                return new C26079M0((C26023A0) obj, (C26023A0) obj2);
            case 2:
                return new C26083N0((C26028B0) obj, (C26028B0) obj2);
            case 4:
                return new C26087O0((C26033C0) obj, (C26033C0) obj2);
            default:
                return new C26095Q0((C26043E0) obj, (C26043E0) obj2);
        }
    }

    public final double applyAsDouble(double d, double d2) {
        switch (this.f64766a) {
            case 22:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    public final long applyAsLong(Object obj) {
        int i = C26127Y1.f64871s;
        return 1;
    }

    public final Object get() {
        switch (this.f64766a) {
            case 14:
                return new C25914f();
            case 15:
                return new C26009g();
            case 16:
                return new ArrayList();
            case 18:
                return new C26010h();
            default:
                return new LinkedHashSet();
        }
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f64766a) {
            case 27:
                return Predicate.CC.$default$negate(this);
            case 28:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo43234or(Predicate predicate) {
        switch (this.f64766a) {
            case 27:
                return Predicate.CC.$default$or(this, predicate);
            case 28:
                return Predicate.CC.$default$or(this, predicate);
            default:
                return Predicate.CC.$default$or(this, predicate);
        }
    }

    public final boolean test(Object obj) {
        switch (this.f64766a) {
            case 27:
                return ((C26012j) obj).mo84112c();
            case 28:
                return ((C26014l) obj).mo84122c();
            default:
                return ((Optional) obj).mo83878c();
        }
    }
}
