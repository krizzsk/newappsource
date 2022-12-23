package p988j$.util.function;

import java.util.Comparator;
import p988j$.util.concurrent.C25906u;
import p988j$.util.function.Predicate;

/* renamed from: j$.util.function.c */
public final /* synthetic */ class C25961c implements C25967f, Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f64647a;

    /* renamed from: b */
    public final /* synthetic */ Object f64648b;

    public /* synthetic */ C25961c(int i, Object obj) {
        this.f64647a = i;
        this.f64648b = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final BiFunction andThen(Function function) {
        switch (this.f64647a) {
            case 0:
                function.getClass();
                return new C25906u(this, function);
            default:
                function.getClass();
                return new C25906u(this, function);
        }
    }

    public final Object apply(Object obj, Object obj2) {
        switch (this.f64647a) {
            case 0:
                return ((Comparator) this.f64648b).compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return ((Comparator) this.f64648b).compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo43234or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return !((Predicate) this.f64648b).test(obj);
    }
}
