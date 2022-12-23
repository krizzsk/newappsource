package p797sm;

import java.util.Comparator;
import p891wk.C20362q;

/* renamed from: sm.j */
public final class C19489j implements C19492m {

    /* renamed from: b */
    public Comparator<String> f49552b;

    public C19489j(Comparator<String> comparator) {
        this.f49552b = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f49552b.compare(((C20362q) obj).f51581C, ((C20362q) obj2).f51581C);
    }
}
