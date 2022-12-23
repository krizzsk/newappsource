package com.moovit.app.home.dashboard;

import android.content.Context;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.offline.tripplanner.PartialOfflineTripPlannerActivity;
import com.moovit.app.suggestedroutes.TripPlanOptions;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.app.tripplanner.C15581b;
import com.moovit.app.tripplanner.TripPlannerActivity;
import com.moovit.suggestedroutes.TripPlanParams;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerOptions;
import p398bv.C13695d;
import p543hq.C17474b;
import p572iw.C17663f;

/* renamed from: com.moovit.app.home.dashboard.t */
public class C14984t extends C14925a<TripPlanOptions, C13695d, C17663f> {
    /* renamed from: p2 */
    public final C15578a mo45131p2() {
        return C13695d.m34207B2((LocationDescriptor) null, (LocationDescriptor) null);
    }

    /* renamed from: q2 */
    public final C15581b mo45132q2() {
        return C17663f.m43826t2((TripPlanOptions) null);
    }

    /* renamed from: s2 */
    public final void mo45134s2(TripPlannerLocations tripPlannerLocations, TripPlannerOptions tripPlannerOptions) {
        TripPlanOptions tripPlanOptions = (TripPlanOptions) tripPlannerOptions;
        mo46797j2(new C17474b(AnalyticsEventKey.SEARCH_ROUTES_CLICKED));
        TripPlanParams.C7626d dVar = new TripPlanParams.C7626d();
        dVar.f23790a = tripPlannerLocations.f23786b;
        dVar.f23791b = tripPlannerLocations.f23787c;
        dVar.f23222c = tripPlanOptions.f39803b;
        dVar.f23223d = tripPlanOptions.f39804c;
        dVar.mo23959b(tripPlanOptions.f39805d);
        TripPlanParams a = dVar.mo23958a();
        Context context = getContext();
        int i = PartialOfflineTripPlannerActivity.f39167r0;
        startActivity(TripPlannerActivity.m39768z2(context, PartialOfflineTripPlannerActivity.class, a, true));
    }
}
