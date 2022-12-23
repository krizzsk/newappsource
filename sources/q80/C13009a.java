package q80;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.commons.request.ServerException;
import com.moovit.ticketing.ticket.TicketId;
import com.tranzmate.moovit.protocol.ticketingV2.MVActivateTicketRequest;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketActivationConfirmationRequestInfo;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketActivationRequestInfo;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import m80.C12873i;
import n80.C12915b;
import n80.C12916c;
import n80.C12918d;
import p80.C12991b;
import r80.C13048b;

/* renamed from: q80.a */
public final class C13009a extends C13778r<C13009a, C13011b, MVActivateTicketRequest> implements C12916c.C12917a<Void, ServerException>, Callable<C13011b> {

    /* renamed from: w */
    public final C12991b f32198w;

    /* renamed from: x */
    public final C12916c f32199x;

    public C13009a(C13752e eVar, C12991b bVar, C12916c cVar) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_activate_ticket, C13011b.class);
        this.f32198w = bVar;
        C21100e.m49373x(cVar, "requestInfo");
        this.f32199x = cVar;
        this.f51770m = new C14291m0(eVar, "ticketing_activate");
    }

    /* renamed from: E */
    public final List<C13011b> mo21059E() throws IOException, ServerException {
        C13011b activateTicket = C13048b.f32272c.activateTicket(this.f33829q, this.f32198w, this.f32199x);
        if (activateTicket == null) {
            this.f32199x.mo39783a(this);
            return Collections.emptyList();
        }
        this.f51765h = true;
        return Collections.singletonList(activateTicket);
    }

    public final Object call() throws Exception {
        return (C13011b) mo52626J();
    }

    /* renamed from: i */
    public final Object mo39784i(C12918d dVar) throws Exception {
        TicketId ticketId = dVar.f31981a.f23473b;
        int i = ticketId.f23511b.f15142b;
        String str = ticketId.f23513d;
        RO mVActivateTicketRequest = new MVActivateTicketRequest();
        mVActivateTicketRequest.providerId = i;
        mVActivateTicketRequest.mo32307i();
        mVActivateTicketRequest.ticketId = str;
        MVTicketActivationConfirmationRequestInfo mVTicketActivationConfirmationRequestInfo = new MVTicketActivationConfirmationRequestInfo();
        mVTicketActivationConfirmationRequestInfo.isAccepted = true;
        mVTicketActivationConfirmationRequestInfo.mo33054g();
        MVTicketActivationRequestInfo mVTicketActivationRequestInfo = new MVTicketActivationRequestInfo();
        mVTicketActivationRequestInfo.setField_ = MVTicketActivationRequestInfo._Fields.CONFIRM;
        mVTicketActivationRequestInfo.value_ = mVTicketActivationConfirmationRequestInfo;
        mVActivateTicketRequest.requestInfo = mVTicketActivationRequestInfo;
        this.f33922v = mVActivateTicketRequest;
        return null;
    }

    /* renamed from: l */
    public final Object mo39785l(C12915b bVar) throws Exception {
        TicketId ticketId = bVar.f31981a.f23473b;
        int i = ticketId.f23511b.f15142b;
        String str = ticketId.f23513d;
        RO mVActivateTicketRequest = new MVActivateTicketRequest();
        mVActivateTicketRequest.providerId = i;
        mVActivateTicketRequest.mo32307i();
        mVActivateTicketRequest.ticketId = str;
        this.f33922v = mVActivateTicketRequest;
        return null;
    }
}
