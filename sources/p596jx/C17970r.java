package p596jx;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodRideRatingRequest;
import p977zz.C20964s0;

/* renamed from: jx.r */
public final class C17970r extends C13778r<C17970r, C17971s, MVTodRideRatingRequest> {

    /* renamed from: w */
    public final String f46052w;

    /* renamed from: x */
    public final int f46053x;

    public C17970r(int i, C13752e eVar, String str, String str2) {
        super(eVar, R.string.api_path_tod_rate_ride_request, C17971s.class);
        C21100e.m49373x(str, "rideId");
        this.f46052w = str;
        this.f46053x = i;
        RO mVTodRideRatingRequest = new MVTodRideRatingRequest();
        mVTodRideRatingRequest.rideId = str;
        mVTodRideRatingRequest.rating = i;
        mVTodRideRatingRequest.mo33700i();
        if (!C20964s0.m49090h(str2)) {
            mVTodRideRatingRequest.freeText = str2;
        }
        this.f33922v = mVTodRideRatingRequest;
    }
}
