package p988j$.util.stream;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p988j$.util.Spliterator;
import p988j$.util.concurrent.ConcurrentHashMap;
import p988j$.util.function.IntFunction;

/* renamed from: j$.util.stream.q */
final class C26213q extends C26119W1 {
    C26213q(C26143c cVar, int i) {
        super(cVar, i);
    }

    /* renamed from: z1 */
    static C26063I0 m65577z1(C26143c cVar, Spliterator spliterator) {
        C26067J0 j0 = new C26067J0(19);
        return new C26063I0((Collection) new C26245w1(1, new C26067J0(21), new C26067J0(20), j0, 3).mo84249w(cVar, spliterator));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public final C26043E0 mo84141r1(Spliterator spliterator, IntFunction intFunction, C26143c cVar) {
        if (C26116V2.DISTINCT.mo84449d(cVar.mo84463X0())) {
            return cVar.mo84466i1(spliterator, false, intFunction);
        }
        if (C26116V2.ORDERED.mo84449d(cVar.mo84463X0())) {
            return m65577z1(cVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new C26101S(new C26198n(0, atomicBoolean, concurrentHashMap), false).mo84249w(cVar, spliterator);
        Set keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add((Object) null);
            keySet = hashSet;
        }
        return new C26063I0(keySet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public final Spliterator mo84472s1(C26143c cVar, Spliterator spliterator) {
        return C26116V2.DISTINCT.mo84449d(cVar.mo84463X0()) ? cVar.mo84474y1(spliterator) : C26116V2.ORDERED.mo84449d(cVar.mo84463X0()) ? m65577z1(cVar, spliterator).spliterator() : new C26152d3(cVar.mo84474y1(spliterator));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public final C26166g2 mo84142u1(int i, C26166g2 g2Var) {
        g2Var.getClass();
        return C26116V2.DISTINCT.mo84449d(i) ? g2Var : C26116V2.SORTED.mo84449d(i) ? new C26203o(g2Var) : new C26208p(this, g2Var);
    }
}
