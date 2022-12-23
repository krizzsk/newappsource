package p607kk;

import java.util.Comparator;

/* renamed from: kk.c */
public final class C18087c implements Comparator<Long> {

    /* renamed from: b */
    public final C18089e f46244b;

    public C18087c(C18089e eVar) {
        this.f46244b = eVar;
    }

    public final int compare(Object obj, Object obj2) {
        Long l = (Long) obj;
        Long l2 = (Long) obj2;
        if (l == null || l2 == null) {
            return this.f46244b.compare(l, l2);
        }
        return l.compareTo(l2);
    }
}
