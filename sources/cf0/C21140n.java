package cf0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lf0.C24236l;
import mf0.C24362h;
import p583jk.C17875h;
import rf0.C24805g;
import rf0.C24806h;

/* renamed from: cf0.n */
public class C21140n extends C21139m {
    /* renamed from: Z */
    public static final int m49438Z(int i, List list) {
        if (new C24806h(0, C17875h.m44314y(list)).mo61258s(i)) {
            return C17875h.m44314y(list) - i;
        }
        StringBuilder r = C25541a.m63887r("Element index ", i, " must be in range [");
        r.append(new C24806h(0, C17875h.m44314y(list)));
        r.append("].");
        throw new IndexOutOfBoundsException(r.toString());
    }

    /* renamed from: a0 */
    public static final void m49439a0(Iterable iterable, Collection collection) {
        C24362h.m61211f(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        for (Object add : iterable) {
            collection.add(add);
        }
    }

    /* renamed from: b0 */
    public static final void m49440b0(ArrayList arrayList, C24236l lVar) {
        int y;
        C24362h.m61211f(arrayList, "<this>");
        C24362h.m61211f(lVar, "predicate");
        int i = 0;
        C24805g p = new C24806h(0, C17875h.m44314y(arrayList)).iterator();
        while (p.f62733d) {
            int nextInt = p.nextInt();
            Object obj = arrayList.get(nextInt);
            if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (i != nextInt) {
                    arrayList.set(i, obj);
                }
                i++;
            }
        }
        if (i < arrayList.size() && i <= (y = C17875h.m44314y(arrayList))) {
            while (true) {
                arrayList.remove(y);
                if (y != i) {
                    y--;
                } else {
                    return;
                }
            }
        }
    }
}
