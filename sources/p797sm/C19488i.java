package p797sm;

import java.util.Comparator;
import p891wk.C20362q;

/* renamed from: sm.i */
public final class C19488i implements C19492m {

    /* renamed from: b */
    public Comparator<Integer> f49551b;

    public C19488i(Comparator<Integer> comparator) {
        this.f49551b = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f49551b.compare(((C20362q) obj).f51583E, ((C20362q) obj2).f51583E);
    }
}
