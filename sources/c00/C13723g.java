package c00;

import ce0.C21100e;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k10.C17993a;
import p241s0.C6302b;

/* renamed from: c00.g */
public final class C13723g {

    /* renamed from: c00.g$a */
    public static class C13724a<T> implements C13722f<T> {

        /* renamed from: b */
        public final C13722f<T> f33797b;

        public C13724a(C13725b bVar) {
            this.f33797b = bVar;
        }

        /* renamed from: o */
        public final boolean mo19661o(T t) {
            return !this.f33797b.mo19661o(t);
        }
    }

    /* renamed from: c00.g$b */
    public static class C13725b<T> implements C13722f<T> {

        /* renamed from: b */
        public final List<C13722f<T>> f33798b;

        @SafeVarargs
        public C13725b(C13722f<T>... fVarArr) {
            List<C13722f<T>> asList = Arrays.asList(fVarArr);
            C21100e.m49373x(asList, "filters");
            this.f33798b = asList;
        }

        /* renamed from: o */
        public final boolean mo19661o(T t) {
            for (C13722f<T> o : this.f33798b) {
                if (o.mo19661o(t)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public static <T> boolean m34280a(Iterable<T> iterable, C13722f<T> fVar) {
        if (iterable == null) {
            return false;
        }
        for (T o : iterable) {
            if (fVar.mo19661o(o)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m34281b(List list, C13722f fVar) {
        int i = 0;
        for (Object o : list) {
            if (fVar.mo19661o(o)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m34282c(Collection<T> collection, C13722f<? super T> fVar) {
        return (ArrayList) m34283d(collection, new ArrayList(), fVar);
    }

    /* renamed from: d */
    public static Collection m34283d(Collection collection, AbstractCollection abstractCollection, C13722f fVar) {
        if (collection == null) {
            return null;
        }
        for (Object next : collection) {
            if (fVar.mo19661o(next)) {
                abstractCollection.add(next);
                if (abstractCollection.size() >= Integer.MAX_VALUE) {
                    return abstractCollection;
                }
            }
        }
        return abstractCollection;
    }

    /* renamed from: e */
    public static C6302b m34284e(Map map, C17993a.C17995b bVar) {
        C6302b bVar2 = new C6302b();
        for (Map.Entry entry : map.entrySet()) {
            if (bVar.mo19661o(entry)) {
                bVar2.put(entry.getKey(), entry.getValue());
            }
        }
        return bVar2;
    }

    /* renamed from: f */
    public static void m34285f(Collection collection, ArrayList arrayList, C13722f fVar) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (fVar.mo19661o(next)) {
                    it.remove();
                    if (arrayList != null) {
                        arrayList.add(next);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static <T> T m34286g(Iterable<T> iterable, C13722f<? super T> fVar) {
        if (iterable == null) {
            return null;
        }
        for (T next : iterable) {
            if (fVar.mo19661o(next)) {
                return next;
            }
        }
        return null;
    }
}
