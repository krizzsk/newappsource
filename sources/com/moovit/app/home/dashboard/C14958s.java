package com.moovit.app.home.dashboard;

import android.os.Bundle;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.suggestedroutes.SuggestRoutesActivity;
import com.moovit.app.suggestedroutes.TripPlanLocationSearchFragment;
import com.moovit.app.suggestedroutes.TripPlanOptions;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.app.tripplanner.C15581b;
import com.moovit.suggestedroutes.TripPlanParams;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.tripplanner.TripPlannerOptions;
import p543hq.C17474b;
import p572iw.C17663f;

/* renamed from: com.moovit.app.home.dashboard.s */
public class C14958s extends C14925a<TripPlanOptions, TripPlanLocationSearchFragment, C17663f> {
    /* renamed from: p2 */
    public final C15578a mo45131p2() {
        Bundle bundle = new Bundle();
        TripPlanLocationSearchFragment tripPlanLocationSearchFragment = new TripPlanLocationSearchFragment();
        tripPlanLocationSearchFragment.setArguments(bundle);
        return tripPlanLocationSearchFragment;
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
        startActivity(SuggestRoutesActivity.m39325M2(getContext(), dVar.mo23958a(), true));
    }
}
