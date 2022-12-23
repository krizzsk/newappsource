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
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanSuggestionRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import p824tp.C19728f;
import p824tp.C19746x;
import p828tt.C19759a;
import p875vs.C20228e;
import q00.C19047a;

/* renamed from: e20.v */
public final class C16797v extends C13778r<C16797v, C16799x, MVTripPlanSuggestionRequest> {

    /* renamed from: A */
    public final Collection<TripPlannerTransportType> f43737A;

    /* renamed from: B */
    public final TripPlannerPersonalPrefs f43738B;

    /* renamed from: C */
    public final AccessibilityPersonalPrefs f43739C;

    /* renamed from: D */
    public final LocationDescriptor f43740D;

    /* renamed from: E */
    public final LocationDescriptor f43741E;

    /* renamed from: F */
    public final boolean f43742F;

    /* renamed from: G */
    public C16779i f43743G = null;

    /* renamed from: H */
    public volatile String f43744H = null;

    /* renamed from: w */
    public final C19728f f43745w;

    /* renamed from: x */
    public final C19047a f43746x;

    /* renamed from: y */
    public final TripPlannerTime f43747y;

    /* renamed from: z */
    public final TripPlannerRouteType f43748z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16797v(C13752e eVar, C19728f fVar, C19047a aVar, TripPlannerTime tripPlannerTime, TripPlannerRouteType tripPlannerRouteType, Set set, TripPlannerPersonalPrefs tripPlannerPersonalPrefs, AccessibilityPersonalPrefs accessibilityPersonalPrefs, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, TripPlannerAlgorithmType tripPlannerAlgorithmType) {
        super(eVar, C19746x.api_path_trip_planner_search_suggestion_request_path, C16799x.class);
        TripPlannerTime tripPlannerTime2 = tripPlannerTime;
        TripPlannerRouteType tripPlannerRouteType2 = tripPlannerRouteType;
        Set set2 = set;
        TripPlannerPersonalPrefs tripPlannerPersonalPrefs2 = tripPlannerPersonalPrefs;
        AccessibilityPersonalPrefs accessibilityPersonalPrefs2 = accessibilityPersonalPrefs;
        LocationDescriptor locationDescriptor3 = locationDescriptor2;
        this.f43745w = fVar;
        this.f43746x = aVar;
        C21100e.m49373x(tripPlannerRouteType2, "routeType");
        this.f43748z = tripPlannerRouteType2;
        this.f43747y = tripPlannerTime2;
        C21100e.m49373x(set2, "transportTypes");
        this.f43737A = set2;
        C21100e.m49373x(tripPlannerPersonalPrefs2, "tripPlannerPersonalPrefs");
        this.f43738B = tripPlannerPersonalPrefs2;
        C21100e.m49373x(accessibilityPersonalPrefs2, "accessibilityPersonalPrefs");
        this.f43739C = accessibilityPersonalPrefs2;
        this.f43740D = locationDescriptor;
        C21100e.m49373x(locationDescriptor3, "destination");
        this.f43741E = locationDescriptor3;
        this.f43742F = true;
        long a = C7923a.m18001a(tripPlannerTime.mo24487b());
        MVTripPlanPref t = C16080a.m40964t(tripPlannerRouteType);
        MVTimeType w = C16080a.m40967w(tripPlannerTime2.f23799b);
        boolean d = tripPlannerTime.mo24489d();
        ArrayList c = C13720d.m34273c(set2, (C13722f) null, new C19759a(11));
        C13717b.m34261h(c);
        MVTripPlanRequest mVTripPlanRequest = new MVTripPlanRequest(t, a, w, d, c, C16080a.m40962r(locationDescriptor), C16080a.m40962r(locationDescriptor2));
        ArrayList c2 = C13720d.m34273c(set2, (C13722f) null, new C20228e(14));
        C13717b.m34261h(c2);
        mVTripPlanRequest.transportTypes = c2;
        mVTripPlanRequest.personalPreferences = C16080a.m40963s(tripPlannerPersonalPrefs, accessibilityPersonalPrefs);
        mVTripPlanRequest.skipTaxiSearch = true;
        mVTripPlanRequest.mo34673F();
        mVTripPlanRequest.algorithmType = C16080a.m40959o(tripPlannerAlgorithmType);
        RO mVTripPlanSuggestionRequest = new MVTripPlanSuggestionRequest();
        mVTripPlanSuggestionRequest.tripPlanRequest = mVTripPlanRequest;
        this.f33922v = mVTripPlanSuggestionRequest;
    }

    /* renamed from: H */
    public final void mo5818H() throws IOException, ServerException {
        this.f43744H = C7553r.f23033b.mo23812b(this.f51759b, ((MVTripPlanSuggestionRequest) this.f33922v).tripPlanRequest);
        super.mo5818H();
    }
}
