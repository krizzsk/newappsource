package cf0;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import mf0.C24362h;

/* renamed from: cf0.m */
public class C21139m extends C21138l {
    /* renamed from: Y */
    public static final <T> void m49437Y(List<T> list, Comparator<? super T> comparator) {
        C24362h.m61211f(list, "<this>");
        C24362h.m61211f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
