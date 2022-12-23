package p596jx;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRealTimeInfoRequest;

/* renamed from: jx.t */
public final class C17972t extends C13778r<C17972t, C17973u, MVTodRideRealTimeInfoRequest> {

    /* renamed from: w */
    public final String f46054w;

    public C17972t(C13752e eVar, String str) {
        super(eVar, R.string.api_path_tod_ride_real_time_request, C17973u.class);
        C21100e.m49373x(str, "rideId");
        this.f46054w = str;
        RO mVTodRideRealTimeInfoRequest = new MVTodRideRealTimeInfoRequest();
        mVTodRideRealTimeInfoRequest.rideId = str;
        this.f33922v = mVTodRideRealTimeInfoRequest;
    }
}
