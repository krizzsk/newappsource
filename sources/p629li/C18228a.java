package p629li;

import com.masabi.justride.sdk.jobs.network.broker.BrokerEndpoint;
import p411cm.C13844b;
import p443dm.C16678c;
import p443dm.C16682g;
import p443dm.C16684i;
import p819tk.C19686c;
import p819tk.C19687d;

/* renamed from: li.a */
public abstract class C18228a<Request extends C19686c, Response extends C19687d> {

    /* renamed from: a */
    public final BrokerEndpoint f46507a;

    /* renamed from: b */
    public final C16684i.C16685a f46508b;

    /* renamed from: c */
    public final C16678c f46509c;

    /* renamed from: d */
    public final Class<Response> f46510d;

    public C18228a(BrokerEndpoint brokerEndpoint, C16684i.C16685a aVar, C16678c cVar, Class<Response> cls) {
        this.f46507a = brokerEndpoint;
        this.f46508b = aVar;
        this.f46509c = cVar;
        this.f46510d = cls;
    }

    /* renamed from: a */
    public final C13844b<Response> mo50642a(Request request) {
        C16684i.C16685a aVar = this.f46508b;
        C16684i iVar = new C16684i(this.f46507a, request, this.f46510d, aVar.f43465a, aVar.f43466b, aVar.f43467c, aVar.f43468d);
        C16678c cVar = this.f46509c;
        if (cVar == null) {
            return iVar;
        }
        return new C16682g(iVar, cVar.f43448a);
    }
}
