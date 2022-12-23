package p988j$.util.function;

import java.util.function.DoublePredicate;

/* renamed from: j$.util.function.r */
public final /* synthetic */ class C25991r implements DoublePredicate {

    /* renamed from: a */
    final /* synthetic */ C25993s f64670a;

    private /* synthetic */ C25991r(C25993s sVar) {
        this.f64670a = sVar;
    }

    /* renamed from: a */
    public static /* synthetic */ DoublePredicate m64842a(C25993s sVar) {
        if (sVar == null) {
            return null;
        }
        return sVar instanceof C25989q ? ((C25989q) sVar).f64669a : new C25991r(sVar);
    }

    public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
        return m64842a(((C25989q) this.f64670a).mo84083a(C25989q.m64837b(doublePredicate)));
    }

    public final /* synthetic */ DoublePredicate negate() {
        return m64842a(((C25989q) this.f64670a).mo84084c());
    }

    /* renamed from: or */
    public final /* synthetic */ DoublePredicate mo84089or(DoublePredicate doublePredicate) {
        return m64842a(((C25989q) this.f64670a).mo84085d(C25989q.m64837b(doublePredicate)));
    }

    public final /* synthetic */ boolean test(double d) {
        return ((C25989q) this.f64670a).mo84086e(d);
    }
}
