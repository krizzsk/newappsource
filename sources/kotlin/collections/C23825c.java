package kotlin.collections;

import cf0.C21132f;
import cf0.C21136j;
import cf0.C21140n;
import cf0.C21141o;
import cf0.C21142p;
import cf0.C21145s;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.random.Random;
import lf0.C24236l;
import mf0.C24362h;
import p389bl.C13637c;
import p583jk.C17875h;
import p583jk.C17884p;
import p845um.C19958a;
import rf0.C24806h;

/* renamed from: kotlin.collections.c */
public class C23825c extends C21141o {
    /* renamed from: A0 */
    public static final List m58489A0(ArrayList arrayList) {
        C24362h.m61211f(arrayList, "<this>");
        if (arrayList.size() <= 1) {
            return m58499K0(arrayList);
        }
        List M0 = m58501M0(arrayList);
        Collections.reverse(M0);
        return M0;
    }

    /* renamed from: B0 */
    public static final Object m58490B0(Collection collection) {
        C24362h.m61211f(collection, "<this>");
        if (collection instanceof List) {
            return m58491C0((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: C0 */
    public static final <T> T m58491C0(List<? extends T> list) {
        C24362h.m61211f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: D0 */
    public static final Object m58492D0(Collection collection) {
        C24362h.m61211f(collection, "<this>");
        if (collection instanceof List) {
            List list = (List) collection;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* renamed from: E0 */
    public static final <T> T m58493E0(List<? extends T> list) {
        C24362h.m61211f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: F0 */
    public static final <T> List<T> m58494F0(List<? extends T> list, C24806h hVar) {
        C24362h.m61211f(hVar, "indices");
        if (hVar.isEmpty()) {
            return EmptyList.f60173b;
        }
        return m58499K0(list.subList(Integer.valueOf(hVar.f62728b).intValue(), Integer.valueOf(hVar.f62729c).intValue() + 1));
    }

    /* renamed from: G0 */
    public static final List m58495G0(ArrayList arrayList) {
        if (arrayList.size() <= 1) {
            return m58499K0(arrayList);
        }
        Object[] array = arrayList.toArray(new Comparable[0]);
        C24362h.m61209d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return C21132f.m49428K0(comparableArr);
    }

    /* renamed from: H0 */
    public static final List m58496H0(Collection collection, Comparator comparator) {
        C24362h.m61211f(collection, "<this>");
        if (collection.size() <= 1) {
            return m58499K0(collection);
        }
        Object[] array = collection.toArray(new Object[0]);
        C24362h.m61209d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return C21132f.m49428K0(array);
    }

    /* renamed from: I0 */
    public static final void m58497I0(Iterable iterable, AbstractCollection abstractCollection) {
        C24362h.m61211f(iterable, "<this>");
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    /* renamed from: J0 */
    public static final int[] m58498J0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: K0 */
    public static final <T> List<T> m58499K0(Iterable<? extends T> iterable) {
        Object obj;
        C24362h.m61211f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C17875h.m44285I(m58501M0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyList.f60173b;
        }
        if (size != 1) {
            return m58500L0(collection);
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return C17875h.m44280D(obj);
    }

    /* renamed from: L0 */
    public static final ArrayList m58500L0(Collection collection) {
        C24362h.m61211f(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: M0 */
    public static final <T> List<T> m58501M0(Iterable<? extends T> iterable) {
        C24362h.m61211f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m58500L0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m58497I0(iterable, arrayList);
        return arrayList;
    }

    /* renamed from: N0 */
    public static final <T> Set<T> m58502N0(Iterable<? extends T> iterable) {
        C24362h.m61211f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m58497I0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: O0 */
    public static final <T> Set<T> m58503O0(Iterable<? extends T> iterable) {
        Object obj;
        C24362h.m61211f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return EmptySet.f60175b;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C13637c.m34083z(collection.size()));
                m58497I0(iterable, linkedHashSet);
                return linkedHashSet;
            }
            if (iterable instanceof List) {
                obj = ((List) iterable).get(0);
            } else {
                obj = iterable.iterator().next();
            }
            return C17884p.m44348S(obj);
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        m58497I0(iterable, linkedHashSet2);
        return C17884p.m44343N(linkedHashSet2);
    }

    /* renamed from: P0 */
    public static final C21145s m58504P0(Iterable iterable) {
        C24362h.m61211f(iterable, "<this>");
        return new C21145s(new CollectionsKt___CollectionsKt$withIndex$1(iterable));
    }

    /* renamed from: Q0 */
    public static final ArrayList m58505Q0(List list, Iterable iterable) {
        C24362h.m61211f(list, "<this>");
        C24362h.m61211f(iterable, InneractiveMediationNameConsts.OTHER);
        Iterator it = list.iterator();
        Iterator it2 = iterable.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C21136j.m49436X(list, 10), C21136j.m49436X(iterable, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: c0 */
    public static final C21142p m58506c0(Iterable iterable) {
        C24362h.m61211f(iterable, "<this>");
        return new C21142p(iterable);
    }

    /* renamed from: d0 */
    public static final <T> boolean m58507d0(Iterable<? extends T> iterable, T t) {
        int i;
        C24362h.m61211f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        if (!(iterable instanceof List)) {
            Iterator<? extends T> it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    C17875h.m44294U();
                    throw null;
                } else if (C24362h.m61206a(t, next)) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
        } else {
            i = ((List) iterable).indexOf(t);
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    public static final List m58508e0(List list, int i) {
        boolean z;
        C24362h.m61211f(list, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C25541a.m63878h("Requested element count ", i, " is less than zero.").toString());
        } else if (i == 0) {
            return m58499K0(list);
        } else {
            int size = list.size() - i;
            if (size <= 0) {
                return EmptyList.f60173b;
            }
            if (size == 1) {
                return C17875h.m44280D(m58521r0(list));
            }
            ArrayList arrayList = new ArrayList(size);
            if (list instanceof RandomAccess) {
                int size2 = list.size();
                while (i < size2) {
                    arrayList.add(list.get(i));
                    i++;
                }
            } else {
                ListIterator listIterator = list.listIterator(i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    /* renamed from: f0 */
    public static final List m58509f0(List list) {
        boolean z;
        C24362h.m61211f(list, "<this>");
        int size = list.size() - 1;
        int i = 0;
        if (size < 0) {
            size = 0;
        }
        if (size >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C25541a.m63878h("Requested element count ", size, " is less than zero.").toString());
        } else if (size == 0) {
            return EmptyList.f60173b;
        } else {
            if (size >= list.size()) {
                return m58499K0(list);
            }
            if (size == 1) {
                return C17875h.m44280D(m58512i0(list));
            }
            ArrayList arrayList = new ArrayList(size);
            for (Object add : list) {
                arrayList.add(add);
                i++;
                if (i == size) {
                    break;
                }
            }
            return C17875h.m44285I(arrayList);
        }
    }

    /* renamed from: g0 */
    public static final ArrayList m58510g0(Iterable iterable, C24236l lVar) {
        C24362h.m61211f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((Boolean) lVar.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public static final ArrayList m58511h0(Set set) {
        C24362h.m61211f(set, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : set) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public static final <T> T m58512i0(Iterable<? extends T> iterable) {
        C24362h.m61211f(iterable, "<this>");
        if (iterable instanceof List) {
            return m58513j0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: j0 */
    public static final <T> T m58513j0(List<? extends T> list) {
        C24362h.m61211f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: k0 */
    public static final <T> T m58514k0(Iterable<? extends T> iterable) {
        C24362h.m61211f(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: l0 */
    public static final <T> T m58515l0(List<? extends T> list) {
        C24362h.m61211f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: m0 */
    public static final Object m58516m0(int i, List list) {
        C24362h.m61211f(list, "<this>");
        if (i < 0 || i > C17875h.m44314y(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: n0 */
    public static final void m58517n0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C24236l lVar) {
        C24362h.m61211f(iterable, "<this>");
        C24362h.m61211f(appendable, "buffer");
        C24362h.m61211f(charSequence, "separator");
        C24362h.m61211f(charSequence2, "prefix");
        C24362h.m61211f(charSequence3, "postfix");
        C24362h.m61211f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C19958a.m47428a(appendable, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    /* renamed from: o0 */
    public static /* synthetic */ void m58518o0(Iterable iterable, Appendable appendable, String str, String str2, String str3, C24236l lVar, int i) {
        if ((i & 2) != 0) {
            str = ", ";
        }
        m58517n0(iterable, appendable, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? -1 : 0, (i & 32) != 0 ? "..." : null, (i & 64) != 0 ? null : lVar);
    }

    /* renamed from: p0 */
    public static final <T> String m58519p0(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C24236l<? super T, ? extends CharSequence> lVar) {
        C24362h.m61211f(iterable, "<this>");
        C24362h.m61211f(charSequence, "separator");
        C24362h.m61211f(charSequence2, "prefix");
        C24362h.m61211f(charSequence3, "postfix");
        C24362h.m61211f(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        m58517n0(iterable, sb, charSequence, charSequence2, charSequence3, i, charSequence4, lVar);
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: q0 */
    public static /* synthetic */ String m58520q0(Iterable iterable, String str, String str2, String str3, C24236l lVar, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        return m58519p0(iterable, str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? -1 : 0, (i & 16) != 0 ? "..." : null, (i & 32) != 0 ? null : lVar);
    }

    /* renamed from: r0 */
    public static final Object m58521r0(Collection collection) {
        C24362h.m61211f(collection, "<this>");
        if (collection instanceof List) {
            return m58522s0((List) collection);
        }
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: s0 */
    public static final <T> T m58522s0(List<? extends T> list) {
        C24362h.m61211f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C17875h.m44314y(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: t0 */
    public static final <T> T m58523t0(List<? extends T> list) {
        C24362h.m61211f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: u0 */
    public static final Comparable m58524u0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* renamed from: v0 */
    public static final ArrayList m58525v0(Iterable iterable, Iterable iterable2) {
        C24362h.m61211f(iterable, "<this>");
        C24362h.m61211f(iterable2, "elements");
        if (iterable instanceof Collection) {
            return m58527x0(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        C21140n.m49439a0(iterable, arrayList);
        C21140n.m49439a0(iterable2, arrayList);
        return arrayList;
    }

    /* renamed from: w0 */
    public static final ArrayList m58526w0(Iterable iterable, Object obj) {
        C24362h.m61211f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m58528y0(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        C21140n.m49439a0(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: x0 */
    public static final ArrayList m58527x0(Iterable iterable, Collection collection) {
        C24362h.m61211f(collection, "<this>");
        C24362h.m61211f(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C21140n.m49439a0(iterable, arrayList2);
        return arrayList2;
    }

    /* renamed from: y0 */
    public static final ArrayList m58528y0(Object obj, Collection collection) {
        C24362h.m61211f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: z0 */
    public static final Object m58529z0(ArrayList arrayList, Random.Default defaultR) {
        C24362h.m61211f(defaultR, "random");
        if (!arrayList.isEmpty()) {
            return arrayList.get(defaultR.mo59290c(arrayList.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }
}
