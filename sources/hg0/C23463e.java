package hg0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import ug0.C25066c;

/* renamed from: hg0.e */
public final class C23463e {

    /* renamed from: a */
    public static final HashMap<C25066c, C25066c> f59246a = new HashMap<>();

    static {
        m57557b(C23872e.C23873a.f60344J, m57556a("java.util.ArrayList", "java.util.LinkedList"));
        m57557b(C23872e.C23873a.f60346L, m57556a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        m57557b(C23872e.C23873a.f60347M, m57556a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        m57557b(new C25066c("java.util.function.Function"), m57556a("java.util.function.UnaryOperator"));
        m57557b(new C25066c("java.util.function.BiFunction"), m57556a("java.util.function.BinaryOperator"));
    }

    /* renamed from: a */
    public static ArrayList m57556a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            arrayList.add(new C25066c(str));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m57557b(C25066c cVar, ArrayList arrayList) {
        HashMap<C25066c, C25066c> hashMap = f59246a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C25066c cVar2 = (C25066c) next;
            hashMap.put(next, cVar);
        }
    }
}
