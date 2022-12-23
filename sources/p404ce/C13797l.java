package p404ce;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ce.l */
public final class C13797l {

    /* renamed from: ce.l$a */
    public static class C13798a {

        /* renamed from: a */
        public final C13784b<?> f33962a;

        /* renamed from: b */
        public final HashSet f33963b = new HashSet();

        /* renamed from: c */
        public final HashSet f33964c = new HashSet();

        public C13798a(C13784b<?> bVar) {
            this.f33962a = bVar;
        }
    }

    /* renamed from: ce.l$b */
    public static class C13799b {

        /* renamed from: a */
        public final Class<?> f33965a;

        /* renamed from: b */
        public final boolean f33966b;

        public C13799b() {
            throw null;
        }

        public C13799b(Class cls, boolean z) {
            this.f33965a = cls;
            this.f33966b = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C13799b)) {
                return false;
            }
            C13799b bVar = (C13799b) obj;
            if (!bVar.f33965a.equals(this.f33965a) || bVar.f33966b != this.f33966b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return ((this.f33965a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f33966b).hashCode();
        }
    }

    /* renamed from: a */
    public static void m34465a(ArrayList arrayList) {
        boolean z;
        boolean z2;
        boolean z3;
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                C13784b bVar = (C13784b) it.next();
                C13798a aVar = new C13798a(bVar);
                Iterator<Class<? super T>> it2 = bVar.f33934b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Class next = it2.next();
                        if (bVar.f33937e == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        boolean z4 = !z3;
                        C13799b bVar2 = new C13799b(next, z4);
                        if (!hashMap.containsKey(bVar2)) {
                            hashMap.put(bVar2, new HashSet());
                        }
                        Set set = (Set) hashMap.get(bVar2);
                        if (set.isEmpty() || z4) {
                            set.add(aVar);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next}));
                        }
                    }
                }
            } else {
                for (Set<C13798a> it3 : hashMap.values()) {
                    for (C13798a aVar2 : it3) {
                        for (C13800m next2 : aVar2.f33962a.f33935c) {
                            if (next2.f33969c == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                Class<?> cls = next2.f33967a;
                                if (next2.f33968b == 2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                Set<C13798a> set2 = (Set) hashMap.get(new C13799b(cls, z2));
                                if (set2 != null) {
                                    for (C13798a aVar3 : set2) {
                                        aVar2.f33963b.add(aVar3);
                                        aVar3.f33964c.add(aVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C13798a aVar4 = (C13798a) it4.next();
                    if (aVar4.f33964c.isEmpty()) {
                        hashSet2.add(aVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    C13798a aVar5 = (C13798a) hashSet2.iterator().next();
                    hashSet2.remove(aVar5);
                    i++;
                    Iterator it5 = aVar5.f33963b.iterator();
                    while (it5.hasNext()) {
                        C13798a aVar6 = (C13798a) it5.next();
                        aVar6.f33964c.remove(aVar5);
                        if (aVar6.f33964c.isEmpty()) {
                            hashSet2.add(aVar6);
                        }
                    }
                }
                if (i != arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        C13798a aVar7 = (C13798a) it6.next();
                        if (!aVar7.f33964c.isEmpty() && !aVar7.f33963b.isEmpty()) {
                            arrayList2.add(aVar7.f33962a);
                        }
                    }
                    throw new DependencyCycleException(arrayList2);
                }
                return;
            }
        }
    }
}
