package p596jx;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodCancelOrderRequest;

/* renamed from: jx.c */
public final class C17954c extends C13778r<C17954c, C17955d, MVTodCancelOrderRequest> {

    /* renamed from: w */
    public final String f46024w;

    public C17954c(C13752e eVar, String str, CurrencyAmount currencyAmount) {
        super(eVar, R.string.api_path_tod_cancel_ride_request, C17955d.class);
        C21100e.m49373x(str, "rideId");
        this.f46024w = str;
        RO mVTodCancelOrderRequest = new MVTodCancelOrderRequest();
        mVTodCancelOrderRequest.rideId = str;
        if (currencyAmount != null) {
            mVTodCancelOrderRequest.cancellationFee = C13749c.m34330p(currencyAmount);
        }
        this.f33922v = mVTodCancelOrderRequest;
    }
}
