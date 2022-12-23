package p988j$.util;

import java.util.Comparator;
import p988j$.util.Spliterator;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.U */
final class C25872U extends C26016n implements C25856D {
    C25872U() {
    }

    /* renamed from: b */
    public final void mo83818b(C25981m mVar) {
        mVar.getClass();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64889d(this, consumer);
    }

    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    /* renamed from: h */
    public final boolean mo83820h(C25981m mVar) {
        mVar.getClass();
        return false;
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64892g(this, consumer);
    }
}
