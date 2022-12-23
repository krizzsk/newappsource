package q80;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.commons.request.ServerException;
import com.moovit.ticketing.ticket.TicketId;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptRequest;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import m80.C12873i;
import m90.C12890b;
import m90.C12892c;
import r80.C13048b;

/* renamed from: q80.v */
public final class C13033v extends C13778r<C13033v, C13034w, MVTicketReceiptRequest> implements Callable<C12890b> {

    /* renamed from: w */
    public final TicketId f32243w;

    public C13033v(C13752e eVar, TicketId ticketId) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_ticket_validation_info, C13034w.class);
        C21100e.m49373x(ticketId, "ticketId");
        this.f32243w = ticketId;
        int i = ticketId.f23511b.f15142b;
        String str = ticketId.f23513d;
        RO mVTicketReceiptRequest = new MVTicketReceiptRequest();
        mVTicketReceiptRequest.providerId = i;
        mVTicketReceiptRequest.mo33116h();
        mVTicketReceiptRequest.ticketId = str;
        this.f33922v = mVTicketReceiptRequest;
        this.f51770m = new C14291m0(eVar, "ticketing_receipt");
    }

    /* renamed from: E */
    public final List<C13034w> mo21059E() throws IOException, ServerException {
        C12890b receipt = C13048b.f32272c.getReceipt(this.f33829q, this.f32243w);
        if (receipt == null) {
            C12892c r = C12892c.m32688r(this.f51759b);
            if (r != null) {
                receipt = r.get(this.f32243w);
            } else {
                receipt = null;
            }
        }
        if (receipt == null) {
            return Collections.emptyList();
        }
        this.f51765h = true;
        return Collections.singletonList(new C13034w(receipt));
    }

    public final Object call() throws Exception {
        return ((C13034w) mo52626J()).f32244m;
    }
}
