package q80;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareIntentResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: q80.j */
public final class C13021j extends C13780t<C13020i, C13021j, MVPurchaseTicketFareIntentResponse> {

    /* renamed from: m */
    public PurchaseStep f32223m;

    public C13021j() {
        super(MVPurchaseTicketFareIntentResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        MVPurchaseTicketFareIntentResponse mVPurchaseTicketFareIntentResponse = (MVPurchaseTicketFareIntentResponse) tBase;
        this.f32223m = C13036y.m32953e(this.f51773b.f51759b, ((C13020i) aVar).f32222w, mVPurchaseTicketFareIntentResponse.contextId, mVPurchaseTicketFareIntentResponse.analyticKey, mVPurchaseTicketFareIntentResponse.step);
    }
}
