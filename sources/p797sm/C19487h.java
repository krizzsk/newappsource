package p797sm;

import java.util.Comparator;
import p891wk.C20362q;

/* renamed from: sm.h */
public final class C19487h implements C19492m {

    /* renamed from: b */
    public final Comparator<String> f49550b;

    public C19487h(Comparator<String> comparator) {
        this.f49550b = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f49550b.compare(((C20362q) obj).f51597c, ((C20362q) obj2).f51597c);
    }
}
