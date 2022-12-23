package ge0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p988j$.util.DesugarCollections;

/* renamed from: ge0.a */
public final class C23408a {
    /* renamed from: a */
    public static ArrayList m57526a(List list) {
        if (list == null) {
            return new ArrayList();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(list);
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList.size());
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static HashMap m57527b(Map map) {
        if (map == null) {
            return new HashMap();
        }
        Map synchronizedMap = DesugarCollections.synchronizedMap(map);
        HashMap hashMap = new HashMap();
        hashMap.putAll(synchronizedMap);
        return hashMap;
    }

    /* renamed from: c */
    public static <Type> List<Type> m57528c(List<Type> list) {
        if (m57529d(list)) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: d */
    public static <Type> boolean m57529d(Collection<Type> collection) {
        return collection == null || collection.isEmpty();
    }

    /* renamed from: e */
    public static <Type> boolean m57530e(Collection<Type> collection) {
        return !m57529d(collection);
    }
}
