package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.appboy.models.outgoing.FacebookUser;
import eh0.C23306d;
import eh0.C23311g;
import java.util.Collection;
import java.util.List;
import kh0.C23789e;
import kh0.C23792h;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import p845um.C19958a;
import rh0.C24819c;
import sf0.C24866j;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25442g;
import zf0.C25491z;

public abstract class GivenFunctionsMemberScope extends C23311g {

    /* renamed from: d */
    public static final /* synthetic */ C24866j<Object>[] f61210d = {C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b */
    public final C25432c f61211b;

    /* renamed from: c */
    public final C23789e f61212c;

    public GivenFunctionsMemberScope(C23792h hVar, C25432c cVar) {
        C24362h.m61211f(hVar, "storageManager");
        C24362h.m61211f(cVar, "containingClass");
        this.f61211b = cVar;
        this.f61212c = hVar.mo59019d(new GivenFunctionsMemberScope$allDescriptors$2(this));
    }

    /* renamed from: b */
    public final Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        C24819c cVar = new C24819c();
        for (Object next : (List) C19958a.m47435j(this.f61212c, f61210d[0])) {
            if ((next instanceof C23903e) && C24362h.m61206a(((C23903e) next).getName(), eVar)) {
                cVar.add(next);
            }
        }
        return cVar;
    }

    /* renamed from: c */
    public final Collection mo53532c(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        C24819c cVar = new C24819c();
        for (Object next : (List) C19958a.m47435j(this.f61212c, f61210d[0])) {
            if ((next instanceof C25491z) && C24362h.m61206a(((C25491z) next).getName(), eVar)) {
                cVar.add(next);
            }
        }
        return cVar;
    }

    /* renamed from: e */
    public final Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        if (!dVar.mo58439a(C23306d.f59099n.f59106b)) {
            return EmptyList.f60173b;
        }
        return (List) C19958a.m47435j(this.f61212c, f61210d[0]);
    }

    /* renamed from: h */
    public abstract List<C23900c> mo60183h();
}
