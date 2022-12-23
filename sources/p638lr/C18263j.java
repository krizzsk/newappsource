package p638lr;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.carpool.C15725a;
import com.moovit.carpool.PassengerRideStops;
import com.moovit.itinerary.C16080a;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.carpool.MVPassengerStops;
import com.tranzmate.moovit.protocol.tripplanner.MVItineraryForRideRequest;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanPref;
import java.util.ArrayList;
import p824tp.C19728f;
import q00.C19047a;
import v90.C13187a;

/* renamed from: lr.j */
public final class C18263j extends C13778r<C18263j, C18264k, MVItineraryForRideRequest> {

    /* renamed from: w */
    public final C19728f f46587w;

    /* renamed from: x */
    public final C19047a f46588x;

    /* renamed from: y */
    public final ServerId f46589y;

    public C18263j(C13752e eVar, C19728f fVar, C19047a aVar, ServerId serverId, PassengerRideStops passengerRideStops, C13187a aVar2) {
        super(eVar, R.string.api_path_carpool_ride_itinerary_request, C18264k.class);
        this.f46587w = fVar;
        this.f46588x = aVar;
        C21100e.m49373x(serverId, "rideId");
        this.f46589y = serverId;
        int i = serverId.f15142b;
        MVPassengerStops g = C15725a.m40160g(passengerRideStops);
        ArrayList<O> c = C13720d.m34273c(aVar2.mo40063d(), (C13722f) null, new C18262i(0));
        C13717b.m34261h(c);
        MVTripPlanPref t = C16080a.m40964t(aVar2.mo40061b());
        RO mVItineraryForRideRequest = new MVItineraryForRideRequest();
        mVItineraryForRideRequest.rideId = i;
        mVItineraryForRideRequest.mo34344j();
        mVItineraryForRideRequest.stops = g;
        mVItineraryForRideRequest.routeTypes = c;
        mVItineraryForRideRequest.tripPlanPref = t;
        this.f33922v = mVItineraryForRideRequest;
    }
}
