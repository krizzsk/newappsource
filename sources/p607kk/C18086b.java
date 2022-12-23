package p607kk;

import java.util.Comparator;

/* renamed from: kk.b */
public final class C18086b implements Comparator<Integer> {

    /* renamed from: b */
    public C18089e f46243b;

    public C18086b(C18089e eVar) {
        this.f46243b = eVar;
    }

    public final int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        if (num == null || num2 == null) {
            return this.f46243b.compare(num, num2);
        }
        return num.compareTo(num2);
    }
}
