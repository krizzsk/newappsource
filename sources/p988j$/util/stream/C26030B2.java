package p988j$.util.stream;

import java.util.Arrays;
import p988j$.util.Spliterator;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.B2 */
final class C26030B2 extends C26169h0 {
    C26030B2(C26143c cVar) {
        super(cVar, C26116V2.f64845q | C26116V2.f64843o);
    }

    /* renamed from: r1 */
    public final C26043E0 mo84141r1(Spliterator spliterator, IntFunction intFunction, C26143c cVar) {
        if (C26116V2.SORTED.mo84449d(cVar.mo84463X0())) {
            return cVar.mo84466i1(spliterator, false, intFunction);
        }
        long[] jArr = (long[]) ((C26033C0) cVar.mo84466i1(spliterator, true, intFunction)).mo84199b();
        Arrays.sort(jArr);
        return new C26180j1(jArr);
    }

    /* renamed from: u1 */
    public final C26166g2 mo84142u1(int i, C26166g2 g2Var) {
        g2Var.getClass();
        return C26116V2.SORTED.mo84449d(i) ? g2Var : C26116V2.SIZED.mo84449d(i) ? new C26055G2(g2Var) : new C26256y2(g2Var);
    }
}
