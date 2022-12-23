package e20;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.Itinerary;
import com.tranzmate.moovit.protocol.tripplanner.MVMultiRouteItineraryUpdateRequest;
import com.tranzmate.moovit.protocol.tripplanner.MVSimilarItineraryMode;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanItinerary;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanRequest;
import p824tp.C19728f;
import p824tp.C19746x;
import q00.C19047a;

/* renamed from: e20.t */
public final class C16795t extends C13778r<C16795t, C16796u, MVMultiRouteItineraryUpdateRequest> {

    /* renamed from: A */
    public final String f43731A;

    /* renamed from: w */
    public final C19728f f43732w;

    /* renamed from: x */
    public final C19047a f43733x;

    /* renamed from: y */
    public final Itinerary f43734y;

    /* renamed from: z */
    public final int f43735z;

    public C16795t(int i, int i2, C19728f fVar, C19047a aVar, Itinerary itinerary, C13752e eVar, MVTripPlanRequest mVTripPlanRequest) {
        super(eVar, C19746x.api_path_trip_planner_similar_request_path, C16796u.class);
        boolean z;
        MVSimilarItineraryMode mVSimilarItineraryMode;
        C21100e.m49373x(fVar, "metroContext");
        this.f43732w = fVar;
        C21100e.m49373x(aVar, "configuration");
        this.f43733x = aVar;
        C21100e.m49373x(itinerary, "itinerary");
        this.f43734y = itinerary;
        int i3 = i + i2;
        this.f43735z = i3;
        this.f43731A = C16795t.class.getSimpleName() + "_" + itinerary.f41894b + "_" + i3;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 > 0) {
            mVSimilarItineraryMode = MVSimilarItineraryMode.NEXT;
        } else {
            mVSimilarItineraryMode = MVSimilarItineraryMode.PREV;
        }
        MVTripPlanItinerary q = C16080a.m40961q(itinerary);
        RO mVMultiRouteItineraryUpdateRequest = new MVMultiRouteItineraryUpdateRequest();
        mVMultiRouteItineraryUpdateRequest.itinerary = q;
        mVMultiRouteItineraryUpdateRequest.mode = mVSimilarItineraryMode;
        mVMultiRouteItineraryUpdateRequest.originalRequest = mVTripPlanRequest;
        mVMultiRouteItineraryUpdateRequest.isOriginState = z;
        mVMultiRouteItineraryUpdateRequest.mo34435j();
        this.f33922v = mVMultiRouteItineraryUpdateRequest;
    }

    /* renamed from: B */
    public final boolean mo21057B() {
        return false;
    }
}
