package j80;

import ce0.C21100e;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p810sz.C19575a;
import p810sz.C19576b;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: j80.g */
public final class C12786g {

    /* renamed from: g */
    public static final C12787a f31604g = new C12787a();

    /* renamed from: a */
    public final List<ServerId> f31605a;

    /* renamed from: b */
    public final Map<ServerId, String> f31606b;

    /* renamed from: c */
    public final List<ServerId> f31607c;

    /* renamed from: d */
    public final Map<ServerId, List<ServerId>> f31608d;

    /* renamed from: e */
    public final Map<ServerId, String> f31609e;

    /* renamed from: f */
    public final Map<ServerId, SearchLineItem> f31610f;

    /* renamed from: j80.g$a */
    public class C12787a extends C19619s<C12786g> {
        public C12787a() {
            super(0, C12786g.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ServerId.C4255c cVar = ServerId.f15141f;
            ArrayList g = pVar.mo51959g(cVar);
            C19589j.C19598i iVar = C19589j.f49779k;
            return new C12786g(g, pVar.mo51961o(cVar, iVar, new HashMap()), pVar.mo51959g(cVar), pVar.mo51961o(cVar, C19575a.m46957a(cVar, true), new HashMap()), pVar.mo51961o(cVar, iVar, new HashMap()), pVar.mo51961o(cVar, SearchLineItem.f41636j, new HashMap()));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C12786g gVar = (C12786g) obj;
            List<ServerId> list = gVar.f31605a;
            ServerId.C4254b bVar = ServerId.f15140e;
            qVar.mo51965h(list, bVar);
            Map<ServerId, String> map = gVar.f31606b;
            C19600l.C19609i iVar = C19600l.f49790t;
            qVar.mo51966o(map, bVar, iVar);
            qVar.mo51965h(gVar.f31607c, bVar);
            qVar.mo51966o(gVar.f31608d, bVar, new C19576b(bVar, true));
            qVar.mo51966o(gVar.f31609e, bVar, iVar);
            qVar.mo51966o(gVar.f31610f, bVar, SearchLineItem.f41635i);
        }
    }

    public C12786g(List<ServerId> list, Map<ServerId, String> map, List<ServerId> list2, Map<ServerId, ? extends List<ServerId>> map2, Map<ServerId, String> map3, Map<ServerId, SearchLineItem> map4) {
        C21100e.m49373x(list, "agencies");
        this.f31605a = Collections.unmodifiableList(list);
        C21100e.m49373x(map, "feedByAgencyId");
        this.f31606b = Collections.unmodifiableMap(map);
        C21100e.m49373x(list2, "lineGroupAgencies");
        this.f31607c = Collections.unmodifiableList(list2);
        C21100e.m49373x(map2, "agencyLineGroups");
        this.f31608d = Collections.unmodifiableMap(map2);
        C21100e.m49373x(map3, "feedByLineGroupId");
        this.f31609e = Collections.unmodifiableMap(map3);
        C21100e.m49373x(map4, "searchLineItemsById");
        this.f31610f = Collections.unmodifiableMap(map4);
    }

    /* renamed from: a */
    public static C12786g m32590a() {
        return new C12786g(Collections.emptyList(), Collections.emptyMap(), Collections.emptyList(), Collections.emptyMap(), Collections.emptyMap(), Collections.emptyMap());
    }
}
