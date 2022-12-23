package p596jx;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodAcceptRideUpdateOfferRequest;

/* renamed from: jx.n */
public final class C17966n extends C13778r<C17966n, C17967o, MVTodAcceptRideUpdateOfferRequest> {

    /* renamed from: w */
    public final String f46047w;

    public C17966n(C13752e eVar, String str, CurrencyAmount currencyAmount) {
        super(eVar, R.string.api_path_tod_ride_accept_update_offer_request, C17967o.class);
        C21100e.m49373x(str, "offerId");
        this.f46047w = str;
        RO mVTodAcceptRideUpdateOfferRequest = new MVTodAcceptRideUpdateOfferRequest();
        mVTodAcceptRideUpdateOfferRequest.offerId = str;
        if (currencyAmount != null) {
            mVTodAcceptRideUpdateOfferRequest.price = C13749c.m34330p(currencyAmount);
        }
        this.f33922v = mVTodAcceptRideUpdateOfferRequest;
    }
}
