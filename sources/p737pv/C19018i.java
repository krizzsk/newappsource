package p737pv;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.ridesharing.model.EventRequest;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelEventRequest;
import com.tranzmate.moovit.protocol.ridesharing.MVRideEntityId;
import d70.C16536a;

/* renamed from: pv.i */
public final class C19018i extends C13778r<C19018i, C19019j, MVPassengerCancelEventRequest> {

    /* renamed from: w */
    public final EventRequest.Key f48379w;

    /* renamed from: x */
    public final CurrencyAmount f48380x;

    public C19018i(C13752e eVar, EventRequest.Key key, CurrencyAmount currencyAmount) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_event_cancel_request, C19019j.class);
        C21100e.m49373x(key, "serverKey");
        this.f48379w = key;
        this.f48380x = currencyAmount;
        int i = key.f42962c.f15142b;
        MVRideEntityId j = C16536a.m42038j(key);
        RO mVPassengerCancelEventRequest = new MVPassengerCancelEventRequest();
        mVPassengerCancelEventRequest.eventId = i;
        mVPassengerCancelEventRequest.mo31192i();
        mVPassengerCancelEventRequest.rideEntityId = j;
        if (currencyAmount != null) {
            mVPassengerCancelEventRequest.fee = C13749c.m34329o(currencyAmount.f23845c);
            mVPassengerCancelEventRequest.mo31193j();
        }
        this.f33922v = mVPassengerCancelEventRequest;
    }
}
