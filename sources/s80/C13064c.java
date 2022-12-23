package s80;

import a30.C0068a;
import com.google.android.play.core.assetpacks.C14333w2;
import com.moovit.commons.request.ServerException;
import com.moovit.ticketing.providers.masabi.MasabiTicketingException;
import com.moovit.ticketing.ticket.TicketId;
import java.util.HashMap;
import java.util.Map;
import n80.C12914a;
import n80.C12915b;
import n80.C12916c;
import n80.C12918d;
import p657mn.C18406b;
import p774rn.C19291a;
import p988j$.util.DesugarCollections;
import q80.C13011b;

/* renamed from: s80.c */
public final class C13064c implements C12916c.C12917a<C13011b, ServerException> {

    /* renamed from: b */
    public final Map<TicketId, C19291a> f32317b = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: i */
    public final Object mo39784i(C12918d dVar) throws Exception {
        TicketId ticketId = dVar.f31981a.f23473b;
        C19291a remove = this.f32317b.remove(ticketId);
        if (remove != null) {
            C0068a.m121c(ticketId.f23514e).mo160a(remove);
            return new C13011b(ticketId);
        }
        throw new MasabiTicketingException("Missing preview for ticket id=" + ticketId);
    }

    /* renamed from: l */
    public final Object mo39785l(C12915b bVar) throws Exception {
        C19291a aVar;
        String str;
        String str2;
        TicketId ticketId = bVar.f31981a.f23473b;
        C0068a c = C0068a.m121c(ticketId.f23514e);
        String str3 = ticketId.f23513d;
        synchronized (c) {
            if (c.mo163f()) {
                C14333w2 a = c.mo161d().f46178h.mo50533a(str3);
                c.mo168k(a, "Failed to complete ticket activation");
                aVar = (C19291a) a.f36107c;
                str = null;
                if (aVar.f49045b.f48677h) {
                    c.mo160a(aVar);
                    aVar = null;
                }
            } else {
                throw new IllegalStateException("Activating ticket with anonymous user!");
            }
        }
        if (aVar == null) {
            return new C13011b(ticketId);
        }
        this.f32317b.put(ticketId, aVar);
        C18406b bVar2 = aVar.f49045b.f48676g;
        if (bVar2 == null) {
            str2 = null;
        } else {
            str2 = bVar2.f46929b;
        }
        if (bVar2 != null) {
            str = bVar2.f46928a;
        }
        return new C13011b(new C12914a(str2, str));
    }
}
