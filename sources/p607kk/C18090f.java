package p607kk;

import java.util.Comparator;

/* renamed from: kk.f */
public final class C18090f implements Comparator<String> {

    /* renamed from: b */
    public C18089e f46247b;

    public C18090f(C18089e eVar) {
        this.f46247b = eVar;
    }

    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str == null || str2 == null) {
            return this.f46247b.compare(str, str2);
        }
        return str.compareTo(str2);
    }
}
