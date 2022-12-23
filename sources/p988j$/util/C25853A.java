package p988j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: j$.util.A */
final class C25853A extends C25877Z {

    /* renamed from: f */
    final /* synthetic */ SortedSet f64467f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C25853A(SortedSet sortedSet, Collection collection) {
        super(collection, 21);
        this.f64467f = sortedSet;
    }

    public final Comparator getComparator() {
        return this.f64467f.comparator();
    }
}
