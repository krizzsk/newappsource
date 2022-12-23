package p737pv;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.ridesharing.model.EventRequest;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeRequest;

/* renamed from: pv.m */
public final class C19022m extends C13778r<C19022m, C19023n, MVRSEventRideRealTimeRequest> {

    /* renamed from: w */
    public final EventRequest f48383w;

    public C19022m(C13752e eVar, EventRequest eventRequest) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_event_real_time_request, C19023n.class);
        ServerId serverId;
        C21100e.m49373x(eventRequest, "eventRequest");
        this.f48383w = eventRequest;
        EventRequest.Key key = eventRequest.f42959i;
        if (key.f42964e == null || (r0 = key.f42965f) == null || (serverId = key.f42966g) == null) {
            throw new IllegalStateException("Unable to retrieve receipt for non-ride server key!");
        }
        ServerId serverId2 = eventRequest.f42953c.f42949h != 1 ? serverId : serverId2;
        int i = key.f42964e.f15142b;
        int i2 = serverId2.f15142b;
        RO mVRSEventRideRealTimeRequest = new MVRSEventRideRealTimeRequest();
        mVRSEventRideRealTimeRequest.rideId = i;
        mVRSEventRideRealTimeRequest.mo31289h();
        mVRSEventRideRealTimeRequest.stopSeq = i2;
        mVRSEventRideRealTimeRequest.mo31291i();
        this.f33922v = mVRSEventRideRealTimeRequest;
    }
}
