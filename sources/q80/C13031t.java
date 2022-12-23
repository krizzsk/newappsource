package q80;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.ticketing.ticket.TicketId;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketMultiReceiptRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import m80.C12873i;
import p826tr.C19752b;

/* renamed from: q80.t */
public final class C13031t extends C13778r<C13031t, C13032u, MVTicketMultiReceiptRequest> implements Callable<C13032u> {

    /* renamed from: x */
    public static final /* synthetic */ int f32241x = 0;

    /* renamed from: w */
    public final List<TicketId> f32242w;

    public C13031t(C13752e eVar, ServerId serverId, ArrayList arrayList) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_multiple_ticket_validation_info, C13032u.class);
        C21100e.m49373x(serverId, "providerId");
        this.f32242w = arrayList;
        int i = serverId.f15142b;
        ArrayList c = C13720d.m34273c(arrayList, (C13722f) null, new C19752b(20));
        RO mVTicketMultiReceiptRequest = new MVTicketMultiReceiptRequest();
        mVTicketMultiReceiptRequest.providerId = i;
        mVTicketMultiReceiptRequest.mo33085h();
        mVTicketMultiReceiptRequest.ticketIds = c;
        this.f33922v = mVTicketMultiReceiptRequest;
    }

    public final Object call() throws Exception {
        return (C13032u) mo52626J();
    }
}
