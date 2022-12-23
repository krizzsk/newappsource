package p737pv;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.ridesharing.model.EventRequest;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideReceiptRequest;

/* renamed from: pv.o */
public final class C19025o extends C13778r<C19025o, C19026p, MVRSEventRideReceiptRequest> {
    public C19025o(C13752e eVar, EventRequest.Key key) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_event_receipt_request, C19026p.class);
        C21100e.m49373x(key, "serverKey");
        if (key.f42964e != null) {
            int i = key.f42964e.f15142b;
            RO mVRSEventRideReceiptRequest = new MVRSEventRideReceiptRequest();
            mVRSEventRideReceiptRequest.rideId = i;
            mVRSEventRideReceiptRequest.mo31307g();
            this.f33922v = mVRSEventRideReceiptRequest;
            return;
        }
        throw new IllegalStateException("Unable to retrieve receipt for non-ride server key!");
    }
}
