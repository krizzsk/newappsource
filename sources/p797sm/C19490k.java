package p797sm;

import java.util.Comparator;
import p891wk.C20362q;

/* renamed from: sm.k */
public final class C19490k implements C19492m {

    /* renamed from: b */
    public Comparator<String> f49553b;

    public C19490k(Comparator<String> comparator) {
        this.f49553b = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f49553b.compare(((C20362q) obj).f51612r, ((C20362q) obj2).f51612r);
    }
}
