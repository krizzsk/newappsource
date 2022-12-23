package p881vy;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.facebook.appevents.C2342l;
import com.moovit.app.wondo.tickets.model.WondoOfferPrice;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.wondo.MVWondoPurchaseOfferRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vy.e */
public final class C20251e extends C13778r<C20251e, C20252f, MVWondoPurchaseOfferRequest> {

    /* renamed from: w */
    public final ServerId f51355w;

    public C20251e(C13752e eVar, ServerId serverId, WondoOfferPrice wondoOfferPrice) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_wondo_purchase_offer, C20252f.class);
        C21100e.m49373x(serverId, "offerId");
        this.f51355w = serverId;
        int i = serverId.f15142b;
        List<WondoOfferPrice.Item> list = wondoOfferPrice.f40731b;
        C2342l lVar = new C2342l(10);
        ArrayList arrayList = new ArrayList(wondoOfferPrice.f40731b.size());
        C13720d.m34276f(list, (C13722f) null, lVar, arrayList);
        RO mVWondoPurchaseOfferRequest = new MVWondoPurchaseOfferRequest();
        mVWondoPurchaseOfferRequest.offerId = i;
        mVWondoPurchaseOfferRequest.mo35726h();
        mVWondoPurchaseOfferRequest.purchaseInfo = arrayList;
        this.f33922v = mVWondoPurchaseOfferRequest;
    }
}
