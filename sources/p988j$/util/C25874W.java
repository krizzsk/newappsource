package p988j$.util;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.W */
final class C25874W extends C26016n implements C25861I {
    C25874W() {
    }

    /* renamed from: a */
    public final void mo83848a(C25966e0 e0Var) {
        e0Var.getClass();
    }

    /* renamed from: c */
    public final boolean mo83849c(C25966e0 e0Var) {
        e0Var.getClass();
        return false;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64891f(this, consumer);
    }

    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64894j(this, consumer);
    }
}
