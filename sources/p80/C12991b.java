package p80;

import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import ce0.C21100e;
import com.moovit.commons.geo.Polygon;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.configuration.TicketingAgencyCapability;
import com.moovit.ticketing.providers.TicketingEngine;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p684nq.C18583d;
import p810sz.C19575a;
import p810sz.C19576b;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p826tr.C19752b;

/* renamed from: p80.b */
public final class C12991b {

    /* renamed from: f */
    public static final C12992a f32158f = new C12992a();

    /* renamed from: a */
    public final Map<ServerId, List<C12989a>> f32159a;

    /* renamed from: b */
    public final Set<TicketingAgencyCapability> f32160b;

    /* renamed from: c */
    public final boolean f32161c;

    /* renamed from: d */
    public final List<ServerId> f32162d;

    /* renamed from: e */
    public final Set<Polygon> f32163e;

    /* renamed from: p80.b$a */
    public class C12992a extends C19619s<C12991b> {
        public C12992a() {
            super(0, C12991b.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ServerId.C4255c cVar = ServerId.f15141f;
            return new C12991b(pVar.mo51959g(cVar), pVar.mo51961o(cVar, C19575a.m46957a(C12989a.f32148j, true), new HashMap()));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C12991b bVar = (C12991b) obj;
            Map<ServerId, List<C12989a>> map = bVar.f32159a;
            ServerId.C4254b bVar2 = ServerId.f15140e;
            qVar.mo51966o(map, bVar2, new C19576b(C12989a.f32148j, true));
            qVar.mo51965h(bVar.f32162d, bVar2);
        }
    }

    public C12991b(ArrayList arrayList, Map map) {
        C21100e.m49373x(map, "agenciesByProviderId");
        this.f32159a = Collections.unmodifiableMap(map);
        Collection<List> values = map.values();
        HashSet hashSet = new HashSet(TicketingAgencyCapability.values().length);
        for (List<C12989a> it : values) {
            for (C12989a aVar : it) {
                hashSet.addAll(aVar.f32153e);
            }
        }
        this.f32160b = Collections.unmodifiableSet(hashSet);
        Set<Polygon> set = null;
        this.f32161c = Collections.unmodifiableSet(C13720d.m34277g(Arrays.asList(TicketingEngine.values()), (C13722f) null, new C19752b(19))).containsAll(map.keySet());
        C21100e.m49373x(arrayList, "validationInfoProviderIds");
        this.f32162d = Collections.unmodifiableList(arrayList);
        Collection<List> values2 = map.values();
        Iterator it2 = values2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (C13723g.m34280a((List) it2.next(), new C18583d(9))) {
                    break;
                }
            } else {
                HashSet hashSet2 = new HashSet();
                for (List<C12989a> it3 : values2) {
                    for (C12989a aVar2 : it3) {
                        Set<Polygon> set2 = aVar2.f32156h;
                        if (set2 != null) {
                            hashSet2.addAll(set2);
                        }
                    }
                }
                set = Collections.unmodifiableSet(hashSet2);
            }
        }
        this.f32163e = set;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: p80.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: p80.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: p80.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: p80.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p80.C12989a mo39880a(com.moovit.network.model.ServerId r4, java.lang.String r5) {
        /*
            r3 = this;
            java.util.Map<com.moovit.network.model.ServerId, java.util.List<p80.a>> r0 = r3.f32159a
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            r0 = 0
            if (r4 != 0) goto L_0x000c
            goto L_0x0028
        L_0x000c:
            java.util.Iterator r4 = r4.iterator()
        L_0x0010:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0028
            java.lang.Object r1 = r4.next()
            r2 = r1
            p80.a r2 = (p80.C12989a) r2
            com.moovit.ticketing.ticket.TicketAgency r2 = r2.f32150b
            java.lang.String r2 = r2.f23495b
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0010
            r0 = r1
        L_0x0028:
            p80.a r0 = (p80.C12989a) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p80.C12991b.mo39880a(com.moovit.network.model.ServerId, java.lang.String):p80.a");
    }

    /* renamed from: b */
    public final boolean mo39881b(TicketingAgencyCapability ticketingAgencyCapability) {
        return this.f32160b.contains(ticketingAgencyCapability);
    }
}
