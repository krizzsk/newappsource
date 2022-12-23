package com.moovit.app.offline.tripplanner;

import android.content.Intent;
import android.os.Bundle;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.app.tripplanner.C15581b;
import com.moovit.app.tripplanner.TripPlannerActivity;
import com.moovit.app.tripplanner.TripPlannerResultsFragment;
import com.moovit.map.MapFragment;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerOptions;
import com.moovit.tripplanner.TripPlannerParams;
import com.moovit.tripplanner.TripPlannerTime;
import p398bv.C13692b;
import p398bv.C13693c;
import p398bv.C13695d;

public class OfflineTripPlannerActivity extends TripPlannerActivity<OfflineTripPlannerParams, OfflineTripPlannerOptions, C13695d, C13692b, C13693c> {

    /* renamed from: r0 */
    public static final /* synthetic */ int f39160r0 = 0;

    /* renamed from: A2 */
    public final C15578a mo45660A2(TripPlannerLocations tripPlannerLocations, TripPlannerOptions tripPlannerOptions) {
        LocationDescriptor locationDescriptor;
        OfflineTripPlannerOptions offlineTripPlannerOptions = (OfflineTripPlannerOptions) tripPlannerOptions;
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
        int i = C13692b.f33750t;
        Bundle bundle = new Bundle();
        bundle.putParcelable("options", (OfflineTripPlannerOptions) tripPlannerOptions);
        C13692b bVar = new C13692b();
        bVar.setArguments(bundle);
        return bVar;
    }

    /* renamed from: C2 */
    public final TripPlannerResultsFragment mo45662C2(TripPlannerLocations tripPlannerLocations, TripPlannerOptions tripPlannerOptions) {
        int i = C13693c.f33752C;
        Bundle bundle = new Bundle();
        bundle.putParcelable("locations", tripPlannerLocations);
        bundle.putParcelable("options", (OfflineTripPlannerOptions) tripPlannerOptions);
        C13693c cVar = new C13693c();
        cVar.setArguments(bundle);
        return cVar;
    }

    /* renamed from: G2 */
    public final TripPlannerOptions mo45663G2(Intent intent) {
        OfflineTripPlannerParams offlineTripPlannerParams = (OfflineTripPlannerParams) ((TripPlannerParams) intent.getParcelableExtra("extra_trip_plan_params"));
        if (offlineTripPlannerParams == null) {
            return null;
        }
        TripPlannerTime tripPlannerTime = offlineTripPlannerParams.f39166d;
        if (tripPlannerTime == null) {
            tripPlannerTime = TripPlannerTime.m17899f();
        }
        return new OfflineTripPlannerOptions(tripPlannerTime);
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
