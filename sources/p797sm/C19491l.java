package p797sm;

import java.util.Comparator;
import p891wk.C20362q;

/* renamed from: sm.l */
public final class C19491l implements C19492m {

    /* renamed from: b */
    public Comparator<Long> f49554b;

    public C19491l(Comparator<Long> comparator) {
        this.f49554b = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f49554b.compare(((C20362q) obj).f51609o, ((C20362q) obj2).f51609o);
    }
}
