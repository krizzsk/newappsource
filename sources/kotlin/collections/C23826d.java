package kotlin.collections;

import cf0.C21149w;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import mf0.C24362h;
import p389bl.C13637c;

/* renamed from: kotlin.collections.d */
public class C23826d extends C13637c {
    /* renamed from: U */
    public static final Map m58530U() {
        EmptyMap emptyMap = EmptyMap.f60174b;
        C24362h.m61209d(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    /* renamed from: V */
    public static final Object m58531V(Map map, String str) {
        C24362h.m61211f(map, "<this>");
        if (map instanceof C21149w) {
            return ((C21149w) map).mo53393m();
        }
        Object obj = map.get(str);
        if (obj != null || map.containsKey(str)) {
            return obj;
        }
        throw new NoSuchElementException("Key " + str + " is missing in the map.");
    }

    /* renamed from: W */
    public static final HashMap m58532W(Pair... pairArr) {
        HashMap hashMap = new HashMap(C13637c.m34083z(pairArr.length));
        m58534Y(hashMap, pairArr);
        return hashMap;
    }

    /* renamed from: X */
    public static final Map m58533X(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return m58530U();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13637c.m34083z(pairArr.length));
        m58534Y(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    /* renamed from: Y */
    public static final void m58534Y(HashMap hashMap, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            hashMap.put(pair.mo59066a(), pair.mo59067b());
        }
    }

    /* renamed from: Z */
    public static final Map m58535Z(AbstractMap abstractMap) {
        C24362h.m61211f(abstractMap, "<this>");
        int size = abstractMap.size();
        if (size == 0) {
            return m58530U();
        }
        if (size != 1) {
            return m58538c0(abstractMap);
        }
        return C13637c.m34058M(abstractMap);
    }

    /* renamed from: a0 */
    public static final Map m58536a0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return m58530U();
        }
        if (size == 1) {
            return C13637c.m34046A((Pair) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13637c.m34083z(arrayList.size()));
        m58537b0(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    /* renamed from: b0 */
    public static final void m58537b0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.mo59066a(), pair.mo59067b());
        }
    }

    /* renamed from: c0 */
    public static final LinkedHashMap m58538c0(AbstractMap abstractMap) {
        C24362h.m61211f(abstractMap, "<this>");
        return new LinkedHashMap(abstractMap);
    }
}
