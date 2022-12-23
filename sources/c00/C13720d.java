package c00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p009a8.C0111k;
import p638lr.C18262i;
import p736pu.C18993b;

/* renamed from: c00.d */
public final class C13720d {

    /* renamed from: a */
    public static final C0111k f33796a = new C0111k(2);

    /* renamed from: a */
    public static C13719c m34271a(C18262i iVar, C18993b bVar) {
        return new C13719c(bVar, iVar);
    }

    /* renamed from: b */
    public static ArrayList m34272b(List list, C13719c cVar) throws RuntimeException {
        return m34273c(list, (C13722f) null, cVar);
    }

    /* renamed from: c */
    public static <I, O, E extends Exception> ArrayList<O> m34273c(Iterable<? extends I> iterable, C13722f<? super I> fVar, C13721e<I, O, E> eVar) throws Exception {
        ArrayList<O> arrayList;
        if (iterable == null) {
            return new ArrayList<>(0);
        }
        if (iterable instanceof Collection) {
            arrayList = new ArrayList<>(((Collection) iterable).size());
        } else {
            arrayList = new ArrayList<>();
        }
        m34276f(iterable, fVar, eVar, arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public static <I, OK, OV, KE extends Exception, VE extends Exception> HashMap<OK, OV> m34274d(Iterable<? extends I> iterable, C13721e<I, OK, KE> eVar, C13721e<I, OV, VE> eVar2) throws Exception, Exception {
        HashMap<OK, OV> hashMap;
        if (iterable instanceof Collection) {
            hashMap = new HashMap<>(((Collection) iterable).size());
        } else {
            hashMap = new HashMap<>();
        }
        for (Object next : iterable) {
            hashMap.put(eVar.convert(next), eVar2.convert(next));
        }
        return hashMap;
    }

    /* renamed from: e */
    public static void m34275e(Map map, Map map2, C13733n nVar, C13721e eVar) throws Exception, Exception {
        for (Map.Entry entry : map.entrySet()) {
            map2.put(nVar.convert(entry.getKey()), eVar.convert(entry.getValue()));
        }
    }

    /* renamed from: f */
    public static void m34276f(Iterable iterable, C13722f fVar, C13721e eVar, Collection collection) throws Exception {
        if (iterable != null) {
            if (fVar != null) {
                for (Object next : iterable) {
                    if (fVar.mo19661o(next)) {
                        collection.add(eVar.convert(next));
                    }
                }
                return;
            }
            for (Object convert : iterable) {
                collection.add(eVar.convert(convert));
            }
        }
    }

    /* renamed from: g */
    public static <I, O, E extends RuntimeException> HashSet<O> m34277g(Iterable<? extends I> iterable, C13722f<? super I> fVar, C13721e<I, O, E> eVar) throws RuntimeException {
        HashSet<O> hashSet;
        if (iterable == null) {
            return new HashSet<>(0);
        }
        if (iterable instanceof Collection) {
            hashSet = new HashSet<>(((Collection) iterable).size());
        } else {
            hashSet = new HashSet<>();
        }
        m34276f(iterable, fVar, eVar, hashSet);
        return hashSet;
    }

    /* renamed from: h */
    public static HashMap m34278h(List list, C25541a aVar, C13721e eVar, C13721e eVar2, C13721e eVar3) throws RuntimeException, RuntimeException, RuntimeException {
        HashMap hashMap = new HashMap();
        for (Object next : list) {
            Object convert = eVar.convert(next);
            Object convert2 = eVar2.convert(next);
            Collection collection = (Collection) hashMap.get(convert);
            if (collection == null) {
                ArrayList arrayList = new ArrayList(1);
                hashMap.put(convert, arrayList);
                collection = arrayList;
            }
            collection.add(convert2);
        }
        if (eVar3 != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                entry.setValue((Collection) eVar3.convert((Collection) entry.getValue()));
            }
        }
        return hashMap;
    }
}
