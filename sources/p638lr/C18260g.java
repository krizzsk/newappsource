package p638lr;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.carpool.C15725a;
import com.moovit.carpool.FutureCarpoolRide;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolDetourRequest;
import com.tranzmate.moovit.protocol.carpool.MVPassengerStops;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;

/* renamed from: lr.g */
public final class C18260g extends C13778r<C18260g, C18261h, MVCarPoolDetourRequest> {

    /* renamed from: w */
    public final ServerId f46583w;

    /* renamed from: x */
    public final LocationDescriptor f46584x;

    public C18260g(C13752e eVar, FutureCarpoolRide futureCarpoolRide, LocationDescriptor locationDescriptor) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_carpool_ride_detour_request, C18261h.class);
        C21100e.m49373x(futureCarpoolRide, "futureRide");
        ServerId serverId = futureCarpoolRide.f40937b.f40910b;
        this.f46583w = serverId;
        C21100e.m49373x(locationDescriptor, "pickupLocation");
        this.f46584x = locationDescriptor;
        int i = serverId.f15142b;
        MVPassengerStops g = C15725a.m40160g(futureCarpoolRide.f40940e);
        MVLocationDescriptor u = C13749c.m34335u(locationDescriptor);
        RO mVCarPoolDetourRequest = new MVCarPoolDetourRequest();
        mVCarPoolDetourRequest.rideId = i;
        mVCarPoolDetourRequest.mo25444i();
        mVCarPoolDetourRequest.stops = g;
        mVCarPoolDetourRequest.pickupLocation = u;
        this.f33922v = mVCarPoolDetourRequest;
    }
}
