package q80;

import c70.C13746a;
import c70.C13780t;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseTicketFareStepCompleteResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: q80.f */
public final class C13017f extends C13780t<C13016e, C13017f, MVPurchaseTicketFareStepCompleteResponse> {

    /* renamed from: m */
    public PurchaseStep f32213m;

    public C13017f() {
        super(MVPurchaseTicketFareStepCompleteResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        MVPurchaseTicketFareStepCompleteResponse mVPurchaseTicketFareStepCompleteResponse = (MVPurchaseTicketFareStepCompleteResponse) tBase;
        this.f32213m = C13036y.m32953e(this.f51773b.f51759b, ((C13016e) aVar).f32211w, mVPurchaseTicketFareStepCompleteResponse.contextId, mVPurchaseTicketFareStepCompleteResponse.analyticKey, mVPurchaseTicketFareStepCompleteResponse.step);
    }

    public C13017f(PurchaseStep purchaseStep) {
        super(MVPurchaseTicketFareStepCompleteResponse.class);
        C21100e.m49373x(purchaseStep, "step");
        this.f32213m = purchaseStep;
    }
}
