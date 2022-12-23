package e20;

import aa0.C7553r;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.accessibility.AccessibilityPersonalPrefs;
import com.moovit.commons.request.ServerException;
import com.moovit.itinerary.C16080a;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerAlgorithmType;
import com.moovit.tripplanner.TripPlannerPersonalPrefs;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.util.time.C7923a;
import com.tranzmate.moovit.protocol.tripplanner.MVTimeType;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanPref;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import p638lr.C18262i;
import p638lr.C18267n;
import p824tp.C19728f;
import p824tp.C19746x;
import q00.C19047a;

/* renamed from: e20.m */
public final class C16788m extends C13778r<C16788m, C16789n, MVTripPlanRequest> {

    /* renamed from: A */
    public final Collection<TripPlannerTransportType> f43695A;

    /* renamed from: B */
    public final LocationDescriptor f43696B;

    /* renamed from: C */
    public final LocationDescriptor f43697C;

    /* renamed from: D */
    public final boolean f43698D;

    /* renamed from: E */
    public C16779i f43699E = null;

    /* renamed from: F */
    public volatile String f43700F = null;

    /* renamed from: w */
    public final C19728f f43701w;

    /* renamed from: x */
    public final C19047a f43702x;

    /* renamed from: y */
    public final TripPlannerRouteType f43703y;

    /* renamed from: z */
    public final TripPlannerTime f43704z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16788m(C13752e eVar, C19728f fVar, C19047a aVar, TripPlannerTime tripPlannerTime, TripPlannerRouteType tripPlannerRouteType, Set set, TripPlannerPersonalPrefs tripPlannerPersonalPrefs, AccessibilityPersonalPrefs accessibilityPersonalPrefs, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, TripPlannerAlgorithmType tripPlannerAlgorithmType) {
        super(eVar, C19746x.api_path_trip_planner_search_single_request_path, C16789n.class);
        C19728f fVar2 = fVar;
        C19047a aVar2 = aVar;
        TripPlannerTime tripPlannerTime2 = tripPlannerTime;
        TripPlannerRouteType tripPlannerRouteType2 = tripPlannerRouteType;
        Set set2 = set;
        LocationDescriptor locationDescriptor3 = locationDescriptor2;
        C21100e.m49373x(fVar2, "metroContext");
        this.f43701w = fVar2;
        C21100e.m49373x(aVar2, "configuration");
        this.f43702x = aVar2;
        C21100e.m49373x(tripPlannerRouteType2, "routeType");
        this.f43703y = tripPlannerRouteType2;
        this.f43704z = tripPlannerTime2;
        C21100e.m49373x(set2, "transportTypes");
        this.f43695A = set2;
        C21100e.m49373x(tripPlannerPersonalPrefs, "tripPlannerPersonalPrefs");
        C21100e.m49373x(accessibilityPersonalPrefs, "accessibilityPersonalPrefs");
        this.f43696B = locationDescriptor;
        C21100e.m49373x(locationDescriptor3, "destination");
        this.f43697C = locationDescriptor3;
        this.f43698D = true;
        long a = C7923a.m18001a(tripPlannerTime.mo24487b());
        MVTripPlanPref t = C16080a.m40964t(tripPlannerRouteType);
        MVTimeType w = C16080a.m40967w(tripPlannerTime2.f23799b);
        boolean d = tripPlannerTime.mo24489d();
        ArrayList c = C13720d.m34273c(set2, (C13722f) null, new C18262i(14));
        C13717b.m34261h(c);
        MVTripPlanRequest mVTripPlanRequest = new MVTripPlanRequest(t, a, w, d, c, C16080a.m40962r(locationDescriptor), C16080a.m40962r(locationDescriptor2));
        ArrayList c2 = C13720d.m34273c(set2, (C13722f) null, new C18267n(14));
        C13717b.m34261h(c2);
        mVTripPlanRequest.transportTypes = c2;
        mVTripPlanRequest.personalPreferences = C16080a.m40963s(tripPlannerPersonalPrefs, accessibilityPersonalPrefs);
        mVTripPlanRequest.skipTaxiSearch = true;
        mVTripPlanRequest.mo34673F();
        mVTripPlanRequest.algorithmType = C16080a.m40959o(tripPlannerAlgorithmType);
        this.f33922v = mVTripPlanRequest;
    }

    /* renamed from: H */
    public final void mo5818H() throws IOException, ServerException {
        this.f43700F = C7553r.f23033b.mo23812b(this.f51759b, this.f33922v);
        super.mo5818H();
    }
}
