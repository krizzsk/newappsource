package p638lr;

import c70.C13752e;
import c70.C13778r;
import com.moovit.carpool.C15725a;
import com.moovit.carpool.PassengerRideStops;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.carpool.MVPassengerGetRideRequest;
import com.tranzmate.moovit.protocol.carpool.MVPassengerStops;

/* renamed from: lr.c */
public final class C18256c extends C13778r<C18256c, C18257d, MVPassengerGetRideRequest> {

    /* renamed from: w */
    public final ServerId f46573w;

    public C18256c(C13752e eVar, ServerId serverId, PassengerRideStops passengerRideStops) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_carpool_get_passenger_ride_path, C18257d.class);
        this.f46573w = serverId;
        int i = serverId.f15142b;
        MVPassengerStops g = C15725a.m40160g(passengerRideStops);
        RO mVPassengerGetRideRequest = new MVPassengerGetRideRequest();
        mVPassengerGetRideRequest.rideId = i;
        mVPassengerGetRideRequest.mo25728h();
        mVPassengerGetRideRequest.stops = g;
        this.f33922v = mVPassengerGetRideRequest;
    }
}
