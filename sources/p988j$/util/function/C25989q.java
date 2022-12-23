package p988j$.util.function;

import java.util.function.DoublePredicate;

/* renamed from: j$.util.function.q */
public final /* synthetic */ class C25989q implements C25993s {

    /* renamed from: a */
    final /* synthetic */ DoublePredicate f64669a;

    private /* synthetic */ C25989q(DoublePredicate doublePredicate) {
        this.f64669a = doublePredicate;
    }

    /* renamed from: b */
    public static /* synthetic */ C25993s m64837b(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return doublePredicate instanceof C25991r ? ((C25991r) doublePredicate).f64670a : new C25989q(doublePredicate);
    }

    /* renamed from: a */
    public final /* synthetic */ C25993s mo84083a(C25993s sVar) {
        return m64837b(this.f64669a.and(C25991r.m64842a(sVar)));
    }

    /* renamed from: c */
    public final /* synthetic */ C25993s mo84084c() {
        return m64837b(this.f64669a.negate());
    }

    /* renamed from: d */
    public final /* synthetic */ C25993s mo84085d(C25993s sVar) {
        return m64837b(this.f64669a.or(C25991r.m64842a(sVar)));
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo84086e(double d) {
        return this.f64669a.test(d);
    }
}
