package eh0;

import com.appboy.models.outgoing.FacebookUser;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25069e;
import zf0.C25437e;
import zf0.C25442g;

/* renamed from: eh0.a */
public abstract class C23300a implements MemberScope {
    /* renamed from: a */
    public final Set<C25069e> mo53530a() {
        return mo58435i().mo53530a();
    }

    /* renamed from: b */
    public Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return mo58435i().mo53531b(eVar, noLookupLocation);
    }

    /* renamed from: c */
    public Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return mo58435i().mo53532c(eVar, noLookupLocation);
    }

    /* renamed from: d */
    public final Set<C25069e> mo53533d() {
        return mo58435i().mo53533d();
    }

    /* renamed from: e */
    public Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        return mo58435i().mo53492e(dVar, lVar);
    }

    /* renamed from: f */
    public final Set<C25069e> mo53493f() {
        return mo58435i().mo53493f();
    }

    /* renamed from: g */
    public final C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return mo58435i().mo58433g(eVar, noLookupLocation);
    }

    /* renamed from: h */
    public final MemberScope mo58434h() {
        if (mo58435i() instanceof C23300a) {
            return ((C23300a) mo58435i()).mo58434h();
        }
        return mo58435i();
    }

    /* renamed from: i */
    public abstract MemberScope mo58435i();
}
