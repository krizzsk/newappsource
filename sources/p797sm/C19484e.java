package p797sm;

import java.util.Comparator;
import p891wk.C20362q;

/* renamed from: sm.e */
public final class C19484e implements C19492m {

    /* renamed from: b */
    public Comparator<Long> f49547b;

    public C19484e(Comparator<Long> comparator) {
        this.f49547b = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f49547b.compare(((C20362q) obj).f51606l.f51515b, ((C20362q) obj2).f51606l.f51515b);
    }
}
