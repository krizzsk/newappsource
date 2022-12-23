package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.appboy.models.outgoing.FacebookUser;
import eh0.C23306d;
import eh0.C23311g;
import java.util.Collection;
import java.util.List;
import kh0.C23789e;
import kh0.C23792h;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import lf0.C24236l;
import mf0.C24362h;
import mf0.C24365j;
import p845um.C19958a;
import rh0.C24819c;
import sf0.C24866j;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25437e;

public final class StaticScopeForKotlinEnum extends C23311g {

    /* renamed from: d */
    public static final /* synthetic */ C24866j<Object>[] f61219d = {C24365j.m61221c(new PropertyReference1Impl(C24365j.m61219a(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: b */
    public final C25432c f61220b;

    /* renamed from: c */
    public final C23789e f61221c;

    public StaticScopeForKotlinEnum(C23792h hVar, C25432c cVar) {
        C24362h.m61211f(hVar, "storageManager");
        C24362h.m61211f(cVar, "containingClass");
        this.f61220b = cVar;
        cVar.mo53513p();
        ClassKind classKind = ClassKind.CLASS;
        this.f61221c = hVar.mo59019d(new StaticScopeForKotlinEnum$functions$2(this));
    }

    /* renamed from: b */
    public final Collection mo53531b(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        C24819c cVar = new C24819c();
        for (Object next : (List) C19958a.m47435j(this.f61221c, f61219d[0])) {
            if (C24362h.m61206a(((C23903e) next).getName(), eVar)) {
                cVar.add(next);
            }
        }
        return cVar;
    }

    /* renamed from: e */
    public final Collection mo53492e(C23306d dVar, C24236l lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        return (List) C19958a.m47435j(this.f61221c, f61219d[0]);
    }

    /* renamed from: g */
    public final C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        return null;
    }
}
