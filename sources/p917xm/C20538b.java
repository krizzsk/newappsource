package p917xm;

import ce0.C21100e;
import com.masabi.justride.sdk.error.ConvertedErrorException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p364al.C13483d;
import p364al.C13487h;
import p391bn.C13644a;
import p413co.C13868n;
import p413co.C13872r;
import p465ek.C16834b;
import p465ek.C16835c;
import p513gk.C17200a;
import p583jk.C17873f;
import p725pj.C18926a;
import p728pm.C18933a;
import p751qm.C19142b;
import p869vm.C20160a;
import p891wk.C20350e;
import p891wk.C20351f;
import p891wk.C20352g;
import p891wk.C20362q;
import p891wk.C20365t;
import p964zm.C20876b;
import w10.C20268a;

/* renamed from: xm.b */
public final class C20538b implements C13483d<Void> {

    /* renamed from: a */
    public final C20268a f51946a;

    /* renamed from: b */
    public final C13644a.C13645a f51947b;

    /* renamed from: c */
    public final C19142b f51948c;

    /* renamed from: d */
    public final C20160a f51949d;

    /* renamed from: e */
    public final Integer f51950e;

    /* renamed from: f */
    public final C20876b f51951f;

    /* renamed from: g */
    public final C20350e f51952g;

    /* renamed from: h */
    public final List<C20352g> f51953h;

    /* renamed from: i */
    public final Set<String> f51954i;

    /* renamed from: xm.b$a */
    public static class C20539a {

        /* renamed from: a */
        public final C20268a f51955a;

        /* renamed from: b */
        public final C13644a.C13645a f51956b;

        /* renamed from: c */
        public final C19142b f51957c;

        /* renamed from: d */
        public final C20160a f51958d;

        /* renamed from: e */
        public final Integer f51959e;

        /* renamed from: f */
        public final C20876b f51960f;

        public C20539a(C20268a aVar, C13644a.C13645a aVar2, C19142b bVar, C20160a aVar3, Integer num, C20876b bVar2) {
            this.f51955a = aVar;
            this.f51956b = aVar2;
            this.f51957c = bVar;
            this.f51958d = aVar3;
            this.f51959e = num;
            this.f51960f = bVar2;
        }
    }

    public C20538b(C20268a aVar, C13644a.C13645a aVar2, C19142b bVar, C20160a aVar3, Integer num, C20876b bVar2, C20350e eVar, List list, HashSet hashSet) {
        this.f51946a = aVar;
        this.f51947b = aVar2;
        this.f51948c = bVar;
        this.f51949d = aVar3;
        this.f51951f = bVar2;
        this.f51952g = eVar;
        this.f51953h = list;
        this.f51954i = hashSet;
        this.f51950e = num;
    }

