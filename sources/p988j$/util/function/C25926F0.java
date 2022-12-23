package p988j$.util.function;

import java.util.function.Predicate;
import p988j$.util.function.Predicate;

/* renamed from: j$.util.function.F0 */
public final /* synthetic */ class C25926F0 implements Predicate {

    /* renamed from: a */
    final /* synthetic */ Predicate f64615a;

    private /* synthetic */ C25926F0(Predicate predicate) {
        this.f64615a = predicate;
    }

    /* renamed from: a */
    public static /* synthetic */ Predicate m64769a(Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return predicate instanceof Predicate.VivifiedWrapper ? ((Predicate.VivifiedWrapper) predicate).f64635a : new C25926F0(predicate);
    }

    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return m64769a(this.f64615a.and(Predicate.VivifiedWrapper.convert(predicate)));
    }

    public final /* synthetic */ java.util.function.Predicate negate() {
        return m64769a(this.f64615a.negate());
    }

    /* renamed from: or */
    public final /* synthetic */ java.util.function.Predicate mo84023or(java.util.function.Predicate predicate) {
        return m64769a(this.f64615a.mo43234or(Predicate.VivifiedWrapper.convert(predicate)));
    }

    public final /* synthetic */ boolean test(Object obj) {
        return this.f64615a.test(obj);
    }
}
