package p638lr;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.itinerary.C16080a;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.util.time.C7923a;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.tripplanner.MVCarpoolTripPlanRequest;
import com.tranzmate.moovit.protocol.tripplanner.MVLocationTarget;
import com.tranzmate.moovit.protocol.tripplanner.MVTimeType;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanPref;
import e20.C16779i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import p824tp.C19728f;
import q00.C19047a;

/* renamed from: lr.o */
public final class C18268o extends C13778r<C18268o, C18269p, MVCarpoolTripPlanRequest> {

    /* renamed from: A */
    public final Collection<TripPlannerTransportType> f46592A;

    /* renamed from: B */
    public final LocationDescriptor f46593B;

    /* renamed from: C */
    public final LocationDescriptor f46594C;

    /* renamed from: D */
    public C16779i f46595D = null;

    /* renamed from: w */
    public final C19728f f46596w;

    /* renamed from: x */
    public final C19047a f46597x;

    /* renamed from: y */
    public final TripPlannerRouteType f46598y;

    /* renamed from: z */
    public final TripPlannerTime f46599z;

    public C18268o(C13752e eVar, C19728f fVar, C19047a aVar, TripPlannerRouteType tripPlannerRouteType, TripPlannerTime tripPlannerTime, Set set, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, boolean z) {
        super(eVar, R.string.api_path_carpool_trip_plan_request, C18269p.class);
        this.f46596w = fVar;
        this.f46597x = aVar;
        C21100e.m49373x(tripPlannerRouteType, "routeType");
        this.f46598y = tripPlannerRouteType;
        C21100e.m49373x(tripPlannerTime, "tripTime");
        this.f46599z = tripPlannerTime;
        C21100e.m49373x(set, "transportTypes");
        this.f46592A = set;
        C21100e.m49373x(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f46593B = locationDescriptor;
        C21100e.m49373x(locationDescriptor2, "destination");
        this.f46594C = locationDescriptor2;
        long a = C7923a.m18001a(tripPlannerTime.mo24487b());
        MVTripPlanPref t = C16080a.m40964t(tripPlannerRouteType);
        MVTimeType w = C16080a.m40967w(tripPlannerTime.f23799b);
        boolean d = tripPlannerTime.mo24489d();
        ArrayList c = C13720d.m34273c(set, (C13722f) null, new C18267n(0));
        C13717b.m34261h(c);
        MVLocationTarget r = C16080a.m40962r(locationDescriptor);
        MVLocationTarget r2 = C16080a.m40962r(locationDescriptor2);
        RO mVCarpoolTripPlanRequest = new MVCarpoolTripPlanRequest();
        mVCarpoolTripPlanRequest.tripPlanPref = t;
        mVCarpoolTripPlanRequest.time = a;
        mVCarpoolTripPlanRequest.mo34231q();
        mVCarpoolTripPlanRequest.timeType = w;
        mVCarpoolTripPlanRequest.currentTimeSelected = d;
        mVCarpoolTripPlanRequest.mo34229o();
        mVCarpoolTripPlanRequest.routeTypes = c;
        mVCarpoolTripPlanRequest.fromLocation = r;
        mVCarpoolTripPlanRequest.toLocation = r2;
        mVCarpoolTripPlanRequest.smartTripPlanRequest = z;
        mVCarpoolTripPlanRequest.mo34230p();
        this.f33922v = mVCarpoolTripPlanRequest;
    }
}
