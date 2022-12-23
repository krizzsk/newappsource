package kotlin.reflect.jvm.internal;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import tf0.C24969e;
import tf0.C24978j;
import ug0.C25069e;
import uh0.C25075c;
import zf0.C25478n;
import zf0.C25491z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"V", "Lzf0/z;", "kotlin.jvm.PlatformType", "invoke", "()Lzf0/z;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class KPropertyImpl$_descriptor$1 extends Lambda implements C24225a<C25491z> {
    public final /* synthetic */ KPropertyImpl<V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$_descriptor$1(KPropertyImpl<? extends V> kPropertyImpl) {
        super(0);
        this.this$0 = kPropertyImpl;
    }

    public final Object invoke() {
        String str;
        KPropertyImpl<V> kPropertyImpl = this.this$0;
        KDeclarationContainerImpl kDeclarationContainerImpl = kPropertyImpl.f60257c;
        String str2 = kPropertyImpl.f60258d;
        String str3 = kPropertyImpl.f60259e;
        kDeclarationContainerImpl.getClass();
        C24362h.m61211f(str2, "name");
        C24362h.m61211f(str3, InAppPurchaseMetaData.KEY_SIGNATURE);
        C25075c a = KDeclarationContainerImpl.f60224b.mo60282a(str3);
        boolean z = true;
        if (a != null) {
            String str4 = (String) ((C25075c.C25076a) a.mo61610a()).get(1);
            C25491z h = kDeclarationContainerImpl.mo59307h(Integer.parseInt(str4));
            if (h != null) {
                return h;
            }
            StringBuilder l = C13555b.m33973l("Local property #", str4, " not found in ");
            l.append(kDeclarationContainerImpl.mo59301a());
            throw new KotlinReflectionInternalError(l.toString());
        }
        Collection<C25491z> k = kDeclarationContainerImpl.mo59309k(C25069e.m62820i(str2));
        ArrayList arrayList = new ArrayList();
        for (T next : k) {
            if (C24362h.m61206a(C24978j.m62672b((C25491z) next).mo61523a(), str3)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder h2 = C16759e.m42352h("Property '", str2, "' (JVM signature: ", str3, ") not resolved in ");
            h2.append(kDeclarationContainerImpl);
            throw new KotlinReflectionInternalError(h2.toString());
        } else if (arrayList.size() == 1) {
            return (C25491z) C23825c.m58491C0(arrayList);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                C25478n g = ((C25491z) next2).mo53429g();
                Object obj = linkedHashMap.get(g);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(g, obj);
                }
                ((List) obj).add(next2);
            }
            TreeMap treeMap = new TreeMap(C24969e.f63108b);
            treeMap.putAll(linkedHashMap);
            Collection values = treeMap.values();
            C24362h.m61210e(values, "properties\n             …\n                }.values");
            List list = (List) C23825c.m58521r0(values);
            if (list.size() == 1) {
                return (C25491z) C23825c.m58513j0(list);
            }
            String q0 = C23825c.m58520q0(kDeclarationContainerImpl.mo59309k(C25069e.m62820i(str2)), "\n", (String) null, (String) null, KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1.f60228f, 30);
            StringBuilder h3 = C16759e.m42352h("Property '", str2, "' (JVM signature: ", str3, ") not resolved in ");
            h3.append(kDeclarationContainerImpl);
            h3.append(':');
            if (q0.length() != 0) {
                z = false;
            }
            if (z) {
                str = " no members found";
            } else {
                str = C24362h.m61216k(q0, "\n");
            }
            h3.append(str);
            throw new KotlinReflectionInternalError(h3.toString());
        }
    }
}
