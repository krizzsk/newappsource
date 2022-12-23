package p988j$.util.function;

import p988j$.util.function.Predicate;

/* renamed from: j$.util.function.E0 */
public final /* synthetic */ class C25924E0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f64611a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f64612b;

    /* renamed from: c */
    public final /* synthetic */ Predicate f64613c;

    public /* synthetic */ C25924E0(Predicate predicate, Predicate predicate2, int i) {
        this.f64611a = i;
        this.f64612b = predicate;
        this.f64613c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f64611a) {
            case 0:
                return Predicate.CC.$default$and(this, predicate);
            default:
                return Predicate.CC.$default$and(this, predicate);
        }
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f64611a) {
            case 0:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo43234or(Predicate predicate) {
        switch (this.f64611a) {
            case 0:
                return Predicate.CC.$default$or(this, predicate);
            default:
                return Predicate.CC.$default$or(this, predicate);
        }
    }

    public final boolean test(Object obj) {
        switch (this.f64611a) {
            case 0:
                return this.f64612b.test(obj) && this.f64613c.test(obj);
            default:
                return this.f64612b.test(obj) || this.f64613c.test(obj);
        }
    }
}
