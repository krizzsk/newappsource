package hg0;

import cf0.C21136j;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import mf0.C24362h;
import p389bl.C13637c;
import p389bl.C13641g;
import ug0.C25066c;
import ug0.C25067d;
import ug0.C25069e;

/* renamed from: hg0.c */
public final class C23461c {

    /* renamed from: a */
    public static final Map<C25066c, C25069e> f59242a;

    /* renamed from: b */
    public static final LinkedHashMap f59243b;

    /* renamed from: c */
    public static final Set<C25066c> f59244c;

    /* renamed from: d */
    public static final Set<C25069e> f59245d;

    static {
        C25067d dVar = C23872e.C23873a.f60372j;
        C25066c cVar = C23872e.C23873a.f60339E;
        Map<C25066c, C25069e> X = C23826d.m58533X(new Pair(C13641g.m34113a(dVar, "name"), C25069e.m62820i("name")), new Pair(C13641g.m34113a(dVar, MediationMetaData.KEY_ORDINAL), C25069e.m62820i(MediationMetaData.KEY_ORDINAL)), new Pair(C23872e.C23873a.f60335A.mo61581c(C25069e.m62820i("size")), C25069e.m62820i("size")), new Pair(cVar.mo61581c(C25069e.m62820i("size")), C25069e.m62820i("size")), new Pair(C13641g.m34113a(C23872e.C23873a.f60367e, "length"), C25069e.m62820i("length")), new Pair(cVar.mo61581c(C25069e.m62820i("keys")), C25069e.m62820i("keySet")), new Pair(cVar.mo61581c(C25069e.m62820i(LinksConfiguration.KEY_VALUES)), C25069e.m62820i(LinksConfiguration.KEY_VALUES)), new Pair(cVar.mo61581c(C25069e.m62820i("entries")), C25069e.m62820i("entrySet")));
        f59242a = X;
        Set<Map.Entry<C25066c, C25069e>> entrySet = X.entrySet();
        ArrayList arrayList = new ArrayList(C21136j.m49436X(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new Pair(((C25066c) entry.getKey()).mo61585f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            C25069e eVar = (C25069e) pair.mo59069d();
            Object obj = linkedHashMap.get(eVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(eVar, obj);
            }
            ((List) obj).add((C25069e) pair.mo59068c());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C13637c.m34083z(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            C24362h.m61211f(iterable, "<this>");
            linkedHashMap2.put(key, C23825c.m58499K0(C23825c.m58502N0(iterable)));
        }
        f59243b = linkedHashMap2;
        Set<C25066c> keySet = f59242a.keySet();
        f59244c = keySet;
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(keySet, 10));
        for (C25066c f : keySet) {
            arrayList2.add(f.mo61585f());
        }
        f59245d = C23825c.m58503O0(arrayList2);
    }
}
