package p737pv;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.ridesharing.model.EventRequest;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.ridesharing.MVPassengerCancelFeeRequest;
import com.tranzmate.moovit.protocol.ridesharing.MVRideEntityId;
import d70.C16536a;

/* renamed from: pv.k */
public final class C19020k extends C13778r<C19020k, C19021l, MVPassengerCancelFeeRequest> {
    public C19020k(C13752e eVar, EventRequest.Key key) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_event_cancellation_request, C19021l.class);
        C21100e.m49373x(key, "serverKey");
        int i = key.f42962c.f15142b;
        MVRideEntityId j = C16536a.m42038j(key);
        RO mVPassengerCancelFeeRequest = new MVPassengerCancelFeeRequest();
        mVPassengerCancelFeeRequest.eventId = i;
        mVPassengerCancelFeeRequest.mo31206h();
        mVPassengerCancelFeeRequest.rideEntityId = j;
        this.f33922v = mVPassengerCancelFeeRequest;
    }
}
