package c00;

import android.util.SparseArray;
import com.appboy.support.StringUtils;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p241s0.C6302b;
import p977zz.C20944i0;

/* renamed from: c00.b */
public final class C13717b {

    /* renamed from: c00.b$a */
    public static class C13718a extends C13726h<Integer> {

        /* renamed from: b */
        public final int f33792b;

        /* renamed from: c */
        public final int f33793c;

        public C13718a(int i, int i2) {
            if (i <= i2) {
                this.f33792b = i;
                this.f33793c = i2;
                return;
            }
            throw new IllegalArgumentException("from > to");
        }

        public final boolean contains(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue()) >= this.f33792b && intValue < this.f33793c) {
                return true;
            }
            return false;
        }

        public final Object get(int i) {
            int i2 = this.f33792b;
            int i3 = i2 + i;
            if (i3 < this.f33793c && i3 >= i2) {
                return Integer.valueOf(i3);
            }
            throw new IndexOutOfBoundsException(C16759e.m42349e("", i));
        }

        public final int indexOf(Object obj) {
            int intValue;
            int i;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue()) >= (i = this.f33792b) && intValue < this.f33793c) {
                return intValue - i;
            }
            return -1;
        }

        public final int lastIndexOf(Object obj) {
            return indexOf(obj);
        }

        public final int size() {
            return this.f33793c - this.f33792b;
        }

        public final List<Integer> subList(int i, int i2) {
            if (i >= 0) {
                int i3 = this.f33793c;
                int i4 = this.f33792b;
                if (i2 < i3 - i4) {
                    return new C13718a(i + i4, i4 + i2);
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static C6302b m34254a(List list, C13733n nVar) {
        C6302b bVar = new C6302b(list.size());
        for (Object next : list) {
            bVar.put(nVar.convert(next), next);
        }
        return bVar;
    }

    /* renamed from: b */
    public static void m34255b(Collection collection, ArrayList arrayList) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.addAll((Collection) it.next());
        }
    }

    /* renamed from: c */
    public static <T> T m34256c(Iterable<? extends T> iterable) {
        if (iterable == null) {
            return null;
        }
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        } else if (iterable.iterator().hasNext()) {
            return iterable.iterator().next();
        } else {
            return null;
        }
    }

    /* renamed from: d */
    public static <T> int m34257d(List<T> list, C13722f<T> fVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (fVar.mo19661o(list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static boolean m34258e(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /* renamed from: f */
    public static boolean m34259f(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    /* renamed from: g */
    public static List m34260g(int i, List list) {
        return list.subList(0, Math.min(i, list.size()));
    }

    /* renamed from: h */
    public static void m34261h(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                it.remove();
            }
        }
    }

    /* renamed from: i */
    public static List m34262i(HashSet hashSet) {
        if (hashSet.size() <= 300) {
            return Collections.singletonList(hashSet);
        }
        Iterator it = hashSet.iterator();
        ArrayList arrayList = new ArrayList(hashSet.size() / Strategy.TTL_SECONDS_DEFAULT);
        while (it.hasNext()) {
            ArrayList arrayList2 = new ArrayList(Strategy.TTL_SECONDS_DEFAULT);
            for (int i = 0; i < 300 && it.hasNext(); i++) {
                arrayList2.add(it.next());
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* renamed from: j */
    public static <T> int m34263j(Iterable<T> iterable, C13733n<T, Integer> nVar) {
        int i = 0;
        for (T convert : iterable) {
            i += nVar.convert(convert).intValue();
        }
        return i;
    }

    /* renamed from: k */
    public static <T> ArrayList<T> m34264k(Iterable<T> iterable) {
        if (iterable == null) {
            return null;
        }
        if (iterable instanceof ArrayList) {
            return (ArrayList) iterable;
        }
        ArrayList<T> arrayList = new ArrayList<>();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: l */
    public static <T> List<T> m34265l(List<T> list, C13722f<T> fVar) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext() && fVar.mo19661o(it.next())) {
            i++;
        }
        if (i > 0) {
            return list.subList(0, i);
        }
        return Collections.emptyList();
    }

    /* renamed from: m */
    public static C6302b m34266m(Set set) {
        C6302b bVar = new C6302b(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C20944i0 i0Var = (C20944i0) it.next();
            bVar.put(i0Var.f52692a, i0Var.f52693b);
        }
        return bVar;
    }

    /* renamed from: n */
    public static <K, V> SparseArray<V> m34267n(Map<K, V> map, C13733n<K, Integer> nVar) {
        SparseArray<V> sparseArray = new SparseArray<>(map.size());
        for (Map.Entry next : map.entrySet()) {
            sparseArray.put(nVar.convert(next.getKey()).intValue(), next.getValue());
        }
        return sparseArray;
    }

    @SafeVarargs
    /* renamed from: o */
    public static <T> SparseArray<T> m34268o(C20944i0<Integer, T>... i0VarArr) {
        SparseArray<T> sparseArray = new SparseArray<>(i0VarArr.length);
        for (C20944i0<Integer, T> i0Var : i0VarArr) {
            sparseArray.put(((Integer) i0Var.f52692a).intValue(), i0Var.f52693b);
        }
        return sparseArray;
    }

    /* renamed from: p */
    public static String m34269p(Collection<?> collection) {
        if (collection == null) {
            return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        if (collection.isEmpty()) {
            return "empty";
        }
        StringBuilder q = C25541a.m63886q('[');
        boolean z = true;
        for (Object next : collection) {
            if (z) {
                z = false;
            } else {
                q.append(", ");
            }
            q.append(next.toString());
        }
        q.append(']');
        return q.toString();
    }

    /* renamed from: q */
    public static String m34270q(Map<?, ?> map) {
        if (map == null) {
            return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        if (map.isEmpty()) {
            return "empty";
        }
        StringBuilder q = C25541a.m63886q('[');
        boolean z = true;
        for (Map.Entry next : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                q.append(", ");
            }
            q.append('[');
            q.append(next.getKey());
            q.append(',');
            q.append(next.getValue());
            q.append(']');
        }
        q.append(']');
        return q.toString();
    }
}
