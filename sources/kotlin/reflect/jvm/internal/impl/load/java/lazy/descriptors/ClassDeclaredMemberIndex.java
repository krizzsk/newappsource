package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.sequences.C24177b;
import lf0.C24236l;
import lg0.C24248a;
import mf0.C24362h;
import og0.C24592g;
import og0.C24599n;
import og0.C24601p;
import og0.C24602q;
import og0.C24607v;
import p389bl.C13637c;
import th0.C24997e;
import ug0.C25069e;

public final class ClassDeclaredMemberIndex implements C24248a {

    /* renamed from: a */
    public final C24592g f60616a;

    /* renamed from: b */
    public final C24236l<C24601p, Boolean> f60617b;

    /* renamed from: c */
    public final C24236l<C24602q, Boolean> f60618c;

    /* renamed from: d */
    public final LinkedHashMap f60619d;

    /* renamed from: e */
    public final LinkedHashMap f60620e;

    /* renamed from: f */
    public final LinkedHashMap f60621f;

    public ClassDeclaredMemberIndex(C24592g gVar, C24236l<? super C24601p, Boolean> lVar) {
        C24362h.m61211f(gVar, "jClass");
        C24362h.m61211f(lVar, "memberFilter");
        this.f60616a = gVar;
        this.f60617b = lVar;
        ClassDeclaredMemberIndex$methodFilter$1 classDeclaredMemberIndex$methodFilter$1 = new ClassDeclaredMemberIndex$methodFilter$1(this);
        this.f60618c = classDeclaredMemberIndex$methodFilter$1;
        C24997e d0 = C24177b.m60543d0(C23825c.m58506c0(gVar.mo59483s()), classDeclaredMemberIndex$methodFilter$1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C24997e.C24998a aVar = new C24997e.C24998a(d0);
        while (aVar.hasNext()) {
            Object next = aVar.next();
            C25069e name = ((C24602q) next).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.f60619d = linkedHashMap;
        C24997e d02 = C24177b.m60543d0(C23825c.m58506c0(this.f60616a.mo59470J()), this.f60617b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C24997e.C24998a aVar2 = new C24997e.C24998a(d02);
        while (aVar2.hasNext()) {
            Object next2 = aVar2.next();
            linkedHashMap2.put(((C24599n) next2).getName(), next2);
        }
        this.f60620e = linkedHashMap2;
        ArrayList k = this.f60616a.mo59477k();
        C24236l<C24601p, Boolean> lVar2 = this.f60617b;
        ArrayList arrayList = new ArrayList();
        for (Object next3 : k) {
            if (lVar2.invoke(next3).booleanValue()) {
                arrayList.add(next3);
            }
        }
        int z = C13637c.m34083z(C21136j.m49436X(arrayList, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(z < 16 ? 16 : z);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next4 = it.next();
            linkedHashMap3.put(((C24607v) next4).getName(), next4);
        }
        this.f60621f = linkedHashMap3;
    }

    /* renamed from: a */
    public final Set<C25069e> mo59510a() {
        C24997e d0 = C24177b.m60543d0(C23825c.m58506c0(this.f60616a.mo59483s()), this.f60618c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C24997e.C24998a aVar = new C24997e.C24998a(d0);
        while (aVar.hasNext()) {
            linkedHashSet.add(((C24602q) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public final Set<C25069e> mo59511b() {
        return this.f60621f.keySet();
    }

    /* renamed from: c */
    public final Set<C25069e> mo59512c() {
        C24997e d0 = C24177b.m60543d0(C23825c.m58506c0(this.f60616a.mo59470J()), this.f60617b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C24997e.C24998a aVar = new C24997e.C24998a(d0);
        while (aVar.hasNext()) {
            linkedHashSet.add(((C24599n) aVar.next()).getName());
        }
        return linkedHashSet;
    }

    /* renamed from: d */
    public final C24607v mo59513d(C25069e eVar) {
        C24362h.m61211f(eVar, "name");
        return (C24607v) this.f60621f.get(eVar);
    }

    /* renamed from: e */
    public final C24599n mo59514e(C25069e eVar) {
        C24362h.m61211f(eVar, "name");
        return (C24599n) this.f60620e.get(eVar);
    }

    /* renamed from: f */
    public final Collection<C24602q> mo59515f(C25069e eVar) {
        C24362h.m61211f(eVar, "name");
        List list = (List) this.f60619d.get(eVar);
        if (list == null) {
            return EmptyList.f60173b;
        }
        return list;
    }
}
