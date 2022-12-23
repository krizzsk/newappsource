package cf0;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import mf0.C24362h;
import p389bl.C13637c;
import p583jk.C17884p;

/* renamed from: cf0.y */
public final class C21151y extends C17884p {
    /* renamed from: g0 */
    public static final LinkedHashSet m49444g0(Set set, Object obj) {
        C24362h.m61211f(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13637c.m34083z(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    /* renamed from: h0 */
    public static final LinkedHashSet m49445h0(Set set, Collection collection) {
        int i;
        C24362h.m61211f(set, "<this>");
        C24362h.m61211f(collection, "elements");
        Integer valueOf = Integer.valueOf(collection.size());
        if (valueOf != null) {
            i = set.size() + valueOf.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C13637c.m34083z(i));
        linkedHashSet.addAll(set);
        C21140n.m49439a0(collection, linkedHashSet);
        return linkedHashSet;
    }
}
