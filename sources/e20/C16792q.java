package e20;

import aa0.C7553r;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import java.util.HashMap;
import java.util.Set;
import p066e0.C4454r0;
import p543hq.C17478e;
import p824tp.C19728f;
import p824tp.C19746x;
import q00.C19047a;

/* renamed from: e20.q */
public final class C16792q extends C13778r<C16792q, C16793r, MVTripPlanRequest> {

    /* renamed from: A */
    public final Collection<TripPlannerTransportType> f43710A;

    /* renamed from: B */
    public final TripPlannerAlgorithmType f43711B;

    /* renamed from: C */
    public final TripPlannerPersonalPrefs f43712C;

    /* renamed from: D */
    public final AccessibilityPersonalPrefs f43713D;

    /* renamed from: E */
    public final LocationDescriptor f43714E;

    /* renamed from: F */
    public final LocationDescriptor f43715F;

    /* renamed from: G */
    public final boolean f43716G;

    /* renamed from: H */
    public final boolean f43717H;

    /* renamed from: I */
    public C16779i f43718I = null;

    /* renamed from: J */
    public final HashMap f43719J = new HashMap();

    /* renamed from: K */
    public volatile String f43720K = null;

    /* renamed from: w */
    public final C19728f f43721w;

    /* renamed from: x */
    public final C19047a f43722x;

    /* renamed from: y */
    public final TripPlannerRouteType f43723y;

    /* renamed from: z */
    public final TripPlannerTime f43724z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16792q(C13752e eVar, C19728f fVar, C19047a aVar, TripPlannerTime tripPlannerTime, TripPlannerRouteType tripPlannerRouteType, Set set, TripPlannerPersonalPrefs tripPlannerPersonalPrefs, AccessibilityPersonalPrefs accessibilityPersonalPrefs, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, boolean z, boolean z2, TripPlannerAlgorithmType tripPlannerAlgorithmType) {
        super(eVar, C19746x.api_path_trip_planner_search_request_path, C16793r.class);
        C19728f fVar2 = fVar;
        C19047a aVar2 = aVar;
        TripPlannerTime tripPlannerTime2 = tripPlannerTime;
        TripPlannerRouteType tripPlannerRouteType2 = tripPlannerRouteType;
        Set set2 = set;
        TripPlannerPersonalPrefs tripPlannerPersonalPrefs2 = tripPlannerPersonalPrefs;
        AccessibilityPersonalPrefs accessibilityPersonalPrefs2 = accessibilityPersonalPrefs;
        LocationDescriptor locationDescriptor3 = locationDescriptor;
        LocationDescriptor locationDescriptor4 = locationDescriptor2;
        boolean z3 = z;
        boolean z4 = z2;
        TripPlannerAlgorithmType tripPlannerAlgorithmType2 = tripPlannerAlgorithmType;
        C21100e.m49373x(fVar2, "metroContext");
        this.f43721w = fVar2;
        C21100e.m49373x(aVar2, "configuration");
        this.f43722x = aVar2;
        C21100e.m49373x(tripPlannerRouteType2, "routeType");
        this.f43723y = tripPlannerRouteType2;
        C21100e.m49373x(tripPlannerTime2, "tripTime");
        this.f43724z = tripPlannerTime2;
        C21100e.m49373x(set2, "transportTypes");
        this.f43710A = set2;
        C21100e.m49373x(tripPlannerPersonalPrefs2, "tripPlannerPersonalPrefs");
        this.f43712C = tripPlannerPersonalPrefs2;
        C21100e.m49373x(accessibilityPersonalPrefs2, "accessibilityPersonalPrefs");
        this.f43713D = accessibilityPersonalPrefs2;
        C21100e.m49373x(locationDescriptor3, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f43714E = locationDescriptor3;
        C21100e.m49373x(locationDescriptor4, "destination");
        this.f43715F = locationDescriptor4;
        this.f43716G = z3;
        this.f43717H = z4;
        C21100e.m49373x(tripPlannerAlgorithmType2, "algorithmType");
        this.f43711B = tripPlannerAlgorithmType2;
        long a = C7923a.m18001a(tripPlannerTime.mo24487b());
        MVTripPlanPref t = C16080a.m40964t(tripPlannerRouteType);
        MVTimeType w = C16080a.m40967w(tripPlannerTime2.f23799b);
        boolean d = tripPlannerTime.mo24489d();
        ArrayList c = C13720d.m34273c(set2, (C13722f) null, new C4454r0(13));
        C13717b.m34261h(c);
        MVTripPlanRequest mVTripPlanRequest = new MVTripPlanRequest(t, a, w, d, c, C16080a.m40962r(locationDescriptor), C16080a.m40962r(locationDescriptor2));
        ArrayList c2 = C13720d.m34273c(set2, (C13722f) null, new C17478e(12));
        C13717b.m34261h(c2);
        mVTripPlanRequest.transportTypes = c2;
        mVTripPlanRequest.personalPreferences = C16080a.m40963s(tripPlannerPersonalPrefs, accessibilityPersonalPrefs);
        mVTripPlanRequest.skipTaxiSearch = z3;
        mVTripPlanRequest.mo34673F();
        mVTripPlanRequest.addFlexTimeSearch = !z4;
        mVTripPlanRequest.mo34698y();
        mVTripPlanRequest.algorithmType = C16080a.m40959o(tripPlannerAlgorithmType);
        this.f33922v = mVTripPlanRequest;
    }

    /* renamed from: B */
    public final boolean mo21057B() {
        return true;
    }

    /* renamed from: H */
    public final void mo5818H() throws IOException, ServerException {
        this.f43720K = C7553r.f23033b.mo23812b(this.f51759b, this.f33922v);
        super.mo5818H();
    }
}
