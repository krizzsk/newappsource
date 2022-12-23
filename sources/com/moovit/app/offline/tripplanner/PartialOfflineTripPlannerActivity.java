package com.moovit.app.offline.tripplanner;

import android.content.Intent;
import android.os.Bundle;
import c00.C13717b;
import com.moovit.app.suggestedroutes.TripPlanOptions;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.app.tripplanner.C15581b;
import com.moovit.app.tripplanner.TripPlannerActivity;
import com.moovit.app.tripplanner.TripPlannerResultsFragment;
import com.moovit.itinerary.TripPlanResult;
import com.moovit.map.MapFragment;
import com.moovit.suggestedroutes.TripPlanParams;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerOptions;
import com.moovit.tripplanner.TripPlannerParams;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.tripplanner.TripPlannerTransportType;
import java.util.List;
import java.util.Set;
import p398bv.C13695d;
import p572iw.C17663f;
import p572iw.C17666h;
import p589jq.C17909a;
import v90.C13187a;

public class PartialOfflineTripPlannerActivity extends TripPlannerActivity<TripPlanParams, TripPlanOptions, C13695d, C17663f, C17666h> {

    /* renamed from: r0 */
    public static final /* synthetic */ int f39167r0 = 0;

    /* renamed from: A2 */
    public final C15578a mo45660A2(TripPlannerLocations tripPlannerLocations, TripPlannerOptions tripPlannerOptions) {
        LocationDescriptor locationDescriptor;
        TripPlanOptions tripPlanOptions = (TripPlanOptions) tripPlannerOptions;
        LocationDescriptor locationDescriptor2 = null;
        if (tripPlannerLocations != null) {
            locationDescriptor = tripPlannerLocations.f23786b;
        } else {
            locationDescriptor = null;
        }
        if (tripPlannerLocations != null) {
            locationDescriptor2 = tripPlannerLocations.f23787c;
        }
        return C13695d.m34207B2(locationDescriptor, locationDescriptor2);
    }

    /* renamed from: B2 */
    public final C15581b mo45661B2(TripPlannerOptions tripPlannerOptions) {
        return C17663f.m43826t2((TripPlanOptions) tripPlannerOptions);
    }

    /* renamed from: C2 */
    public final TripPlannerResultsFragment mo45662C2(TripPlannerLocations tripPlannerLocations, TripPlannerOptions tripPlannerOptions) {
        List<TripPlanResult> list;
        TripPlanOptions tripPlanOptions = (TripPlanOptions) tripPlannerOptions;
        TripPlanParams tripPlanParams = (TripPlanParams) ((TripPlannerParams) getIntent().getParcelableExtra("extra_trip_plan_params"));
        if (tripPlanParams == null) {
            list = null;
        } else {
            list = tripPlanParams.f23221g;
        }
        int i = C17666h.f45402O;
        Bundle bundle = new Bundle();
        bundle.putParcelable("locations", tripPlannerLocations);
        bundle.putParcelable("options", tripPlanOptions);
        bundle.putParcelableArrayList("initial_results", C13717b.m34264k(list));
        C17666h hVar = new C17666h();
        hVar.setArguments(bundle);
        return hVar;
    }

    /* renamed from: G2 */
    public final TripPlannerOptions mo45663G2(Intent intent) {
        TripPlanParams tripPlanParams = (TripPlanParams) ((TripPlannerParams) intent.getParcelableExtra("extra_trip_plan_params"));
        if (tripPlanParams == null) {
            return null;
        }
        TripPlannerTime tripPlannerTime = tripPlanParams.f23218d;
        if (tripPlannerTime == null) {
            tripPlannerTime = TripPlannerTime.m17899f();
        }
        TripPlannerTime tripPlannerTime2 = tripPlannerTime;
        C17909a aVar = (C17909a) mo44537r1("ACCESSIBILITY_CONFIGURATION");
        C13187a aVar2 = (C13187a) mo44537r1("TRIP_PLANNER_CONFIGURATION");
        TripPlannerRouteType tripPlannerRouteType = tripPlanParams.f23219e;
        if (tripPlannerRouteType == null) {
            tripPlannerRouteType = aVar2.mo40061b();
        }
        Set<TripPlannerTransportType> set = tripPlanParams.f23220f;
        if (C13717b.m34258e(set)) {
            set = aVar2.mo40063d();
        }
        return new TripPlanOptions(tripPlannerTime2, tripPlannerRouteType, set, aVar2.mo40062c(), aVar2.mo40060a(), aVar.mo50463a());
    }

    /* renamed from: K2 */
    public final boolean mo45664K2() {
        return true;
    }

    /* renamed from: y2 */
    public final MapFragment mo45665y2() {
        return null;
    }
}
