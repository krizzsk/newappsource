package p596jx;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodChangeRideDestinationRequest;

/* renamed from: jx.p */
public final class C17968p extends C13778r<C17968p, C17969q, MVTodChangeRideDestinationRequest> {

    /* renamed from: w */
    public final String f46049w;

    /* renamed from: x */
    public final LocationDescriptor f46050x;

    public C17968p(C13752e eVar, String str, LocationDescriptor locationDescriptor) {
        super(eVar, R.string.api_path_tod_ride_change_destination_request, C17969q.class);
        C21100e.m49373x(str, "rideId");
        this.f46049w = str;
        C21100e.m49373x(locationDescriptor, "destination");
        this.f46050x = locationDescriptor;
        MVLocationDescriptor u = C13749c.m34335u(locationDescriptor);
        RO mVTodChangeRideDestinationRequest = new MVTodChangeRideDestinationRequest();
        mVTodChangeRideDestinationRequest.rideId = str;
        mVTodChangeRideDestinationRequest.newDestination = u;
        this.f33922v = mVTodChangeRideDestinationRequest;
    }
}
