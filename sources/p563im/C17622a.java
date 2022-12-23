package p563im;

import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p069e3.C4544g;
import p358af.C13437d;
import p364al.C13487h;
import p388bk.C13634a;
import p443dm.C16675a;
import p445do.C16690b;
import p517go.C17210b;
import p583jk.C17875h;
import p609km.C18106j;
import p634ln.C18247a;
import p705on.C18801i;
import p705on.C18805l;
import p725pj.C18926a;
import p752qn.C19148f;
import p796sl.C19472c;
import p817ti.C19682a;
import p843uk.C19918a0;
import p843uk.C19920b0;
import p843uk.C19923c0;
import p843uk.C19933h;
import p843uk.C19935i;
import p843uk.C19945o;
import p846un.C19960b;

/* renamed from: im.a */
public final class C17622a {

    /* renamed from: a */
    public final C16690b f45298a;

    /* renamed from: b */
    public final C17210b f45299b;

    /* renamed from: c */
    public final C18106j f45300c;

    /* renamed from: d */
    public final C18805l.C18806a f45301d;

    /* renamed from: e */
    public final C4544g f45302e;

    /* renamed from: f */
    public final C19472c.C19473a f45303f;

    /* renamed from: g */
    public final C19960b f45304g;

    public C17622a(C16690b bVar, C17210b bVar2, C18106j jVar, C18805l.C18806a aVar, C4544g gVar, C19472c.C19473a aVar2, C19960b bVar3) {
        this.f45298a = bVar;
        this.f45299b = bVar2;
        this.f45300c = jVar;
        this.f45301d = aVar;
        this.f45302e = gVar;
        this.f45303f = aVar2;
        this.f45304g = bVar3;
    }

    /* renamed from: a */
    public final C13487h<C18801i> mo50078a(C18247a aVar, C18247a aVar2, List<String> list) {
        List<String> list2;
        C13487h hVar;
        boolean z;
        List<String> list3;
        boolean z2;
        C18247a aVar3 = aVar;
        C18247a aVar4 = aVar2;
        if (list != null) {
            list2 = list;
        } else {
            if (aVar3 == null || aVar4 == null) {
                list3 = Collections.singletonList("DISCRETE");
            } else {
                C19472c.C19473a aVar5 = this.f45303f;
                C13487h<List<C18247a>> C = new C19472c(aVar5.f49520a, aVar3.f46552a).mo40394C();
                if (C.mo40399a()) {
                    return new C13487h<>(null, new C13634a(C.f33366b, C13634a.f33600D, "There was an issue checking that the destination matches the origin"));
                }
                int intValue = aVar4.f46552a.intValue();
                Iterator it = ((List) C.f33365a).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C18247a) it.next()).f46552a.intValue() == intValue) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (!z2) {
                    return new C13487h<>(null, new C13634a((C18926a) null, C13634a.f33599C, "The origin and destination pair provided is not valid"));
                }
                String valueOf = String.valueOf(aVar3.f46552a);
                String valueOf2 = String.valueOf(aVar4.f46552a);
                list3 = Arrays.asList(new String[]{C13437d.m33706k(valueOf, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, valueOf2), C13437d.m33706k(valueOf2, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, valueOf)});
            }
            list2 = list3;
        }
        C18106j jVar = this.f45300c;
        C19920b0.C19921a aVar6 = jVar.f46298a;
        C19682a aVar7 = jVar.f46299b;
        aVar6.getClass();
        C13487h C2 = aVar7.mo50642a(new C19920b0(new C19933h(Collections.singletonList(new C19935i("selectionKeys", list2))))).mo40394C();
        if (C2.mo40399a()) {
            hVar = new C13487h(null, C2.f33366b);
        } else {
            hVar = new C13487h(((C19923c0) C2.f33365a).f50596d, (C18926a) null);
        }
        if (hVar.mo40399a()) {
            return new C13487h<>(null, new C16675a(ProductAction.ACTION_PURCHASE, new HashMap()).mo49399a(hVar.f33366b));
        }
        List<C19918a0> list4 = (List) hVar.f33365a;
        if (C17875h.m44278B(list4)) {
            return new C13487h<>(null, new C13634a((C18926a) null, C13634a.f33611e, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."));
        }
        C4544g gVar = this.f45302e;
        gVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (C19918a0 a0Var : list4) {
            if (C17875h.m44278B(a0Var.f50585q) || ((List) gVar.f15660c).containsAll(a0Var.f50585q)) {
                arrayList.add(a0Var);
            }
        }
        if (C17875h.m44278B(arrayList)) {
            return new C13487h<>(null, new C13634a((C18926a) null, C13634a.f33598B, "No products for the given selection key are supported by this version of the SDK"));
        }
        int size = list4.size() - arrayList.size();
        Iterator it2 = list4.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            Integer num = ((C19918a0) it2.next()).f50584p;
            if (num != null && num.intValue() > 0) {
                z = true;
                break;
            }
        }
        String a = this.f45304g.mo52262a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C19918a0 a0Var2 = (C19918a0) it3.next();
            linkedHashMap.put(a0Var2.f50574f, a0Var2);
        }
        Map emptyMap = Collections.emptyMap();
        Long valueOf3 = Long.valueOf(this.f45298a.mo49402a());
        if (a == null) {
            throw new IllegalArgumentException("OrderId is null");
        } else if (valueOf3 == null) {
            throw new IllegalArgumentException("startTimeStamp is null");
        } else if (list2 == null) {
            throw new IllegalArgumentException("selectionKeys is null");
        } else if (emptyMap != null) {
            C19945o oVar = new C19945o(a, valueOf3, linkedHashMap, list2, emptyMap, size, aVar, aVar2);
            this.f45299b.f44499a.put(a, oVar);
            List emptyList = Collections.emptyList();
            ArrayList a2 = this.f45301d.mo51295a(arrayList);
            C19148f a3 = oVar.mo52238a();
            C18247a aVar8 = oVar.f50671f;
            C18247a aVar9 = oVar.f50672g;
            if (emptyList != null) {
                return new C13487h<>(new C18801i(a, a2, a3, z, emptyList, size, aVar8, aVar9), (C18926a) null);
            }
            throw new IllegalArgumentException("lineItems is null");
        } else {
            throw new IllegalArgumentException("selectedProducts is null");
        }
    }
}
