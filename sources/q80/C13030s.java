package q80;

import c00.C13720d;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ticketing.ticket.Ticket;
import com.tranzmate.moovit.protocol.ticketingV2.MVUserRefreshTicketsStatusResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import org.apache.thrift.TBase;
import p009a8.C0112l;
import p054d0.C4303q;

/* renamed from: q80.s */
public final class C13030s extends C13780t<C13029r, C13030s, MVUserRefreshTicketsStatusResponse> {

    /* renamed from: m */
    public Map<String, Ticket.Status> f32240m = Collections.emptyMap();

    public C13030s() {
        super(MVUserRefreshTicketsStatusResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C13029r rVar = (C13029r) aVar;
        this.f32240m = Collections.unmodifiableMap(C13720d.m34274d(((MVUserRefreshTicketsStatusResponse) tBase).ticketStatuses, new C0112l(21), new C4303q(22)));
    }
}
