package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.C24062a;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25066c;

public final class NullabilityAnnotationStatesImpl$cache$1 extends Lambda implements C24236l<C25066c, T> {
    public final /* synthetic */ NullabilityAnnotationStatesImpl<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NullabilityAnnotationStatesImpl$cache$1(NullabilityAnnotationStatesImpl<T> nullabilityAnnotationStatesImpl) {
        super(1);
        this.this$0 = nullabilityAnnotationStatesImpl;
    }

    public final Object invoke(Object obj) {
        Object obj2;
        C25066c cVar = (C25066c) obj;
        C24362h.m61210e(cVar, "it");
        Map<C25066c, T> map = this.this$0.f60557b;
        C24362h.m61211f(map, LinksConfiguration.KEY_VALUES);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<C25066c, T>> it = map.entrySet().iterator();
        while (true) {
            boolean z = true;
            C25066c cVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            C25066c cVar3 = (C25066c) next.getKey();
            if (!C24362h.m61206a(cVar, cVar3)) {
                C24362h.m61211f(cVar3, "packageName");
                if (!cVar.mo61582d()) {
                    cVar2 = cVar.mo61583e();
                }
                if (!C24362h.m61206a(cVar2, cVar3)) {
                    z = false;
                }
            }
            if (z) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        if (!it2.hasNext()) {
            obj2 = null;
        } else {
            obj2 = it2.next();
            if (it2.hasNext()) {
                int length = C24062a.m60024b((C25066c) ((Map.Entry) obj2).getKey(), cVar).mo61580b().length();
                do {
                    Object next2 = it2.next();
                    int length2 = C24062a.m60024b((C25066c) ((Map.Entry) next2).getKey(), cVar).mo61580b().length();
                    if (length > length2) {
                        obj2 = next2;
                        length = length2;
                    }
                } while (it2.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }
}
