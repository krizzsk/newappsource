package p797sm;

import java.util.Comparator;
import p891wk.C20362q;

/* renamed from: sm.f */
public final class C19485f implements C19492m {

    /* renamed from: b */
    public Comparator<String> f49548b;

    public C19485f(Comparator<String> comparator) {
        this.f49548b = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f49548b.compare(((C20362q) obj).f51613s, ((C20362q) obj2).f51613s);
    }
}
