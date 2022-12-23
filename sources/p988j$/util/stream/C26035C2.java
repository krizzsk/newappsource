package p988j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;
import p988j$.util.Comparator$CC;
import p988j$.util.Spliterator;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.C2 */
final class C26035C2 extends C26119W1 {

    /* renamed from: t */
    private final boolean f64708t;

    /* renamed from: u */
    private final Comparator f64709u;

    C26035C2(C26143c cVar) {
        super(cVar, C26116V2.f64845q | C26116V2.f64843o);
        this.f64708t = true;
        this.f64709u = Comparator$CC.m64673a();
    }

    C26035C2(C26143c cVar, Comparator comparator) {
        super(cVar, C26116V2.f64845q | C26116V2.f64844p);
        this.f64708t = false;
        comparator.getClass();
        this.f64709u = comparator;
    }

    /* renamed from: r1 */
    public final C26043E0 mo84141r1(Spliterator spliterator, IntFunction intFunction, C26143c cVar) {
        if (C26116V2.SORTED.mo84449d(cVar.mo84463X0()) && this.f64708t) {
            return cVar.mo84466i1(spliterator, false, intFunction);
        }
        Object[] o = cVar.mo84466i1(spliterator, true, intFunction).mo84245o(intFunction);
        Arrays.sort(o, this.f64709u);
        return new C26058H0(o);
    }

    /* renamed from: u1 */
    public final C26166g2 mo84142u1(int i, C26166g2 g2Var) {
        g2Var.getClass();
        return (!C26116V2.SORTED.mo84449d(i) || !this.f64708t) ? C26116V2.SIZED.mo84449d(i) ? new C26060H2(g2Var, this.f64709u) : new C26040D2(g2Var, this.f64709u) : g2Var;
    }
}
