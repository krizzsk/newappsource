package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import lf0.C24236l;
import mf0.C24362h;
import rh0.C24823d;

public final class OverridingUtilsKt {
    /* renamed from: a */
    public static final <H> Collection<H> m60264a(Collection<? extends H> collection, C24236l<? super H, ? extends C23894a> lVar) {
        C24362h.m61211f(collection, "<this>");
        C24362h.m61211f(lVar, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        C24823d dVar = new C24823d();
        while (!linkedList.isEmpty()) {
            Object j0 = C23825c.m58513j0(linkedList);
            C24823d dVar2 = new C24823d();
            ArrayList g = OverridingUtil.m60244g(j0, linkedList, lVar, new C24115x410e6287(dVar2));
            if (g.size() != 1 || !dVar2.isEmpty()) {
                Object s = OverridingUtil.m60252s(g, lVar);
                C23894a aVar = (C23894a) lVar.invoke(s);
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C24362h.m61210e(next, "it");
                    if (!OverridingUtil.m60247k(aVar, (C23894a) lVar.invoke(next))) {
                        dVar2.add(next);
                    }
                }
                if (!dVar2.isEmpty()) {
                    dVar.addAll(dVar2);
                }
                dVar.add(s);
            } else {
                Object B0 = C23825c.m58490B0(g);
                C24362h.m61210e(B0, "overridableGroup.single()");
                dVar.add(B0);
            }
        }
        return dVar;
    }
}
