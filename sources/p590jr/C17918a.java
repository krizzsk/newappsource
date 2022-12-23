package p590jr;

import c70.C13752e;
import c70.C13778r;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.carpool.MVCancelRideRequest;

/* renamed from: jr.a */
public final class C17918a extends C13778r<C17918a, C17919b, MVCancelRideRequest> {
    public C17918a(ServerId serverId, C13752e eVar) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_carpool_cancel_ride_request, C17919b.class);
        int i = serverId.f15142b;
        RO mVCancelRideRequest = new MVCancelRideRequest();
        mVCancelRideRequest.requestId = i;
        mVCancelRideRequest.mo25404g();
        this.f33922v = mVCancelRideRequest;
    }
}