    /* renamed from: C */
    public final C13487h<Void> mo40394C() {
        C13487h hVar;
        C13487h hVar2;
        C13487h hVar3;
        ArrayList arrayList;
        C13487h hVar4;
        ArrayList arrayList2 = new ArrayList();
        Map<C20362q, C20365t> map = this.f51952g.f51527a;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            C20362q qVar = (C20362q) next.getKey();
            List<Long> list = ((C20365t) next.getValue()).f51636a;
            if (!list.isEmpty() && !this.f51954i.contains(qVar.f51581C)) {
                hashMap.put(qVar, list);
            }
        }
        for (C20362q qVar2 : hashMap.keySet()) {
            C13487h d = this.f51946a.mo52443d(qVar2.f51581C, qVar2.f51608n);
            if (d.mo40399a()) {
                arrayList2.add(d.f33366b);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = ((C20362q) entry.getKey()).f51581C;
            List list2 = (List) entry.getValue();
            C13644a.C13645a aVar = this.f51947b;
            C13487h<Void> a = new C13644a(aVar.f33677a, aVar.f33678b, aVar.f33679c, str, (Long) Collections.max(list2)).mo40529a();
            if (a.mo40399a()) {
                arrayList2.add(a.f33366b);
            }
            mo52739a(str, list2, arrayList2);
        }
        for (String aVar2 : this.f51954i) {
            C13644a.C13645a aVar3 = this.f51947b;
            C13487h<Void> a2 = new C13644a(aVar3.f33677a, aVar3.f33678b, aVar3.f33679c, aVar2, Long.MAX_VALUE).mo40529a();
            if (a2.mo40399a()) {
                arrayList2.add(a2.f33366b);
            }
        }
        Map<C20362q, C20365t> map2 = this.f51952g.f51527a;
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next2 : map2.entrySet()) {
            String str2 = ((C20362q) next2.getKey()).f51581C;
            List<Long> list3 = ((C20365t) next2.getValue()).f51636a;
            if (!list3.isEmpty() && this.f51954i.contains(str2)) {
                hashMap2.put(str2, list3);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            mo52739a((String) entry2.getKey(), (List) entry2.getValue(), arrayList2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C20352g next3 : this.f51953h) {
            linkedHashMap.put(next3.f51532a, next3);
        }
        for (String remove : this.f51954i) {
            linkedHashMap.remove(remove);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.values());
        C20160a aVar4 = this.f51949d;
        Integer num = this.f51950e;
        aVar4.getClass();
        try {
            arrayList = new ArrayList(aVar4.f51169c.mo51447a().f51528a);
        } catch (ConvertedErrorException e) {
            aVar4.f51168b.getClass();
            C18926a b = C17873f.m44275b(e);
            if (b.mo51438a(C16835c.f43820m.intValue(), "ticket.access")) {
                aVar4.f51171e.mo52737a(b);
                arrayList = new ArrayList();
            } else {
                hVar = C20160a.m47741a(b);
            }
        }
        ArrayList arrayList4 = arrayList;
        Iterator it = arrayList3.iterator();
        while (true) {
            if (it.hasNext()) {
                C20352g gVar = (C20352g) it.next();
                C13872r<Void> c = ((C13868n) aVar4.f51167a.f3985a).mo40786c(C21100e.m49347j0(), gVar.f51532a, gVar.f51534c.toString().getBytes(StandardCharsets.UTF_8));
                if (c.mo40817a()) {
                    hVar4 = new C13487h(null, new C16835c(c.f34120b, C16835c.f43813f, "Save failed"));
                } else {
                    hVar4 = new C13487h(null, (C18926a) null);
                }
                if (hVar4.mo40399a()) {
                    hVar = C20160a.m47741a(hVar4.f33366b);
                    break;
                }
                C13487h d2 = aVar4.f51170d.mo52443d(gVar.f51532a, gVar.f51533b);
                if (d2.mo40399a()) {
                    hVar = C20160a.m47741a(d2.f33366b);
                    break;
                }
                String str3 = gVar.f51532a;
                if (!arrayList4.contains(str3)) {
                    arrayList4.add(str3);
                }
            } else {
                if (num == null) {
                    try {
                        aVar4.f51169c.mo51448b(arrayList4);
                    } catch (ConvertedErrorException e2) {
                        aVar4.f51168b.getClass();
                        hVar = C20160a.m47741a(C17873f.m44275b(e2));
                    }
                } else {
                    C18933a aVar5 = aVar4.f51169c;
                    int intValue = num.intValue();
                    C20351f a3 = aVar5.mo51447a();
                    C13487h a4 = aVar5.f48217b.mo52058a(new C20351f(intValue, a3.f51531d, arrayList4, a3.f51530c));
                    if (a4.mo40399a()) {
                        C17873f fVar = aVar5.f48219d;
                        C18926a aVar6 = a4.f33366b;
                        fVar.getClass();
                        throw C17873f.m44274a(aVar6);
                    }
                }
                hVar = new C13487h(null, (C18926a) null);
            }
        }
        if (hVar.mo40399a()) {
            arrayList2.add(hVar.f33366b);
        }
        C19142b bVar = this.f51948c;
        Set<String> set = this.f51954i;
        bVar.getClass();
        try {
            ArrayList arrayList5 = new ArrayList(bVar.f48669c.mo51447a().f51528a);
            arrayList5.removeAll(set);
            try {
                bVar.f48669c.mo51448b(arrayList5);
                Iterator<String> it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        hVar2 = new C13487h(null, (C18926a) null);
                        break;
                    }
                    C13872r<Void> a5 = ((C13868n) bVar.f48667a.f16037a).mo40784a(C21100e.m49347j0(), it2.next());
                    if (a5.mo40817a()) {
                        hVar3 = new C13487h(null, new C16835c(a5.f34120b, C16835c.f43814g, "Delete failed"));
                    } else {
                        hVar3 = new C13487h(null, (C18926a) null);
                    }
                    if (hVar3.mo40399a()) {
                        hVar2 = new C13487h(null, new C16835c(hVar3.f33366b, C16835c.f43814g, "Delete failed"));
                        break;
                    }
                }
            } catch (ConvertedErrorException e3) {
                bVar.f48668b.getClass();
                hVar2 = new C13487h(null, new C16835c(C17873f.m44275b(e3), C16835c.f43814g, "Delete failed"));
            }
        } catch (ConvertedErrorException e4) {
            bVar.f48668b.getClass();
            hVar2 = new C13487h(null, new C16835c(C17873f.m44275b(e4), C16835c.f43814g, "Delete failed"));
        }
        if (hVar2.mo40399a()) {
            arrayList2.add(hVar2.f33366b);
        }
        if (arrayList2.isEmpty()) {
            return new C13487h<>(null, (C18926a) null);
        }
        return new C13487h<>(null, new C16834b((C18926a) arrayList2.get(0), C16834b.f43811f, "Unable to process sync result"));
    }

    /* renamed from: a */
    public final void mo52739a(String str, List list, ArrayList arrayList) {
        C13487h hVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C13872r<Void> a = this.f51951f.f52610a.mo40784a(C21100e.m49328W(), C20876b.m48871a(((Long) it.next()).longValue(), str));
            if (a.mo40817a()) {
                hVar = new C13487h(null, new C17200a(a.f34120b, C17200a.f44447j, "Delete extra activation information failed"));
            } else {
                hVar = new C13487h(null, (C18926a) null);
            }
            if (hVar.mo40399a()) {
                arrayList.add(hVar.f33366b);
            }
        }
    }
}
