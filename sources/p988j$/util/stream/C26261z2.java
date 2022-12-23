package p988j$.util.stream;

import java.util.Arrays;
import p988j$.util.Spliterator;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.z2 */
final class C26261z2 extends C26022A {
    C26261z2(C26143c cVar) {
        super(cVar, C26116V2.f64845q | C26116V2.f64843o);
    }

    /* renamed from: r1 */
    public final C26043E0 mo84141r1(Spliterator spliterator, IntFunction intFunction, C26143c cVar) {
        if (C26116V2.SORTED.mo84449d(cVar.mo84463X0())) {
            return cVar.mo84466i1(spliterator, false, intFunction);
        }
        double[] dArr = (double[]) ((C26023A0) cVar.mo84466i1(spliterator, true, intFunction)).mo84199b();
        Arrays.sort(dArr);
        return new C26098R0(dArr);
    }

    /* renamed from: u1 */
    public final C26166g2 mo84142u1(int i, C26166g2 g2Var) {
        g2Var.getClass();
        return C26116V2.SORTED.mo84449d(i) ? g2Var : C26116V2.SIZED.mo84449d(i) ? new C26045E2(g2Var) : new C26246w2(g2Var);
    }
}
