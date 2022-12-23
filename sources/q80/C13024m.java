package q80;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitRequest;
import java.util.concurrent.Callable;
import m80.C12873i;

/* renamed from: q80.m */
public final class C13024m extends C13778r<C13024m, C13025n, MVPurchaseSplitRequest> implements Callable<C13025n> {
    public C13024m(C13752e eVar, TicketFare ticketFare) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_split_intent, C13025n.class);
        C21100e.m49373x(ticketFare, "fare");
        int i = ticketFare.f23327c.f15142b;
        String str = ticketFare.f23333i.f23495b;
        String str2 = ticketFare.f23326b;
        RO mVPurchaseSplitRequest = new MVPurchaseSplitRequest();
        mVPurchaseSplitRequest.providerId = i;
        mVPurchaseSplitRequest.mo32733i();
        mVPurchaseSplitRequest.agencyKey = str;
        mVPurchaseSplitRequest.fareId = str2;
        this.f33922v = mVPurchaseSplitRequest;
    }

    public final Object call() throws Exception {
        return (C13025n) mo52626J();
    }
}
