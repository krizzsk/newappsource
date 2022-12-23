package p607kk;

import java.util.Comparator;

/* renamed from: kk.d */
public final class C18088d implements Comparator<Long> {

    /* renamed from: b */
    public final C18089e f46245b;

    public C18088d(C18089e eVar) {
        this.f46245b = eVar;
    }

    public final int compare(Object obj, Object obj2) {
        Long l = (Long) obj;
        Long l2 = (Long) obj2;
        if (l == null || l2 == null) {
            return this.f46245b.compare(l, l2);
        }
        return l2.compareTo(l);
    }
}
