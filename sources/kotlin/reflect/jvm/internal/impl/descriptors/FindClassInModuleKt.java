package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.C24177b;
import kotlin.sequences.SequencesKt__SequencesKt;
import mf0.C24362h;
import p583jk.C17875h;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;
import xg0.C25269l;
import xg0.C25270m;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25485t;
import zf0.C25489x;

public final class FindClassInModuleKt {
    /* renamed from: a */
    public static final C25432c m58735a(C25485t tVar, C25065b bVar) {
        C24362h.m61211f(tVar, "<this>");
        C24362h.m61211f(bVar, "classId");
        C25437e b = m58736b(tVar, bVar);
        if (b instanceof C25432c) {
            return (C25432c) b;
        }
        return null;
    }

    /* renamed from: b */
    public static final C25437e m58736b(C25485t tVar, C25065b bVar) {
        C25485t tVar2;
        C25437e eVar;
        C24362h.m61211f(tVar, "<this>");
        C24362h.m61211f(bVar, "classId");
        C25269l lVar = (C25269l) tVar.mo59456K(C25270m.f63545a);
        if (lVar == null) {
            tVar2 = null;
        } else {
            tVar2 = lVar.mo61875a();
        }
        if (tVar2 == null) {
            C25066c h = bVar.mo61574h();
            C24362h.m61210e(h, "classId.packageFqName");
            C25489x k0 = tVar.mo59458k0(h);
            List<C25069e> g = bVar.mo61576i().f63254a.mo61597g();
            MemberScope o = k0.mo59447o();
            Object j0 = C23825c.m58513j0(g);
            C24362h.m61210e(j0, "segments.first()");
            eVar = o.mo58433g((C25069e) j0, NoLookupLocation.FROM_DESERIALIZATION);
            if (eVar == null) {
                return null;
            }
            for (C25069e next : g.subList(1, g.size())) {
                if (!(eVar instanceof C25432c)) {
                    return null;
                }
                MemberScope X = ((C25432c) eVar).mo53405X();
                C24362h.m61210e(next, "name");
                C25437e g2 = X.mo58433g(next, NoLookupLocation.FROM_DESERIALIZATION);
                if (g2 instanceof C25432c) {
                    eVar = (C25432c) g2;
                    continue;
                } else {
                    eVar = null;
                    continue;
                }
                if (eVar == null) {
                    return null;
                }
            }
        } else {
            C25066c h2 = bVar.mo61574h();
            C24362h.m61210e(h2, "classId.packageFqName");
            C25489x k02 = tVar2.mo59458k0(h2);
            List<C25069e> g3 = bVar.mo61576i().f63254a.mo61597g();
            MemberScope o2 = k02.mo59447o();
            Object j02 = C23825c.m58513j0(g3);
            C24362h.m61210e(j02, "segments.first()");
            C25437e g4 = o2.mo58433g((C25069e) j02, NoLookupLocation.FROM_DESERIALIZATION);
            if (g4 != null) {
                Iterator<C25069e> it = g3.subList(1, g3.size()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C25069e next2 = it.next();
                    if (g4 instanceof C25432c) {
                        MemberScope X2 = ((C25432c) g4).mo53405X();
                        C24362h.m61210e(next2, "name");
                        C25437e g5 = X2.mo58433g(next2, NoLookupLocation.FROM_DESERIALIZATION);
                        if (g5 instanceof C25432c) {
                            g4 = (C25432c) g5;
                            continue;
                        } else {
                            g4 = null;
                            continue;
                        }
                        if (g4 == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            g4 = null;
            if (g4 != null) {
                return g4;
            }
            C25066c h3 = bVar.mo61574h();
            C24362h.m61210e(h3, "classId.packageFqName");
            C25489x k03 = tVar.mo59458k0(h3);
            List<C25069e> g6 = bVar.mo61576i().f63254a.mo61597g();
            MemberScope o3 = k03.mo59447o();
            Object j03 = C23825c.m58513j0(g6);
            C24362h.m61210e(j03, "segments.first()");
            C25437e g7 = o3.mo58433g((C25069e) j03, NoLookupLocation.FROM_DESERIALIZATION);
            if (g7 == null) {
                return null;
            }
            for (C25069e next3 : g6.subList(1, g6.size())) {
                if (!(eVar instanceof C25432c)) {
                    return null;
                }
                MemberScope X3 = ((C25432c) eVar).mo53405X();
                C24362h.m61210e(next3, "name");
                C25437e g8 = X3.mo58433g(next3, NoLookupLocation.FROM_DESERIALIZATION);
                if (g8 instanceof C25432c) {
                    g7 = (C25432c) g8;
                    continue;
                } else {
                    g7 = null;
                    continue;
                }
                if (g7 == null) {
                    return null;
                }
            }
        }
        return eVar;
    }

    /* renamed from: c */
    public static final C25432c m58737c(C25485t tVar, C25065b bVar, NotFoundClasses notFoundClasses) {
        C24362h.m61211f(tVar, "<this>");
        C24362h.m61211f(bVar, "classId");
        C24362h.m61211f(notFoundClasses, "notFoundClasses");
        C25432c a = m58735a(tVar, bVar);
        if (a != null) {
            return a;
        }
        return notFoundClasses.mo59412a(bVar, C17875h.m44285I(C24177b.m60553n0(C24177b.m60549j0(SequencesKt__SequencesKt.m60539Z(bVar, C23885x24bfe126.f60417b), C23886x24bfe127.f60418f))));
    }
}
