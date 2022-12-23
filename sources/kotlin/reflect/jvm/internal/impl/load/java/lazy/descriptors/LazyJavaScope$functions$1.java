package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kg0.C23780d;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import lf0.C24236l;
import mf0.C24362h;
import p584jl.C17885a;
import ug0.C25069e;

public final class LazyJavaScope$functions$1 extends Lambda implements C24236l<C25069e, Collection<? extends C23903e>> {
    public final /* synthetic */ LazyJavaScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$functions$1(LazyJavaScope lazyJavaScope) {
        super(1);
        this.this$0 = lazyJavaScope;
    }

    public final Object invoke(Object obj) {
        C25069e eVar = (C25069e) obj;
        C24362h.m61211f(eVar, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) ((LockBasedStorageManager.C24148k) this.this$0.f60688f).invoke(eVar));
        this.this$0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : linkedHashSet) {
            String z = C17885a.m44474z((C23903e) next, 2);
            Object obj2 = linkedHashMap.get(z);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(z, obj2);
            }
            ((List) obj2).add(next);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection a = OverridingUtilsKt.m60264a(list, LazyJavaScope$retainMostSpecificMethods$mostSpecificMethods$1.f60703f);
                linkedHashSet.removeAll(list);
                linkedHashSet.addAll(a);
            }
        }
        this.this$0.mo59537m(linkedHashSet, eVar);
        C23780d dVar = this.this$0.f60684b;
        return C23825c.m58499K0(dVar.f60080a.f60072r.mo59573a(dVar, linkedHashSet));
    }
}
