package eh0;

import com.appboy.models.outgoing.FacebookUser;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25069e;
import zf0.C25437e;
import zf0.C25442g;

/* renamed from: eh0.g */
public abstract class C23311g implements MemberScope {
    /* renamed from: a */
    public Set<C25069e> mo53530a() {
        Collection<C25442g> e = mo53492e(C23306d.f59101p, FunctionsKt.f61392a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : e) {
            if (next instanceof C23903e) {
                C25069e name = ((C23903e) next).getName();
                C24362h.m61210e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return EmptyList.f60173b;
    }

    /* renamed from: c */
    public Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return EmptyList.f60173b;
    }

    /* renamed from: d */
    public Set<C25069e> mo53533d() {
        Collection<C25442g> e = mo53492e(C23306d.f59102q, FunctionsKt.f61392a);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T next : e) {
            if (next instanceof C23903e) {
                C25069e name = ((C23903e) next).getName();
                C24362h.m61210e(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        return EmptyList.f60173b;
    }

    /* renamed from: f */
    public Set<C25069e> mo53493f() {
        return null;
    }

    /* renamed from: g */
    public C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return null;
    }
}
