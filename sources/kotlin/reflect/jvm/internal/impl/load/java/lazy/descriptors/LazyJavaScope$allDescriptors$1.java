package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import eh0.C23303c;
import eh0.C23306d;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24225a;
import lf0.C24236l;
import mf0.C24361g;
import mf0.C24362h;
import ug0.C25069e;
import zf0.C25442g;

public final class LazyJavaScope$allDescriptors$1 extends Lambda implements C24225a<Collection<? extends C25442g>> {
    public final /* synthetic */ LazyJavaScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaScope$allDescriptors$1(LazyJavaScope lazyJavaScope) {
        super(0);
        this.this$0 = lazyJavaScope;
    }

    public final Object invoke() {
        LazyJavaScope lazyJavaScope = this.this$0;
        C23306d dVar = C23306d.f59098m;
        MemberScope.f61214a.getClass();
        C24236l<C25069e, Boolean> lVar = MemberScope.Companion.f61216b;
        lazyJavaScope.getClass();
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (dVar.mo58439a(C23306d.f59097l)) {
            for (C25069e next : lazyJavaScope.mo59533h(dVar, lVar)) {
                if (lVar.invoke(next).booleanValue()) {
                    C24361g.m61168j(lazyJavaScope.mo58433g(next, noLookupLocation), linkedHashSet);
                }
            }
        }
        if (dVar.mo58439a(C23306d.f59094i) && !dVar.f59105a.contains(C23303c.C23304a.f59085a)) {
            for (C25069e next2 : lazyJavaScope.mo59534i(dVar, lVar)) {
                if (lVar.invoke(next2).booleanValue()) {
                    linkedHashSet.addAll(lazyJavaScope.mo53531b(next2, noLookupLocation));
                }
            }
        }
        if (dVar.mo58439a(C23306d.f59095j) && !dVar.f59105a.contains(C23303c.C23304a.f59085a)) {
            for (C25069e eVar : lazyJavaScope.mo59539o(dVar)) {
                if (lVar.invoke(eVar).booleanValue()) {
                    linkedHashSet.addAll(lazyJavaScope.mo53532c(eVar, noLookupLocation));
                }
            }
        }
        return C23825c.m58499K0(linkedHashSet);
    }
}
